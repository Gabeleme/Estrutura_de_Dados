public class atividade2 {
    //Crie um método que receba 3 vetores com 8 posições cada e retorne uma matriz de 8x3 posições com os respectivos valores armazenados nos vetores.
    public static void main(String[] args) {
        // Declara três vetores com 8 elementos cada um
        int vetor1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int vetor2[] = { 9, 10, 11, 12, 13, 14, 15, 16 };
        int vetor3[] = { 17, 18, 19, 20, 21, 22, 23, 24 };

        // Chama o método que gera uma matriz a partir dos vetores
        int[][] matriz = gerarMatriz(vetor1, vetor2, vetor3);

        // Percorre a matriz e imprime seus elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); // Imprime os elementos da matriz
            }
            System.err.println(); // Quebra de linha após cada linha da matriz
        }
    }

    public static int[][] gerarMatriz(int[] vetor1, int[] vetor2, int[] vetor3) {
        // Cria uma matriz 8x3 para armazenar os valores dos três vetores
        int[][] matriz = new int[8][3];

        // Preenche a matriz com os elementos dos vetores
        for (int i = 0; i < 8; i++) {
            matriz[i][0] = vetor1[i]; // Primeira coluna recebe valores do vetor1
            matriz[i][1] = vetor2[i]; // Segunda coluna recebe valores do vetor2
            matriz[i][2] = vetor3[i]; // Terceira coluna recebe valores do vetor3
        }
        return matriz; // Retorna a matriz preenchida

    }

}
