# Checkpoint 1 - API de Pedidos

Este projeto é uma API REST desenvolvida com Spring Boot para gerenciamento de pedidos.

## Endpoints

### Pedidos

- GET `/pedidos` - Retorna a lista de todos os pedidos
- GET `/pedidos/{id}` - Retorna um pedido específico por ID
- POST `/pedidos` - Cria um novo pedido
- PUT `/pedidos/{id}` - Atualiza um pedido existente
- DELETE `/pedidos/{id}` - Remove um pedido

## Exemplos de Requisições

### Criar um Pedido
```json
POST /pedidos
{
    "clienteNome": "João Silva",
    "valorTotal": 150.50
}
```

### Atualizar um Pedido
```json
PUT /pedidos/1
{
    "clienteNome": "João Silva Atualizado",
    "valorTotal": 200.00
}
```

## Banco de Dados

O projeto utiliza o H2 Database (banco de dados em memória). 
Você pode acessar o console do H2 em: http://localhost:8080/h2-console

## Como Executar

1. Clone o repositório
2. Execute `mvn spring-boot:run`
3. A API estará disponível em `http://localhost:8080`