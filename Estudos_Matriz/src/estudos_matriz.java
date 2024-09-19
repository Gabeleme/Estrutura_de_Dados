public class estudos_matriz {
    //Escreva um método que receba uma matriz de inteiros e retorne a soma de todos os seus elementos.

    public static void main(String[] args) {
        // Declara e inicializa uma matriz 3x3 com valores inteiros
        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

         // Chama o método somaMatriz para calcular a soma dos elementos da matriz
        int resultado = somaMatriz(matriz);

        System.out.println(resultado);  // Imprime o valor retornado pelo método

    }

    // Método que calcula a soma de todos os elementos em uma matriz 2D
    public static int somaMatriz(int[][] matriz){
        int soma =0;  // Inicializa a variável soma para acumular o valor total

        // Loop para iterar sobre as linhas da matriz
        for(int i = 0; i < matriz.length; i++){ // Itera sobre cada linha da matriz
             // Loop para iterar sobre as colunas da matriz
            for(int j = 0; j < matriz[i].length; j++){ // Itera sobre cada coluna da linha atual
                soma += matriz[i][j]; // Adiciona o valor do elemento atual à soma
            }
        }
        return soma;  // Retorna o valor acumulado na variável soma
    }
}
