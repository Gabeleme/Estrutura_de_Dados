import java.util.ArrayList;
import java.util.Random;

public class estudos_lista01 {
    public static void main(String[] args) {
        Random random = new Random(); // Criar uma instância da classe Random para gerar números aleatórios
        ArrayList<Integer> numeros = new ArrayList<>(); // Criar uma lista para armazenar os números aleatórios

        // Preencher a lista com 10 números aleatórios entre 0 e 49
        for (int i = 0; i < 10; i++) { // Itera de 0 a 9 (10 iterações)
            int numeroAleatorio = random.nextInt(50); // Gera um número aleatório entre 0 e 49
            numeros.add(numeroAleatorio); // Adiciona o número aleatório à lista
        }

        System.out.println("Elementos da lista: " + numeros); // Exibir os elementos da lista

        // Inicializa variáveis para calcular a soma e a média dos valores na lista
        double soma = 0; // Inicializa a variável soma para armazenar a soma dos valores
        double media = 0; // Declara a variável media para armazenar a média dos valores

        // Loop para calcular a soma dos valores na lista
        for (int i = 0; i < numeros.size(); i++) {  // Itera sobre cada elemento da lista
            soma += numeros.get(i); // acessando o elemento pelo indice
        }
        media = soma / numeros.size(); // Calcula a média dos valores (soma dividida pelo número de elementos)

        System.out.println("Média dos valores: " + media); // Imprime a média calculada

        int maior_numero = numeros.get(0); // Inicializa o maior número com o primeiro valor da lista
        int menor_numero = numeros.get(0); // Inicializa o menor número com o primeiro valor da lista

        // Loop para encontrar o maior e o menor número na lista
        for (int i = 0; i < numeros.size(); i++) { // Itera sobre cada elemento da lista
            int numeroAtual = numeros.get(i);  // Obtém o valor do elemento atual
            if (numeroAtual > maior_numero) { // Verifica se o número atual é maior que o maior número encontrado
                maior_numero = numeroAtual; // Atualiza o maior número encontrado
            }
            if (numeroAtual < menor_numero) { // Verifica se o número atual é menor que o menor número encontrado
                menor_numero = numeroAtual; // Atualiza o menor número encontrado
            }
        }

        System.out.println("O maior número é: " + maior_numero); // Imprime o maior número encontrado
        System.out.println("O menor número é: " + menor_numero); // Imprime o menor número encontrado

    }

}
