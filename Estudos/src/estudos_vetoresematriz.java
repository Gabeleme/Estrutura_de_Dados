public class estudos_vetoresematriz {
    public static void main(String[] args) {
        int vetor[] = { 10, 20, 30 };
        int soma = somadovetor(vetor);
        System.out.println("A soma dos valores tem como resultado: " + soma);
    }

    public static int somadovetor(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];

        }
        return soma;

    }
}
