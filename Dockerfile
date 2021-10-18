FROM openjdk:8-jdk
MAINTAINER <alexander.aichinger@mhp.com>

EXPOSE 8080

VOLUME /data

COPY target/*.jar /app/service.jar

CMD ["java", "-jar", "/app/service.jar"]
