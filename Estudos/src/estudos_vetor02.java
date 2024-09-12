import java.util.Scanner;

public class estudos_vetor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas[] = new double[4]; // Inicializa um array de doubles com 4 elementos

        System.out.println("Informe as notas: ");
        // Loop para ler as 4 notas do usuário e armazená-las no array
        for (int i = 0; i < notas.length; i++) { // Itera sobre cada índice do array
            System.out.print("Informe a " + (i + 1) + "nota: "); 
            notas[i] = sc.nextDouble(); // Lê a nota e armazena no array
        }

        System.out.println("As notas Digitas foram: ");
        for (int i = 0; i < notas.length; i++) { // Itera sobre cada índice do array
            System.out.println(notas[i]); // Imprime a nota armazenada no índice atual
        }

        double soma = 0; // Inicializa a variável soma para acumular a soma das notas
        // Loop para calcular a soma das notas
        for (int i = 0; i < notas.length; i++) { // Itera sobre cada índice do array
            soma += notas[i]; // Adiciona o valor da nota atual à variável soma
        }
        System.out.println("A soma das notas é de: " + soma);

        double media = 0;// Inicializa a variável media para armazenar a média das notas

        for (int i = 0; i < notas.length; i++) { // Itera sobre cada índice do array
            media = soma / notas.length; // Calcula a média
        }
        System.out.println("A media dos valores foi de: " + media);
        sc.close();
    }
}
