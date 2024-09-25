import java.util.Random;

public class estudos_vetor18 {
    /*
     * Crie um método que gere uma lista de 10 números aleatórios entre 1 e 100 e
     * armazene eles em um vetor, depois faça a soma de todos os números no vetor,
     * depois a soma apenas nos valores pares
     */

    public static int[] gerarNumerosAleatorios() {
        // Cria um objeto da classe Random para gerar números aleatórios
        Random random = new Random();
        // Cria um array de inteiros chamado 'numeros' com 10 posições
        int[] numeros = new int[10];

        // Laço que percorre o array de números e preenche com valores aleatórios entre 10 e 100
        for (int i = 0; i < numeros.length; i++) { 
            // Gera um número aleatório entre 10 e 100 e atribui à posição i do array
            numeros[i] = random.nextInt(91) + 10;
        }
        return numeros; // Retorna o array preenchido com números aleatórios
    }

    // metodo para imprimir
    public static void imprimirVetor(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) { // percorre
            System.out.print(numeros[i] + " "); // imprime
        }
    }

    // metodo para somar
    public static void somarvetor(int[] numeros) {
        int somaTodos = 0; // variavel 
        for (int i = 0; i < numeros.length; i++) { // percorre
            somaTodos += numeros[i]; //soma
        }
        System.out.println("A soma de todos os números é: " + somaTodos); // imprime na tela
    }

    public static void somaNumerosPares(int[] numeros) { // metodo para somar so os pares
        int soma = 0; // declara a variavel soma
        for (int i = 0; i < numeros.length; i++) { // percorre o vetor
            if (numeros[i] % 2 == 0) { // logica pra saber se é par
                soma += numeros[i]; // soma
            }
        }
        System.out.println("A soma dos números pares é de: " + soma); // imprime a resposta
    }

    public static void main(String[] args) {
        int[] numeros = gerarNumerosAleatorios();

        System.out.println("\n====================");
        System.out.println("Os números no vetor são:");
        gerarNumerosAleatorios();
        imprimirVetor(numeros);
        System.out.println("\n====================");
        somarvetor(numeros);
        System.out.println("\n====================");
        somaNumerosPares(numeros);

    }
}
