import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class estudos_lista02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // acanner

        // Cria uma lista de Strings para armazenar nomes
        List<String> lista = new ArrayList<>();

        addNomeLista(lista, sc); // Chama o método para adicionar nomes à lista
        removerNomeLista(lista, sc); // Chama o método para remover um nome da lista

        sc.close(); // fecha o scanner
    }

    // Métodos para adicionar nome na lista
    public static void addNomeLista(List<String> lista, Scanner sc) {
        // Variável para armazenar o nome digitado pelo usuário
        String nomeAdicionado;

        for (int i = 0; i < 5; i++) { //loop para ferguntar e adicionar nome na lista
            System.out.println("\nInforme o nome que deseja adicionar: ");
            nomeAdicionado = sc.nextLine(); // Lê o nome digitado pelo usuário
            lista.add(nomeAdicionado); // Adiciona o nome à lista
        }

        // Exibe a lista com todos os nomes adicionados
        System.out.println("\n------------------------------");
        System.out.println("Lista com todos os 5 nomes adicionados: ");
        System.out.println(lista);

    }
    
    // Método para remover um nome da lista
    public static void removerNomeLista(List<String> lista, Scanner sc) {
        // Verifica se a lista está vazia
        if (lista.isEmpty()) {
            // Informa ao usuário que não há itens para remover
            System.out.println("A lista está vazia. Nenhum item para remover.");
            return; // Sai do método se a lista estiver vazia
        }

         // Variável para armazenar o índice informado pelo usuário
        int indice;

        // Loop para solicitar um índice válido até que o usuário forneça um índice correto
        while (true) {
            // Solicita ao usuário que informe o índice do item a ser removido
            System.out.println("\nQual índice você deseja remover? (0 a " + (lista.size() - 1) + ")");
             // Verifica se a entrada do usuário é um número inteiro
             // hasNextInt() retorna True ou False
             // usado para validação de entrada, nesse caso utilizado para verificar se o valor inserido pelo usuario é um número inteiro 

            if (sc.hasNextInt()) {
                indice = sc.nextInt(); // Lê o índice informado pelo usuário
                sc.nextLine(); // Consumir a nova linha deixada pelo nextInt()

                // Verifica se o índice está dentro do intervalo válido
                if (indice >= 0 && indice < lista.size()) {
                    lista.remove(indice); // Remove o item no índice especificado

                    System.out.println("------------------------------");
                    System.out.println("Lista com o nome removido: ");
                    System.out.println(lista); // imprime a lista com o item removido
                    System.out.println("------------------------------");

                    break;  // Sai do loop após a remoção
                } else {
                    // Informa ao usuário que o índice é inválido
                    System.out.println("Índice inválido. Tente novamente.");
                }
            } else {
                // Informa ao usuário que a entrada não é um número inteiro
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                sc.next(); // Limpar o buffer
            }
        }
    }
    
}
    


