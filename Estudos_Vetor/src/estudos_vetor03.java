import java.util.Scanner;

public class estudos_vetor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inicializa um array de doubles com 10 elementos
        double valores[] = new double[10];

        System.out.println("Informe os valores: ");
        // Loop para ler 10 valores do usuário e armazená-los no array
        for (int i = 0; i < valores.length; i++) { // Itera sobre cada índice do array
            System.out.println("Informe o " + (i + 1) + "Valor: ");
            valores[i] = sc.nextDouble(); // Lê o valor e armazena no array
        }

        // Chama o método somaDaMedia para calcular a média dos valores
        double media = somaDaMedia(valores); 
        System.out.println("A média dos valores é de: " + media);

        sc.close();
    }

    // Método que calcula e retorna a média dos valores em um array de doubles
    public static double somaDaMedia(double[] valores) {
        double soma = 0; // Inicializa a variável soma para acumular a soma dos valores
        // Loop para calcular a soma dos valores
        for (int i = 0; i < valores.length; i++) { // Itera sobre cada índice do array
            soma += valores[i]; // Adiciona o valor do índice atual à variável soma
        }
        // Calcula a média dos valores
        double media = soma / valores.length; // Divide 
        return media;// Divide a soma pelo número de valores para obter a média

    }

}
