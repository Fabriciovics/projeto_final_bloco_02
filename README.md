# Projeto E-commerce de Farmácia - Backend com Spring Boot

<br />

<div align="center">
    <img src="https://i.imgur.com/w8tTOuT.png" title="source: imgur.com" /> 
</div>

<br />

<div align="center">
    <img src="https://img.shields.io/github/languages/top/Fabriciovics/projeto_final_bloco_02?style=flat-square" />
    <img src="https://img.shields.io/github/repo-size/Fabriciovics/projeto_final_bloco_02?style=flat-square" />
    <img src="https://img.shields.io/github/languages/count/Fabriciovics/projeto_final_bloco_02?style=flat-square" />
    <img src="https://img.shields.io/github/last-commit/Fabriciovics/projeto_final_bloco_02?style=flat-square" />
    <img src="https://img.shields.io/github/issues/Fabriciovics/projeto_final_bloco_02?style=flat-square" />
    <img src="https://img.shields.io/github/issues-pr/Fabriciovics/projeto_final_bloco_02?style=flat-square" />
    <img src="https://img.shields.io/badge/status-construção-yellow" alt="Status: Em Construção">
</div>

<br />

## Descrição do Projeto

Este projeto consiste em uma API RESTful para uma farmácia online. Os usuários podem listar produtos farmacêuticos e de bem-estar, categorizá-los e interagir com um sistema de usuários (cadastro, login, etc.). O objetivo principal é demonstrar a criação de um backend funcional utilizando Spring Boot e os conceitos aprendidos durante o Bloco 02 do bootcamp da Generation Brasil.

## Tecnologias Utilizadas

* **Linguagem de Programação:** Java
* **Framework:** Spring Boot
* **Banco de Dados:** MySQL
* **Outras Bibliotecas/Ferramentas:** Lombok, Spring Security, Bean Validation, Jackson

## Configuração e Execução

1.  **Pré-requisitos:**

    * Java JDK 17 ou superior.
    * Maven instalado.
    * Um banco de dados MySQL em execução.
    * Postman ou Insomnia para testar a API.
2.  **Configuração do Banco de Dados:**

    * Crie um banco de dados chamado `db_farmacia`.
    * Configure as credenciais do banco de dados (URL, usuário, senha) no arquivo `src/main/resources/application.properties`.
3.  **Executando a Aplicação:**

    * Clone este repositório: `git clone https://github.com/Fabriciovics/projeto_final_bloco_02.git`
    * Navegue até o diretório do projeto: `cd projeto_final_bloco_02`
    * Execute a aplicação usando Maven: `./mvnw spring-boot:run`
4.  **Acessando a API:**

    * A API estará disponível em `http://localhost:8080`.

## Endpoints da API

* `/usuarios`:

    * `POST /usuarios/cadastrar`: Cadastra um novo usuário.
    * `POST /usuarios/logar`: Autentica um usuário e retorna um token JWT.
    * `GET /usuarios/{id}`: Retorna um usuário específico pelo ID (requer autenticação).
* `/categorias`:

    * `GET /categorias`: Retorna todas as categorias.
    * `GET /categorias/{id}`: Retorna uma categoria específica pelo ID.
    * `POST /categorias`: Cria uma nova categoria (requer autenticação).
    * `PUT /categorias/{id}`: Atualiza uma categoria existente (requer autenticação).
    * `DELETE /categorias/{id}`: Exclui uma categoria (requer autenticação).
* `/produtos`:

    * `GET /produtos`: Retorna todos os produtos.
    * `GET /produtos/{id}`: Retorna um produto específico pelo ID.
    * `POST /produtos`: Cria um novo produto (requer autenticação).
    * `PUT /produtos/{id}`: Atualiza um produto existente (requer autenticação).
    * `DELETE /produtos/{id}`: Exclui um produto (requer autenticação).

## Exemplos de Uso

* **Cadastrar um usuário:**

    ```
    POST /usuarios/cadastrar
    Content-Type: application/json

    {
        "nome": "Nome do Usuário",
        "usuario": "email@example.com",
        "senha": "senhaforte123"
    }
    ```
* **Criar uma categoria (requer token JWT):**

    ```
    POST /categorias
    Content-Type: application/json
    Authorization: Bearer SEU_TOKEN_JWT

    {
        "titulo": "Medicamentos"
    }
    ```

    Resposta:

    ```json
    {
        "id": 1,
        "titulo": "Medicamentos",
        "produtos": []
    }
    ```

## Contribuição

Sinta-se à vontade para abrir issues e propor melhorias! Pull requests são bem-vindos.


## Autor

* Fabricio Viana - [Fabriciovics](https://github.com/Fabriciovics)
## 8. Contato

Desenvolvido por [**Fabriciovics**](https://github.com/Fabriciovics)  
📧 Fabriciovics@gmail.com
