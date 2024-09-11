import java.util.ArrayList;
import java.util.List;

public class estudos_lista {
    //Escreva um método que receba uma lista de inteiros e um valor inteiro, e adicione o valor ao final da lista.

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Exibir a lista antes de adicionar o novo valor
        System.out.println("Lista antes: " + numeros);

        // Chamar o método para adicionar um valor
        adicionarValor(numeros, 10);

        // Exibir a lista após adicionar o novo valor
        System.out.println("Lista depois: " + numeros);
    }

    public static void adicionarValor(List<Integer> lista, int valor){
        lista.add(valor); 
    }
}

