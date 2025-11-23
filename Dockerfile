# Java 17 (compatível com Quarkus 3)
FROM eclipse-temurin:17-jdk AS build

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# ---- Runtime ----
FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY --from=build /app/target/quarkus-app /app/quarkus-app

CMD ["java", "-jar", "/app/quarkus-app/quarkus-run.jar"]
