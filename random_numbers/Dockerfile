FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app
COPY target/random_numbers-0.0.1-SNAPSHOT.jar random_numbers.jar

EXPOSE 8080
CMD ["java", "-jar", "random_numbers.jar"]
