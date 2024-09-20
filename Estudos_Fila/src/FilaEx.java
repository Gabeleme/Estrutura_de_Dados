import java.util.ArrayList;
import java.util.List;

public class FilaEx {
    // FILA conceito FiFo (First-In First-out)

    // public void adiciona(Object item); ------ Adiciona no final da fila
    // public Object remove() ----- Remove do final da fila
    // public Object exibirInicio(); ----- Exibe o final da fila
    // public int tamanho(); ----- Retorna o tamanho da fila

    // ** A fila deverá ser implementada utilizando Arraylist

    List <Object> fila = new ArrayList<>(); // Lista que armazena os elementos da fila

    public void adicionar(Object item){ // Adiciona um item ao final da fila
        fila.add(item); 
    }

    public Object remover(){
        // remove do inicio da Lista...
        // Qual o indice do inicio da lista? = 0
        return fila.remove(0);
    }

    public Object exibirInicio(){
        // le a primeira posição sem remover
        return fila.get(0);
    }

    public int tamanho(){
        // retorna o tamanho da lista
        return fila.size(); 
    }

    public void exibirFila() { // Exibe o estado da fila
        for (int i = 0; i < fila.size(); i++) {
            System.out.print(fila.get(i) + ", ");
        }
        System.out.println();
    }

}
