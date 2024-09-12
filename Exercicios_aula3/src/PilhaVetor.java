public class PilhaVetor {
    /*
     * Metodos obrigatorios
     * Empilhar (obj elmento): Adicionar um elemento ao topo da pilha
     * obj desempilhar(): Remove e retorna o elemento do topo da pilha
     * Booleano Pilha Vazia(): Verifica se a pilha está vazia
     * Booleano Pilha Cheia(): Verifica se a pilha está cheia
     */

    Object[] elementos; // Array para armazenar os elementos da pilha
    int indice; // Índice que indica a posição do topo da pilha

    public PilhaVetor(int tamanho) { // construtor publico
        this.elementos = new Object[tamanho]; // reservando espaço na memoria ao chamar new
        indice = 0; // Inicializa o índice para indicar que a pilha está vazia
    }

    // empilha o item no topo da pilha se não estiver cheia
    public void empilhar(Object item) {
        if (!pilhaCheia()) { // verifica se não está cheia
            elementos[indice] = item; // Adiciona o item na posição indicada pelo índice
            System.out.println(elementos[indice]);
            indice++; // Incrementa o índice para o próximo item
        }
    }

    // Desempilhar remove o item do topo da pilha e retorna o valor se não estiver
    // vazia
    public Object desempilha() {
        if (!pilhaVazia()) { // verifica se não está vazia
            indice--; // decrementa o índice para o topo da pilha
            return elementos[indice]; // Retorna o item do topo da pilha
        } else {
            return null; // Se a pilha estiver vazia, retorna null
        }
    }

    // Verifica se a pilha está vazia
    public boolean pilhaVazia() {
        return (indice == 0)
            ; // Retorna true se o índice é 0, indicando que a pilha está vazia
    }

    public boolean pilhaCheia() {
        return (indice == elementos.length)
            ; // Retorna true se o índice for igual ao tamanho do array, indicando que a pilha
              // está cheia
    }
}
