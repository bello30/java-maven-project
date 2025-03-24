FROM openjdk:8-jre-alpine

EXPOSE 8080

<<<<<<< HEAD
COPY ./target/java-maven-app-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "java-maven-app-1.0-SNAPSHOT.jar"]
=======
COPY ./target/java-maven-app-1.1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "java-maven-app-1.1.0-SNAPSHOT.jar"]
>>>>>>> 4a076336e09569c25b250ebf5bae8951e7337f30
