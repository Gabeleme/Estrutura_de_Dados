public class estudos_recursao2 {

    public static void imprimirNumeros(int n) {
        // Verifica se o valor de 'n' é igual a 1 (caso base da recursão).
        if (n == 1) {
            // Se for igual a 1, imprime o número 1 seguido de um espaço.
            System.out.print(n + " ");
        } else {
            // Se 'n' for maior que 1, chama a função recursivamente com o valor de 'n' - 1.
            imprimirNumeros(n - 1);
            // Após a chamada recursiva, imprime o valor de 'n' seguido de um espaço.
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        // Declara e inicializa a variável N com o valor 10.
        int N = 10;
        // Chama o método imprimirNumeros passando N como argumento.
        imprimirNumeros(N);
    }
}
