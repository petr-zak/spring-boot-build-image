# spring-boot-build-image
Build you app as docker image using spring boot.

## Requirements
- Java 1.8+
- Spring boot 2.3

## How to build docker image
```
mvn spring-boot:build-image
```

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
