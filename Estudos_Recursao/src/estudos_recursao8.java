public class estudos_recursao8 {

    /*
     * Calcular a soma dos números pares até N: Escreva uma função recursiva que
     * retorne a soma de todos os números pares até n
     */

     public static int contador(int n) {
        // Caso base: se n for menor ou igual a 2, retorna o valor de n.
        if(n <= 2){
            return n;
        } else {
            // Se n for par (n % 2 == 0), retorna n; se n for ímpar, retorna 0.
            // Soma o valor resultante com a chamada recursiva da função para n - 2.
            return (n % 2 == 0 ? n : 0) + contador(n - 2);
        }
    }
    
    public static void main(String[] args) {
        int n = 20; // Define o valor inicial como 20.
        
        // Chama o método recursivo para calcular a soma dos números pares até n.
        int soma = contador(n); 
        
        // Exibe o resultado da soma dos números pares até o valor de n.
        System.out.println("\nA soma dos números pares até " + n + " é: " + soma); 
    }
    
}
