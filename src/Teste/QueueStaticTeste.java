package Teste;

import main.java.StaticQueue;

public class QueueStaticTeste {

    public static void main(String[] args) {

        StaticQueue<Integer> fila = new StaticQueue<>(5);

        System.out.println("Fila vazia? " + fila.isEmpty());

        fila.push(10);
        fila.push(20);
        fila.push(30);

        System.out.println("Primeiro: " + fila.peek());
        System.out.println("Último: " + fila.back());
        System.out.println("Tamanho: " + fila.size());

        System.out.println("Removido: " + fila.pop());
        System.out.println("Removido: " + fila.pop());

        System.out.println("Primeiro após remoções: " + fila.peek());

        fila.push(40);
        fila.push(50);
        fila.push(60);

        System.out.println("Último: " + fila.back());
        System.out.println("Tamanho: " + fila.size());

        while (!fila.isEmpty()) {
            System.out.println("Removendo: " + fila.pop());
        }

        System.out.println("Fila vazia? " + fila.isEmpty());
    }
}
