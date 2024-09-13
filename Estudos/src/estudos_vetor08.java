public class estudos_vetor08 {
    // Crie uma matriz 5x5 e calcule a soma de cada linha e cada coluna.
    public static void main(String[] args) {
        // Define uma matriz 5x5 com valores inteiros
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        // Chamar os métodos para calcular e exibir as somas
        calcularSomaLinhas(matriz);
        calcularSomaColunas(matriz);
    }

    // Método para calcular e exibir a soma de cada linha
    public static void calcularSomaLinhas(int[][] matriz) {
        System.out.println("Soma de cada linha: ");
         // Itera sobre cada linha da matriz
        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;
             // Itera sobre cada elemento da linha
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            // Exibe a soma da linha atual
            System.out.println("Linha " + (i + 1) + ": " + soma);
        }
    }

    // Método para calcular e exibir a soma de cada coluna
    public static void calcularSomaColunas(int[][] matriz) {
        System.out.println("Soma de cada coluna: ");
         // Itera sobre cada coluna da matriz
        for (int j = 0; j < matriz[0].length; j++){
            int soma = 0;
            // Itera sobre cada elemento da coluna
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }
            // Exibe a soma da coluna atual
            System.out.println("Coluna " + (j + 1) + ": " + soma);
        }
    }
}
