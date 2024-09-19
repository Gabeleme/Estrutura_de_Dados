import java.util.Scanner;

public class estudos_matriz04 {

    // Método para preencher uma matriz 3x3 com valores fornecidos pelo usuário
    public static void addMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do usuário

        // Loop para percorrer todas as linhas da matriz
        for (int i = 0; i < matriz.length; i++) {
            // Loop para percorrer todas as colunas da matriz
            for (int j = 0; j < matriz[i].length; j++) {
                // Solicita ao usuário o valor para a posição atual na matriz
                System.out.print("\nDigite o valor para a posição [" + i + "][" + j + "]: ");
                // Armazena o valor fornecido pelo usuário na posição correspondente da matriz
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }

    // Método para imprimir a matriz formatada
    public static void imprimirMatriz(int[][] matriz) {
        // Loop para percorrer todas as linhas da matriz
        for (int i = 0; i < matriz.length; i++) {
            // Loop para percorrer todas as colunas da matriz
            for (int j = 0; j < matriz[i].length; j++) {
                // Imprime o valor da matriz com um espaçamento fixo para formatação
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println(); // Pula para a próxima linha após imprimir todos os valores de uma linha
        }
    }

    // Método para criar uma nova matriz com o dobro dos valores da matriz original
    public static int[][] dobroMatriz(int[][] matriz) {
        int linhas = matriz.length; // Número de linhas da matriz original
        int colunas = matriz[0].length; // Número de colunas da matriz original
        int[][] matrizDobrada = new int[linhas][colunas]; // Cria uma nova matriz com o mesmo tamanho

        // Loop para percorrer todas as linhas da matriz original
        for (int i = 0; i < linhas; i++) {
            // Loop para percorrer todas as colunas da matriz original
            for (int j = 0; j < colunas; j++) {
                // Dobra o valor da posição correspondente e armazena na nova matriz
                matrizDobrada[i][j] = matriz[i][j] * 2;
            }
        }

        return matrizDobrada; // Retorna a nova matriz com os valores dobrados
    }

    // Método para imprimir a matriz dobrada
    public static void imprimirDobroMatriz(int[][] matriz) {
        // Imprime a matriz dobrada
        System.out.println("Matriz com o dobro dos valores:");
        imprimirMatriz(matriz); // Reutiliza o método imprimirMatriz para mostrar a matriz dobrada
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; // Cria uma matriz de inteiros 3x3

        addMatriz(matriz); // Preenche a matriz com valores fornecidos pelo usuário
        System.out.println("Matriz original:");
        imprimirMatriz(matriz); // Imprime a matriz original

        // Cria uma nova matriz com o dobro dos valores da matriz original
        int[][] matrizDobrada = dobroMatriz(matriz);

        // Imprime a matriz dobrada
        imprimirDobroMatriz(matrizDobrada);
    }
}