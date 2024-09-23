import java.util.Scanner;
import java.util.Stack;

public class ex03_pilha {
    /*
     * Pilha de Caracteres: Implemente uma pilha para armazenar caracteres. Receba
     * uma palavra do usuário e utilize a pilha para imprimir a palavra ao contrário
     */

    public static String inverterPalavra(String palavra) {
        Stack<Character> pilha = new Stack<>(); // cria uma pilha para armazenar os caracteres da palavra

        for (int i = 0; i < palavra.length(); i++) { // percorre cada caractere
            pilha.push(palavra.charAt(i)); // pega o caractere atual da pilha
        }

        // Inicializa um StringBuilder para construir a palavra invertida.
        StringBuilder palavraInvertida = new StringBuilder();

        // Enquanto a pilha não estiver vazia...
        while (!pilha.isEmpty()) {
            // Remove o caractere do topo da pilha.
            char caractere = pilha.pop();

            // Adiciona o caractere removido ao final do StringBuilder.
            palavraInvertida.append(caractere);
        }

        // Converte o StringBuilder para uma string e retorna a palavra invertida.
        return palavraInvertida.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInforme a palavra: ");
        String palavra = sc.nextLine();

        String palavraInvertida = inverterPalavra(palavra);
        System.out.println("A palavra invertida é: " + palavraInvertida);

        sc.close();
    }
}
