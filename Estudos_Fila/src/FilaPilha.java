import java.util.LinkedList;
import java.util.Stack;

/* enqueue : Adiciona um elemento ao final da fila.
dequeue: Remove e retorna o elemento do início da fila.
peek (ou front): Retorna o elemento do início da fila sem removê-lo.
isEmpty: Verifica se a fila está vazia.
size: Retorna o número de elementos na fila. */

// Push (Empilhar): Adiciona um elemento ao topo da pilha.
// Pop (Desempilhar): Remove e retorna o elemento do topo da pilha.
// Peek(Espiar): Retorna o elemento do topo da pilha sem removê-lo.
// IsEmpty (Está Vazia): Verifica se a pilha está vazia.
// IsFull (Está Cheia): Verifica se a pilha está cheia (apenas em implementações com tamanho

class FilaExPilha {
    private LinkedList<Integer> listaFila; // declara uma lista para armazenar a fila
    private Stack<Integer> pilha; // declara uma pilha

    // construtor da classe
    public FilaExPilha() { 
        listaFila = new LinkedList<>(); // Inicializa a listaFila como uma nova LinkedList
        pilha = new Stack<>(); // Inicializa a pilha como uma nova Stack
    }

    // Método para adicionar um elemento à fila
    public void add(int valor) {
        listaFila.add(valor); // Adiciona o valor ao final da listaFila
    }

    // Método para remover um elemento da fila
    public Integer removeFila() {
        // Retorna o primeiro elemento da fila ou null se a fila estiver vazia
        return listaFila.isEmpty() ? null : listaFila.removeFirst();
    }

    // Método para mover todos os elementos da fila para a pilha
    public void addPilha() {
        // Enquanto a fila não estiver vazia
        while (!listaFila.isEmpty()) {
            pilha.push(listaFila.removeFirst()); // Move elementos da fila para a pilha
        }
    }

    // Método para desempilhar elementos
    public Integer removePilha() {
        return pilha.isEmpty() ? null : pilha.pop();
    }

    // Método para visualizar o estado da fila
    @Override
    public String toString() {
        return "Fila: " + listaFila + ", Pilha: " + pilha;
    }

    // Método para verificar se a FILA está vazia
    public boolean isFilaEmpty() {
        return listaFila.isEmpty();
    }

     // Método para verificar se a PILHA está vazia
    public boolean isPilhaEmpty() {
        return pilha.isEmpty();
    }

}

public class FilaPilha {

    public static void main(String[] args) {
        FilaExPilha filaPilha = new FilaExPilha(); // Cria uma instância da classe FilaExPilha

        // Adiciona elementos à fila
        filaPilha.add(1);
        filaPilha.add(2);
        filaPilha.add(3);
        filaPilha.add(4);

        System.out.println("\nFila original: " + filaPilha); // exibe a fila

        System.out.println("Estado inicial: " + filaPilha); // exibe o estado inicial

        // Transferindo elementos da fila para a pilha
        filaPilha.addPilha();

        System.out.println("Após mover elementos para a pilha: " + filaPilha); // exibe depois de tranferido os dados de uma pra outra

        // Desempilhando elementos da pilha
        System.out.print("Elementos desempilhados (em ordem inversa): ");
        // Enquanto a pilha não estiver vazia
        while (!filaPilha.isPilhaEmpty()) {
            // Remove e imprime o elemento do topo da pilha
            System.out.print(filaPilha.removePilha() + " ");
        }
    }

}
