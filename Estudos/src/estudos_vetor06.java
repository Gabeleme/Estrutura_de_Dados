public class estudos_vetor06 {

    // Escreva um algoritmo que Leia 10 valores inteiros e armazene-os em um Vetor.
    // Após a digitação do último valor, imprima os elementos com conteúdo par.
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Cria e inicializa um vetor com valores de 1 a 10

        valorPar(vetor); // Chama o método para imprimir valores pares no vetor
    }

    public static void valorPar(int[] vetor) { // metodo para achar os valores par
        for (int i = 0; i < vetor.length; i++) { // percorre o vetor
            if (vetor[i] % 2 == 0) { // se valor do vetor for divisivel por 2 e igual a 0 é par
                System.out.println(vetor[i]); // Imprime o valor par encontrado
            }
        }

    }

}
