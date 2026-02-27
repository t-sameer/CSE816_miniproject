FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean compile

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

COPY --from=build /app/target/classes ./classes

CMD ["java", "-cp", "classes", "Main"]