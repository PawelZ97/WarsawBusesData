FROM openjdk:11-jre-slim
EXPOSE 8080
WORKDIR /usr/src/java-app
COPY build/libs/*.jar ./app.jar
COPY apiKey .
ENTRYPOINT ["java", "-jar", "app.jar"]