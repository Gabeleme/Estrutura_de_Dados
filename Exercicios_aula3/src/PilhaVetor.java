public class PilhaVetor {
    /*
     * Metodos obrigatorios
     * Empilhar (obj elmento)
     * obj desempilhar()
     * Booleano Pilha Vazia()
     * Booleano Pilha Cheia()
     */

    Object[] elementos;
    int indice;

    public PilhaVetor(int tamanho) { // construtor publico
        this.elementos = new Object[tamanho]; // reservando espaço na memoria ao chamar new
        indice = 0;
    }

    // empilha o item no topo da pilha se não estiver cheia 
    public void empilhar(Object item) {
        if(!pilhaCheia()){
            elementos[indice] = item; 
            System.out.println(elementos[indice]);
            indice++; 
        }
    }
    //Desempilhar remove o item do topo da pilha e retorna o valor se não estiver vazia
    public Object desempilha(){
        if(!pilhaVazia()){
            indice--; // decrementa 
            return elementos[indice]; 
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
