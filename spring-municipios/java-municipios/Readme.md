# 🏙️ Consulta de Municípios (IBGE)

Aplicação desenvolvida em **Spring Boot** que consome a API pública do IBGE para consulta de municípios brasileiros.

## 🚀 Tecnologias utilizadas

* Java 17
* Spring Boot
* Thymeleaf
* Docker

## 🔎 Funcionalidades

* Buscar municípios por nome
* Exibir ID, nome e estado
* Integração com API do IBGE

## 🐳 Executando com Docker

```bash
docker build -t java-municipios .
docker run -p 8080:8080 java-municipios
```

Acesse: http://localhost:8080

## 📦 Estrutura do projeto

* Controller → entrada HTTP
* Service → lógica e consumo da API
* Model → estrutura dos dados
* Template → renderização HTML

## 📌 Observações

Projeto com foco em aprendizado de Spring Boot e integração com APIs externas.
