FROM codenvy/jdk8_maven3_tomcat8
ADD target/huarui-zipkin-1.0-SNAPSHOT.jar /app/app.jar
CMD ["java","-jar","-Dspring.profiles.active=test","/app/app.jar"]
