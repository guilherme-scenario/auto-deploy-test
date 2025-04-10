FROM maven:3.9.5-eclipse-temurin-11 AS builder

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:11-jdk-slim

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8888

ENTRYPOINT ["java", "-Xms128m", "-Xmx384m", "-Xss512k", "-Dfile.encoding=UTF-8", "-jar", "/app/app.jar"]