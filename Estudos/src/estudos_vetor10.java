import java.util.Scanner;

public class estudos_vetor10 {
    // receba 15 números e armazene em um vetor e no final retorne o dobro de cada
    // um dos valores do vetor

    // metodo para adicionar no vetor
    public static void addValoresVetor(int[] valores) {
        Scanner sc = new Scanner(System.in); // scanner

        for (int i = 0; i < valores.length; i++) { // itera sobre cada item do vetor
            System.out.println(); // quebra linha
            System.out.print("Informe os valores: "); // imprime
            valores[i] = sc.nextInt(); // armazena os valores passados dentro do vetor
        }
        sc.close(); // fecha o scanner
    }

    // metodo para imprimir o vetor
    public static void imprimirVetorNormal(int[] valores) {
        for (int i = 0; i < valores.length; i++) { // itera sobre cada valor armazenado no vetor
            System.out.print(valores[i] + " ");
        }
    }

    public static int[] valoresDuplicados(int[] valores) {
        // Cria um novo vetor para armazenar o dobro dos valores
        int[] duplicados = new int[valores.length];

        for (int i = 0; i < valores.length; i++) { // itera sobre o vetor
            duplicados[i] = valores[i] * 2; // Armazena o dobro do valor na posição correspondente do vetor duplicado
        }
        return duplicados;
    }

    // metodo que imprime os valores duplicados
    public static void imprimeDuplicado(int[] valores) {
        for (int i = 0; i < valores.length; i++) { // itera sobre o vetor
            System.out.print(valores[i] + " "); // imprime o valor armazenado
        }
    }

    public static void main(String[] args) {
        int[] valores = new int[15]; // cria um vetor de inteiros com 15 posições

        addValoresVetor(valores); // Chama o método para adicionar valores ao vetor
        System.out.println("------------------------------------");
        System.out.println("Valores armazenados no vetor: ");
        // Chama o método para imprimir os valores armazenados no vetor
        imprimirVetorNormal(valores);

        System.out.println("\n------------------------------------");
        System.out.println("valores duplicados: ");

        // Obtém o vetor com os valores duplicados
        int[] valoresDuplicados = valoresDuplicados(valores);
        // Chama o método para imprimir os valores duplicados
        imprimeDuplicado(valoresDuplicados);
        System.out.println("\n------------------------------------");
    }
}
