FROM openjdk:8-jdk-alpine
MAINTAINER  "hariinfo@gmail.com"
ADD target/consul-kube-demo-0.0.1-SNAPSHOT.jar service-c.jar
ENTRYPOINT ["java","-jar","/service-c.jar"]