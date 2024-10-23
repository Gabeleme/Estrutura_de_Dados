public class exListaDuplamenteLigada {
    exNodeDuplo inicio, fim; // ponteiro para o inicio e o fim da lista
    int tamanho; // armazena o tamanho

    public exListaDuplamenteLigada() {
        tamanho = 0; // inicia o tamanho com 0
        inicio = fim = null; // inicia o inicio e o fim valendo null
    }

    // metodo que adiciona na primeira e na ultima posição da lista
    public void adicionar(Object info) {
        // verificar se a lista esta vazia
        if (inicio == null) {
            // se a lista estiver vazia adiciona na primeira opção
            exNodeDuplo novoNoex = new exNodeDuplo(info, null, null); // cria um novo no
            inicio = fim = novoNoex; // define o inicio e o fim para o novo no
            tamanho++; // incrementa no tamanho da lista
        } else {
            // adiciona na ultima posição
            // cria um novo no com proximo apontando para null
            exNodeDuplo novoNoex = new exNodeDuplo(info, null, null); // cria um novo no
            fim.setProximo(novoNoex); // seta o ultimo no ao novo no
            novoNoex.setAnterior(fim); // seta o novo no ao antigo fim
            fim = novoNoex; // atualiza a referencia do no ao antigo fim
            tamanho++; // incrementa no tamanho da lista
        }
    }

    // metodo para adicionar nas demais posições expecificas
    public void adicionar(Object info, int indice) {
        exNodeDuplo novoNoex; // Criar uma nova referência para o novo nó que será adicionado

        // Se o índice for 0, chamar o método para adicionar no início da lista
        if (indice == 0) {
            // Chamar método já implementado para adicionar no início
            adicionar(info);
            return; // Retornar para não executar o restante do código
        }

        // Se o índice for igual ao tamanho da lista, chamar o método para adicionar no
        // final da lista
        if (indice == tamanho) {
            // Chamar método já implementado para adicionar no final
            adicionar(info);
            return; // Retornar para não executar o restante do código
        }

        // Criar um novo nó com a informação passada como argumento
        novoNoex = new exNodeDuplo(info, null, null); // Criar o novo nó

        // Percorrer a lista até o índice desejado
        exNodeDuplo atual = inicio; // Começar do início
        for (int i = 0; i < indice - 1; i++) { // Ir até o nó anterior à posição desejada
            atual = atual.getProximo(); // Avançar para o próximo nó
        }

        // Atualizar os ponteiros para inserir o novo nó na posição correta
        novoNoex.setProximo(atual.getProximo()); // Conectar o novo nó ao próximo nó
        novoNoex.setAnterior(atual); // Conectar o novo nó ao nó anterior

        if (atual.getProximo() != null) { // Se não for o último nó
            atual.getProximo().setAnterior(novoNoex); // Conectar o próximo nó ao novo nó
        }

        atual.setProximo(novoNoex); // Conectar o nó atual ao novo nó
        tamanho++; // Incrementar o tamanho da lista
    }

    // metodo de retornar a informação do no
    public Object getLista(int indice) {
        exNodeDuplo no = percorrerLista(indice); // Chama percorrerLista para obter o nó
        return no != null ? no.getInfo() : null; // Retorna a informação do nó ou null se não encontrado
    }

    // metodo de percorrer a lista
    private exNodeDuplo percorrerLista(int indice) {
        // percorre a lista e retorna o nó referente ao índice
        exNodeDuplo aux; // declara a variável auxiliar

        if (indice < tamanho / 2) { // Se o índice estiver na primeira metade
            aux = inicio; // começa no início da lista
            // percorre a lista do início para o fim
            for (int i = 0; i < indice; i++) {
                aux = aux.getProximo(); // Move para o próximo nó
            }
            return aux; // Retorna o nó encontrado
        } else { // Se o índice estiver na segunda metade
            aux = fim; // começa no fim da lista
            // percorre a lista do fim para o início
            for (int i = tamanho - 1; i > indice; i--) {
                aux = aux.getAnterior(); // Move para o nó anterior
            }
            return aux; // Retorna o nó encontrado
        }
    }

    // metodo de imprimir a lista
    public void imprimirLista() {
        exNodeDuplo aux = inicio; // inicializa o aux no inicio da lista
        while (aux != null) { // enquanto não chegar ao fim
            System.out.println(aux.getInfo() + " "); // imprime as informações do no
            aux = aux.getProximo(); // move para o proximo no
        }
        System.out.println();
    }

    // metodo de remover
    public void remover(Object info) {
        exNodeDuplo aux = inicio; // começa do inicio da lista
        while (aux != null) { // enqaunto não chegar ao fim
            if (aux.getInfo().equals(info)) { // verifica se am informação do no é igual a informação a ser removida
                if (aux.getAnterior() != null) { // se não for o primeiro no
                    aux.getAnterior().setProximo(aux.getProximo()); // conecta o anterior ao proximo
                } else {
                    inicio = aux.getProximo(); // Atualiza o inicio se for o primeiro no
                }
                if (aux.getProximo() != null) { // se nao for o ultimo no
                    aux.getProximo().setAnterior(aux.getAnterior());
                } else {
                    fim = aux.getAnterior(); // atualiza o fim se for o ultimo no
                }
                tamanho--; // decrementa o tamanho da lista
                return; // sai do metodo
            }
            aux = aux.getProximo(); // move para o proximo no
        }
    }

    // metodo de limpar a lista
    public void limpar() {
        inicio = null; // Define o início como nulo
        fim = null; // Define o fim como nulo
        tamanho = 0; // Zera o tamanho da lista
    }

    // metodo para contar o numero de nos na lista
    public int contarNo() {
        return tamanho; // retorna o tamanho da lista
    }

    // metodo para buscar um no na lista
    public boolean buscar(Object info) {
        exNodeDuplo aux = inicio; // começa no inicio da lista
        while (aux != null) { // enquanto nao chegar ao final da lista
            if (aux.getInfo().equals(info)) { // verifica se a informação do nó é igual à informação a ser buscada
                return true; // Retorna verdadeiro se o nó for encontrado
            }
            aux = aux.getProximo(); // move para o proximo no
        }
        return false; // retorna falso se o no não for encontrado
    }

    // metodo de inverter a lista
    public void inverter() {
        exNodeDuplo aux = inicio; // Começa no início da lista
        exNodeDuplo temp = null; // Declara um nó temporário para armazenar a referência anterior

        while (aux != null) {
            temp = aux.getAnterior(); // Armazena o nó anterior
            aux.setAnterior(aux.getProximo()); // Inverte o próximo
            aux.setProximo(temp); // Inverte o anterior
            aux = aux.getAnterior(); // Move para o próximo nó (que agora é o anterior)
        }

        // Atualiza o início e o fim da lista
        if (temp != null) {
            fim = inicio; // O fim agora é o antigo início
            inicio = temp; // O novo início é o antigo fim
        }
    }
}
