import java.util.Scanner;

public class estudos_matriz06 {

    public static void mediaLinhaMatriz(int[][] matriz, int linha) {

        // Verifica se o índice da linha é válido
        if (linha < 0 || linha >= matriz.length) { // Checa se o índice da linha é menor que 0 ou maior ou igual ao número de linhas da matriz
            System.out.println("Linha inválida."); // Exibe uma mensagem de erro caso o índice da linha seja inválido
            return; // Interrompe a execução do método, já que a linha fornecida não é válida
        }

        // Calcula a soma dos elementos da linha escolhida
        double soma = 0; // Inicializa a variável para armazenar a soma dos elementos
        for (int j = 0; j < matriz[linha].length; j++) { // Itera sobre as colunas da linha escolhida
            soma += matriz[linha][j]; // Adiciona o valor do elemento atual à soma
        }
        
        // Calcula a média
        double media = soma / matriz[linha].length; // Divide a soma pelo número de colunas para obter a média

        // Exibe a média
        System.out.printf("A média dos elementos da linha %d é: %.2f%n", linha, media); // Imprime a média formatada
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner

        // Inicializa a matriz 3x4 com valores fixos
        int[][] matriz = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

         // Exibe a matriz para o usuário
         System.out.println("Matriz 3x4:"); 
         for (int i = 0; i < matriz.length; i++) { // Itera sobre as linhas da matriz
             for (int j = 0; j < matriz[i].length; j++) { // Itera sobre as colunas da linha atual
                 System.out.print(matriz[i][j] + " "); // Imprime o valor do elemento seguido de um espaço
             }
             System.out.println(); 
         }
 
         // Solicita ao usuário o índice da linha para calcular a média
         System.out.print("\nEscolha a linha (0, 1 ou 2) para calcular a média: "); // Pede ao usuário para inserir o índice da linha
         int linhaEscolhida = sc.nextInt(); // Lê o índice da linha inserido pelo usuário
 
         // Chama o método para calcular e mostrar a média da linha escolhida
         mediaLinhaMatriz(matriz, linhaEscolhida); // Passa a matriz e o índice da linha para o método
 

        sc.close();
    }
}
