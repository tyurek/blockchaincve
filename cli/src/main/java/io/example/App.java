package io.example;
import com.google.crypto.tink.subtle.X25519;
import com.google.crypto.tink.subtle.Ed25519Sign;
import com.google.crypto.tink.subtle.Ed25519Verify;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.BinaryKeysetReader;
import com.google.crypto.tink.subtle.AesGcmJce;
import org.apache.commons.codec.binary.Hex;
import com.google.crypto.tink.subtle.Hkdf;
import java.util.ArrayList;
import java.util.Base64;
import java.lang.ProcessBuilder;
import java.lang.Process;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import org.json.*;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.signature.EcdsaSignKeyManager;
import com.google.crypto.tink.config.TinkConfig;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.Security;
import java.security.SecureRandom;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyFactory;
import javax.crypto.Cipher;

//import java.security.interfaces.ECPrivateKey;
//import java.security.interfaces.ECPublicKey;
//import java.security.spec.ECParameterSpec;
import java.security.spec.ECGenParameterSpec;
//import java.security.spec.ECPoint;

import org.bouncycastle.jce.spec.ECParameterSpec;

import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.params.ParametersWithRandom;






public class App {
    /*public static void main(String[] args){
        byte[] hkdfsalt = "saltysaltysaltsalt".getBytes();
        String VendorId = "ExampleVendor";
        String message = "Somebody Set Up Us The Bomb";
        
        try{
            byte[] key = X25519.generatePrivateKey();
            byte[] kdfkey = Hkdf.computeHkdf("HmacSha256", key, hkdfsalt, "".getBytes(), 32);
            System.out.println( Hex.encodeHexString(kdfkey) );
            AesGcmJce aead = new AesGcmJce(key);
            byte[] ciphertext = aead.encrypt(message.getBytes(), "".getBytes());
            ArrayList<byte[]> affected = new ArrayList<byte[]>();
            ArrayList<byte[]> pseudonyms = new ArrayList<byte[]>();
            ArrayList<byte[]> blinds = new ArrayList<byte[]>();
            for(int i=0; i < 5; i++){
                affected.add(X25519.publicFromPrivate(X25519.generatePrivateKey()));
            }
            for(int i=0; i < affected.size(); i++){
                byte[] pk = affected.get(i);
                byte[] r_i = X25519.generatePrivateKey();
                pseudonyms.add(X25519.computeSharedSecret(r_i, pk));
                blinds.add(r_i);
            }
            
            Ed25519Sign s = new Ed25519Sign(key);
            byte[] sig = s.sign(kdfkey);
            Ed25519Verify v = new Ed25519Verify(X25519.publicFromPrivate(key));
            //throws error if sig fails
            //v.verify(sig, kdfkey);
            Ed25519Sign.KeyPair keyPair = Ed25519Sign.KeyPair.newKeyPair();
            Ed25519Sign signer = new Ed25519Sign(keyPair.getPrivateKey());
            Ed25519Verify verifier = new Ed25519Verify(keyPair.getPublicKey());
            byte [] sig2 = signer.sign("hooplah".getBytes());
            verifier.verify(sig2, "hooplah".getBytes());
        }catch(Exception e) {
		    e.printStackTrace();
        }
    }*/
    /*public static void main(String[] args){
        byte[] hkdfsalt = "saltysaltysaltsalt".getBytes();
        String VendorId = "ExampleVendor";
        String message = "Somebody Set Up Us The Bomb";

        try{
            TinkConfig.register();
            byte[] key = X25519.generatePrivateKey();
            byte[] kdfkey = Hkdf.computeHkdf("HmacSha256", key, hkdfsalt, "".getBytes(), 32);
            System.out.println( Hex.encodeHexString(kdfkey) );
            AesGcmJce aead = new AesGcmJce(key);
            byte[] ciphertext = aead.encrypt(message.getBytes(), "".getBytes());
            ArrayList<byte[]> affected = new ArrayList<byte[]>();
            ArrayList<byte[]> pseudonyms = new ArrayList<byte[]>();
            ArrayList<byte[]> blinds = new ArrayList<byte[]>();
            for(int i=0; i < 5; i++){
                affected.add(X25519.publicFromPrivate(X25519.generatePrivateKey()));
            }
            for(int i=0; i < affected.size(); i++){
                byte[] pk = affected.get(i);
                byte[] r_i = X25519.generatePrivateKey();
                pseudonyms.add(X25519.computeSharedSecret(r_i, pk));
                blinds.add(r_i);
            }
            KeysetHandle privateKeysetHandle = KeysetHandle.generateNew(EcdsaSignKeyManager.ecdsaP256Template());

            // 2. Get the primitive.
            PublicKeySign signer = privateKeysetHandle.getPrimitive(PublicKeySign.class);

            // 3. Use the primitive to sign.
            byte[] signature = signer.sign(message.getBytes());

            // VERIFYING

            // 1. Obtain a handle for the public key material.
            KeysetHandle publicKeysetHandle = privateKeysetHandle.getPublicKeysetHandle();

            // 2. Get the primitive.
            PublicKeyVerify verifier = publicKeysetHandle.getPrimitive(PublicKeyVerify.class);

            // 4. Use the primitive to verify.
            verifier.verify(signature, message.getBytes());
            
            ECParameterSpec ecParams = EllipticCurves.getNistP256Params();
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
            keyGen.initialize(ecParams);
            KeyPair keyPair = keyGen.generateKeyPair();
            ECPublicKey pub = (ECPublicKey) keyPair.getPublic();
            ECPrivateKey priv = (ECPrivateKey) keyPair.getPrivate();
            ECPoint p = pub.getW();
            ECPoint p2 = p.multiply(priv.getS()).normalize();
            byte [] sharedbytes = EllipticCurves.computeSharedSecret(priv, pub);
            //ECPoint shared = EllipticCurves.pointDecode(ecParams.getCurve(), EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, sharedbytes);
            //ECPublicKey shared = EllipticCurves.getEcPublicKey(ecParams, EllipticCurves.PointFormatType.COMPRESSED, sharedbytes);
            
        }catch(Exception e) {
		    e.printStackTrace();
        }
    }*/
    /*public static void main(String[] args){
        byte[] hkdfsalt = "saltysaltysaltsalt".getBytes();
        String VendorId = "ExampleVendor";
        String message = "Somebody Set Up Us The Bomb";
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        
        try{
            X9ECParameters p = NISTNamedCurves.getByName("P-256");
            ECDomainParameters params = new ECDomainParameters(p.getCurve(), p.getG(), p.getN(), p.getH()); 
            ECCurve.Fp fpcurve = (ECCurve.Fp) p.getCurve();
            BigInteger fp = fpcurve.getQ();
            BigInteger privkey = new BigInteger("12345678910");
            
            //KeyPairGenerator keyGen = KeyPairGenerator.getInstance("ECDSA", "BC");
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC", "BC");
            keyGen.initialize(new ECGenParameterSpec("P-256"));
            KeyPair kp = keyGen.generateKeyPair();
            ECPublicKey pub = (ECPublicKey)kp.getPublic();
            ECPrivateKey priv = (ECPrivateKey)kp.getPrivate();
            ECPoint point = pub.getQ();
            //ECPoint point2 = point.multiply(priv.getD());
            ECPoint point2 = point.multiply(new BigInteger("3"));
            
            ECGenParameterSpec spec = new ECGenParameterSpec("P-256");
            ECParameterSpec aspec = pub.getParameters();
            ECPublicKeySpec bpubs = new ECPublicKeySpec (point2, aspec);
            KeyFactory kfa = KeyFactory.getInstance ("EC");
            ECPublicKey bpub = (ECPublicKey) kfa.generatePublic(bpubs);
            ECPublicKeyParameters pubKey = new ECPublicKeyParameters(point2, params);
            BigInteger one = new BigInteger("1");
            BigInteger two = new BigInteger("3");

            System.out.println(priv.getD().multiply(two).toString());
            System.out.println(priv.getD().multiply(two).mod(fp).toString());
            System.out.println(new ECFieldElement.Fp(fp, priv.getD()).multiply(new ECFieldElement.Fp(fp, two)).toBigInteger().toString());
            System.out.println(fp.toString());

            //new ECFieldElement.Fp(fp, priv.getD()).multiply(new ECFieldElement.Fp(fp, two)).toBigInteger().toString()

            ECPrivateKeyParameters priKey = new ECPrivateKeyParameters(priv.getD().multiply(two).mod(fp.add(one)), params);
            //ECPrivateKeyParameters priKey = new ECPrivateKeyParameters(new ECFieldElement.Fp(fp, priv.getD()).multiply(new ECFieldElement.Fp(fp, two)).toBigInteger(), params);
            //ECPrivateKeyParameters priKey = new ECPrivateKeyParameters(priv.getD().multiply(one), params);
            SecureRandom k = new SecureRandom();
            ECDSASigner dsa = new ECDSASigner();
            dsa.init(true, new ParametersWithRandom(priKey, k));
            BigInteger[] sig = dsa.generateSignature(message.getBytes());
            
            ECDSASigner dsa2 = new ECDSASigner();
            dsa2.init(false, new ECPublicKeyParameters(point2, params));
            if (!dsa2.verifySignature(message.getBytes(), sig[0], sig[1]))
            {
                System.out.print("sig failure");
            }
            
            Cipher iesCipher = Cipher.getInstance("ECIESWITHAES-CBC", "BC");
            iesCipher.init(Cipher.ENCRYPT_MODE, pub);
            Cipher iesCipher2 = Cipher.getInstance("ECIESWITHAES-CBC", "BC");
            iesCipher2.init(Cipher.DECRYPT_MODE, kp.getPrivate(), iesCipher.getParameters());
            byte[] ct = iesCipher.doFinal(message.getBytes());
            byte[] ptbytes = iesCipher2.doFinal(ct);
            String pt = new String(ptbytes, "UTF-8");
            System.out.println(pt);
            
            
        }catch(Exception e) {
		    e.printStackTrace();
        }

    }*/
    public static void main(String[] args){
        if (args.length == 2){
            if (!args[0].equals("genpki")){
                printHelp();
                return;
            }
            genPKI(args[1]);
            return;
        }
        else if(args.length == 3){
            if (!args[0].equals("retrieve")){
                printHelp();
                return;
            }
            retrieveMsg(args[1], args[2]);
            return;
        }
        else if(args.length == 5){
            if (!args[0].equals("post")){
                printHelp();
                return;
            }
            postMsg(args[1], args[2], args[3], args[4]);
            return;
        }
        else if(args.length == 1){
            if (!args[0].equals("test")){
                printHelp();
                return;
            }
            System.out.println("testing!");
        }
        else{
            printHelp();
            return;
        }
        for (String s: args) {
            System.out.println(s);
        }
        byte[] hkdfsalt = "saltysaltysaltsalt".getBytes();
        String VendorId = "ExampleVendor3";
        String message = "Somebody Set Up Us The Bomb";
        
        try{
            byte[] key = X25519.generatePrivateKey();
            byte[] kdfkey = Hkdf.computeHkdf("HmacSha256", key, hkdfsalt, "".getBytes(), 32);
            byte[] ephemeralpriv = X25519.generatePrivateKey();
            byte[] ephemeralpub = X25519.publicFromPrivate(ephemeralpriv);
            System.out.println( Hex.encodeHexString(kdfkey) );
            AesGcmJce aead = new AesGcmJce(kdfkey);
            byte[] ciphertext = aead.encrypt(message.getBytes(), "".getBytes());
            byte[] ptbytes = aead.decrypt(ciphertext, "".getBytes());
            String pt = new String(ptbytes, "UTF-8");
            System.out.println(pt);
            ArrayList<byte[]> affected = new ArrayList<byte[]>();
            ArrayList<byte[]> affected_sk = new ArrayList<byte[]>();
            ArrayList<byte[]> enckeys = new ArrayList<byte[]>();
            for(int i=0; i < 5; i++){
                byte[] sk = X25519.generatePrivateKey();
                affected_sk.add(sk);
                affected.add(X25519.publicFromPrivate(sk));
            }
            for(int i=0; i < affected.size(); i++){
                byte[] pk = affected.get(i);
                byte[] shared = X25519.computeSharedSecret(ephemeralpriv, pk);
                byte[] sharedkey = Hkdf.computeHkdf("HmacSha256", shared, hkdfsalt, "".getBytes(), 32);
                AesGcmJce aead2 = new AesGcmJce(sharedkey);
                enckeys.add( aead2.encrypt(kdfkey, "".getBytes()) );
            }
            writePKI(affected_sk, "halp.txt");
            affected_sk = readPKI("halp.txt");
            //encrypted_msg-ephemeralkey-enckeys
            String outstr = Base64.getEncoder().encodeToString(ciphertext) + "-" + Base64.getEncoder().encodeToString(ephemeralpub) + "-" + bytesarr2Str(enckeys);
            //ProcessBuilder pb = new ProcessBuilder("curl", "-s", "localhost:26657/broadcast_tx_commit?tx=\""+ VendorId + ":" + outstr+"\"");
            //Process process = pb.start();
            System.out.println("curl -s 'localhost:26657/broadcast_tx_commit?tx=\""+ VendorId + ":" + outstr+"\"'");
            //System.out.println("curl -s 'localhost:26657/broadcast_tx_commit?tx=\""+ VendorId + ":" + "toby" +"\"'");
            Process process = Runtime.getRuntime().exec("curl -s localhost:26657/broadcast_tx_commit?tx=\""+ VendorId + ":" + outstr+"\"");
            //Process process = Runtime.getRuntime().exec("curl -s 'localhost:26657/broadcast_tx_commit?tx=\""+ VendorId + ":" + "toby" +"\"'");
            String text2 = null;
            Thread.sleep(2000);
            InputStream response2 = process.getInputStream();
            Scanner scanner2 = new Scanner(response2, "UTF-8");
            text2 = scanner2.useDelimiter("\\A").next();
            System.out.println(text2);
            process.destroy();
            Process process2 = Runtime.getRuntime().exec("curl -s localhost:26657/abci_query?data=\""+ VendorId +"\"");
            Thread.sleep(2000);
            InputStream response = process2.getInputStream();
            String text = null;
            Scanner scanner = new Scanner(response, "UTF-8");
            text = scanner.useDelimiter("\\A").next();
            JSONObject obj = new JSONObject(text);
            System.out.println(obj.getJSONObject("result").getJSONObject("response").toString());
            String value = obj.getJSONObject("result").getJSONObject("response").getString("value");
            byte[] decodedvaluebytes = Base64.getDecoder().decode(value);

            String[] parts = new String(decodedvaluebytes, "UTF-8").replace(" ", "+").split("-");//outstr.split(";");
            //System.out.println(parts[2].replace(" ", "+").length());
            //System.out.println(bytesarr2Str(enckeys).length());
            //System.out.println(bytesarr2Str(enckeys).equals(parts[2].replace(" ", "+")));
            byte[] ct = Base64.getDecoder().decode(parts[0]);
            byte[] ephpub = Base64.getDecoder().decode(parts[1]);
            ArrayList<byte[]> enckeys2 = str2Bytesarr(parts[2]);//str2Bytesarr(new String(Base64.getDecoder().decode(parts[2]), "UTF-8"));
            //ArrayList<byte[]> enckeys2 = str2Bytesarr(bytesarr2Str(enckeys));
            byte[] shared2 = X25519.computeSharedSecret(affected_sk.get(0), ephpub);
            byte[] sharedkey2 = Hkdf.computeHkdf("HmacSha256", shared2, hkdfsalt, "".getBytes(), 32);
            //byte[] sharedkey2 = X25519.computeSharedSecret(ephemeralpriv, affected.get(0));
            AesGcmJce aead3 = new AesGcmJce(sharedkey2);
            byte[] key2 = aead3.decrypt(enckeys2.get(0), "".getBytes());
            AesGcmJce aead4 = new AesGcmJce(key2);
            byte[] ptbytes2 = aead4.decrypt(ct, "".getBytes());
            System.out.println(new String(ptbytes2, "UTF-8"));
            
            writePKI(affected, "halp.txt");
            ArrayList<byte[]> newaffected = readPKI("halp.txt");
            
        }catch(Exception e) {
		    e.printStackTrace();
        }
    }
    
    public static String bytesarr2Str(ArrayList<byte[]> in){
        String out = "";
        for(int i=0; i < in.size()-1; i++){
            out += Base64.getEncoder().encodeToString(in.get(i)) + ",";
        }
        out += Base64.getEncoder().encodeToString(in.get(in.size()-1));
        return(out);
    }
    
    public static ArrayList<byte[]> str2Bytesarr(String in){
        ArrayList<byte[]> out = new ArrayList<byte[]>();
        
        String[] parts = in.replace(" ", "+").split(",");//split(in.getBytes(), ';');
        for(int i=0; i < parts.length; i++){
            out.add(Base64.getDecoder().decode(parts[i]));
        }
        return(out);
    }
    
    public static List<byte[]> split(byte[] tx, char separator) {
        int i;
        for (i = 0; i < tx.length; i++) {
            if (tx[i] == (byte)separator) {
                break;
            }
        }
        if (i == tx.length) {
            return Collections.emptyList();
        }
        return List.of(
                Arrays.copyOfRange(tx, 0, i),
                Arrays.copyOfRange(tx, i+1, tx.length-1)
        );
    }
    
    public static ArrayList<byte[]> readPKI(String filename)
    {
        try{
            FileInputStream in = new FileInputStream(filename);
            ArrayList<byte[]> out = new ArrayList<byte[]>();
            byte[] pk = new byte[32];
            while (in.read(pk) != -1) {
                out.add(pk);
                pk = new byte[32];
            }
            in.close();
            return(out);
        }catch(Exception e) {
		    e.printStackTrace();
        }
        return(new ArrayList<byte[]>());
    }
    
    public static void writePKI(ArrayList<byte[]> pki, String filename)
    {
        try{
            FileOutputStream out = new FileOutputStream(filename);
            for (byte[] s: pki) {
                out.write(s);
            }
            out.close();
        }catch(Exception e) {
		    e.printStackTrace();
        }
        return;
    }
    
    public static void writeBytes(byte[] bytes, String filename)
    {
        try{
            FileOutputStream out = new FileOutputStream(filename);
            out.write(bytes);
            out.close();
        }catch(Exception e) {
		    e.printStackTrace();
        }
        return;
    }
    
    public static byte[] readBytes(String filename)
    {
        byte[] sk = new byte[32];
        try{
            FileInputStream in = new FileInputStream(filename);
            in.read(sk);
            in.close();
        }catch(Exception e) {
		    e.printStackTrace();
        }
        return(sk);
    }
    
    public static void genPKI(String size){
        try{
            int isize = Integer.parseInt(size);
            ArrayList<byte[]> pubkeys = new ArrayList<byte[]>();
            for(int i=0; i < isize; i++){
                byte[] sk = X25519.generatePrivateKey();
                writeBytes(sk, "priv_" + String.valueOf(i) + ".txt");
                pubkeys.add(X25519.publicFromPrivate(sk));
            }
            writePKI(pubkeys, "pki.txt");
        }catch(Exception e) {
		    e.printStackTrace();
        }
        return;
    }
    
    public static void postMsg(String vendor, String message, String pki_filename, String affected_ids){
        try{
            ArrayList<byte[]> pki = readPKI(pki_filename);
            ArrayList<byte[]> affected = new ArrayList<byte[]>();
            for (String s: affected_ids.split(",")) {
                int id = Integer.parseInt(s);
                affected.add(pki.get(id));
            }
            byte[] key = X25519.generatePrivateKey();
            byte[] hkdfsalt = "saltysaltysaltsalt".getBytes();
            byte[] kdfkey = Hkdf.computeHkdf("HmacSha256", key, hkdfsalt, "".getBytes(), 32);
            
            byte[] ephemeralpriv = X25519.generatePrivateKey();
            byte[] ephemeralpub = X25519.publicFromPrivate(ephemeralpriv);
            
            AesGcmJce aead = new AesGcmJce(kdfkey);
            byte[] ciphertext = aead.encrypt(message.getBytes(), "".getBytes());
            
            ArrayList<byte[]> enckeys = new ArrayList<byte[]>();
            for(int i=0; i < affected.size(); i++){
                byte[] pk = affected.get(i);
                byte[] shared = X25519.computeSharedSecret(ephemeralpriv, pk);
                byte[] sharedkey = Hkdf.computeHkdf("HmacSha256", shared, hkdfsalt, "".getBytes(), 32);
                AesGcmJce aead2 = new AesGcmJce(sharedkey);
                enckeys.add( aead2.encrypt(kdfkey, "".getBytes()) );
            }
            
            String outstr = Base64.getEncoder().encodeToString(ciphertext) + "-" + Base64.getEncoder().encodeToString(ephemeralpub) + "-" + bytesarr2Str(enckeys);
            Process process = Runtime.getRuntime().exec("curl -s localhost:26657/broadcast_tx_commit?tx=\""+ vendor + ":" + outstr+"\"");
            Thread.sleep(1000);
            InputStream response = process.getInputStream();
            String text = null;
            Scanner scanner = new Scanner(response, "UTF-8");
            text = scanner.useDelimiter("\\A").next();
            //System.out.println(text);
            process.destroy();
            
        }catch(Exception e) {
		    e.printStackTrace();
        }
        return;
    }
    
    public static void retrieveMsg(String vendor, String filename){
        try{
            byte[] hkdfsalt = "saltysaltysaltsalt".getBytes();
            Process process2 = Runtime.getRuntime().exec("curl -s localhost:26657/abci_query?data=\""+ vendor +"\"");
            Thread.sleep(2000);
            InputStream response = process2.getInputStream();
            String text = null;
            Scanner scanner = new Scanner(response, "UTF-8");
            text = scanner.useDelimiter("\\A").next();
            process2.destroy();
            
            JSONObject obj = new JSONObject(text);
            //System.out.println(obj.getJSONObject("result").getJSONObject("response").toString());
            String value = obj.getJSONObject("result").getJSONObject("response").getString("value");
            byte[] decodedvaluebytes = Base64.getDecoder().decode(value);

            String[] parts = new String(decodedvaluebytes, "UTF-8").replace(" ", "+").split("-");
            byte[] ct = Base64.getDecoder().decode(parts[0]);
            byte[] ephpub = Base64.getDecoder().decode(parts[1]);
            ArrayList<byte[]> enckeys = str2Bytesarr(parts[2]);
            
            byte[] shared = X25519.computeSharedSecret(readBytes(filename), ephpub);
            byte[] sharedkey = Hkdf.computeHkdf("HmacSha256", shared, hkdfsalt, "".getBytes(), 32);
            
            AesGcmJce aead = new AesGcmJce(sharedkey);
            for (byte[] keyct: enckeys){
                try{
                    byte[] key2 = aead.decrypt(keyct, "".getBytes());
                    AesGcmJce aead2 = new AesGcmJce(key2);
                    byte[] ptbytes = aead2.decrypt(ct, "".getBytes());
                    System.out.println(new String(ptbytes, "UTF-8"));
                    return;
                }catch(Exception e){
                    continue;
                }
            }
            System.out.println("No message from that vendor");

        }catch(Exception e) {
		    e.printStackTrace();
        }
        return;
    }
    public static void printHelp(){
        System.out.println("Usage:");
        System.out.println("To generate a pki: genpki $number_of_entries");
        System.out.println("To post an alert: post $vendor_id $message $pki_filename $affected_ids(comma separated with no spaces)");
        System.out.println("To retreive an alert: retrieve $vendor_id $priv_key_filename");
    }
}
