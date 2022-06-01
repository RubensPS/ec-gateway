FROM openjdk:18

COPY./build/libs/ec-gateway-0.0.1-SNAPSHOT.jar ec-gateway-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "ec-gateway-0.0.1-SNAPSHOT.jar"]