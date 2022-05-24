FROM openjdk:8
EXPOSE 9002
ADD target/my-app.jar my-app.jar 
ENTRYPOINT ["java", "-jar","/my-app.jar "]
