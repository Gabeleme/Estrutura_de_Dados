public class teste_fila {
    public static void main(String[] args) {
        // ------------ Fila Simples -----------------

        Fila minhaFila = new Fila(); // Criando uma fila simples
        // Adicionar 10 valores na fila e remover imprimindo

        System.out.println("\nEnfileirando: ");

        // Adiciona 10 itens na fila
        for (int i = 0; i < 10; i++) {
            minhaFila.adicionar("Item" + i); // Adiciona um item na fila
            System.out.print(i + "| ");
        }
        System.out.println("\nDesenfileirar: ");
        // Remove e imprime os itens da fila
        for (int i = 0; i < 10; i++) {
            System.out.print(minhaFila.remover() + "| "); // Remove e imprime o item removido
        }

        System.out.println("\n---------------------------------------------------------");

        // ------------ Fila Prioridade -----------------

        // Criando uma fila com prioridade
        Fila_Prioridade filaINSS = new Fila_Prioridade();
        Pessoa p1, p2, p3, p4, p5;

        // Adiciona pessoas com diferentes idades e imprime seus nomes
        p1 = new Pessoa(17, "Victor");
        System.out.println(p1.getNome());
        filaINSS.adicionar(p1);

        p2 = new Pessoa(65, "VJoao");
        System.out.println(p2.getNome());
        filaINSS.adicionar(p2);

        p3 = new Pessoa(69, "Rosana");
        System.out.println(p3.getNome());
        filaINSS.adicionar(p3);

        p4 = new Pessoa(40, "Gabriela");
        System.out.println(p4.getNome());
        filaINSS.adicionar(p4);

        p5 = new Pessoa(67, "Jose");
        System.out.println(p5.getNome());
        filaINSS.adicionar(p5);

        System.out.println("-----------------------------------------------------");

        int tamanhofila = filaINSS.tamanho(); // declara uma variavel para poder armazenar o tamanho da fila e utilziar
        // ela depois no for
        Pessoa aux; // Declara uma variável para armazenar a pessoa removida da fila

        for (int i = 0; i < tamanhofila; i++) {
            aux = filaINSS.remover(); // Remove o elemento do início da fila e armazena na variável 'aux'
            // A chamada ao método 'remover' reduz o tamanho da fila em 1 a cada iteração

            // Imprime o nome e a idade da pessoa removida
            // Usa 'aux.getNome()' para obter o nome e 'aux.getIdade()' para obter a idade
            System.out.println(aux.getNome() + " | " + aux.getIdade());

        }
    }
}
