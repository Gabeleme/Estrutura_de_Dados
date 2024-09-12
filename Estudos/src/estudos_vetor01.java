import java.util.Scanner;

public class estudos_vetor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // declara o Scanner

         // Cria um array de inteiros com capacidade para 5 elementos
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:"); // socilita que o usuario digite 5 numeros

        // Loop para ler 5 números inteiros do usuário e armazená-los no array
        for (int i = 0; i < numeros.length; i++) { // Itera sobre o índice de 0 a 4
            System.out.print("Número " + (i + 1) + ": "); // Solicita a entrada do usuário para o número atual
            numeros[i] = sc.nextInt(); // Lê o número inteiro digitado e o armazena no array
        }

        System.out.println("\nOs números digitados são:"); // exibe os valores digitados

        // Loop para exibir os números armazenados no array
        for (int i = 0; i < numeros.length; i++) { // Itera sobre o índice de 0 a 4
            System.out.println("Número " + (i + 1) + ": " + numeros[i]); // Imprime o número armazenado na posição atual do array
        }

        sc.close(); 
    }
}
