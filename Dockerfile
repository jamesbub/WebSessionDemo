FROM openjdk:8-jdk-alpine

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} webSession.jar
ENTRYPOINT ["java","-jar","/webSession.jar"]
