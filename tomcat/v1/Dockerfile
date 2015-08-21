FROM centos:centos7

ENV TOMCAT_VERSION 7.0.55
ENV CATALINA_HOME /opt/tomcat

RUN yum update -y && \
    yum install -y wget \
            tar \
            java-1.7.0-openjdk && \
    wget -q https://archive.apache.org/dist/tomcat/tomcat-7/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz -O /tmp/catalina.tar.gz && \
    tar xzf /tmp/catalina.tar.gz -C /opt && \
    ln -s /opt/apache-tomcat-${TOMCAT_VERSION} /opt/tomcat && \
    rm /tmp/catalina.tar.gz

EXPOSE 8080

CMD $CATALINA_HOME/bin/catalina.sh run