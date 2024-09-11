public class estudosmatriz01 {
    // Escreva um método que receba uma matriz de inteiros e retorne o maior valor
    // presente na matriz.

    public static void main(String[] args) {
        int valores[][] = {
                { 1, 2, 4 },
                { 10, 20, 5 },
                { 100, 6, 9 }
        };

        int maior = encontrarMaiorValor(valores);
        System.out.println("O maior valor da matriz é: " + maior);
    }

    public static int encontrarMaiorValor(int[][] valores) {
        int maiorValor = valores[0][0];

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                if (valores[i][j] > maiorValor) {
                    maiorValor = valores[i][j];
                }

            }
        }
        return maiorValor;
    }

}
