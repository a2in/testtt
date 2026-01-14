FROM ubuntu:latest
workdir /app
expose 8080
copy ./build/libs/*-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]