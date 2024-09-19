public class estudos_matriz05 {

    // Método para somar os elementos da diagonal principal
    public static void diagonalMatriz(int[][] matriz) {
        int n = matriz.length; // Obtém o tamanho da matriz
        int somaDiagonalMatriz = 0; // Inicializa a soma dos elementos da diagonal principal

        // Loop para percorrer todos os elementos da diagonal principal
        // Aqui, i é tanto o índice da linha quanto o índice da coluna
        // A condição matriz[i][i] garante que estamos acessando apenas os elementos onde o índice da linha e o índice da coluna são iguais, ou seja, os elementos que formam a diagonal principal.
        
        for (int i = 0; i < n; i++) {
            // Adiciona o valor do elemento da diagonal principal à soma
            somaDiagonalMatriz += matriz[i][i];
        }

        // Exibe a soma da diagonal principal
        System.out.println("Soma da diagonal principal: " + somaDiagonalMatriz);

    }

    public static void main(String[] args) {
        // Cria uma matriz quadrada 4x4 com valores inteiros
        int[][] matriz = {
                { 1, 2, 3, 10 },
                { 4, 5, 6, 20 },
                { 7, 8, 9, 30 },
                { 10, 11, 12, 40 }
        };

        diagonalMatriz(matriz); // Chama o método para somar os elementos da diagonal principal
    }
}

//para cada elemento da diagonal principal, o índice da linha é igual ao índice da coluna. Portanto, para acessar a diagonal principal, precisamos pegar os elementos onde o índice de linha i é igual ao índice de coluna i