
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


## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/laerciothleal/spring-boot-api-first.git
   cd spring-boot-api-first
   ```

2. **Construir e Executar a Aplicação**
   
   2.1. Compile e execute a aplicação:
   
   ```bash
   mvn clean compile
   mvn spring-boot:run
   ```

   2.2 Via docker:

   Utilize o seguinte arquivo `docker-compose.yml`:

   ```yaml
   services:
     backend:
       build:
         dockerfile: ./Dockerfile
       ports:
         - "8080:8080"
       volumes:
         - .m2:/root/.m2
       stdin_open: true
       tty: true
   ```
   - **Comandos para subir o ambiente**:
     ```bash
     docker-compose up --build
     ```

3. Acesse a aplicação:
   - **Swagger UI**: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)


## Estrutura do Projeto
- **src/main/java/com/backend/controller**: Controladores gerados e customizados.
- **target/generated-sources/openapi/src/main/java/com/backend/controller/ConvertApi.java**: Classe gerada para fazer a conversao

## Autor
- **Desenvolvedor**: Laercio Leal
- **LinkedIn**: https://www.linkedin.com/in/laercioth/
