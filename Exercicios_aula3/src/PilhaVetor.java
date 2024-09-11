public class PilhaVetor {
    /*
     * Metodos obrigatorios
     * Empilhar (obj elmento): Adicionar um elemento ao topo da pilha
     * obj desempilhar(): Remove e retorna o elemento do topo da pilha
     * Booleano Pilha Vazia(): Verifica se a pilha está vazia
     * Booleano Pilha Cheia(): Verifica se a pilha está cheia
     */

    Object[] elementos;
    int indice;

    public PilhaVetor(int tamanho) { // construtor publico
        this.elementos = new Object[tamanho]; // reservando espaço na memoria ao chamar new
        indice = 0;
    }

    // empilha o item no topo da pilha se não estiver cheia 
    public void empilhar(Object item) {
        if(!pilhaCheia()){ // verifica se não está cheia
            elementos[indice] = item; // Adiciona o item na posição indicada pelo índice
            System.out.println(elementos[indice]);
            indice++;  // Incrementa o índice
        }
    }
    //Desempilhar remove o item do topo da pilha e retorna o valor se não estiver vazia
    public Object desempilha(){
        if(!pilhaVazia()){ //verifica se não está vazia
            indice--; // decrementa 
            return elementos[indice]; // Retorna o item do topo da pilha
        }else{
            return null; 
        }
    }

    public boolean pilhaVazia() {
        if (indice == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pilhaCheia() {
        if (indice == elementos.length) {
            return true;
        } else {
            return false;
        }
    }
}
