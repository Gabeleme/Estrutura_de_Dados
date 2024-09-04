public class atividade7 {
    public static void main(String[] args) {

        int[][] matriz = { // Criação da matriz
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };

        System.out.println("Matriz:"); // imprime a matriz
        imprimirMatriz(matriz); // chamada do metodo de imprimir a matriz

        int[][] matrizTransposta = transporMatriz(matriz); // chamada do método

        System.out.println("Matriz Transposta:");
        imprimirMatriz(matrizTransposta); // chamada do metodo de imprimir a matriz transposta
    }

    // Método para transpor a matriz 
    public static int[][] transporMatriz(int[][] matriz) {
        int linhas = matriz.length; 
        int colunas = matriz[0].length; 

        int[][] matrizTransposta = new int[colunas][linhas]; // matriz para armazenar o nova matriz
        
        //for para preencher a matriz, linha e coluna
        for (int i = 0; i < linhas; i++) { 
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j]; // atribuindo os valores para cada posição 
            }
        }

        return matrizTransposta; //retornando a nova matriz
    }

    // Método para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        // for para percorrer a matriz, linha e coluna
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
