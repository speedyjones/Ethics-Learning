FROM tomcat:8.5.63-jdk8-openjdk-slim-buster

RUN apt-get update; apt-get install -y fontconfig libfreetype6

WORKDIR /

COPY target/*.jar /usr/local/tomcat/ROOT.jar

COPY convert-env-to-jopts-and-run-tomcat.sh /

ENTRYPOINT ["/bin/bash", "convert-env-to-jopts-and-run-tomcat.sh"]
