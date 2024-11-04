public class ListaCircular {
    private NoListaCircular inicio; // referencia para o primeiro no da lista
    private NoListaCircular ultimo; // referencia para o ultimo no da lista
    private int tamanho; // contador para armazenar o número de elementos na lista

    public ListaCircular() {
        this.inicio = null; // inicializa a lista como nula
        this.ultimo = null; // inicializa o ultimo no como null
        this.tamanho = 0; // inicializa o tamanho como 0
    }

    // Método pora adicionar um item na lista
    public void adicionar(Object item, int indice) {
        // Cria um novo nó com o valor passado
        NoListaCircular novoNoListaCircular = new NoListaCircular(item);

        // se a lista estiver vazia, adiciona o novo nó como o primeiro valor, aponta o
        // proxímo para ele mesmo (por que é uma lsita circular)
        if (tamanho == 0) {
            inicio = novoNoListaCircular; // o novo nó será o primeiro
            ultimo = novoNoListaCircular; // o novo nó também será o ultimo pois so existe um valor na lista
            novoNoListaCircular.setProximo(inicio); // aponta para ele mesmo
        } else if (indice == 0) { // adiciona no inicio da lista
            novoNoListaCircular.setProximo(inicio); // Faz o novo nó apontar para o antigo início
            ultimo.setProximo(novoNoListaCircular); // Último nó agora aponta para o novo início
            inicio = novoNoListaCircular; // O novo nó passa a ser o início
        } else if (indice >= tamanho) { // adiciona no final da lista
            ultimo.setProximo(novoNoListaCircular); // Faz o último nó apontar para o novo nó
            novoNoListaCircular.setProximo(inicio); // Faz o novo nó apontar para o início
            ultimo = novoNoListaCircular; // Atualiza o último nó para o novo nó
        } else { // Adiciona em qualquer outra posição
            NoListaCircular atual = inicio; // Começa a partir do início
            for (int i = 0; i < indice - 1; i++) {
                atual = atual.getProximo(); // Move para o próximo nó até chegar na posição anterior
            }
            novoNoListaCircular.setProximo(atual.getProximo()); // Faz o novo nó apontar para o próximo nó do anterior
            atual.setProximo(novoNoListaCircular); // Faz o nó anterior apontar para o novo nó
        }
        tamanho++;
    }

    // metodo para remover um nó
    public void remover(int indice) {
        if (tamanho == 0) { // se tamanho é igual a zero a lista esta vazia
            System.out.println("A lista está vazia");
        }
        if (indice < 0 || indice >= tamanho) { // se indice é menor que 0 ou maior que o tamanho da lsita o indice vai
                                               // ser invalido
            System.out.println("Indice invalido");
        }

        if (indice == 0) { // remove o primeiro nó
            if (tamanho == 1) { // Se houver apenas um nó
                inicio = null; // A lista ficara vazia
                ultimo = null; // O ultimo nó também sera null
            } else {
                inicio = inicio.getProximo(); // Atualiza o inicio para o prox nó
                ultimo.setProximo(inicio); // O ultimo nó agora aponta para o novo inicio
            }
        } else {
            NoListaCircular atual = inicio; // começa a partir do inicio
            for (int i = 0; i < indice - 1; i++) {
                atual = atual.getProximo(); // Move para o próximo nó até chegar na posição anterior
            }
            NoListaCircular aRemover = atual.getProximo(); // Nó a ser removido
            atual.setProximo(aRemover.getProximo()); // Bypass para remover o nó

            if (indice == tamanho - 1) { // Se o último nó for removido
                ultimo = atual; // Atualiza o último nó
            }
        }
        tamanho--; // Decrementa o tamanho
    }

    // metodo para imprimir a lista 
    public String imprimirLista() {
        if (inicio == null) return ""; // Se a lista estiver vazia

        StringBuilder resultado = new StringBuilder();
        NoListaCircular atual = inicio;

        do {
            resultado.append(atual.getValor()).append(" -> ");
            atual = atual.getProximo();
        } while (atual != inicio); // Para quando voltar ao início

        return resultado.substring(0, resultado.length() - 4); // Remove o último " -> "
    }


    public int getTamanho() {
        return tamanho; // Retorna o tamanho da lista
    }

}
