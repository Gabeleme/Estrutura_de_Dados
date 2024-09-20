import java.util.Stack;

public class Pilha_stack {
    // LIFO (Last In, First Out), ou seja, o último elemento a ser inserido é o
    // primeiro a ser removido

    // Push (Empilhar): Adiciona um elemento ao topo da pilha.
    // Pop (Desempilhar): Remove e retorna o elemento do topo da pilha.
    // Peek(Espiar): Retorna o elemento do topo da pilha sem removê-lo.
    // IsEmpty (Está Vazia): Verifica se a pilha está vazia.
    // IsFull (Está Cheia): Verifica se a pilha está cheia (apenas em implementações com tamanho

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(10); // adiciona o elementos na pilha
        pilha.push(20); // adiciona o elemento na pilha
        pilha.push(30); // adiciona o elemento na pilha
        // esse ultimo elemento adicionado é o valor que está no topo da pilha

        System.out.print("\n--------------------------------");
        System.out.println("\nPilha: " + pilha);

        System.out.println("--------------------------------");
        // peek mostra o elemento que está no topo da pilha
        System.out.println("Elemento no topo: " + pilha.peek());

        System.out.println("--------------------------------");
        // remove o valor que está no topo da pilha
        System.out.println("Removendo o topo: " + pilha.pop());

        System.out.println("--------------------------------");
        // como removemos um elemento vamos exibir o novo elemento que está no topo
        System.out.println("Elemento que tomou conta do topo: " + pilha.peek());

        System.out.println("--------------------------------");
        // Exibe se a pilha está vazia
        System.out.println("A pilha está vazia? " + pilha.isEmpty()); // Saída: false

        System.out.println("--------------------------------");
        // Adicionando mais elementos e exibindo o tamanho da pilha
        pilha.push(40); // pilha: [10, 20, 40]
        System.out.println("Tamanho da pilha: " + pilha.size()); // Saída: 3

        System.out.println("--------------------------------");
        // Remover todos os elementos da pilha
        while (!pilha.isEmpty()) {
            System.out.println("Removendo: " + pilha.pop());
        }

        System.out.println("--------------------------------");
        // Verifica se a pilha está vazia após remover todos os elementos
        System.out.println("A pilha está vazia agora? " + pilha.isEmpty()); // Saída: true
        System.out.println("--------------------------------");

    }
}
