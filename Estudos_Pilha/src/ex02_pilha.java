import java.util.Scanner;

public class ex02_pilha {
    /*
     * Pilha de Números Inteiros: Crie uma pilha que armazene números inteiros e
     * escreva um programa que empilhe 10 números fornecidos pelo usuário. Depois,
     * desempilhe e mostre os números na ordem inversa.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner
        PilhaEx pilha = new PilhaEx(10); // cria uma instancia da pilha com capacidade de receber 10 valores 

        System.out.println("\nPilha: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um valor inteiro: "); // Pede um valor ao usuário
            int valores = sc.nextInt(); // le o valor passado pelo usuario
            pilha.push(valores); // adiciona o valor a pilha
        }

        System.out.println("-------------------------------");
        System.out.println("Valores armazenados na Pilha:");
        for (int i = 0; i <= pilha.topo; i++) {
            System.out.print(pilha.elementos[i] + " "); // Exibe os valores empilhados
        }
        System.out.println("\n-------------------------------");
        System.out.println("Topo da pilha: " + pilha.peek()); // Exibe o valor no topo da pilha sem removê-lo

        System.out.println("-------------------------------");
        System.out.println("Valores inversos:");
        // Loop para desempilhar e exibir os valores na ordem inversa
        for (int i = pilha.size(); i > 0; i--) {
            Object valoresDesempilhados = pilha.pop(); // Remove o elemento do topo da pilha
            System.out.print(valoresDesempilhados + " "); // Exibe o valor desempilhado
        }

        System.out.println(); // Nova linha após a exibição
        sc.close(); // fecha o scanner
    }
}
