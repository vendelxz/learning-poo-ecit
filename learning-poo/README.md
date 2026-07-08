# 🏃‍♂️ Desafio Prático: Modelando Atletas com Herança

## 🎯 Objetivo da Atividade
Praticar os conceitos fundamentais de **Herança**, **Encapsulamento** e **Sobrescrita de Métodos (`@Override`)** na Programação Orientada a Objetos utilizando Java.

---

## 📝 Proposta da Tarefa
Você foi encarregado de desenvolver a base de um sistema para uma confederação esportiva. A primeira etapa consiste em modelar a estrutura dos atletas participantes.

### Passo 1: A Superclasse `Atleta`
Crie a classe base `Atleta`, que servirá de modelo (superclasse) para os esportistas.
1. Defina **no máximo 4 atributos privados** (sugestão: `nome`, `idade`, `peso` e `altura`).
2. Crie o método construtor recebendo esses atributos.
3. Gere os métodos `Getters` e `Setters` para garantir o encapsulamento.
4. Crie um método chamado `fazerAtividade()` que exiba no console uma mensagem genérica.
   - *Exemplo: "O atleta [nome] está realizando uma atividade física genérica."*

### Passo 2: As Subclasses Esportivas
Crie duas novas classes específicas: `Corredor` e `Ciclista`.
1. Ambas devem utilizar a palavra-chave `extends` para herdar as características de `Atleta`. (Utilize 'super' para os atributos)
2. Implemente os construtores nestas subclasses, utilizando o comando `super(...)` para repassar os valores para a classe mãe.

### Passo 3: Comportamentos Específicos
Apesar de serem atletas, corredores e ciclistas treinam de formas diferentes. Para representar isso:
1. Em cada subclasse, utilize a anotação `@Override` para **sobrescrever** o método `fazerAtividade()`.
2. No `Corredor`, o método deve imprimir algo como: *"O corredor [nome] está correndo na pista de atletismo."*
3. No `Ciclista`, o método deve imprimir algo como: *"O ciclista [nome] está pedalando a sua bicicleta."*

---

## 🧪 Como testar o seu código
Crie uma classe principal (ex: `App.java` com o método `main`) e instancie objetos das três classes (`Atleta`, `Corredor` e `Ciclista`). Chame o método `fazerAtividade()` de cada um deles e observe o resultado no console.

---

## 🧠 Desafio para Reflexão
Nesta atividade, utilizamos herança simples para compartilhar o comportamento `fazerAtividade()`. Isso foi feito **de propósito** para levantar o seguinte questionamento:

> *Se amanhã precisarmos de adicionar a classe `Nadador` no sistema, e o programador simplesmente **esquecer** de criar o método `fazerAtividade()` nela, o que acontece? O código compilará, mas usará a mensagem genérica da classe Atleta.*

**Como podemos refatorar este código e usar os recursos do Java para OBRIGAR que toda a nova subclasse de desporto implemente a sua própria atividade, evitando esquecimentos e erros?**
