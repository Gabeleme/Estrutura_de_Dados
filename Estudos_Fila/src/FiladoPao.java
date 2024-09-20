public class FiladoPao {
    public static void main(String[] args) {
        FilaEx fila = new FilaEx();  // Criando um objeto da classe FilaEx para gerenciar a fila

        fila.adicionar("Maria"); // adicionando na fila
        fila.adicionar("Marcos"); // adicionando na fila

        System.out.println("\n-------------------------------");
        System.out.println("----- Fila do Pão -----");
        System.out.println("Na fila do Pão temos: " + fila.tamanho() + " Pessoas"); // exibe o tamanho da fila, nesse caso exibe quantas pessoas estão na fila
        System.out.print("As pessoas na fila são: ");
        fila.exibirFila(); // exibe a fila
        System.out.println("-------------------------------");
        System.out.println("A primeira pessoa da lista foi chamada e atendida!");
        fila.remover(); // remove a primeira pessoa da fila que ja foi atendida 
        System.out.println("-------------------------------");
        System.out.println("Chegou mais quatro pessoas na fila!");

        // adiciona mais pessoas na fila
        fila.adicionar("Gabriela"); 
        fila.adicionar("Eduardo");
        fila.adicionar("Emanuel");
        fila.adicionar("Fernando");

        System.out.println("Agora temos uma fila de: " + fila.tamanho() + " Pessoas"); // exibe o tamanho
        System.out.print("As pessoas na fila são: ");
        fila.exibirFila();
        System.out.println("-------------------------------");
        System.out.println("A proxima pessoa da fila a ser atendida será: " + fila.exibirInicio()); // exibe a primeira pessoa da fila

    }
}
