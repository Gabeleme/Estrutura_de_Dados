import java.util.Scanner;

public class estudos_matriz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner
        int[][] matriz = new int[3][4]; // inicia a matriz 3x4

        int soma = 0; // inicia a variavel soma valendo 0
        for (int i = 0; i < matriz.length; i++) { // percorre as linhas da matriz
            for (int j = 0; j < matriz[i].length; j++) { // percorre as colunas da matriz
                System.out.print("\nDigite o valor para a posição [" + i + "][" + j + "]: "); // pede o valor ao usuario
                matriz[i][j] = sc.nextInt(); // armazena
                soma += matriz[i][j]; // realiza a soma
            }
        }
        System.out.println("A soma de todos os valores da matriz é: " + soma); // imprime o resultado da soma

        sc.close();
    }
}
