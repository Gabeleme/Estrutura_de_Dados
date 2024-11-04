import java.util.Stack;

public class PilhaOrdenada {

    // Método para ordenar a pilha em ordem crescente
    public static void ordenarPilha(Stack<Integer> pilha) {
        // Criando uma pilha auxiliar
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        // Enquanto a pilha original não estiver vazia
        while (!pilha.isEmpty()) {
            // Remove o elemento do topo da pilha original
            int elemento = pilha.pop();

            // Move elementos da pilha auxiliar de volta para a pilha original
            // se eles forem maiores que o elemento removido
            while (!pilhaAuxiliar.isEmpty() && pilhaAuxiliar.peek() > elemento) {
                pilha.push(pilhaAuxiliar.pop());
            }

            // Adiciona o elemento removido à pilha auxiliar
            pilhaAuxiliar.push(elemento);
        }

        // A pilha auxiliar agora está ordenada, vamos transferir os elementos de volta
        while (!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }

}
