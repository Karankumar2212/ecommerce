FROM openjdk:17-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ./target/ecommerce.jar ecommerce.jar
ENTRYPOINT ["java","-jar","/ecommerce.jar"] 