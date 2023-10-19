## Vamos criar um sistema de aprovação de pedidos.

Vamos criar um sistema de aprovação de pedidos como exemplo. Teremos vários níveis de aprovação, como Gerente, Diretor e CEO. Cada nível decidirá se aprova ou rejeita um pedido com base no valor do pedido.

## Estrutura do projeto

Primeiro, criaremos uma interface que representa os manipuladores:
-public interface Approver

Agora, implementaremos as classes concretas para os diferentes níveis de aprovação:
-class Manager
-class Director
-class CEO

A classe PurchaseRequest representa uma solicitação de compra com um número de solicitação e um valor associado.
