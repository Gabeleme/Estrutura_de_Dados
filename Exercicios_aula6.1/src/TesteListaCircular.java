public class TesteListaCircular {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        lista.adicionar("A", 0);
        lista.adicionar("B", 1);
        lista.adicionar("C", 2);
        lista.adicionar("D", 1); // Adiciona "D" na posição 1

        System.out.println("\nLista após adições: " + lista.imprimirLista());

        lista.remover(0); // Remove "A"
        System.out.println("Lista após remoção: " + lista.imprimirLista());

        lista.remover(2); // Remove "C"
        System.out.println("Lista após remoção: " + lista.imprimirLista());
    }
    }

