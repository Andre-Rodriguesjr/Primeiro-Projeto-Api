# Primeiro-Projeto-Api

 🎬 Cinema API

Este é o meu primeiro projeto utilizando **Spring Boot**.  
Com ele estou praticando e entendendo como funciona o desenvolvimento de uma API REST utilizando arquitetura em camadas.

---

## 🚀 Sobre o Projeto

A Cinema API é uma aplicação backend desenvolvida para gerenciar filmes.

Ela permite:

- ✅ Cadastrar filmes
- ✅ Listar todos os filmes
- ✅ Buscar filme por ID
- ✅ Atualizar filme
- ✅ Deletar filme

O projeto foi estruturado seguindo o padrão:

- Controller
- Service
- Repository
- Entity

---

## 🏗 Arquitetura

A aplicação foi organizada em camadas:

- **Entity** → Representa a tabela no banco de dados.
- **Repository** → Interface que estende o JpaRepository para realizar operações no banco.
- **Service** → Contém as regras de negócio da aplicação.
- **Controller** → Responsável por receber as requisições HTTP e chamar o Service.

```
cinema/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/cinema/
│   │   │       ├── controller/
│   │   │       │   └── FilmeController.java
│   │   │       ├── entity/
│   │   │       │   └── Filme.java
│   │   │       ├── repository/
│   │   │       │   └── FilmeRepository.java
│   │   │       ├── service/
│   │   │       │   └── FilmeService.java
│   │   │       └── CinemaApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   └── test/
└── pom.xml
---

## 🛠 Tecnologias Utilizadas

- ☕ Java 17+
- 🌱 Spring Boot
- 🗄 Spring Data JPA
- 🧠 H2 Database (em memória)
- 📦 Maven
- 🔍 ApiDog (para testes dos endpoints)

---

## 📌 Endpoints Disponíveis

### 🔹 Criar Filme
`POST /filmes`

### 🔹 Listar Filmes
`GET /filmes`

### 🔹 Buscar por ID
`GET /filmes/{id}`

### 🔹 Atualizar Filme
`PUT /filmes/{id}`

### 🔹 Deletar Filme
`DELETE /filmes/{id}`

---


## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de praticar e estudar sobre:

- Estruturação de uma API REST
- Arquitetura em camadas
- Integração com banco de dados
- CRUD completo com Spring Boot

---

👨‍💻 Projeto desenvolvido para fins de estudo.
