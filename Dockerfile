FROM gradle:9.3.1-jdk25 AS builder
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

HEALTHCHECK --interval=30s --timeout=5s --start-period=30s --retries=3 \
  CMD bash -c '</dev/tcp/localhost/9093' || exit 1

ENTRYPOINT ["java", "-jar", "app.jar"]
