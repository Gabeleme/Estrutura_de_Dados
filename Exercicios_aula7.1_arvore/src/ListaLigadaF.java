public class ListaLigadaF {
    private NoListaLigada inicio; // referência para o início da lista

    public ListaLigadaF() {
        this.inicio = null; // inicializa como nula
    }

    // Método para adicionar um nó na lista
    public void adicionar(NoEx02 valor) {
        NoListaLigada novoNo = new NoListaLigada(valor);
        if (inicio == null) {
            inicio = novoNo; // se a lista estiver vazia, adiciona o novo nó
        } else {
            NoListaLigada atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo(); // vai até o último nó
            }
            atual.setProximo(novoNo); // adiciona o novo nó ao final
        }
    }

    // Método para obter o início da lista
    public NoListaLigada getInicio() {
        return inicio; // retorna o início da lista
    }

    // Método para verificar se a lista está vazia
    public boolean isEmpty() {
        return inicio == null;
    }

    // Método para imprimir a lista (opcional, útil para depuração)
    public void imprimir() {
        NoListaLigada atual = inicio;
        while (atual != null) {
            System.out.print(atual.getValor().getValor() + " -> "); // imprime o valor do nó
            atual = atual.getProximo(); // avança para o próximo nó
        }
        System.out.println("null"); // finaliza a impressão da lista
    }
}
