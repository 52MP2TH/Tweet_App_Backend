FROM openjdk:13-jdk-alpine
EXPOSE 8081
ARG JAR_FILE=target/TweetApp-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} TweetApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/TweetApp-0.0.1-SNAPSHOT.jar"]