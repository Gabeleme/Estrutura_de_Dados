import java.util.Arrays;

public class estudos_recursao4 {
    /*
     * Crie um método recursivo que receba um vetor de inteiros e retorne a soma de
     * todos os elementos do vetor
     */

    public static int somarValores(int[] vetor) {
        // cosndição de parada, verifica se o vetor está vazio
        if (vetor.length == 0) {
            return 0; // retorna 0 se não tiver elementos
        } else {
            // retorna o primeiro elemento do vetor somado a soma dos demais elementos
            // Aqui, usamos Arrays.copyOfRange para criar uma cópia do vetor a partir do índice 1
            // Isso significa que estamos ignorando o primeiro elemento na próxima chamada recursiva
            return vetor[0] + somarValores(Arrays.copyOfRange(vetor, 1, vetor.length));

        }

    }

    public static void main(String[] args) {
        int[] vetor = { 1, 5, 10, 30, 100 }; // cria o vetor
        int soma = somarValores(vetor); // chama o metodo
        System.out.println("\nA soma dos elementos é: " + soma); // imprime a resposta
    }
}
