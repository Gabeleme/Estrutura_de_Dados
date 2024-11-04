public class atividade01 {
    // Crie um método que receba 1 vetor com 8 posições, inverta a ordem dos itens e retorne o vetor invertido
    
    public static void main(String[] args) throws Exception {
        // Declara e inicializa um vetor com 8 números inteiros
        int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
         // Percorre o vetor e imprime cada elemento na tela
        for (int i = 0; i < 8; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("===================="); // Imprime uma linha de separação
        inverteVetor(vetor); // Chama o método que inverte e imprime o vetor
    }

    public static void inverteVetor(int v[]) {
        // Cria um novo vetor auxiliar para armazenar os elementos invertidos
        int aux[] = new int[8];
         // Inverte os elementos do vetor original e armazena no vetor auxiliar
        for (int i = 0; i < 8; i++) {
            aux[i] = v[7 - i]; // Acessa os elementos na ordem inversa
            System.err.println(aux[i]); // Imprime o valor invertido
        }

    }
}
