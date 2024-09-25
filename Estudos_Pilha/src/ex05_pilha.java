import java.util.Scanner;
import java.util.Stack;

public class ex05_pilha {
    /*
     * Implemente um método que encontre o menor elemento na pilha sem removê-lo.
     * Implemente um método que encontre o maior elemento na pilha sem removê-lo
     */

    private static Stack<Integer> pilha = new Stack<>();

    public static void recebervalores() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("\nInforme os valores: ");
            int valoresRecebidos = sc.nextInt();
            pilha.add(valoresRecebidos);
        }
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            sc.close();
            return;
        }
        sc.close();
    }

    public static void encontrarMenorValor() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        int menorValor = pilha.peek();
        for (int i = 0; i < pilha.size(); i++) {
            int valor = pilha.get(i);
            if (valor < menorValor) {
                menorValor = valor;
            }
        }
        System.out.println("O menor valor na pilha é: " + menorValor);

    }

    public static void encontrarMaiorValor() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        
        int maiorValor = pilha.peek();
        for(int i = 0; i < pilha.size(); i++){
            int valor = pilha.get(i);
            if ( valor > maiorValor){
                maiorValor = valor;
            }
        }
        System.out.println("O maior valor na pilha é: " + maiorValor);
    }

    public static void main(String[] args) {
        recebervalores();
        encontrarMenorValor();
        encontrarMaiorValor();
    }
}
