FROM maven:3.8.3-openjdk-17
WORKDIR /app

#Parent pom for building
COPY pom.xml .
COPY commons-email2-core ./commons-email2-core
COPY commons-email2-jakarta ./commons-email2-jakarta
COPY springboot-email ./springboot-email

RUN mvn clean install -f ./commons-email2-core/pom.xml #To install email2 as local maven dependencies
RUN mvn clean install -f ./commons-email2-jakarta/pom.xml
RUN mvn clean package -Pproduction -f ./springboot-email/pom.xml #To deploy Vaadin in production mode

COPY ./springboot-email/target/springboot-email-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]