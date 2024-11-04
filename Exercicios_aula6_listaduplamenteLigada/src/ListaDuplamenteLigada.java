public class ListaDuplamenteLigada {
    NodeDuplo inicio, fim; // ponteiro para o inicio e o fim da lista
    int tamanho; // armazena o tamanho

    // construtor 
    public ListaDuplamenteLigada(){
        tamanho = 0; // inicia o tamanho da lista com 0
        inicio = fim = null; // inicia o inicio e fim como nulo
    }

    //metodo para adicionar na ultima posição da lista 
    public void adicionar(Object info){
        // se inicio e fim forem null a lista está vazia 
        if(inicio == null){
            // adiciona na primeira posição 
            NodeDuplo novoNo = new NodeDuplo(info, null, null); 
            inicio = fim = novoNo; // Define início e fim para o novo nó
            tamanho++; // Incrementa o tamanho da lista
        }else{
            //adiciona na ultima posição 
            // cria um novo no com proximo apontando para null
            NodeDuplo novoNo = new NodeDuplo(info, null, fim);
            //seta ProximoNo do ultimo no para novo no
            fim.setProximo(novoNo);
            //altera o ponteiro do ultimo no para novoNo
            fim = novoNo; // Atualiza o ponteiro fim para o novo nó
            tamanho++; // Incrementa o tamanho da lista

        }
    }

    // Método para adicionar um novo nó em uma posição específica
    public void adicionar(Object info, int indice){
        //adiciona em qualquer posição
        NodeDuplo novoNo;
        if(indice == 0){ // Verifica se o índice é 0 para adicionar no início
            novoNo = new NodeDuplo(info, inicio, null);
            // Atualiza o nó anterior do início para o novo nó
            inicio.setAnterior(novoNo);
            inicio = novoNo; // Atualiza o início para o novo nó
            tamanho++; // Incrementa o tamanho da lista
        }else if(indice == tamanho - 1){ // Se o índice for o último, chama o método adicionar
            adicionar(info);
        }else if(indice < tamanho - 1){ // Verifica se o índice está dentro do limite
            NodeDuplo aux = percorreLista(indice); // Obtém o nó na posição indicada
            novoNo = new NodeDuplo(info, aux, aux.getAnterior());
            aux.setAnterior(novoNo); // Atualiza o nó anterior para o novo nó
            novoNo.getAnterior().setProximo(novoNo); // Atualiza o próximo do nó anterior
        }
    }

    // Método para retornar a informação do nó
    public Object getLista(int indice){
        // retorna a informação do nó apontado pelo incide 
        return null;
    }

    private NodeDuplo percorreLista(int indice){
        //percorre a lista e retorna o nó referente ao indice
        NodeDuplo aux; // declara a variavel
        if(indice < tamanho / 2){ // Se o índice estiver na primeira metade
            // percorre a lista do inicio para o fim
            aux = inicio;
            for(int i = 0; i < indice; i++){
                aux = aux.getProximo(); // Move para o próximo nó
            }
            return aux; // Retorna o nó encontrado
        }else{ // Se o índice estiver na segunda metade
            //percorre a lista do fim para o inicio
            aux = fim; 
            for(int i = tamanho - 1; i > indice; i--){
                aux = aux.getAnterior(); // Move para o nó anterior
            }
            return aux; // Retorna o nó encontrado
        }

    }

    public void imprimirTodaLista(){
        //percorre a lista até proximo No igual a null
        NodeDuplo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo().toString()); // Imprime a informação do nó
            //percorre a lista
            aux = aux.getProximo(); // Move para o próximo nó
        }
    }
}
