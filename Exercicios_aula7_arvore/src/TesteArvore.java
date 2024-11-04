public class TesteArvore {
    public static void main(String[] args) {
        Arvore minhaArvore = new Arvore();
        minhaArvore.adicionar(5);
        minhaArvore.adicionar(3);
        minhaArvore.adicionar(1);
        minhaArvore.adicionar(2);
        minhaArvore.adicionar(4);
        minhaArvore.adicionar(8);
        minhaArvore.adicionar(7);
        minhaArvore.adicionar(6);
        minhaArvore.adicionar(9);
        
        System.out.println("\n==================================");
        System.out.println("Percorrendo a árvore Pré-Ordem:");
        minhaArvore.imprimirPreOrdem();
        System.out.println("==================================");
        System.out.println("Percorrendo a árvore Em Ordem:");
        minhaArvore.imprimirEmOrdem();
        System.out.println("==================================");
        System.out.println("Percorrendo a árvore Pós-Ordem:");
        minhaArvore.ImprimirPosOrdem();
        System.out.println("==================================");
    }
}
