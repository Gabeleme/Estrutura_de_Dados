public class TesteArvoreBi {
    public static void main(String[] args) {
        NoDaArvorebinaria raiz = new NoDaArvorebinaria(1); // cria a raiz com valor 1, no caso inicializa como raiz
                                                           // principal 1
        raiz.esquerda = new NoDaArvorebinaria(2); // Cria o nó à esquerda da raiz com valor 2
        raiz.direita = new NoDaArvorebinaria(3); // Cria o nó à direita da raiz com valor 3
        raiz.esquerda.esquerda = new NoDaArvorebinaria(4); // Cria o nó à esquerda do nó 2 com valor 4
        raiz.esquerda.direita = new NoDaArvorebinaria(5); // Cria o nó à direita do nó 2 com valor 5

        // Cria uma instancia da classe de Percurso da árvore
        PercursoArvoreBinaria percurso = new PercursoArvoreBinaria();

        System.out.println("\n=============================");
        // Imprime os valores da árvore em pré-ordem
        // Pré-ordem: o pai é visitado antes dos filhos, ou seja, Pai-Esquerda-Direita;
        // O resultado precisa ser: pai(1), esquerda(2), esquerda(4), direita(5), direita(3)
        System.out.println("Árvore em pré-ordem:");
        // Chama o método que imprime os valores da árvore em pré-ordem, começando pela raiz.
        percurso.ImpirmirPreOrdem(raiz);


        System.out.println("=============================");
        // Imprime os valores da árvore em ordem
        // Em ordem: o pai é visitado entre os filhos, ou seja, Esquerda-Pai-Direita;
        // Neste caso começa pelo ultimo valor da esquerda, depois o valor pai,
        // O resultado precisa ser: esquerda(4), pai(2), direita(5), pai(1), direita(3)
        System.out.println("Árvore em ordem:");
        percurso.ImprimirEmOrdem(raiz);

        System.out.println("=============================");
        // Imprime os valores da árvore em pós-ordem
        // Pós-ordem: o pai é visitado após os filhos, ou seja, Esquerda-Direita-Pai
        // O resultado precisa ser: esquerda(4), direita(5), pai(2), direita(3), pai(1)
        System.out.println("Árvore em pós-ordem:");
        percurso.ImprimirPosOrdem(raiz);
        System.out.println(); // quebra de linha
    }

}
