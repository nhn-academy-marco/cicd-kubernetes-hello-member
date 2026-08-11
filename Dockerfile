FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
COPY .mvn/ .mvn
COPY mvnw .
RUN chmod +x mvnw
RUN ./mvnw package -DskipTests

# 2단계: 실행용 경량 이미지
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]