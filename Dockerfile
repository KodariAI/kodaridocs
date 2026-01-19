FROM gradle:9.3.0-jdk25 AS builder
WORKDIR /app

COPY build.gradle.kts settings.gradle.kts gradlew gradlew.bat ./
COPY gradle ./gradle
COPY autogen ./autogen

RUN chmod +x ./gradlew

RUN ./gradlew dependencies --no-daemon

COPY src ./src

RUN ./gradlew bootJar --no-daemon

FROM eclipse-temurin:25-jre
WORKDIR /app

RUN groupadd -g 1001 appuser && useradd -u 1001 -g appuser appuser

COPY --from=builder --chown=appuser:appuser /app/build/libs/*.jar app.jar

USER appuser

EXPOSE 9093

ENTRYPOINT ["java", "-jar", "app.jar"]
