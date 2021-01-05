ARG awsRegion
ARG awsAccountId
ARG jarName

FROM $awsAccountId.dkr.ecr.$awsRegion.amazonaws.com/adoptopenjdk:11-jdk-hotspot-focal
COPY target/$jarName /usr/local/app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /usr/local/app.jar" ]
