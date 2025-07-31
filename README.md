# Exemplo com Spring Boot e Vaadin

Este repositório contém um exemplo de aplicação desenvolvida durante um treinamento online, utilizando:
- **Spring Boot** para o back-end
- **Vaadin** para o front-end

> **Java utilizado:** Amazon Corretto OpenJDK 11

## Branches

- `main`: código-fonte com Vaadin 23
- `tomcat9_war`: código-fonte configurado para Tomcat 9 com Java 11

## Demo Online
Acesse a demonstração oficial da Vaadin em: [https://crm.demo.vaadin.com/login](https://crm.demo.vaadin.com/login)

## Tutorial Oficial
O tutorial em texto está disponível na [Documentação Vaadin](https://vaadin.com/docs/latest/flow/tutorials/in-depth-course).


## Banco de Dados com Docker Compose
O projeto utiliza MySQL como banco de dados. Para subir o banco localmente, execute:

```
docker compose up -d
```

Isso irá criar um container MySQL com as credenciais e banco já configurados para a aplicação.

## Como rodar localmente
1. Certifique-se de ter o **Java 11** instalado.
2. Certifique-se de que o banco de dados (MySQL) está rodando via Docker Compose (veja acima).
3. Execute o comando abaixo na raiz do projeto para iniciar a aplicação:
   ```
   ./mvnw spring-boot:run
   ```
   Ou, no Windows:
   ```
   mvnw.cmd spring-boot:run
   ```
4. Acesse [http://localhost:8080](http://localhost:8080) no navegador.

## Versões do Java Runtime Environment (JRE) para Tomcat
| Valor | Versão Java |
|-------|-------------|
| 49    | Java 5      |
| 50    | Java 6      |
| 51    | Java 7      |
| 52    | Java 8      |
| 53    | Java 9      |
| 54    | Java 10     |
| 55    | Java 11     |
| 56    | Java 12     |
| 57    | Java 13     |
| 58    | Java 14     |
| 59    | Java 15     |
| 60    | Java 16     |
| 61    | Java 17     |
| 62    | Java 18     |
| 63    | Java 19     |
| 64    | Java 20     |
| 65    | Java 21     |
