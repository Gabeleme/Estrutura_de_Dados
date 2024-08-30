public class atividade6 {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        matrizimprimir(matriz);
    }

    public static void matrizimprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("|" + "\t" + matriz[i][j] + "\t" + "|");
            }
            System.out.println();
        }
    }

}
