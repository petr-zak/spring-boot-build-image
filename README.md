# spring-boot-build-image
How to build your java application as OCI image using Spring Boot 2.3.

## Minimal Requirements
- Java 8
- Spring Boot 2.3
- Maven 3
- Docker 18

## How to build image
|type|command|
|----|-------|
|OCI image|```mvn spring-boot:build-image```|
|Docker image|```./appBuildDockerImage.sh```|

## How to run docker container on default port 8080
```
docker run -d --rm --name dockertest -p 8080:8080 dockertest:0.0.1-SNAPSHOT
```

## How to access the app in running docker container
http://localhost:8080/dockertest

## How to stop docker container
```
docker stop dockertest
```

## How to run docker container on port 9090
```
docker run -d --rm --name dockertest -e server.port=9090 -p 9090:9090 dockertest:0.0.1-SNAPSHOT
```
