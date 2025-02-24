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
        - balance: float
        - limit: float
        + getNumber(): string
        + getAgency(): string
        + getBalance(): float
        + getLimit(): float
    }

    class Feature {
        - icon: string
        - description: string
        + getIcon(): string
        + getDescription(): string
    }

    class Card {
        - number: string
        - limit: float
        + getNumber(): string
        + getLimit(): float
    }

    class News {
        - icon: string
        - description: string
        + getIcon(): string
        + getDescription(): string
    }

    User "1" -- "1" Account : has
    User "1" -- "*" Feature : has
    User "1" -- "1" Card : has
    User "1" -- "*" News : has 
    ```