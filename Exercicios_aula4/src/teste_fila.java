public class teste_fila {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();
        // Adicionar 10 valores na fila e remover imprimindo

        System.out.println("\nEnfileirando: ");
        for (int i = 0; i < 10; i++) {
            minhaFila.adicionar("Item" + i);
            System.out.print(i + "| ");
        }
        System.out.println("\nDesenfileirar: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(minhaFila.remover() + "| ");
        }

        System.out.println("\n---------------------------------------------------------");

        Fila_Prioridade filaINSS = new Fila_Prioridade();
        Pessoa p1, p2, p3, p4, p5;
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
        int tamanhofila = filaINSS.tamanho();
        Pessoa aux;
        for (int i = 0; i < tamanhofila; i++) {
            aux = filaINSS.remover();
            System.out.println(aux.getNome() + " | " + aux.getIdade());

        }
    }
}
