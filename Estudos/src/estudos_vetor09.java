import java.util.Scanner;

// receba 10 números e armazene eles em um vetor e depois imprima eles na ordem que foi recebido
public class estudos_vetor09 {

    // metodo para preencher o vetor com valores passados pelo usuario
    public static void preencherVetorNormal(int[] valores) {
        Scanner sc = new Scanner(System.in); // scanner
        for (int i = 0; i < valores.length; i++) { // percorre cada posição do vetor
            System.out.print("\nInsira um número inteiro: "); //imprime
            valores[i] = sc.nextInt(); //armazena dos valores passado pelo usuario em cada posição do vetor
        }
        sc.close(); // fecha o scanner
    }

    // Método para imprimir os valores armazenados no vetor
    public static void imprimirVetorNormal(int[] valores) {
        System.out.println("\n------------------------------------------------"); // linha de separação
        System.out.println("Os valores armazenados no vetor foram: "); // imprime
        for (int i = 0; i < valores.length; i++) { //percorre cada posição do vetor
            System.out.print(" " + valores[i]); // imprime os valores nas posições do vetor
        }
        // System.out.println();
    }

    //receba os valores e retorne o vetor de forma inversa
    public static int[] vetorInverso(int[] valores){
        // cria novo vetor com o mesmo tamanho do vetor original para poder armazenar os valores de forma inversa 
        int vetorInverso[] = new int[valores.length]; 
        for(int i = 0; i < valores.length; i++){ // percorre cada indice do vetor
            vetorInverso[i] = valores[valores.length - 1 - i]; // imprime o vetor inverso
        }
        return vetorInverso; // retorna o vetor inverso
    }

    // Método para imprimir os valores armazenados no vetor
    public static void imprimirVetorInverso(int[] valores) {
        System.out.println("Os valores armazenados no vetor invertido são: "); // imprime
        for (int i = 0; i < valores.length; i++) { // percorre o vetor
            System.out.print(" " + valores[i]); // imprime o vetor
        }
        System.out.println(); // pula linha
    }

    public static void main(String[] args) {
        // Cria um vetor de inteiros com 10 posições
        int[] valores = new int[10];

         // Chama o método para preencher o vetor com valores fornecidos pelo usuário
        preencherVetorNormal(valores);
         // Chama o método para imprimir os valores armazenados no vetor
        imprimirVetorNormal(valores);

        System.out.println("\n------------------------------------------------");
        
        // Chama o método para obter o vetor com os valores na ordem inversa
        int[] vetorInvertido = vetorInverso(valores);
         // Chama o método para imprimir os valores armazenados no vetor invertido
        imprimirVetorInverso(vetorInvertido);
    }

}