public class estudos_matriz {
    //Escreva um método que receba uma matriz de inteiros e retorne a soma de todos os seus elementos.

    public static void main(String[] args) {
        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int resultado = somaMatriz(matriz);

        System.out.println(resultado);

    }

    public static int somaMatriz(int[][] matriz){
        int soma =0; 
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }
        }
        return soma; 
    }
}
