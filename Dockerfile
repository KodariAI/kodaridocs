FROM gradle:8.14-jdk21-alpine AS builder
WORKDIR /app

COPY build.gradle settings.gradle gradlew gradlew.bat ./
COPY gradle ./gradle
RUN chmod +x ./gradlew

RUN ./gradlew dependencies --no-daemon

COPY src ./src

RUN ./gradlew bootJar --no-daemon

FROM amazoncorretto:21-alpine
WORKDIR /app

RUN addgroup -g 1001 -S appuser && adduser -u 1001 -S appuser -G appuser

COPY --from=builder --chown=appuser:appuser /app/build/libs/*.jar app.jar

USER appuser

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "app.jar"]
