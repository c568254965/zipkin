#!/bin/bash

git pull
mvn clean package -Dmaven.test.skip=true

docker rm -f zipkin
docker rmi -f zipkin:test
docker build -t zipkin:test .
docker run -d -p 6866:6866 --name zipkin zipkin:test java -Dspring.profiles.active=test -jar /app/app.jar
