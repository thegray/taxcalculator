FROM openjdk:8-jdk-alpine

COPY ./target/TaxCalculator-1.0.0.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch TaxCalculator-1.0.0.jar'

ENTRYPOINT ["java","-jar","TaxCalculator-1.0.0.jar"]
