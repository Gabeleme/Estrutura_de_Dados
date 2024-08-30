public class atividade2 {
    public static void main(String[] args) {
        int vetor1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int vetor2[] = { 9, 10, 11, 12, 13, 14, 15, 16 };
        int vetor3[] = { 17, 18, 19, 20, 21, 22, 23, 24 };

        int[][] matriz = gerarMatriz(vetor1, vetor2, vetor3);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.err.print(matriz[i][j] + " ");
            }
            System.err.println();
        }
    }

    public static int[][] gerarMatriz(int[] vetor1, int[] vetor2, int[] vetor3) {
        int[][] matriz = new int[8][3];

        for (int i = 0; i < 8; i++) {
            matriz[i][0] = vetor1[i];
            matriz[i][1] = vetor2[i];
            matriz[i][2] = vetor3[i];
        }
        return matriz;

    }
    

}
