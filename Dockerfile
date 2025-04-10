FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./target/java-mvn-app-*.jar /usr/app/
WORKDIR /usr/app

CMD java -jar java-mvn-app-*.jar

