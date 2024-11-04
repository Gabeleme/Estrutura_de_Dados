public class TesteListaLigada {
    public static void main(String[] args) {

        ListaLigada minhaLista = new ListaLigada(); // criação da lista ligada
        
        // adicoonando elementos na lista
        minhaLista.adicionar("Gabriela");
        minhaLista.adicionar("Rodrigo");
        minhaLista.adicionar("Carlos");
        minhaLista.adicionar("Creusa");

        // Imprime a lista completa após adicionar os primeiros elementos
        System.out.println("\nLista de inicio");
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - " + minhaLista.getLista(i));
        }

        // adiciona um elemento na posição 0
        minhaLista.adicionar("Rafael", 0);
        // adiciona um elemento na posição 4
        minhaLista.adicionar("José", 4);

        // imprime a lista depois de adicionar
        System.out.println("---------------------------------------");
        System.err.println("Lista após adicionar duas pessoas (Rafael) e (José)");
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - " + minhaLista.getLista(i));
        }

        // Remove o elemento na posição 3 (Carlos)
        minhaLista.remover(3);
        System.out.println("---------------------------------------");
        System.out.println("Lista após remover o elemento na posição 3 (Carlos):");
        for (int i = 0; i < minhaLista.getTamanho(); i++) {
            System.out.println(i + " - " + minhaLista.getLista(i));
        }

    }
}

// para entregar na proxima aula
// Altere a método Adicionar da Lista Ligada para permitir adicionar na posição
// do índice 0;
// Implemente o método void remover(int posição); //Que removerá o nó definido
// pelo índice