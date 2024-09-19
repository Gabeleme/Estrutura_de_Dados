public class estudos_vetor11 {
    // metodo para preencher o vetor com os valores pares
    public static void preencherVetor(int[] valores) {
        int index = 0; // Índice para armazenar o valor no vetor
        // Loop para iterar sobre números pares de 2 a 100
        for (int i = 2; i <= 100; i += 2) {
            valores[index] = i; // Atribui o número par ao vetor na posição atual
            index++; // Move para a próxima posição do vetor
        }
    }

    // metodo para imprimir o vetor
    public static void imprimirValores(int[] valores) {
        System.out.println("Valores pares de 0 a 100: ");
        // Loop para percorrer e imprimir todos os valores no vetor
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " "); // Imprime o valor atual seguido de um espaço
        }
    }

    public static void main(String[] args) {
        int[] vetoresPares = new int[50]; // Cria um vetor com 50 posições para armazenar valores pares

        preencherVetor(vetoresPares); // Chama o método para preencher o vetor com números pares
        imprimirValores(vetoresPares); // Chama o método para imprimir os valores do vetor
    }
}
