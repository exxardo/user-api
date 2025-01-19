# User API

### Esta é a primeira parte do projeto e é possivel encontrar a segunda aqui: [Microsserviço de Email](https://github.com/exxardo/email-ms).

## Descrição

O **User API** é um microsserviço responsável por gerenciar os usuários do sistema. Ele permite realizar operações como salvar usuários no banco de dados e publicar mensagens para outros serviços através do RabbitMQ.

---

## Problema Resolvido

Este projeto resolve o problema de comunicação desacoplada entre microsserviços, permitindo que eventos relacionados a usuários sejam publicados e consumidos de forma assíncrona. Além disso, centraliza o gerenciamento de usuários em um único serviço, garantindo consistência e escalabilidade.

---

## Arquitetura do Sistema

Abaixo está a arquitetura geral do sistema, que inclui o **User API**, o **Email Microservice**, e a comunicação via RabbitMQ utilizando a CloudAMQP:

![Arquitetura do Sistema](https://github.com/exxardo/user-api/blob/0999e47830665f013e7e9c5b7526ad8a8fe775df/Arquitetura%20do%20Sistema.png)

### Explicação da Arquitetura

- **User API**: Salva o usuário criado em um banco de dados PostgreeSQL e publica eventos relacionados aos usuários no RabbitMQ.
- **RabbitMQ**: Atua como um broker de mensagens, permitindo comunicação assíncrona entre os microsserviços.
- **Email Microservice**: Consome as mensagens publicadas pelo User API, envia notificações por e-mail e salva informações relacionadas a mensagem enviada em uma tabela no banco de dados PostgreeSQL.

Essa arquitetura foi escolhida por ser escalável, desacoplada e permitir a fácil adição de novos consumidores sem impactar o serviço principal.

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

## Endpoints da API

### `POST /users`
Cadastra um novo usuário no sistema.

#### Exemplo de Requisição:
```json
{
  "name": "João Silva",
  "email": "joao.silva@email.com"
}
```

#### Exemplo de Resposta (201 Created):
```json
{
  "id": "123e4567-e89b-12d3-a456-426614174000",
  "name": "João Silva",
  "email": "joao.silva@email.com"
}
```

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

## Padrões Adotados

1. **Arquitetura em Camadas**: O código segue a separação em camadas (Controller, Service, Repository) para maior organização e responsabilidade única.
2. **Comunicação Assíncrona**: Utilização do RabbitMQ para desacoplar os serviços e permitir escalabilidade horizontal.
3. **DTOs (Data Transfer Objects)**: Uso de DTOs para transferir dados entre as camadas, garantindo encapsulamento e validações.

---

## Guia de Estilo

O projeto segue as boas práticas recomendadas pelo Java Code Conventions:
1. Nomes descritivos para classes, métodos e variáveis.
2. Uso consistente de indentação e espaçamento.
3. Documentação com comentários Javadoc em todas as classes públicas.

---

## Como Contribuir

1. Faça um fork deste repositório.
2. Crie uma branch com sua feature ou correção: `git checkout -b minha-feature`.
3. Commit suas alterações: `git commit -m 'Adiciona nova feature'`.
4. Envie para o repositório remoto: `git push origin minha-feature`.
5. Abra um Pull Request explicando suas alterações.

---

## Lições Aprendidas

Durante o desenvolvimento deste projeto, aprendemos:
1. A importância da comunicação assíncrona para sistemas distribuídos.
2. Como configurar e utilizar o RabbitMQ com Spring Boot.
3. Boas práticas na organização de microsserviços e integração com bancos de dados relacionais.

---

## Fontes Utilizadas para Consulta

- [DevMedia](https://www.devmedia.com.br/conheca-o-spring-transactional-annotations/32472)
- [Google Senhas](https://support.google.com/accounts/answer/185833)
- [CloudAMQP](https://www.cloudamqp.com/blog/part4-rabbitmq-for-beginners-exchanges-routing-keys-bindings.html)
- [Spring Boot](https://docs.spring.io/spring-boot/index.html)

---

## Contato

Para dúvidas ou sugestões, entre em contato através do meu [LinkedIn](https://www.linkedin.com/in/eduardoramiro).
