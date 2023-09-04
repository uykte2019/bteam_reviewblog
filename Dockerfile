FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package _DskipTests

FROM openjdk:17.8.1-jdk-slim
COPY --from=build /target/ReviewsBlog-0.0.1-SNAPSHOT.jar reviewblog.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/reviewblog.jar"]