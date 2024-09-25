import java.util.ArrayList;

public class estudos_lista10 {
    /*
     * Crie um ArrayList de números inteiros e escreva um método que imprima todos
     * os elementos maiores que um valor especificado.
     */

    public static void main(String[] args) {
        // Cria um ArrayList para armazenar números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adiciona números multiplicados por 10 à lista
        for (int i = 1; i <= 5; i++) {
            numeros.add(i * 10); // Adiciona 10, 20, 30, 40, 50
        }

        // Separador visual para a saída no console
        System.out.println("\n=================================");

        // Imprimir todos os elementos da lista
        System.out.println("Todos os números:");
        imprimirArray(numeros); // Chama o método para imprimir todos os números

        // Outro separador visual
        System.out.println("\n===================================");

        // Imprimir os valores maiores que 10
        System.out.println("Números maiores que 10:");
        valoresMaiores(numeros, 10); // Chama o método para imprimir números maiores que 10
    }

    // Método para imprimir os valores maiores que o valor especificado
    public static void valoresMaiores(ArrayList<Integer> numeros, int valor) {
        // Percorre a lista de números
        for (int i = 0; i < numeros.size(); i++) {
            // Verifica se o número atual é maior que o valor especificado
            if (numeros.get(i) > valor) {
                System.out.print(numeros.get(i) + " "); // Imprime o número se for maior
            }
        }
    }

    // Método para imprimir todos os valores do ArrayList
    public static void imprimirArray(ArrayList<Integer> numeros) {
        // Percorre a lista de números
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " "); // Imprime cada número
        }
    }
}
