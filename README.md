# 🛒 # todolist-api

Backend REST desenvolvido com Java e Spring Boot para gerenciamento de tarefas

---

# 📌 Visão Geral

```text
Frontend Angular
   ↓
Spring Boot REST API
   ↓
Oracle DB
```

---

# ⚙️ Tecnologias Utilizadas

- JAVA 1.8
- Spring Boot
- Spring Data JPA
- Oracle DB
- Maven
- Docker

---

# 🏗️ Funcionalidades

## ✅ CRUD Básico

- Criar Tarefas
- Atualizar Tarefas
- Listar Tarefas
- Remover Tarefas

---

## ✅ Banco de Dados em Contêiner

- Utilizado o arquivo `docker-compose.yml`

---

# 📂 Estrutura do Projeto

```text
todolist-api/
│
├── src/main/java/com/todolist/todolistapi/
│   ├── controller/
│   ├── model/
│   ├── repository/
│   ├── service/
│   └── TodolistApiApplication.java
│
├── docker-compose.yml
├── package.json
├── pom.xml
└── README.md
```

---

# 📈 Próximas Evoluções

- Segurança
- Testes
- GitHub Actions
- Evolução da Arquitetura

---

# ✨ Projeto Relacionado

Frontend Angular:
```text
todolist-apptodolist-app
```

---

# 🚀 Primeiros Passos no Projeto

1. Faça um clone do projeto
2. Importe o projeto na IDE como Maven Project
3. Caso não tenha o Oracle DB instalado, execute o comando `docker-compose up`
4. Execute o comando `mvn install` (ou baixe as dependências)
5. Execute o projeto pela classe TodolistApiApplication.java (o esquema do banco será atualizado automaticamente)
6. Pronto! Agora você tem uma API REST local na porta 8080

---

# 👨‍💻 Autor

Wenner Baima Muniz