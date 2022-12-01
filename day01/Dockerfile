FROM maven:alpine as BASE
WORKDIR /app
COPY ./ .
RUN mvn package

FROM openjdk:17-alpine
COPY --from=BASE /app/target/aoc-day01-1-jar-with-dependencies.jar /day01.jar
COPY input.txt .
CMD java -jar /day01.jar