FROM 156498802103.dkr.ecr.eu-west-1.amazonaws.com/adoptopenjdk:11-jdk-hotspot-focal
ARG jarName
COPY target/$jarName /usr/local/app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /usr/local/app.jar" ]
