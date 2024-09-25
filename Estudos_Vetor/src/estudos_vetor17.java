public class estudos_vetor17 {
    /*
     * Escreva um método que some todos os números nas posições pares de uma lista
     * de inteiros.
     */

    public static void numerosPares(int[] vetor) { // metodo para somar so os pares
        int soma = 0; // declara a variavel soma
        for (int i = 0; i < vetor.length; i++) { // percorre o vetor
            if (vetor[i] % 2 == 0) { // logica pra saber se é par
                soma += vetor[i]; // soma
            }
        }
        System.out.println("A soma dos números pares é de: " + soma); // imprime a resposta
    }

    public static void imprimirVetor(int[] vetor) { // metodo pra imprimir o vetor
        for (int i = 0; i < vetor.length; i++) { // percorre o vetor
            System.out.println(vetor[i]); // imprime o vetor
        }

    }

    public static void main(String[] args) {
        int[] vetor = { 2, 4, 6, 7, 1, 3, 10 }; // vetor
        System.out.println("\n=============================");
        System.out.println("Os valores adiconados ao vetor foram: ");
        imprimirVetor(vetor); // chama o metodo de imprimir
        System.out.println("=============================");
        numerosPares(vetor); // chama o metodo de soma
    }
}
