# Etapa 1: Build da aplicação
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

COPY . .

# 🚨 Aqui garantimos que o mvnw tenha permissão de execução
RUN chmod +x ./mvnw && ./mvnw clean package -DskipTests

# Etapa 2: Imagem final
FROM eclipse-temurin:21-jdk
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
