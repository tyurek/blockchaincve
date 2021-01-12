FROM gitpod/workspace-full

#RUN mkdir ~/gradle && \
#gradle -g ~/gradle

ENV GRADLE_USER_HOME $HOME/gradle

RUN pwd

#RUN echo export GOPATH=\"\$HOME/go\" >> ~/.bash_profile && \
#    echo export PATH=\"\$PATH:\$GOPATH/bin\" >> ~/.bash_profile && \
#    echo export GO111MODULE=on >> ~/.bash_profile && \
#    source ~/.bash_profile

ENV GOPATH $HOME/go
#ENV PATH=\"\$PATH:\$GOPATH/bin\"
ENV GO111MODULE=on
ENV PATH $GOPATH:$PATH

#ENV PATH /root/.cargo/bin:$PATH

RUN mkdir -p $GOPATH/src/github.com/tendermint && \
    cd $GOPATH/src/github.com/tendermint && \
    pwd && \
    git clone https://github.com/tendermint/tendermint.git && \
    cd tendermint && \
    git checkout release/v0.32.9 && \
    make install

#RUN mkdir -p ~/gradle && \
#gradle -g ~/gradle

CMD bash

