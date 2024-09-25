public class estudos_vetor19 {
    /*
     * Crie um programa que leia um vetor de inteiros, calcule a média de seus
     * elementos e mostre quais elementos são maiores ou iguais à média
     */

    public static void calcularMedia(int[] vetor) {
        int soma = 0;
        int media = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            media = soma / vetor.length;
        }
        System.out.println("A média dos valores no vetor é de: " + media);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Esse valor é maior que a média: " + vetor[i] + " ");
            } else if (vetor[i] == media) {
                System.out.println("Esse valor é igual a média: " + vetor[i] + " ");
            }
        }

    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] vetor = { 10, 20, 30, 40, 50 };

        System.out.println("\n====================");
        System.out.println("Os valores adicionados ao vetor foram:");
        imprimirVetor(vetor);
        System.out.println("\n====================");
        calcularMedia(vetor);

    }
}
