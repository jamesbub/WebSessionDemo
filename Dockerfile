FROM tomcat:8.0.20-jre8
# Coping to server
COPY target/webSession*.war /usr/local/tomcat/webapps/webSession.war
