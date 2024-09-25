import java.util.Stack;

public class ClonarPilha {
    /*
     * Crie um método que clone a pilha e retorne uma nova pilha com os mesmos
     * elementos.
     */

    // Método que clona a pilha
    public static Stack<Integer> clonarPilha(Stack<Integer> pilhaOriginal) {
        // cria uma nova pilha para que possa armazenar a copia
        Stack<Integer> pilhaClone = new Stack<>();
        // cria uma pilha auxiliar para transferir os elementos
        Stack<Integer> auxiliar = new Stack<>();

        // 1. Transferir elementos da pilha original para a pilha auxiliar
        // enquanto a pilha original não estiver vamos removendo os elementos do topo
        while (!pilhaOriginal.isEmpty()) {
            int elemento = pilhaOriginal.pop(); // remove o elemento do topo da pilha
            auxiliar.push(elemento); // adiciona o elememto a pilha auxiliar
        }

        // 2. Transferir os elementos da pilha auxiliar para a pilha clonada
        while (!auxiliar.isEmpty()) {
            int elemento = auxiliar.pop(); // Remove o elemento do topo da pilha auxiliar
            pilhaClone.push(elemento); // Adiciona o elemento à pilha clone
            pilhaOriginal.push(elemento); // Retorna o elemento à pilha original
        }

        return pilhaClone; // retorna a pilha clonada
    }

    public static void main(String[] args) {
        // Cria uma pilha original e adiciona elementos a ela
        Stack<Integer> pilhaOriginal = new Stack<>();
        pilhaOriginal.push(1);
        pilhaOriginal.push(2);
        pilhaOriginal.push(3);

        // Clona a pilha original usando o método
        Stack<Integer> pilhaClonada = clonarPilha(pilhaOriginal);

        // Imprime a pilha original
        System.out.println("Pilha Original: " + pilhaOriginal);
        // Imprime a pilha clonada
        System.out.println("Pilha Clonada: " + pilhaClonada);
    }
}

/* temos que usar uma pilha originar, uma auxlixar e a que vai retornar os valores
 * clonados por conta que se passar direto da original para a clonada os valores
 * vão ser colocamso de forma inversa ja que a pilha remove o ultimo que foi adicionado
 * enão passamos da original para a auxilixar e depois da auxilixar para a clonada para
 * que os elementos possam ser passados em ordem correta e as pilhas ficarem clonadas de 
 * maneira correta com a ordem certa nas duas 
 */
