import java.util.Stack;

public class UnirPilhas {
    /* Implemente um método que una duas pilhas em uma nova pilha. */

    // método que une as pilhas em uma so
    public static Stack<Integer> unirPilhas(Stack<Integer> pilhaUm, Stack<Integer> pilhaDois) {
        // criação de uma pilha que vai conter a união da pilha Um com a pilha Dois
        Stack<Integer> pilhaUnida = new Stack<>();
        // criação de uma pilha auxilixar que vai ajudar na transferencia dos elementos 
        Stack<Integer> auxiliar = new Stack<>();

        // Transferir os elementos da primeira pilha para a pilha auxiliar
        while (!pilhaUm.isEmpty()) { // enquanto a pilha não estiver vazia faça isso
            auxiliar.push(pilhaUm.pop()); // removendo elemento do topo da pilha e adicionando na pilha auxilixar
        }

        // Transferir os elementos da pilha auxiliar para a pilha unida
        // Isso restaura a ordem original de pilha1 na pilha unida
        while (!auxiliar.isEmpty()) { // enquanto a pilha não estiver vazia faça isso
            pilhaUnida.push(auxiliar.pop()); // Remove o elemento do topo da pilha auxiliar e o coloca em pilhaUnida
        }

        // Transferir os elementos da segunda pilha para a pilha auxiliar
        while (!pilhaDois.isEmpty()) {
            auxiliar.push(pilhaDois.pop()); // Remove o elemento do topo de pilhaDois e adiciona à pilha auxiliar
        }

        // Transferir os elementos da pilha auxiliar (invertidos) para a pilha unida
        // Isso restaura a ordem original de pilha2 na pilha unida
        while (!auxiliar.isEmpty()) {
            pilhaUnida.push(auxiliar.pop()); // Remove o elemento do topo da pilha auxiliar e o coloca em pilhaUnida
        }

        return pilhaUnida;
    }

    public static void main(String[] args) {
        Stack<Integer> pilhaUm = new Stack<>(); //  cria a primeira pilha

        Stack<Integer> pilhaDois = new Stack<>(); // cria a segunda pilha

        // Adicionando elementos à primeira pilha
        pilhaUm.push(1);
        pilhaUm.push(2);
        pilhaUm.push(3);

        // Adicionando elementos à segunda pilha
        pilhaDois.push(4);
        pilhaDois.push(5);
        pilhaDois.push(6);

        // Unindo as pilhas
        Stack<Integer> pilhaUnida = unirPilhas(pilhaUm, pilhaDois);

        // Exibindo a nova pilha unida
        System.out.println("Pilha Unida: " + pilhaUnida);
    }

}
