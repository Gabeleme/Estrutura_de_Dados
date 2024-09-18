import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class estudos_lista05 {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>(); // Cria uma lista mutável de strings chamada 'frutas'

        // Adiciona uma lista de frutas na lista 'frutas' usando o método addAll() e Arrays.asList()
        frutas.addAll(Arrays.asList("Banana", "Morango", "Caju", "Maça", "Melancia"));

        System.out.println("\n------------------------------");
        System.out.println("Lista com os itens iniciasi: " + frutas); // imprime a lista

        frutas.add(2, "Mamão"); // adiciona outro valor ao indice 2

        System.out.println("------------------------------");

        System.out.println("Lista com indice 2 substituido: " + frutas); // imprime a lista com o novo valor adicionado

    }
}

// Arrays.asList()
// O que faz: Cria uma lista fixa a partir de um conjunto de elementos ou de um array.
//Uso: Útil para converter arrays em listas ou para inicializar listas com valores pré-definidos.
//Limitação: A lista resultante não permite adicionar ou remover elementos, mas permite modificar os valores existentes.

// addAll()
// O que faz: Adiciona todos os elementos de uma coleção (como uma lista) a uma lista existente.
// Uso: Útil para adicionar vários elementos de uma vez, em vez de usar add() repetidamente.
// Vantagem: Torna o código mais eficiente e legível ao permitir a adição de vários itens com um único método.

//Se você precisa de uma lista mutável (em que você pode adicionar ou remover elementos), use ArrayList em combinação com addAll().