import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class estudos_lista06 {
    //Crie um método que receba uma lista de inteiros e retorne uma nova lista com os elementos em ordem inversa.
    public static void main(String[] args) {
        // Inicializa a lista de números
        List<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40)); 

        // Chama o método inverterLista 
        List<Integer> numerosInvertidos = inverterLista(numeros);

        // imprime o resultado
        System.out.println("\nLista original: " + numeros);
        System.out.println("Lista invertida: " + numerosInvertidos);

    }

    // Método que inverte a lista de inteiros
    public static List<Integer> inverterLista(List<Integer> numeros){

        // Cria uma nova lista copiando os elementos da lista original
        List<Integer> listaInvertida = new ArrayList<>(numeros);

        Collections.reverse(listaInvertida);  // Inverte a nova lista

        return listaInvertida;  // Retorna a lista invertida
    }
}
