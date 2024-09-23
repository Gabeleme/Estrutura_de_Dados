public class estudos_recursao6 {
    /*
     * Número de dígitos: Crie uma função recursiva que calcule quantos dígitos tem
     * um número inteiro n
     */

    public static int calcular(int n) {
        // Verifica se o valor de 'n' é igual a 0 (caso base da recursão).
        if (n == 0) {
            // Se 'n' for 0, retorna 0, encerrando a recursão.
            return 0;
        } else {
            // Caso contrário, adiciona 1 à chamada recursiva com 'n' dividido por 10.
            // Isso efetivamente "remove" o último dígito de 'n' a cada chamada, contando
            // quantos dígitos existem.
            return 1 + calcular(n / 10);
        }
    }

    public static void main(String[] args) {
        // Declara e inicializa a variável 'n' com o valor 100.
        int n = 100;
        // Chama a função 'calcular' para contar os dígitos de 'n' e armazena o
        // resultado em 'quantidade'.
        int quantidade = calcular(n);
        // Imprime o resultado informando quantos dígitos o número 'n' possui.
        System.out.println("\nO número " + n + " tem " + quantidade + " dígitos!");
    }

}
