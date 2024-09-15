public class estudos_vetor13 {

    public static void analisarVetor(int[] valores) {
        int quantidadeZeros = 0;

        System.out.println("Valores positivos: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > 0) {
                System.out.print(valores[i] + " ");
            }
        }

        System.out.println("\n-------------------------------");
        System.out.println("Valores negativos: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < 0) {
                System.out.print(valores[i] + " ");
            }
        }

        // Contando zeros
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == 0) {
                quantidadeZeros++;
            }
        }
        System.out.println("\n-------------------------------");
        System.out.println("Quantidade de zeros: " + quantidadeZeros);
    }

    public static void imprimirVetor(int[] valores) {
        System.out.print("Vetor completo: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] valores = { 10, -20, 30, 40, -50, -60, -1, -2, -3, -10, 0, 0 };

        System.out.println();
        System.out.println("-------------------------------");
        analisarVetor(valores);
        System.out.println("-------------------------------");
        imprimirVetor(valores);
        System.out.println("-------------------------------");
    }
}
