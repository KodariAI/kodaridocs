FROM gradle:9.4.1-jdk25 AS builder
WORKDIR /app

COPY build.gradle.kts settings.gradle.kts gradlew gradlew.bat ./
COPY gradle ./gradle
COPY app/build.gradle.kts ./app/
COPY docs/build.gradle.kts ./docs/

RUN chmod +x ./gradlew

RUN ./gradlew dependencies --no-daemon

COPY app ./app
COPY docs ./docs

RUN ./gradlew :app:bootJar --no-daemon

FROM eclipse-temurin:25-jre
WORKDIR /app

RUN groupadd -g 1001 appuser && useradd -u 1001 -g appuser appuser

COPY --from=builder --chown=appuser:appuser /app/app/build/libs/*.jar app.jar

USER appuser

EXPOSE 9093

HEALTHCHECK --interval=30s --timeout=5s --start-period=30s --retries=3 \
  CMD bash -c '</dev/tcp/localhost/9093' || exit 1

ENTRYPOINT ["java", "-jar", "app.jar"]
