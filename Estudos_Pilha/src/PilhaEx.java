
public class PilhaEx { // classe pilha 

    // LIFO (Last In, First Out), ou seja, o último elemento a ser inserido é o
    // primeiro a ser removido

    // Push (Empilhar): Adiciona um elemento ao topo da pilha.
    // Pop (Desempilhar): Remove e retorna o elemento do topo da pilha.
    // Peek(Espiar): Retorna o elemento do topo da pilha sem removê-lo.
    // IsEmpty (Está Vazia): Verifica se a pilha está vazia.
    // IsFull (Está Cheia): Verifica se a pilha está cheia (apenas em implementações com tamanho

    public Object[] elementos; // Array para armazenar os elementos da pilha
    public int topo; //Indice do topo da pilha
    public int capacidade; // capacidade maxima da pilha


    //Construtor da pilha
    public PilhaEx(int tamanho) {  // Recebe um tamanho para inicializar a pilha
        capacidade = tamanho;  // Define a capacidade máxima da pilha
        elementos = new Object[capacidade];  // Inicializa o array com a capacidade fornecida
        topo = -1;  // Inicializa o topo como -1, indicando que a pilha está vazia
    }

     // Método para empilhar (adicionar elemento no topo)
    public void push(int elemento) {  
        if (!isFull()) { // Verifica se a pilha não está cheia
            topo++;  // Incrementa o índice do topo
            elementos[topo] = elemento; // Adiciona o elemento na posição indicada pelo topo
        } else {
            System.out.println("Pilha cheia! Não é possível adicionar mais elementos.");
        }
    }

    // Método para desempilhar (remover elemento do topo)
    public Object pop() {  // Remove e retorna o elemento do topo da pilha
        if (!isEmpty()) { // Verifica se a pilha não está vazia
            Object elementoRemovido = elementos[topo];  // Guarda o elemento do topo
            topo--; // Decrementa o índice do topo
            return elementoRemovido; // Retorna o elemento removido
        } else {
            System.out.println("Pilha vazia! Não há elementos para remover.");
            return null; // Se a pilha estiver vazia, retorna null
        }
    }

    // Método para espiar o elemento do topo sem removê-lo
    public Object peek() {  // Retorna o elemento do topo sem removê-lo
        if (isEmpty()) {  // Verifica se a pilha está vazia
            System.out.println("Pilha vazia! Não há elementos para espiar.");
            return -1;  // Retorna -1 se a pilha estiver vazia
        } else {
            return elementos[topo];  // Retorna o elemento no topo
        }
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {  // Retorna true se a pilha não tem elementos
        return topo == -1;  // O topo é -1 se a pilha estiver vazia
    }

    // Método para verificar se a pilha está cheia
    public boolean isFull() {  // Retorna true se a pilha está cheia
        return topo == capacidade - 1;  // O topo é igual à capacidade - 1 se a pilha estiver cheia
    }

    // Método para verificar o tamanho atual da pilha
    public int size() {  // Retorna o número de elementos na pilha
        return topo + 1;  // O tamanho é o índice do topo + 1 (para incluir o elemento no topo)
    }
    
}
