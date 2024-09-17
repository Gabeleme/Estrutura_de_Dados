import java.util.Scanner;

public class estudos_matriz03 {

    public static void addMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in); // scanner

        for (int i = 0; i < matriz.length; i++) { // percorre a linha
            for (int j = 0; j < matriz[i].length; j++) { // percorre as colunas
                System.out.print("\nDigite o valor para a posição [" + i + "][" + j + "]: "); // pede o valor ao usuario
                matriz[i][j] = sc.nextInt(); // armazena
            }
        }
        sc.close(); // fecha o scanner
    }

    // metodo para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // percorre as colunas
                System.out.printf("%5d", matriz[i][j]); // imprime a matriz
            }
            System.out.println(); // pula linha
        }
    }

    // metodo para achar o maior valor da matriz
    public static void maiorElementoMatriz(int[][] matriz) {
        int max = matriz[0][0]; // Assume que o primeiro elemento é o maior inicialmente

        for (int i = 0; i < matriz.length; i++) { // percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // percorre as colunas
                // Atualiza o valor máximo se encontrar um valor maior do que ja estava armazenado atualmente
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }

        System.out.println("O maior elemento da matriz é: " + max); // imprime o resultado
    }

    public static void main(String[] args) {
        int[][] matriz = new int[5][3]; // Cria uma matriz de inteiros 5x3

        addMatriz(matriz); // chama o metodo de adicionar os valores a matriz
        System.out.println("-------------");
        System.out.println("Matriz: ");
        imprimirMatriz(matriz); // chama o metodo de imprimir a matriz
        System.out.println("---------------");
        maiorElementoMatriz(matriz); // chama o metodo de imprimir o maior valor da matriz
    }
}
