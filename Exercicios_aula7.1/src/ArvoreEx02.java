public class ArvoreEx02 {
    private NoEx02 raiz; // referência para a raiz da árvore

    public ArvoreEx02(Object valorRaiz) {
        raiz = new NoEx02(valorRaiz); // inicializa a raiz da árvore
    }

    // Método para somar os valores de todos os nós filhos de um nó pai
    public int somarFilhos(NoEx02 noPai) {
        int soma = 0; // variável para armazenar a soma
        NoListaLigada atual = noPai.getFilhos().getInicio(); // obtém a lista de filhos

        // percorre todos os nós filhos
        while (atual != null) {
            soma += (int) atual.getValor().getValor(); // soma o valor do filho
            soma += somarFilhos(atual.getValor()); // chama recursivamente para somar os filhos
            atual = atual.getProximo(); // move para o próximo nó
        }

        return soma; // retorna a soma total
    }

    public NoEx02 getRaiz() {
        return raiz; // retorna a raiz da árvore
    }
}
