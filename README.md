
# API First Example

## Descrição do Projeto
Este projeto é um exemplo de aplicação utilizando o conceito **API First** com Spring Boot. A aplicação foi gerada a partir de uma especificação OpenAPI e implementa operações para conversão de moedas e gerenciamento de dados relacionados.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.3.6**
- **SpringDoc OpenAPI** (Swagger UI para documentação)
- **Lombok** (redução de boilerplate code)

## Funcionalidades
- **Conversão de Moedas**: Endpoints para conversão entre moedas com base em taxas pré-configuradas.
- **Documentação Interativa**: Swagger UI para explorar e testar a API.


## Pré-requisitos
- **JDK 17+**
- **Maven 3.8+**

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/laerciothleal/spring-boot-api-first.git
   cd spring-boot-api-first
   ```

2. Compile e execute a aplicação:
   ```bash
   mvn clean compile
   mvn spring-boot:run
   ```

3. Acesse a aplicação:
   - **Swagger UI**: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)


## Estrutura do Projeto
- **src/main/java/com/backend/controller**: Controladores gerados e customizados.
- **target/generated-sources/openapi/src/main/java/com/backend/controller/ConvertApi.java**: Classe gerada para fazer a conversao

## Autor
- **Desenvolvedor**: Laercio Leal
- **LinkedIn**: https://www.linkedin.com/in/laercioth/
