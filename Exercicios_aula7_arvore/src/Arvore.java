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

    // Função para imprimir os valores da árvore em pré-ordem
    // Pré-ordem: o pai é visitado antes dos filhos, ou seja, Pai-Esquerda-Direita;
    private void imprimirPreOrdem(ArvoreBinaria No) {
        if (No != null) {
            System.out.print(No.getInfo() + " "); // imprime o pai
            imprimirPreOrdem(No.getNoEsquerda()); // imprime o valor da esquerda
            imprimirPreOrdem(No.getNoDireita()); // imprime a direita
        }
    }

    public void imprimirPreOrdem(){
        imprimirPreOrdem(raiz);
    }

    // Função para imprimir os valores da árvore em ordem
    // Em ordem: o pai é visitado entre os filhos, ou seja, Esquerda-Pai-Direita;
    private void imprimirEmOrdem(ArvoreBinaria No) {
        if (No != null) {
            imprimirEmOrdem(No.getNoEsquerda()); // imprime a esquerda
            System.out.print(No.getInfo() + " "); // imprime o pai
            imprimirEmOrdem(No.getNoDireita()); // imprime a direita

        }
    }

    public void imprimirEmOrdem(){
        imprimirEmOrdem(raiz);
    }

    // Função para imprimir os valores da árvore em pós-ordem
    // Pós-ordem: o pai é visitado após os filhos, ou seja, Esquerda-Direita-Pai
    private void ImprimirPosOrdem(ArvoreBinaria No) {
        if (No != null) {
            ImprimirPosOrdem(No.getNoEsquerda()); // imprime a esquerda
            ImprimirPosOrdem(No.getNoDireita()); //imprimir a direita
            System.out.print(No.getInfo() + " "); //imprime o pai 
        }

    }

    public void ImprimirPosOrdem(){
        ImprimirPosOrdem(raiz); 
    }

}
