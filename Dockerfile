FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-11-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean package -DskipTests

FROM openjdk:11-jdk-slim

EXPOSE 8888

COPY --from=build /target/auto-deploy-test-0.0.1.jar app.jar

ENTRYPOINT ["java", "jar", "app.jar"]