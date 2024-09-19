import java.util.Scanner;

public class estudos_vetor14 {

    public static void addValoresAoVetor(int[] valores) {
        Scanner sc = new Scanner(System.in); // scanner
        for (int i = 0; i < valores.length; i++) { // percorre o vetor
            System.out.println("\nInforme um valor (0 considerado negativo): "); // pede ao usuario para inserir o valor
            int valorInserido = sc.nextInt(); // armazena o valor
            // Enquanto o valor for menor ou igual a zero, solicita um valor válido (positivo)
            while (valorInserido <= 0) {
                System.out.println("Valor inválido! Informe um valor positivo ou maior zero: ");
                valorInserido = sc.nextInt(); // le o novo valor inserido
            }

            valores[i] = valorInserido; // Atribui o valor válido à posição atual do vetor
        }
        sc.close(); // fecha o scanner
    }

    // Método para imprimir os valores do vetor
    public static void imprimirVetor(int[] valores){
        for(int i = 0; i < valores.length; i++){ // percorre o vetor
            System.out.print(valores[i] + " "); // imprime o vetor
        }
    }
    
    // Método para imprimir os valores do vetor
    public static void somaValoresImpar(int[] valores){
        int soma = 0; // inicia uma variavel em 0
        for(int i = 0; i < valores.length; i++){ // percorre o vetor
            if(valores[i] % 2 != 0){ // verifica se o valor é impar
                soma += valores[i]; // adiciona o valor impar a variavel de soma
            }
        }
        System.out.println(soma); // imprime o resultado da soma
    }

    // Método para imprimir apenas os valores ímpares do vetor
    public static void imprimirImpar(int[] valores){
        for(int i = 0; i < valores.length; i++){ // percorre o vetor
            if(valores[i] % 2 != 0){ // verifica se o valor é impar
                System.out.print(valores[i] + " "); // imprime o valor impar
            }
        }
    }

    
    public static void main(String[] args) {
        int[] valores = new int[10]; // declara o vetor com 10 posições

        addValoresAoVetor(valores); //chama o metodo para adicionar os valores ao vetor
        System.out.println("-----------------------------------");
        System.out.println("Vetor: ");
        imprimirVetor(valores); // chama o metodo de imprimir o vetor
        System.out.println("\n-----------------------------------");
        System.out.println("Valores impares: ");
        imprimirImpar(valores); // chama o metodo de imprimir os valores impares do vetor
        System.out.println("\n-----------------------------------");
        System.out.println("Soma dos valores impares: ");
        somaValoresImpar(valores); // chama o metodo de imprimir os resultados da soma dos valores impares adicionados ao vetor
        System.out.println("-----------------------------------");

    }
}
