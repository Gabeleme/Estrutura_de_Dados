public class estudos_vetoresematriz {
    public static void main(String[] args) {
        // Inicializa um array de inteiros com três valores
        int vetor[] = { 10, 20, 30 };
        // Chama o método somadovetor para calcular a soma dos elementos do array
        int soma = somadovetor(vetor);
        System.out.println("A soma dos valores tem como resultado: " + soma);
    }

    // Método que calcula a soma dos valores em um array de inteiros
    public static int somadovetor(int[] vetor) {
        int soma = 0;// Inicializa a variável soma para acumular o total dos valores
        // Loop para iterar sobre cada elemento do array
        for (int i = 0; i < vetor.length; i++) { // Itera sobre cada índice do array
            soma += vetor[i]; // Adiciona o valor do elemento atual à variável soma

        }
        return soma; //Retorna o valor acumulado na variável soma

    }
}
