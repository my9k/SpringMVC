FROM openjdk:8
EXPOSE 9002
ADD target/Spring-MVC-Docker.jar Spring-MVC-Docker.jar 
ENTRYPOINT ["java", "-jar","/Spring-MVC-Docker.jar "]