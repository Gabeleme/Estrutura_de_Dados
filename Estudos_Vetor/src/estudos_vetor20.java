import java.util.Scanner;

public class estudos_vetor20 {
    /*
     * Crie um programa que leia um vetor de inteiros e rotacione seus elementos à
     * direita em uma posição
     */

    // Função que rotaciona o vetor para a direita
    public static void rotacionarParaDireita(int[] vetor) {
        // Armazena o último elemento do vetor
        int ultimoElemento = vetor[vetor.length - 1];

        // Desloca os elementos do vetor uma posição para a direita (de trás para
        // frente)
        for (int i = vetor.length - 1; i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }

        // Coloca o último elemento armazenado na primeira posição
        vetor[0] = ultimoElemento;
    }

    // Função para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        // Cria o vetor
        int[] vetor = new int[tamanho];

        // Preenche o vetor com números fornecidos pelo usuário
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        // Exibe o vetor original
        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        // Rotaciona o vetor para a direita
        rotacionarParaDireita(vetor);

        // Exibe o vetor após a rotação
        System.out.println("Vetor rotacionado para a direita:");
        imprimirVetor(vetor);

        sc.close();
    }

}
