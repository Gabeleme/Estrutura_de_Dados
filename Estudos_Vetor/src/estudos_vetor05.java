public class estudos_vetor05 {
    public static void main(String[] args) {
        // Inicializa um array de inteiros com três valores, todos iguais a 10
        int numeros[] = { 10, 10, 10 };
        somaInteiros(numeros); // Chama o método somaInteiros para calcular a soma dos valores do array
    }

    // Método que calcula a soma dos valores em um array de inteiros e imprime o resultado
    public static void somaInteiros(int[] numeros) {
        int soma = 0; // Inicializa a variável soma para acumular o total dos valores
        // Loop para iterar sobre cada elemento do array
        for (int i = 0; i < numeros.length; i++) { // Itera sobre cada índice do array
            soma += numeros[i]; // Adiciona o valor do elemento atual à variável soma
        }
        System.out.println("O resultado da soma é: " + soma);
    }
}
