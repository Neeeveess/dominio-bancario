## API RESTful para estudo de um Domínio Bancário com Kotlin e Spring Boot

**Projeto feito com Kotlin no Java 21 e Spring Framework 3.3.1**

## Sobre o Projeto
Este projeto é uma API de RESTful desenvolvida em Kotlin, ele foi feito para aplicar conceitos aprendidos com Kotlin.

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +Card card
        +List~Feature~ features
        +List~News~ news
    }
    
    class Account {
        +String number
        +String agency
        +String balance
        +Double limit
    }
    
    class Card {
        +String number
        +Double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class News {
        +String icon
        +String description
    }
    
    User "1" *-- "1" Account
    User "1" *-- "1" Card
    User "1" *-- "N" Feature
    User "1" *-- "N" News
```

## Tecnologias utilizadas

- Kotlin
- Gradle
- Spring Boot
- Spring Data JPA
- H2 Database
- PostgreSQL

## Iniciando projeto
Para iniciar a aplicação execute a seguinte ação na pasta do projeto

    ./gradlew bootRun

Instale as dependências do gradle com o comando:

    ./gradlew dependencies


## Autor

**João Vitor Neves Marques** <br>
e-mail: jvneves_marq@hotmail.com <br>
LinkedIn: https://www.linkedin.com/in/jvneves/
