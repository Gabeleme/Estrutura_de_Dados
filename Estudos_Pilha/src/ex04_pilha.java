import java.util.Random;
import java.util.Stack;

public class ex04_pilha {
    /*
     * Crie uma pilha que armazene números aleatórios entre 1 e 100.
     * Implementeuma função que desempilhe e mostre todos os números pares.
     */

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>(); // Cria uma pilha para armazenar os números aleatórios
        Random random = new Random(); // Cria um objeto Random para gerar números aleatórios

        // Gera e armazena 10 números aleatórios entre 0 e 99 na pilha
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(100); // Gera um número aleatório
            pilha.push(numeroAleatorio); // Adiciona o número à pilha
        }

        // Imprime os números armazenados na pilha
        System.out.println("Números aleatórios armazenados na pilha: " + pilha);

        // Chama a função para mostrar os números pares
        mostrarPares(pilha);

    }

    // Função que desempilha e mostra todos os números pares
    public static void mostrarPares(Stack<Integer> pilha) {
        System.out.println("Números pares desempilhados:");

        // Cria uma pilha auxiliar para armazenar os números que não são pares
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        // Enquanto a pilha não estiver vazia
        while (!pilha.isEmpty()) {
            int numero = pilha.pop(); // Remove o número do topo da pilha

            // Verifica se o número é par
            if (numero % 2 == 0) {
                System.out.println(numero); // Imprime o número par
            } else {
                pilhaAuxiliar.push(numero); // Armazena o número ímpar na pilha auxiliar
            }
        }

        // Reempilha os números ímpares de volta na pilha original
        while (!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }
}
