FROM openjdk:11
COPY ./build/libs/WarsawBusesData-0.0.1-SNAPSHOT.jar /usr/app/
COPY apiKey /usr/app
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "WarsawBusesData-0.0.1-SNAPSHOT.jar"]