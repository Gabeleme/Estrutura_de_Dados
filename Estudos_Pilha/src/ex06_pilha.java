import java.util.Stack;

class Pilha { // Classe que representa uma pilha 
    private Stack<Integer> stack; // Declara uma pilha de inteiros

    public Pilha() { // Construtor que inicializa a pilha
        this.stack = new Stack<>();
    }

    // Método para adicionar um elemento à pilha
    public void push(int valor) {
        stack.push(valor); // Adiciona o valor ao topo da pilha
    }

    // Método para remover todos os elementos pares da pilha
    public void removerPares() {
        Stack<Integer> tempStack = new Stack<>(); // Pilha temporária para armazenar ímpares

        // Move elementos da pilha original para a pilha temporária, mantendo apenas os ímpares
        while (!stack.isEmpty()) {
            int valor = stack.pop(); // Remove o elemento do topo da pilha original
            if (valor % 2 != 0) { // Verifica se o elemento é ímpar
                tempStack.push(valor); // Adiciona o ímpar à pilha temporária
            }
        }

        // Restaura a pilha original com os elementos que sobraram (apenas ímpares)
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop()); // Retorna os ímpares para a pilha original
        }
    }

    // Método para remover todos os elementos ímpares da pilha
    public void removerImpares() {
        Stack<Integer> tempStack = new Stack<>(); // Pilha temporária para armazenar pares

        // Move elementos da pilha original para a pilha temporária, mantendo apenas os pares
        while (!stack.isEmpty()) {
            int valor = stack.pop(); // Remove o elemento do topo da pilha original
            if (valor % 2 == 0) { // Verifica se o elemento é par
                tempStack.push(valor); // Adiciona o par à pilha temporária
            }
        }

        // Restaura a pilha original com os elementos que sobraram (apenas pares)
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop()); // Retorna os pares para a pilha original
            // tempStack usado para armazenar algo temporariamente 
        }
    }

    // Método para verificar se um determinado elemento existe na pilha
    public boolean existe(int valor) {
        return stack.contains(valor); // Retorna true se o valor estiver presente na pilha
    }

    // Método para imprimir os elementos da pilha (para fins de teste)
    public void imprimir() {
        System.out.println(stack); // Imprime o conteúdo da pilha
    }
}


public class ex06_pilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(); // Cria uma nova instância da pilha

        // Adicionando elementos à pilha
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println("\n======================================");
        System.out.println("Essa é a pilha completa: ");
        pilha.imprimir(); // chama o metodo de Imprime a pilha inicial

        System.out.println("======================================");
        pilha.removerPares(); // chama o metodo que Remove pares
        System.out.println("Essa é a pilha apenas com os valores ímpares: ");
        pilha.imprimir(); // chama o metodo que Imprime a pilha após remover pares

        // Para restaurar a pilha original e remover ímpares
        pilha.push(2);
        pilha.push(4);
        pilha.push(6);
        pilha.push(8);
        
        System.out.println("======================================");
        pilha.removerImpares(); // Remove ímpares
        System.out.println("Essa é a pilha apenas com os valores pares: ");
        pilha.imprimir(); // Imprime a pilha após remover ímpares

         // Verifica se determinados elementos existem na pilha
        System.out.println("======================================");
        System.out.println("Verificação se elemento 3 existe: " + pilha.existe(3));
        System.out.println("Verificação se elemento 2 existe: " + pilha.existe(2));
    }
}