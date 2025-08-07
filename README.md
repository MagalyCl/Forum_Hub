# FórumHub - API REST com Spring Boot

FórumHub é um projeto back-end desenvolvido com **Spring Boot**, que simula um fórum simples com funcionalidades completas de **CRUD** para gerenciamento de tópicos. O objetivo principal é aplicar os conceitos de arquitetura RESTful, validações de dados, persistência com banco de dados relacional e segurança com autenticação/autorização.

## Funcionalidades

A API permite aos usuários:

-  **Criar** um novo tópico  
-  **Listar** todos os tópicos criados  
-  **Consultar** um tópico específico por ID  
-  **Atualizar** um tópico existente  
-  **Deletar** um tópico  

##  Tecnologias utilizadas

- **Java 17+**
- **Spring Boot**
- **MySQL**
- **Maven**
- **JWT (JSON Web Token)** para autenticação

## Exemplos de uso JSON

### 1. Cadastro de Usuário

- **POST** `/usuario/cadastro`

```json
{
  "nome": "Carlos Andrade",
  "email": "carlos.andrade@email.com",
  "senha": "senhaForte123"
}
```

### 2. Login (Autenticação JWT)

- **POST** `/login`  

```json
{
  "email": "carlos.andrade@email.com",
  "senha": "senhaForte123"
}
```

### 3 - Cadastro de Tópicos

- **POST** `/topicos{id}`
  
```json
{
  "titulo": "Erro ao conectar com o MySQL",
  "mensagem": "Estou usando Spring Boot com MySQL e recebo um erro de autenticação ao tentar conectar.",
  "autor": "Carlos Andrade",
  "curso": "Spring Boot"
}
```

### 4. Listar Tópicos

- **GET** `/topicos`
  
 ```json
  {
  "id": 2,
  "titulo": "Dúvida sobre uso de JPA com MySQL",
  "mensagem": "Quero entender como mapear relacionamentos OneToMany no Spring Boot usando MySQL.",
  "dataCriacao": "2025-01-16T13:16:00",
  "status": "NAO_RESPONDIDO",
  "autor": "ana_souza",
  "curso": "Banco de Dados"
  }
  ```

### 5. Detalhar um Tópico

- **GET** `/topicos/{id}`
  
```json
  {
  "id": 2,
  "titulo": "Dúvida sobre uso de JPA com MySQL",
  "mensagem": "Quero entender como mapear relacionamentos OneToMany no Spring Boot usando MySQL.",
  "dataCriacao": "2025-01-16T13:16:00",
  "status": "NAO_RESPONDIDO",
  "autor": "ana_souza",
  "curso": "Banco de Dados"
  }
  ```
### 6. Atualizar um Tópico
  
  - **PUT** `/topicos`

```json
  {
  "id": 2,
  "titulo": "Como usar relacionamentos no JPA com MySQL?",
  "mensagem": "Gostaria de um exemplo prático usando @OneToMany e @ManyToOne no Spring Data JPA com MySQL.",
  "curso": "Banco de Dados"
}
```

### 7 - Exclusão de um Tópico:

Endpoint: /topicos/{id}

Método: DELETE

Resposta: 204 No Content se o tópico for excluído com sucesso.
