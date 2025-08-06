# 📚 livros-api

Projeto backend desenvolvido em **Java + Spring Boot** para servir como API de um sistema de cadastro e gerenciamento de livros.  
O objetivo principal deste projeto é **estudo e prática** de desenvolvimento orientado por contrato de API, realizando a integração entre **frontend** e **backend** de forma desacoplada.

---

## 🎯 Objetivo do Projeto

Este projeto foi criado para **estudos de integração front-end e back-end** usando um **contrato de API** previamente definido.  
A proposta é que o frontend (`livros-ui`) e o backend (`livros-api`) sejam desenvolvidos de forma independente, mas compatíveis, garantindo que ambos sigam a especificação acordada.

📌 Repositório do frontend: [livros-ui](https://github.com/RaffaelBino/livros-ui)  
📌 API publicada: [Swagger - livros-api](https://livros-api-production.up.railway.app/swagger-ui/index.html#/)

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database** (para ambiente local)
- **PostgreSQL** (em produção no Railway)
- **Springdoc OpenAPI** (Swagger)
- **Lombok**
- **Railway** (deploy)

---

## 📦 Como Rodar o Projeto Localmente

### 1️⃣ Pré-requisitos

- **Java 21+**
- **Maven 3.8+**
- **Git**

### 2️⃣ Clonar o Repositório

```bash
git clone https://github.com/willfpinheiro/livros-api.git
cd livros-api
```

### 3️⃣ Configurar Banco de Dados

Por padrão, o projeto usa **H2 em memória** para desenvolvimento.  
Não é necessário configurar um banco externo para testes locais.

Se desejar usar **PostgreSQL**, ajuste o `application.yml` com as credenciais do seu banco.

### 4️⃣ Rodar a Aplicação

```bash
mvn spring-boot:run
```

A API estará disponível em:

```
http://localhost:8080
```

### 5️⃣ Acessar Documentação da API

- **Swagger UI**: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## 🔗 Integração com o Frontend

Este backend foi desenvolvido para ser consumido pelo projeto **[livros-ui](https://github.com/RaffaelBino/livros-ui)**, construído em **Angular**.

Fluxo da integração:
1. O contrato de API foi definido e documentado no Swagger.
2. O frontend consome os endpoints conforme especificado.
3. O backend valida e persiste os dados, retornando as respostas conforme o contrato.

---

## 🚀 Deploy

O projeto está disponível em produção no Railway:

- **Swagger Produção**: [https://livros-api-production.up.railway.app/swagger-ui/index.html](https://livros-api-production.up.railway.app/swagger-ui/index.html)

---

## 👨‍💻 Autor

Projeto backend desenvolvido por **Will Pinheiro** como parte de um estudo de desenvolvimento de aplicações integradas front/back, seguindo contrato de API.
