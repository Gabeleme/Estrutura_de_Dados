import java.util.ArrayList;

public class Pilha {
    ArrayList<Object> elementos; // Lista que armazena os elementos da pilha

    //Construtor
    public Pilha(){
        elementos = new ArrayList<Object>(); //inicializa a lista
    }

    //Método verifica se a pilha está vazia
    public boolean pilhaVazia(){
        if(elementos.size() == 0){ 
            return true; // Retorna true se a lista de elementos estiver vazia
        }else{
            return false; // Retorna false se a lista contiver elementos
        }
    }// Retorna true se a lista de elementos estiver vazia, caso contrário, retorna false

    // Método para adicionar um item ao topo da pilha
    public void empilhar(Object item){
        elementos.add(item); // Adiciona o item ao final da lista (topo da pilha)

    }

    // Método para remover e retornar o item do topo da pilha
    public Object desempilhar(){
        if(!pilhaVazia()) // verifica se não esta vazia
            return elementos.remove(elementos.size() -1 ); // Remove e retorna o item do final da lista (topo da pilha)
        return null; // Se a pilha estiver vazia, retorna null
    }
}
