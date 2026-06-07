package Teste;

import main.java.DinamicQueue;

public class QueueDinamicTeste {

    public static void main(String[] args) {

        DinamicQueue<String> fila = new DinamicQueue<>();

        System.out.println("Fila vazia? " + fila.isEmpty());

        fila.push("João");
        fila.push("Maria");
        fila.push("Pedro");

        System.out.println("Primeiro: " + fila.peek());
        System.out.println("Último: " + fila.back());
        System.out.println("Tamanho: " + fila.size());

        System.out.println("Removido: " + fila.pop());

        System.out.println("Primeiro após remoção: " + fila.peek());

        fila.push("Ana");
        fila.push("Carlos");

        System.out.println("Último: " + fila.back());
        System.out.println("Tamanho: " + fila.size());

        while (!fila.isEmpty()) {
            System.out.println("Removendo: " + fila.pop());
        }

        System.out.println("Fila vazia? " + fila.isEmpty());
    }
}