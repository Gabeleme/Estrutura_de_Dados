import java.util.Scanner;

public class TesteContato {
    public static void main(String[] args) {
        ContatoListaLigada listadecontato = new ContatoListaLigada();
        Scanner sc = new Scanner(System.in);

        // menu de opções
        int opcao; // variavel que armazena a resposta do usuario
        do {
            System.out.println("");
            System.out.println("=========== Menu Contatos ===========");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Listar Contatos");
            System.out.println("4 - Buscar Contato");
            System.out.println("5 - Ordenar Contatos");
            System.out.println("6 - Atualizar Contato");
            System.out.println("7 - Contar quantidade de Contatos");
            System.out.println("8 - Filtrar Contatos pela letra do nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção (coloque o número): ");
            opcao = sc.nextInt(); // recebe e le o valor escolhido
            sc.nextLine();
            System.out.println("\n=====================================");
            switch (opcao) {
                case 1: // Adicionar
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine(); // recebe o nome
                    System.out.print("Digite o telefone: ");
                    String telefone = sc.nextLine(); // recebe o telefone
                    System.out.print("Digite o e-mail: ");
                    String email = sc.nextLine();// recebe o email
                    Contato contato = new Contato(nome, telefone, email); // cria um novo contato
                    listadecontato.adicionarContato(contato); // adiciona esse novo contato na lista
                    break;
                case 2: // remover contato
                    System.out.print("Digite o nome do contato que deseja remover: ");
                    String nomeParaRemover = sc.nextLine(); // armazena o nome que foi inserido
                    listadecontato.removerContato(nomeParaRemover); // remove o contato
                    break;
                case 3: // listar contato
                    listadecontato.listarContatos();
                    break;
                case 4: // buscar contato
                    System.out.print("Digite o nome do contato que deseja buscar: ");
                    String nomeBuscar = sc.nextLine();
                    listadecontato.buscarContatos(nomeBuscar);
                    break;
                case 5: // odenar
                    listadecontato.ordenarContatos();
                    break;
                case 6: // atualizar contato
                    System.out.print("Digite o nome do contato que deseja atualizar: ");
                    String nomeAtualizar = sc.nextLine();
                    System.out.print("Digite o novo telefone: ");
                    String novoTelefone = sc.nextLine();
                    System.out.print("Digite o novo e-mail: ");
                    String novoEmail = sc.nextLine();
                    Contato novoContato = new Contato(nomeAtualizar, novoTelefone, novoEmail);
                    listadecontato.atualizarcontato(nomeAtualizar, novoContato);
                    break;
                case 7: // contar
                    listadecontato.contarContatos();
                    break;
                case 8: // filtrar
                    System.out.print("Digite a letra: ");
                    char letra = sc.nextLine().charAt(0);
                    listadecontato.filtrarcontatosPorLetraDoNome(letra);
                    break;
                case 0:
                    System.out.println("Saindo");
                    break; 
                default:
                System.out.println("Opção inválida. Tente novamente.");

            }

        } while (opcao != 0);

        sc.close();
    }

}
