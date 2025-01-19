# User API

## Descrição
O **User API** é um microsserviço responsável por gerenciar os usuários do sistema. Ele permite realizar operações como salvar usuários no banco de dados e publicar mensagens para outros serviços através do RabbitMQ.

---

## Arquitetura do Sistema

Abaixo está a arquitetura geral do sistema, que inclui o **User API**, o **Email Microservice**, e a comunicação via RabbitMQ utilizando a CloudAMQP:

![Arquitetura do Sistema](# User API

## Descrição
O **User API** é um microsserviço responsável por gerenciar os usuários do sistema. Ele permite realizar operações como salvar usuários no banco de dados e publicar mensagens para outros serviços através do RabbitMQ.

---

## Arquitetura do Sistema

Abaixo está a arquitetura geral do sistema, que inclui o **User API**, o **Email Microservice**, e a comunicação via RabbitMQ utilizando a CloudAMQP:

![Arquitetura do Sistema](# User API

## Descrição
O **User API** é um microsserviço responsável por gerenciar os usuários do sistema. Ele permite realizar operações como salvar usuários no banco de dados e publicar mensagens para outros serviços através do RabbitMQ.

---

## Arquitetura do Sistema

Abaixo está a arquitetura geral do sistema, que inclui o **User API**, o **Email Microservice**, e a comunicação via RabbitMQ utilizando a CloudAMQP:

![Arquitetura do Sistema](# User API

## Descrição
O **User API** é um microsserviço responsável por gerenciar os usuários do sistema. Ele permite realizar operações como salvar usuários no banco de dados e publicar mensagens para outros serviços através do RabbitMQ.

---

## Arquitetura do Sistema

Abaixo está a arquitetura geral do sistema, que inclui o **User API**, o **Email Microservice**, e a comunicação via RabbitMQ utilizando a CloudAMQP:

![Arquitetura do Sistema](Arquitetura do Sistema.png)

---

## Funcionalidades
- **Cadastro de Usuários:** Permite salvar os dados de um usuário no banco de dados PostgreSQL.
- **Publicação de Mensagens:** Publica mensagens no RabbitMQ para notificar outros serviços sobre eventos relacionados ao usuário.

---

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **PostgreSQL**
- **RabbitMQ** (CloudAMQP)
- **Maven**

---

## Configuração

### Pré-requisitos
- Java 17 instalado.
- PostgreSQL configurado.
- Conta na CloudAMQP para acesso ao RabbitMQ.

### Configuração do `application.properties`
No arquivo `src/main/resources/application.properties`, configure as seguintes propriedades:

```properties
spring.datasource.url=jdbc:postgresql://<host>:<port>/<database>
spring.datasource.username=<username>
spring.datasource.password=<password>
broker.queue.email.name=<nome-da-fila>
spring.rabbitmq.host=<host-rabbitmq>
spring.rabbitmq.username=<username>
spring.rabbitmq.password=<password>
```

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
   cd user-api
   ```

2. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

3. Acesse a aplicação:
    - Endpoint principal: `POST /users` para cadastrar um usuário.

---

## Estrutura do Projeto

- `models/`: Contém as entidades do sistema.
- `controllers/`: Gerencia os endpoints da API.
- `services/`: Contém a lógica de negócios.
- `repositories/`: Gerencia a persistência no banco de dados.
- `producers/`: Publica mensagens no RabbitMQ.

---

## Contato
Para dúvidas ou sugestões, entre em contato com [seu-email@dominio.com].
)

---

## Funcionalidades
- **Cadastro de Usuários:** Permite salvar os dados de um usuário no banco de dados PostgreSQL.
- **Publicação de Mensagens:** Publica mensagens no RabbitMQ para notificar outros serviços sobre eventos relacionados ao usuário.

---

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **PostgreSQL**
- **RabbitMQ** (CloudAMQP)
- **Maven**

---

## Configuração

### Pré-requisitos
- Java 17 instalado.
- PostgreSQL configurado.
- Conta na CloudAMQP para acesso ao RabbitMQ.

### Configuração do `application.properties`
No arquivo `src/main/resources/application.properties`, configure as seguintes propriedades:

```properties
spring.datasource.url=jdbc:postgresql://<host>:<port>/<database>
spring.datasource.username=<username>
spring.datasource.password=<password>
broker.queue.email.name=<nome-da-fila>
spring.rabbitmq.host=<host-rabbitmq>
spring.rabbitmq.username=<username>
spring.rabbitmq.password=<password>
```

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
   cd user-api
   ```

2. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

3. Acesse a aplicação:
    - Endpoint principal: `POST /users` para cadastrar um usuário.

---

## Estrutura do Projeto

- `models/`: Contém as entidades do sistema.
- `controllers/`: Gerencia os endpoints da API.
- `services/`: Contém a lógica de negócios.
- `repositories/`: Gerencia a persistência no banco de dados.
- `producers/`: Publica mensagens no RabbitMQ.

---

## Contato
Para dúvidas ou sugestões, entre em contato com [seu-email@dominio.com].
)

---

## Funcionalidades
- **Cadastro de Usuários:** Permite salvar os dados de um usuário no banco de dados PostgreSQL.
- **Publicação de Mensagens:** Publica mensagens no RabbitMQ para notificar outros serviços sobre eventos relacionados ao usuário.

---

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **PostgreSQL**
- **RabbitMQ** (CloudAMQP)
- **Maven**

---

## Configuração

### Pré-requisitos
- Java 17 instalado.
- PostgreSQL configurado.
- Conta na CloudAMQP para acesso ao RabbitMQ.

### Configuração do `application.properties`
No arquivo `src/main/resources/application.properties`, configure as seguintes propriedades:

```properties
spring.datasource.url=jdbc:postgresql://<host>:<port>/<database>
spring.datasource.username=<username>
spring.datasource.password=<password>
broker.queue.email.name=<nome-da-fila>
spring.rabbitmq.host=<host-rabbitmq>
spring.rabbitmq.username=<username>
spring.rabbitmq.password=<password>
```

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
   cd user-api
   ```

2. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

3. Acesse a aplicação:
    - Endpoint principal: `POST /users` para cadastrar um usuário.

---

## Estrutura do Projeto

- `models/`: Contém as entidades do sistema.
- `controllers/`: Gerencia os endpoints da API.
- `services/`: Contém a lógica de negócios.
- `repositories/`: Gerencia a persistência no banco de dados.
- `producers/`: Publica mensagens no RabbitMQ.

---

## Contato
Para dúvidas ou sugestões, entre em contato com [seu-email@dominio.com].
)

---

## Funcionalidades
- **Cadastro de Usuários:** Permite salvar os dados de um usuário no banco de dados PostgreSQL.
- **Publicação de Mensagens:** Publica mensagens no RabbitMQ para notificar outros serviços sobre eventos relacionados ao usuário.

---

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **PostgreSQL**
- **RabbitMQ** (CloudAMQP)
- **Maven**

---

## Configuração

### Pré-requisitos
- Java 17 instalado.
- PostgreSQL configurado.
- Conta na CloudAMQP para acesso ao RabbitMQ.

### Configuração do `application.properties`
No arquivo `src/main/resources/application.properties`, configure as seguintes propriedades:

```properties
spring.datasource.url=jdbc:postgresql://<host>:<port>/<database>
spring.datasource.username=<username>
spring.datasource.password=<password>
broker.queue.email.name=<nome-da-fila>
spring.rabbitmq.host=<host-rabbitmq>
spring.rabbitmq.username=<username>
spring.rabbitmq.password=<password>
```

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
   cd user-api
   ```

2. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

3. Acesse a aplicação:
    - Endpoint principal: `POST /users` para cadastrar um usuário.

---

## Estrutura do Projeto

- `models/`: Contém as entidades do sistema.
- `controllers/`: Gerencia os endpoints da API.
- `services/`: Contém a lógica de negócios.
- `repositories/`: Gerencia a persistência no banco de dados.
- `producers/`: Publica mensagens no RabbitMQ.

---

## Fontes utilizadas para consulta

- [DevMedia](https://www.devmedia.com.br/conheca-o-spring-transactional-annotations/32472)
- [Google Senhas](https://support.google.com/accounts/answer/185833)
- [CloudAMQP](https://www.cloudamqp.com/blog/part4-rabbitmq-for-beginners-exchanges-routing-keys-bindings.html)
- [Spring Boot](https://docs.spring.io/spring-boot/index.html)


---
## Contato
Para dúvidas ou sugestões, entre em contato através do meu [LinkedIn](https://www.linkedin.com/in/eduardoramiro).
