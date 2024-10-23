public class exTesteDuplamenteLigada {
    public static void main(String[] args) {
        exListaDuplamenteLigada lista = new exListaDuplamenteLigada();

        // Adicionando elementos
        lista.adicionar("Primeiro");
        lista.adicionar("Segundo");
        lista.adicionar("Terceiro");
        lista.adicionar("Quarto");

        System.out.println("Lista após adicionar elementos:");
        lista.imprimirLista();

        // Inverter a lista
        lista.inverter();
        System.out.println("Lista após inverter:");
        lista.imprimirLista();

        // Buscar elemento
        System.out.println("Buscar 'Terceiro': " + lista.buscar("Terceiro"));

        // Remover um elemento
        lista.remover("Segundo");
        System.out.println("Lista após remover 'Segundo':");
        lista.imprimirLista();

        // Limpar a lista
        lista.limpar();
        System.out.println("Lista após limpar:");
        lista.imprimirLista();
    }
}
