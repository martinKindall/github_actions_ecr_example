from eclipse-temurin:17.0.3_7-jdk

COPY build/libs/app.jar /app.jar

ENTRYPOINT exec java -jar /app.jar