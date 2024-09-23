public class estudos_recursao5 {
    /*
     * Soma dos N primeiros números naturais: Crie uma função recursiva que retorne
     * a soma dos primeiros n números naturais.
     * n = 10
     */

     public static int soma(int n) {
        // Verifica se o valor de 'n' é igual a 1 (caso base da recursão).
        if (n == 1) { 
            // Se for igual a 1, retorna 1, encerrando a recursão.
            return 1;
        } else {
            // Caso contrário, retorna 'n' somado ao resultado da função recursiva chamada com 'n - 1'.
            return n + soma(n - 1);
        }
    }
    
    public static void main(String[] args) {
        // Declara e inicializa a variável 'n' com o valor 10.
        int n = 10;
        // Chama a função 'soma' e armazena o resultado na variável 'resultado'.
        int resultado = soma(n);
        // Imprime uma linha de separação.
        System.out.println("\n-----------------------------");
        // Imprime o resultado da soma dos 'n' primeiros números naturais.
        System.out.println("A soma dos " + n + " primeiros números naturais é: " + resultado);
        // Imprime outra linha de separação.
        System.out.println("-----------------------------");
    }
    
}