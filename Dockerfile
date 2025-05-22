FROM openjdk:11
EXPOSE 8080
ADD target/labfaker-0.0.1-SNAPSHOT.jar labfaker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/labfaker-0.0.1-SNAPSHOT.jar"]