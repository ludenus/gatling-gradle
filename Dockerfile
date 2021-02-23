FROM openjdk:11.0.10-jdk

COPY . /gatling-gradle
WORKDIR /gatling-gradle
RUN ./gradlew clean compileGatlingScala compileTestScala

ENTRYPOINT ./entrypoint.sh