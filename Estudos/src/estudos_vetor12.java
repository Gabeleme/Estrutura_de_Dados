import java.util.Scanner;

public class estudos_vetor12 {

    // Método para adicionar valores ao vetor
    public static void addValorVetor(int[] valores, Scanner sc) {
        for (int i = 0; i < valores.length; i++) { // percorre o vetor
            System.out.println(); //pula linha
            System.out.print("Informe o valor: "); // escreve isso na tela
            valores[i] = sc.nextInt(); // armazena os valores passados ao vetor
        }
    }

    // Método para imprimir os valores do vetor
    public static void imprimirVetor(int[] valores) {
        System.out.println("Valores no vetor:"); //imprime a mensagem
        for (int valor : valores) { // Percorre o vetor utilizando um loop for-each, onde 'valor' é o valor atual
            System.out.print(valor + " "); // imprime os valores
        }
        System.out.println(); // Para quebrar a linha após imprimir os valores
    }

    // Método para permitir que o usuário informe o índice e mostrar o valor correspondente
    public static void indiceUsuario(int[] valores, Scanner sc) {
        System.out.println("Informe o índice (0 a " + (valores.length - 1) + "): "); // solicita o indice
        int indice = sc.nextInt(); // armazena o valor passado

        // Verificando se o índice é válido
        if (indice >= 0 && indice < valores.length) {
            System.out.println("O valor no índice " + indice + " é: " + valores[indice]);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void main(String[] args) {
        int[] valores = new int[8]; // Vetor com 8 posições
        Scanner sc = new Scanner(System.in); // Scanner único para o programa todo

        addValorVetor(valores, sc); // Adiciona valores ao vetor
        System.out.println("-----------------------------------------");
        indiceUsuario(valores, sc); // Usuário informa o índice para consultar o valor
        System.out.println("-----------------------------------------");
        imprimirVetor(valores); // Imprime os valores do vetor
        sc.close(); // Fechar o scanner ao final

    }
}
