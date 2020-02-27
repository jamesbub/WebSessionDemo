FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} webSession.jar
ENTRYPOINT ["java","-jar","/webSession.jar"]
