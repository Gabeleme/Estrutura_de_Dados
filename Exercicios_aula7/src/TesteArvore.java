public class TesteArvore {
    public static void main(String[] args) {
        Arvore minhaArvore = new Arvore();
        minhaArvore.adicionar(10);
        minhaArvore.adicionar(0);
        minhaArvore.adicionar(1);
        minhaArvore.adicionar(15);
        minhaArvore.adicionar(20);
        minhaArvore.adicionar(12);
        minhaArvore.adicionar(7);

        System.out.println("\n==================================");
        System.out.println("Percorrendo a árvore:");
        minhaArvore.percorrerEImprimir();
        System.out.println("==================================");
        int profundidade = minhaArvore.buscar(7); // Deve retornar a profundidade do nó com valor 7
        System.out.println("Profundidade do nó 7: " + profundidade);
    }
}
