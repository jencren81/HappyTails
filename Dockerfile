FROM openjdk:17

ADD target/HappyTails-0.0.1-SNAPSHOT.jar /HappyTails-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/HappyTails-0.0.1-SNAPTSHOT.jar"]
