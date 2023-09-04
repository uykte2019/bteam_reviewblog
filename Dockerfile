FROM maven:2.7.15-openjdk-1.8 AS build
COPY . .
RUN mvn clean package _DskipTests

FROM openjdk:1.8-jdk-slim
COPY --from=build /target/ReviewsBlog-0.0.1-SNAPSHOT.jar reviewblog.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/reviewblog.jar"]