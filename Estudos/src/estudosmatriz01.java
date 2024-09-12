public class estudosmatriz01 {
    // Escreva um método que receba uma matriz de inteiros e retorne o maior valor
    // presente na matriz.

    public static void main(String[] args) {
        // Inicializa uma matriz 2D com valores inteiros
        int valores[][] = {
                { 1, 2, 4 },
                { 10, 20, 5 },
                { 100, 6, 9 }
        };

        // Chama o método encontrarMaiorValor para encontrar o maior valor na matriz
        int maior = encontrarMaiorValor(valores);
        System.out.println("O maior valor da matriz é: " + maior);
    }

    // Método que encontra e retorna o maior valor em uma matriz 2D de inteiros
    public static int encontrarMaiorValor(int[][] valores) {
        // Inicializa a variável maiorValor com o valor do primeiro elemento da matriz
        int maiorValor = valores[0][0];

        // Loop para iterar sobre cada linha da matriz
        for (int i = 0; i < valores.length; i++) {
            // Loop para iterar sobre cada coluna da linha atual
            for (int j = 0; j < valores[i].length; j++) {
                // Se o valor atual for maior que o maiorValor registrado, atualiza maiorValor
                if (valores[i][j] > maiorValor) {
                    maiorValor = valores[i][j];
                }

            }
        }
        return maiorValor; // Retorna o maior valor encontrado na matriz
    }

}
