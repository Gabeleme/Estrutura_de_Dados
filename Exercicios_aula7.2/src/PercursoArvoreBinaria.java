public class PercursoArvoreBinaria {

    //Função para imprimir os valores da árvore em pré-ordem
    //Pré-ordem: o pai é visitado antes dos filhos, ou seja, Pai-Esquerda-Direita;
    public void ImpirmirPreOrdem(NoDaArvorebinaria No){
        if(No == null) return; //Se valor for igual a null, não faz nada, nesse caso não retorna nada
        System.out.println(No.valor + " "); // Visita o nó: imprime o valor (pai)
        ImpirmirPreOrdem(No.esquerda); //Visita o filho a esquerda
        ImpirmirPreOrdem(No.direita); //Visita o filho a direita
    }

    // Função para imprimir os valores da árvore em ordem
    // Em ordem: o pai é visitado entre os filhos, ou seja, Esquerda-Pai-Direita;
    public void ImprimirEmOrdem(NoDaArvorebinaria No){
        if (No == null) return; // Se o nó for nulo, não faz nada
        ImprimirEmOrdem(No.esquerda); //visita o filho a esquerda
        System.out.println(No.valor + " "); // visita o nó e imprime (pai)
        ImprimirEmOrdem(No.direita); // visita o filho a direita
    }

    // Função para imprimir os valores da árvore em pós-ordem
    // Pós-ordem: o pai é visitado após os filhos, ou seja, Esquerda-Direita-Pai
    public void ImprimirPosOrdem(NoDaArvorebinaria No){
        if(No == null) return; // Se o nó for nulo, não faz nada
        ImprimirPosOrdem(No.esquerda); //visita o filho a esquerda
        ImprimirPosOrdem(No.direita); // visita o filho a direita
        System.out.println(No.valor + " "); // visita o nó e imprime (pai)
    }
}
