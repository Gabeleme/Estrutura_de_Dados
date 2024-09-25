import java.util.ArrayList;
import java.util.Scanner;

public class estudos_lista11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> itens = new ArrayList<>(); // Cria um ArrayList para armazenar os itens

        // Chama o método para adicionar itens à lista
        adicionarItens(sc, itens);

        // Chama o método para exibir os itens adicionados
        exibirItens(itens);
        System.out.println("========================");
        // Chama o método para contar a ocorrência de uma palavra escolhida pelo usuário
        contarOcorrencias(sc, itens);
        sc.close(); // Fecha o scanner
    }

    // Método para adicionar itens à lista
    public static void adicionarItens(Scanner scanner, ArrayList<String> itens) {
        System.out.print("Quantos itens você deseja adicionar à lista? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha após o número

        // Pergunta os itens um por um
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o item " + i + ": ");
            String item = scanner.nextLine(); // Lê o item
            itens.add(item); // Adiciona o item à lista
        }
    }

    // Método para exibir todos os itens adicionados
    public static void exibirItens(ArrayList<String> itens) {
        System.out.println("\nItens adicionados à lista:");
        for (String item : itens) {
            System.out.println(item); // Imprime cada item
        }
    }

    // Método para contar a ocorrência de uma palavra escolhida pelo usuário
    public static void contarOcorrencias(Scanner scanner, ArrayList<String> itens) {
        System.out.print("\nDigite a palavra que você deseja contar: ");
        String palavra = scanner.nextLine(); // Lê a palavra a ser contada

        int contador = 0; // Inicializa o contador

        // Percorre a lista e conta quantas vezes a palavra aparece
        for (String item : itens) {
            if (item.equalsIgnoreCase(palavra)) { // Compara sem considerar maiúsculas/minúsculas
                contador++; // Incrementa o contador se a palavra for encontrada
            }
        }

        // Exibe o resultado
        System.out.println("A palavra \"" + palavra + "\" apareceu " + contador + " vezes na lista.");
    }
}
