public class Arvore {
    // devemos criar uma classe que permita adicionar de forma ordenada valores
    // inteiros, sem permitir valores duplicados

    // Atributos da Arvore
    private ArvoreBinaria raiz;

    public void adicionar(int info) {
        // implemente o código necessario para permitir adicionar novos nós na arvore
        // binaria de forma ordenada, utilizando a seguinte regra:
        // Se o valor de info for maior que o valor de nó
        // Adicionar a direita se não a esquerda
        // Se o valor for duplicado encerra sem adicionar

        if (raiz == null) {
            raiz = new ArvoreBinaria(info, null, null);

        } else {
            adicionarRecursivo(info, raiz);
        }
    }

    private void adicionarRecursivo(int info, ArvoreBinaria raiz) {
        // se info for maior que raiz.info adicionar a direita
        // se raiz direita for igual a null, cria o no e atribui a raiz direita
        if (info > Integer.parseInt(raiz.getInfo().toString())) {
            if (raiz.getNoDireita() == null) {
                ArvoreBinaria novoNo = new ArvoreBinaria(info, null, null);
                raiz.setNoDireita(novoNo);
            } else {
                // senão chama adicionar recursivo passando info e raiz.direita como parametro
                adicionarRecursivo(info, raiz.getNoDireita());
            }
        } else if (raiz.getNoEsquerda() == null) {
            // senão adicionar a esquerda
            // se raiz.esquerda for igual a null, cria o nó e atribui a raiz.esqeurda
            ArvoreBinaria novoNo = new ArvoreBinaria(info, null, null);
            raiz.setNoEsquerda(novoNo);
        } else {
            // senão chama adicionar recursivo passando indo raiz.esquerda como parametro
            adicionarRecursivo(info, raiz.getNoEsquerda());
        }

    }

    // Método para buscar um nó na árvore e retornar sua profundidade
    public int buscar(int info) {
        return buscarRecursivo(info, raiz, 0); // Inicia a busca a partir da raiz com profundidade 0
    }

    // Método recursivo para buscar um nó
    private int buscarRecursivo(int info, ArvoreBinaria raiz, int profundidade) {
        if (raiz == null) {
            return -1; // Nó não encontrado
        }
        // Verifica se o valor do nó atual é igual ao valor buscado
        if (info == Integer.parseInt(raiz.getInfo().toString())) {
            return profundidade; // Retorna a profundidade do nó encontrado
        }
        // Se o valor buscado for menor, busca na subárvore da esquerda
        if (info < Integer.parseInt(raiz.getInfo().toString())) {
            return buscarRecursivo(info, raiz.getNoEsquerda(), profundidade + 1);
        } else {
            // Se o valor buscado for maior, busca na subárvore da direita
            return buscarRecursivo(info, raiz.getNoDireita(), profundidade + 1);
        }
    }

    // criar metodo para percorrer e imprimir
    // Inicia o percurso da árvore e imprime os valores e profundidades
    public void percorrerEImprimir(){
        percorrerEImprimirRecursivo(raiz, 0); // Começa pela raiz com profundidade 0
    }

    // Percorre e imprime 
    private void percorrerEImprimirRecursivo(ArvoreBinaria raiz, int profundidade){
        if(raiz != null){ // verifica se não é nulo
            percorrerEImprimirRecursivo(raiz.getNoEsquerda(), profundidade + 1); // Percorre a esquerda
            System.out.println("Valor: " + raiz.getInfo() + " Profundidade: " + profundidade); // imprime o valor e a profundidade
            percorrerEImprimirRecursivo(raiz.getNoDireita(), profundidade + 1); // Percorre a direita
        }
    }

    
    
}
