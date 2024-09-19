import java.util.Scanner;

public class estudos_matriz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner
        int[][] matriz = new int[4][3]; // inicializa a matriz 4x3

        for (int i = 0; i < matriz.length; i++) { // percorre as linhas da matriz
            for (int j = 0; j < matriz[i].length; j++) { // percorre as colunas da matriz
                System.out.print("\nDigite o valor para a posição [" + i + "][" + j + "]: "); // pede o valor ao usuario
                matriz[i][j] = sc.nextInt(); //armazena 
            }
        }

        System.out.println("\nMatriz 4x3:"); // imprime na tela a mensagem
        for (int i = 0; i < 4; i++) { // percorre as linhas da matriz
            for (int j = 0; j < 3; j++) { // percorre as colunas da matriz
                System.out.printf("%4d", matriz[i][j]); // imprime a matriz
                if (j < 2) {
                    System.out.print(" | "); // Adiciona " | " entre as colunas, mas não após a última coluna
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
