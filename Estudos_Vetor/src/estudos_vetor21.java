import java.util.Scanner;

public class estudos_vetor21 {
    /*
     * Crie um programa que insira elementos em um vetor e, em seguida, desloque
     * todos os elementos para a esquerda n posições. Os elementos que saem pela
     * esquerda devem reaparecer no final do vetor.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner

        // pedir para que o usuario informe o tamanho do vetor
        System.out.print("Informe o tamanho do vetor que deseja: ");
        int tamanho = sc.nextInt(); // le o valor passado pelo usuario

        /*
         * declaração do vetor com a chamada do método e o método tem dois parametros,
         * um o scanner e o outro o tamanho inserido pelo usuario
         */

        int[] vetor = lerVetor(sc, tamanho);

        // pedir o número de deslocamento
        System.out.print("\nInforme o número de posição para deslocar para a esquerda: ");
        int n = sc.nextInt();

        /*
         * Deslocar o vetor
         * Chama o método deslocarParaEsquerda, que devolve um novo vetor com os
         * elementos deslocados
         * retorna valor
         */
        int[] vetorDeslocado = deslocarParaEsquerda(vetor, n);

        exibirVetor(vetorDeslocado); // chamada do método que exibe o vetor

        sc.close(); // fecha o scanner
    }

    // Método para ler os elementos do vetor
    public static int[] lerVetor(Scanner sc, int tamanho) {
        int[] vetor = new int[tamanho]; // Cria um vetor com o tamanho especificado
        System.out.println("Informe os elementos do vetor: ");

        // Loop para ler cada elemento do vetor
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = sc.nextInt(); // Lê o elemento e armazena no vetor
        }
        return vetor; // Retorna o vetor preenchido
    }

    // Método para deslocar os elementos do vetor para a esquerda
    public static int[] deslocarParaEsquerda(int[] vetor, int n) {
        int tamanho = vetor.length; // Obtém o tamanho do vetor
        int[] resultado = new int[tamanho]; // Cria um novo vetor para armazenar o resultado

        // Loop para deslocar os elementos
        for (int i = 0; i < tamanho; i++) {
            int novoIndice = (i - n + tamanho) % tamanho; // Calcula o novo índice para cada elemento
            resultado[novoIndice] = vetor[i]; // Atribui o valor ao novo índice
        }
        return resultado; // Retorna o vetor deslocado
    }

    // Método para exibir os elementos do vetor
    public static void exibirVetor(int[] vetor) {
        System.out.println("Vetor deslocado: "); // Mensagem antes de exibir o vetor
        // Loop para imprimir cada elemento do vetor
        for (int i = 0; i < vetor.length; i++) { // Percorre o vetor
            System.out.print(vetor[i] + " "); // Imprime cada elemento seguido de um espaço
        }
        System.out.println(); // Quebra a linha após exibir o vetor
    }
}
