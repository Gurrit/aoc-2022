FROM maven:alpine as BASE
WORKDIR /app
COPY ./ .
RUN mvn package

FROM openjdk:17-alpine
COPY --from=BASE /app/target/aoc-day02-1-jar-with-dependencies.jar /day02.jar
COPY input.txt .
CMD java -jar /day02.jar