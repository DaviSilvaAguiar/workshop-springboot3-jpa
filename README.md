Workshop Spring Boot 3 com JPA
Este projeto foi desenvolvido durante o curso Java COMPLETO Programação Orientada a Objetos + Projetos, ministrado pelo professor Nelio Alves na Udemy. Ele tem como objetivo explorar os principais recursos do Spring Boot 3, com foco em APIs RESTful e o uso da JPA (Java Persistence API) para persistência de dados.

🧩 Funcionalidades
API RESTful: Implementação de uma API para gerenciar usuários, pedidos e produtos.
Banco de Dados Relacional: Uso do H2 (em memória) ou bancos como MySQL para persistência de dados.
Operações CRUD: Endpoints para criação, leitura, atualização e exclusão de dados em todas as entidades.
Relacionamentos JPA: Modelagem de relacionamentos como um-para-muitos, muitos-para-um e muitos-para-muitos.
Tratamento de Exceções: Mecanismo robusto para capturar e tratar erros, garantindo consistência nas respostas.
📚 Sobre o Desenvolvimento
O projeto foi desenvolvido com foco em:

Configuração e uso do Spring Boot 3 para aplicações modernas.
Persistência de dados com JPA, utilizando anotações como @Entity, @OneToMany, @ManyToOne, etc.
Criação de APIs RESTful seguindo boas práticas de desenvolvimento.
Uso de bancos de dados relacionais com JPA e o padrão Repository.
Paginação, ordenação e outras operações avançadas.
🚀 Como Executar
Certifique-se de ter o Java 17+ e Maven instalados.
Clone o repositório:
git clone https://github.com/DaviSilvaAguiar/workshop-springboot3-jpa.git  
Navegue até a pasta do projeto:
cd workshop-springboot3-jpa  
Configure o banco de dados no arquivo application.properties. Por padrão, o projeto está configurado para usar o H2:
properties
spring.datasource.url=jdbc:h2:mem:testdb  
spring.datasource.driverClassName=org.h2.Driver  
spring.datasource.username=sa  
spring.datasource.password=  
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect  
Compile o projeto com o Maven:
mvn clean install  
Execute a aplicação:
mvn spring-boot:run  
Acesse a aplicação em http://localhost:8080.
🎓 Agradecimentos
Este projeto foi implementado como parte do curso Java COMPLETO Programação Orientada a Objetos + Projetos, ministrado por Nelio Alves na Udemy. O curso é uma excelente fonte para aprender os fundamentos e práticas avançadas no desenvolvimento de aplicações Java com Spring Boot e JPA.


Workshop Spring Boot 3 with JPA
This project was developed during the Java COMPLETO Object-Oriented Programming + Projects course, taught by Professor Nelio Alves on Udemy. The objective is to explore the main features of Spring Boot 3, focusing on RESTful APIs and using JPA (Java Persistence API) for data persistence.

🧩 Features
RESTful API: Implementation of an API to manage users, orders, and products.
Relational Database: Use of H2 (in-memory) or databases like MySQL for data persistence.
CRUD Operations: Endpoints for creating, reading, updating, and deleting data for all entities.
JPA Relationships: Modeling relationships such as one-to-many, many-to-one, and many-to-many.
Exception Handling: Robust mechanism to capture and handle errors, ensuring consistent responses.
📚 About the Development
The project focuses on:

Configuring and using Spring Boot 3 for modern applications.
Data persistence with JPA, utilizing annotations like @Entity, @OneToMany, @ManyToOne, etc.
Creating RESTful APIs following best development practices.
Using relational databases with JPA and the Repository pattern.
Pagination, sorting, and other advanced operations.
🚀 How to Run
Make sure you have Java 17+ and Maven installed.
Clone the repository:
git clone https://github.com/DaviSilvaAguiar/workshop-springboot3-jpa.git  
Navigate to the project directory:
cd workshop-springboot3-jpa  
Configure the database in the application.properties file. By default, the project is set to use H2:
properties
spring.datasource.url=jdbc:h2:mem:testdb  
spring.datasource.driverClassName=org.h2.Driver  
spring.datasource.username=sa  
spring.datasource.password=  
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect  
Build the project with Maven:
mvn clean install  
Run the application:
mvn spring-boot:run  
Access the application at http://localhost:8080.
🎓 Acknowledgments
This project was implemented as part of the Java COMPLETO Object-Oriented Programming + Projects course, taught by Professor Nelio Alves on Udemy. The course is an excellent resource for learning the fundamentals and advanced practices in Java application development using Spring Boot and JPA.
