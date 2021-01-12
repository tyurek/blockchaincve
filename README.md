# A Demo of how one might do private vulnerability notifications with a blockchain
## What this does (high level):
Essentially this project runs Tendermint Core to achieve bft concensus for a distributed key-value store application written in Java. Vendors and clients use a command line program (also Java, but could be anything) to communicate with this application over http. When a vendor needs to notifiy clients about a vulnerability, they create a key-value entry, where the key is the vendor id and the vulnerability number and the value is the encrypted notification along with information which affected clients can use to decrypt the message. Clients are responsible for retrieving this message and trying to decrypt it.

## More detailed Cryptography:
We assume a PKI where every client has a known public key, which in this case is a point on Curve25519.

When a vendor needs to send notification of a security incident, they first sample a random key *k* and use it to encrypt the notification via AES-GCM.
They then generate an ephemeral Curve25519 keypair and use X25519 along with the PKI to generate ephemeral shared keys with each affected client.
Each of these shared keys is then fed through a hash key derivation function, which is used to encrypt k with AES-GCM.
They create an entry in the key-value store, where the key is the vendor id and the vulnerability number and the value is
*{ephemeral_public_key, encrypted_notification, encryptions_of_k}*

A client will see the entry made by a vendor that it does business with and will retrieve the value from the KV store.
They will perform X25519 with the ephemeral public key and use the hkdf to derive a potential encryption key.
They will then try to decrypt each encryption of *k* with that key and if successful, will output the message.


## Security Properties:
built from simple crypto primitives: symmetric encryption, diffie-hellman key exchange over elliptic curves, and key derivation functions

The key value store is immutable, byzantine fault tolerant, and highly available, allowing clients to reliably retrieve security incident notifications.

In the case of a dispute or audit, both the vendor and the client have the ability to prove that they acted correctly.

When both the vendor and client act correctly, the client successfully receives the correct message.

An adversary that can not solve the computational diffie-hellman problem does not learn that a particular client is in the set of notified clients (except possibly by inference using external information, addressed later). 

If every client retrieves every key-value pair, then access patterns do not reveal which clients subscribe to which vendors.

### Other benefits:
This methodology can turn any key value store into a notification system which inherits its reliablity and correctness properties from the KV store.

## What this doesn't get you:
This implementation does not hide the length of the message or the number of recipients. The both of these could be used to possibly determine which product was faulty, which could then reveal the list of notified clients to an adversary with external information). Both of these issues can be fixed with padding (at the cost of bandwidth).

This does not give you a guarantee that the vendor formatted the message correctly. A client may need to discover that they should have been included in a notification through another channel (but would then at least have proof that the vendor acted incorrectly). I didn't come up with a way around this that wouldn't rely on the vendor generating either a snark or an infeasibly-large OR proof.


## How to actually use this thing:
Run `docker-compose build tendermintexp`
when that finishes, run `docker-compose run --rm tendermintexp`
As you'll need three "tabs" to run this experiment, open two more docker terminal instances and in each of those run `docker exec -it tendermint_tendermintexp_run_1 bash`
-If that doesn't work, run `docker ps` to get a list of running images and substitute `tendermint_tendermintexp_run_1` with whatever appears in the NAMES column

In the first window, navigate to ~/tmapp and run `./gradlew run`
-This will start building the tendermint application (the key value store) and will run it when complete

In the second window, run tendermint core by executing
`TMHOME="/tmp/example" tendermint init`
followed by 
`TMHOME="/tmp/example" tendermint node --abci grpc --proxy_app tcp://127.0.0.1:26658`

Finally in the third window navigate to ~/cli and run
`./gradlew run`
which will build the command line tool and present you with a list of ways to call it.
To pass arguments to the cli, run something like
`./gradlew run --args="arg1 arg2 arg3"`

You can use the pki example I generated for this demo or create your own using the tool.
Once that is done you can run, say 
`./gradlew run --args="post IBM HyperLedger_is_on_fire_it_is_very_bad pki.txt 1,2"`
to have IBM notify clients 1 and 2 about the high flammability of HyperLedger.

Client 1 can then retrieve this notification by running 
`./gradlew run --args="retrieve IBM priv_1.txt"`

Client 0 will fail to decrypt the message due to using mostly-flame-retardant blockchains
`./gradlew run --args="retrieve IBM priv_0.txt"`


Files of interest:
`~\cli\src\main\java\io\example\App.java` contains the code for the command line interface

`~\tmapp\src\main\java\io\example\KVStoreApp.java` specifies the Tendermint application which communicates with Tendermint Core program over ABCI (implemented via grpc).

Future Work:
The validate() function in KVStoreApp.java is not completed. Essentially this is where validators would sanity check a potential entry, by for example making sure it is formatted correctly and doesn't already exist as an entry. This would be a good place to enforce some sort of system for vulnerability notification identifier numbers.

There should be some sort of identity validation for vendors. Perhaps a signature under a known public key (possibly enforced by the validate() function above).

The command line tool is quite primative as well. The arguments must be in the correct order and the vendor's message doesn't support spaces due to how command line arguments are parsed, for example.

This demo was built off of a Java Key Value store tutorial on the tendermint website. This tutorial is out of date and does not work on the most recent version of tendermint, as the grpc file layout has changed since the tutorial was written. Consequently, the version of tendermint used in this demo is also not the most recent one.

This demo was built using a gitpod image, which essentially is a large image with a lot of things (such as Java and golang) preinstalled. The idea was to use gitpod as an easy way to demo this online without requiring any local installations. However, I did not get this project to the point where that works. It may be easy to intgrate this demo into an online gitpod instance, and it may not. If gitpod integration is not desired, I would recommend using a lighter base image.