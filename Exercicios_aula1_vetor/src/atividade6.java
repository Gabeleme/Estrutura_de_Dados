public class atividade6 {
    public static void main(String[] args) {
        // Define uma matriz 3x3
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        matrizimprimir(matriz); // Chama o método para imprimir a matriz
    }

    public static void matrizimprimir(int[][] matriz) {
        // Percorre a matriz linha por linha
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Imprime o elemento da matriz com formatação entre barras "|"
                System.out.println("|" + "\t" + matriz[i][j] + "\t" + "|");
            }
            System.out.println(); // Quebra de linha após imprimir cada linha da matriz
        }
    }

}
