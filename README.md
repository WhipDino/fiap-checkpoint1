# API de Gerenciamento de Pedidos

## 📝 Descrição
API REST desenvolvida com Spring Boot para gerenciamento de pedidos, permitindo operações básicas de CRUD (Criar, Ler, Atualizar e Deletar) para pedidos.

## 🛠️ Tecnologias Utilizadas
- Java 17
- Spring Boot 3.1.7
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## 📋 Pré-requisitos
- Java JDK 17
- Maven

## 🚀 Como Executar
1. Clone o repositório
```bash
git clone [url-do-repositório]
```

2. Entre na pasta do projeto
```bash
cd checkpoint1
```

3. Execute o projeto
```bash
mvn spring-boot:run
```

4. A aplicação estará disponível em `http://localhost:8080`

## 🔗 Endpoints da API

### Listar todos os pedidos
```http
GET /pedidos
```

### Buscar pedido por ID
```http
GET /pedidos/{id}
```

### Criar novo pedido
```http
POST /pedidos
```
Corpo da requisição:
```json
{
    "clienteNome": "João Silva",
    "valorTotal": 150.50
}
```

### Atualizar pedido
```http
PUT /pedidos/{id}
```
Corpo da requisição:
```json
{
    "clienteNome": "João Silva",
    "valorTotal": 200.00
}
```

### Deletar pedido
```http
DELETE /pedidos/{id}
```

## 📊 Banco de Dados
O projeto utiliza o H2 Database (banco de dados em memória).
- Console do H2: `http://localhost:8080/h2-console`
- URL JDBC: `jdbc:h2:mem:testdb`
- Usuário: `sa`
- Senha: ` ` (em branco)

## 📝 Estrutura do Projeto
```
src/main/java/br/com/fiap/checkpoint1/
├── controller/
│   └── PedidoController.java
├── model/
│   └── Pedido.java
├── repository/
│   └── PedidoRepository.java
├── service/
│   └── PedidoService.java
└── Checkpoint1Application.java
```

## 🔍 Validações
- Nome do cliente não pode ser vazio
- Valor total não pode ser nulo ou negativo
- Data do pedido é preenchida automaticamente com a data atual

## 🧪 Testando a API

### Exemplos de Requisições

#### Criar Pedido
```http
POST http://localhost:8080/pedidos
Content-Type: application/json

{
    "clienteNome": "Maria Santos",
    "valorTotal": 299.99
}
```

#### Atualizar Pedido
```http
PUT http://localhost:8080/pedidos/1
Content-Type: application/json

{
    "clienteNome": "Maria Santos Silva",
    "valorTotal": 350.00
}
```

#### Listar Todos os Pedidos
```http
GET http://localhost:8080/pedidos
```

#### Buscar Pedido Específico
```http
GET http://localhost:8080/pedidos/1
```

#### Deletar Pedido
```http
DELETE http://localhost:8080/pedidos/1
```

## ⚠️ Tratamento de Erros
- 404: Pedido não encontrado
- 400: Dados inválidos na requisição
- 500: Erro interno do servidor

## 📦 Dependências Principais
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
    </dependency>
</dependencies>
```

## 👥 Autor
[Seu Nome]

## 📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
