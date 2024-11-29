import java.util.Random;

public class Ordenacao {

    /*
     * Ordenação por Troca (Bubble Sort):
     * Algoritmo simples que ordena um vetor comparando elementos adjacentes e os
     * trocando, caso estejam fora de ordem.
     * Após cada iteração, o maior elemento da parte não ordenada é movido para sua
     * posição correta.
     * O processo se repete até que o vetor esteja totalmente ordenado ou nenhuma
     * troca seja necessária.
     * Complexidade: Melhor caso (vetor já ordenado) é O(n); Pior caso (vetor em
     * ordem inversa) é O(n^2).
     */

    public static void BubbleSort(int[] vetor) {

        int aux; //variavel auxilixar
        int interacoes = 0; // Contador para medir a quantidade de interações
        boolean trocou; // Indica se houve troca durante a passagem pelo vetor

        // Verifica o vizinho e realiza a troca
        for (int i = 0; i < vetor.length - 1; i++) { // percorre o vetor
            trocou = false; // Verifica se houve trocas nessa passagem
            for (int j = 1; j < vetor.length - i - 1; j++) {
                /*
                 * percorre o vetor para ir ordenando ele verifica se o
                 * vizinho adjacente é menor que o atual, se for menor
                 * troca de posição, senão não faz nada
                 */
                if (vetor[j] > vetor[j + 1]) { // Compara o elemento atual com o próximo.
                    aux = vetor[j]; // Armazena o valor atual na variável auxiliar.
                    vetor[j] = vetor[j + 1]; // Move o valor do próximo elemento para a posição atual.
                    vetor[j + 1] = aux; // Coloca o valor armazenado na posição adjacente.
                    trocou = true; // Define 'trocou' como 'true' para indicar que houve uma troca.
                }
                interacoes++; // Incrementa o contador de interações.
            }
            imprimirVetor(vetor); // Imprime o estado atual do vetor após cada passagem.
            if (!trocou) // Se não houve trocas, o vetor já está ordenado
                break; //encerra
        }
        System.out.println("----------------------------------------");
        System.out.println("Interações (Bubble Sort): " + interacoes);
        System.out.println("----------------------------------------");

    }

    /*
     * Ordenação por Seleção (Selection Sort):
     * Algoritmo que encontra o menor elemento da parte não ordenada e o move para
     * sua posição correta.
     * O processo se repete até que o vetor esteja totalmente ordenado.
     * Complexidade: O(n^2) para melhor, pior e casos médios.
     */

    public static void SelectSort(int[] vetor) {
        // seleciona o menor valor no vetor e realiza a troca com o índice de referência
       
        int interacoes = 0; // Contador de interações

        for (int i = 0; i < vetor.length - 1; i++) { //percorre cada posição do vetor
            int minIndex = MinValue(vetor, i); // Encontra o índice do menor elemento a partir de i
            // Verifica se o índice do menor elemento é diferente da posição atual.
            if (minIndex != i) { 
                int aux = vetor[i]; // Armazena temporariamente o valor atual.
                vetor[i] = vetor[minIndex]; // Substitui o valor atual pelo menor elemento encontrado.
                vetor[minIndex] = aux; // Coloca o valor armazenado na posição do menor elemento.
            }
            imprimirVetor(vetor); // Mostra o estado do vetor após cada troca
            interacoes++; // Incrementa o contador de interações
        }

        System.out.println("----------------------------------------");
        System.out.println("Interações (Selection Sort): " + interacoes);
        System.out.println("----------------------------------------");
    }

     /*
     * Método auxiliar para encontrar o índice do menor elemento em um vetor
     * a partir de um índice inicial.
     */

    private static int MinValue(int[] vetor, int iInicio) {
        int minIndex = iInicio; // Assume que o menor elemento está no índice inicial

        // Percorre o vetor para encontrar o menor valor
        for (int i = iInicio + 1; i < vetor.length; i++) {
            // Compara o valor atual com o valor no índice armazenado como o menor.
            if (vetor[i] < vetor[minIndex]) {
                minIndex = i; // Atualiza o índice do menor valor
            }
        }
        return minIndex; // Retorna o índice do menor elemento encontrado
    }

    /*
     * Ordenação por Inserção (Insertion Sort):
     * Algoritmo que insere elementos do vetor desordenado no vetor ordenado, um por
     * vez.
     * Complexidade: Melhor caso é O(n) (vetor já ordenado); Pior caso é O(n^2).
     */

    public static void InsertSort(int[] vetor) {
        // Recorta o primeiro item do vetor desordenado e insere de forma ordenada no
        // vetor ordenado.

        int interacoes = 0; // Contador de interações

        // Laço para cada elemento a ser inserido no vetor ordenado
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i]; // Elemento atual a ser inserido
            int j = i - 1; // Índice do último elemento da parte já ordenada.

            // Move os elementos maiores que a chave para a direita
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j]; // Desloca o elemento uma posição para a direita.
                j--; // Move para o próximo elemento à esquerda.
                interacoes++; // Incrementa o contador de interações
            }
            vetor[j + 1] = chave; // Insere a chave na posição correta
            imprimirVetor(vetor); // Exibe o estado atual do vetor
        }

        System.out.println("----------------------------------------");
        System.out.println("Interações (Insertion Sort): " + interacoes);
        System.out.println("----------------------------------------");
    }

    public static void imprimirVetor(int[] vetor) {
        // Imprime no console o vetor
        for (int i = 0; i < vetor.length; i++) {
            if (i > 0) {
                System.out.print(" | ");
            }
            System.out.print(vetor[i]);
        }
        System.out.println();
    }

    public static int[] criarVetorAleatorio(int n) {
        Random random = new Random();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        }
        return vetor;
    }

    public static void main(String[] Args) {
        int[] vetor = null;
        int[] vetorDesordenado = criarVetorAleatorio(10);

        System.out.println("\n==========================================");
        System.out.println("=============== BubbleSort ===============");
        vetor = vetorDesordenado.clone();
        imprimirVetor(vetor);
        BubbleSort(vetor);
        imprimirVetor(vetor);

        System.out.println("==========================================");
        System.out.println("=============== Select Sort ===============");
        vetor = vetorDesordenado.clone();
        imprimirVetor(vetor);
        SelectSort(vetor);
        imprimirVetor(vetor);

        System.out.println("==========================================");
        System.out.println("=============== Insert Sort ===============");
        vetor = vetorDesordenado.clone();
        imprimirVetor(vetor);
        InsertSort(vetor);
        imprimirVetor(vetor);

    }
}
