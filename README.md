# Projeto de API Rest de uma página de Banco


## Diagrama de Classes

```mermaid
classDiagram
    class User {
        - name: string
        + getName(): string
    }

    class Account {
        - number: string
        - agency: string
        - balance: BigInteger
        - limit: BigInteger
        + getNumber(): string
        + getAgency(): string
        + getBalance(): BigInteger
        + getLimit(): BigInteger
    }

    class Feature {
        - icon: string
        - description: string
        + getIcon(): string
        + getDescription(): string
    }

    class Card {
        - number: string
        - limit: Biginteger
        + getNumber(): string
        + getLimit(): BigInteger
    }

    class News {
        - icon: string
        - description: string
        + getIcon(): string
        + getDescription(): string
    }

    User "1" *-- "1" Account : has
    User "1" *-- "N" Feature : has
    User "1" *-- "1" Card : has
    User "1" *-- "N" News : has 
    ```