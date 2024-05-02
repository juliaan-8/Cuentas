FROM openjdk:17-alpine
MAINTAINER cuchi
COPY target/Cuentas-0.0.1-SNAPSHOT.jar  cuchi-app.jar
ENTRYPOINT ["java","-jar","/cuchi-app.jar"]