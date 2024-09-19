import java.util.ArrayList;
import java.util.List;

public class estudos_lista04 {
    // Crie um ArrayList de nomes e escreva um método que verifique se um nome específico está presente na lista.

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); // Cria uma lista de Strings para armazenar nomes

        // Adiciona alguns nomes à lista
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Lucas");

        // Nome a ser verificado
        String nomeParaVerificar = "Maria";

        // Chama o método para verificar se o nome está presente na lista
        boolean encontrado = verificarNome(nomes, nomeParaVerificar);

        // Imprime o resultado
        if (encontrado) {
            System.out.println(nomeParaVerificar + " está presente na lista.");
        } else {
            System.out.println(nomeParaVerificar + " não está presente na lista.");
        }
    }

    // Método para verificar se um nome está presente na lista
    public static boolean verificarNome(List<String> lista, String nome) {
        // Usa o método contains da lista para verificar a presença do nome
        return lista.contains(nome);
    }

    // O método 'contains' verifica se um elemento específico está presente na lista.
    // Retorna 'true' se o elemento estiver na lista e 'false' caso contrário.
    // Ele usa o método 'equals' para comparar o elemento buscado com os elementos da lista.
}
