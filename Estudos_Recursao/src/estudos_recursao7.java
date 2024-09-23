public class estudos_recursao7 {
    /*
     * Imprimir números de 1 até N: Escreva uma função recursiva que imprima os
     * números de 1 até n.
     */

     public static void imprimirValores(int valores) {
        // Se o valor for 1, imprime o valor e termina a recursão.
        if (valores == 1) {
            System.out.println(valores + " ");
        } else {
            // Chamada recursiva, diminuindo o valor em 1 a cada vez até atingir 1.
            imprimirValores(valores - 1);
    
            // Após a chamada recursiva, imprime o valor atual.
            System.out.println(valores + " ");
        }
    }
    
    public static void main(String[] args) {
        int valores = 10; // Define o valor inicial como 10.
        
        // Exibe o separador de linhas no início.
        System.out.println("\n-------------------");
    
        // Chama o método recursivo para imprimir os valores de 1 até 10.
        imprimirValores(valores);
    
        // Exibe o separador de linhas no fim.
        System.out.println("-------------------");
    }
    
}
