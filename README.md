# Queue - Fila Estática e Fila Dinâmica

## Descrição

Este projeto apresenta duas implementações da estrutura de dados **Fila (Queue)** utilizando Java:

* **Fila Estática**: implementada com array circular.
* **Fila Dinâmica**: implementada com lista encadeada.

Ambas seguem o princípio **FIFO (First In, First Out)**, onde o primeiro elemento inserido é o primeiro a ser removido.

---

## Interface Queue<T>

As duas implementações seguem o mesmo contrato definido pela interface `Queue<T>`.

```java
public interface Queue<T> {

    void push(T element);

    T pop();

    T peek();

    T back();

    int size();

    boolean isEmpty();

    void clear();
}
```

---

## Fila Estática

A Fila Estática utiliza um vetor de tamanho fixo para armazenar os elementos.

### Características

* Capacidade definida na criação da fila.
* Utiliza os ponteiros `head` e `tail`.
* Implementação baseada em fila circular.
* Reaproveitamento de posições livres através de aritmética modular.

### Estrutura

```text
+---+---+---+---+---+
| A | B | C | D | E |
+---+---+---+---+---+
  ^
 head

tail → próxima posição livre
```

### Complexidade

| Operação  | Complexidade |
| --------- | ------------ |
| push()    | O(1)         |
| pop()     | O(1)         |
| peek()    | O(1)         |
| back()    | O(1)         |
| size()    | O(1)         |
| isEmpty() | O(1)         |
| clear()   | O(n)         |

---

## Fila Dinâmica

A Fila Dinâmica utiliza uma lista encadeada para armazenar os elementos.

### Características

* Crescimento dinâmico.
* Sem limite fixo de capacidade.
* Utiliza referências para o primeiro e último nó.
* Não necessita de redimensionamento.

### Estrutura

```text
head
 ↓
[A] → [B] → [C] → [D]
                     ↑
                   tail
```

### Complexidade

| Operação  | Complexidade |
| --------- | ------------ |
| push()    | O(1)         |
| pop()     | O(1)         |
| peek()    | O(1)         |
| back()    | O(1)         |
| size()    | O(1)         |
| isEmpty() | O(1)         |
| clear()   | O(1)         |

---

## Métodos Disponíveis

### push(T element)

Insere um elemento no final da fila.

### pop()

Remove e retorna o primeiro elemento da fila.

### peek()

Retorna o primeiro elemento sem removê-lo.

### back()

Retorna o último elemento sem removê-lo.

### size()

Retorna a quantidade de elementos armazenados.

### isEmpty()

Verifica se a fila está vazia.

### clear()

Remove todos os elementos da fila.

---

## Comparação entre as Implementações

| Aspecto                    | Fila Estática      | Fila Dinâmica   |
| -------------------------- | ------------------ | --------------- |
| Estrutura                  | Array Circular     | Lista Encadeada |
| Tamanho                    | Fixo               | Variável        |
| Uso de Memória             | Pré-alocada        | Sob demanda     |
| Inserção                   | O(1)               | O(1)            |
| Remoção                    | O(1)               | O(1)            |
| Limite de Capacidade       | Sim                | Não             |
| Reaproveitamento de Espaço | Aritmética Modular | Natural         |

---

## Conceitos Aplicados

* Estruturas de Dados
* Generics (`<T>`)
* Interface e Polimorfismo
* Encapsulamento
* Lista Encadeada
* Array Circular
* Aritmética Modular
* Complexidade de Algoritmos

---

## Autor

Projeto acadêmico desenvolvido para estudo e implementação da estrutura de dados Fila (Queue) em Java.
