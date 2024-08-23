FROM maven:3.9.9-eclipse-temurin-21-alpine

WORKDIR /app

RUN apk add --no-cache nodejs npm

ENV NODE_HOME=/usr/lib/node_modules

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn package -DskipTests

VOLUME /root/.m2

CMD ["tail", "-f", "/dev/null"]

# CMD ["java", "-Dspring.devtools.restart.enabled=true", "-jar", "target/webapp-spring.jar"]
