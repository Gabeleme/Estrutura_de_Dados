public class ListaDuplamenteLigada {
    NodeDuplo inicio, fim;
    int tamanho; 

    public ListaDuplamenteLigada(){
        tamanho = 0; 
        inicio = fim = null;
    }

    //metodo para adicionar na ultima posição da lista 
    public void adicionar(Object info){
        // se inicio e fim forem null a lista está vazia 
        if(inicio == null){
            // adiciona na primeira posição 
            NodeDuplo novoNo = new NodeDuplo(info, null, null); 
            inicio = fim = novoNo;
            tamanho++; 
        }else{
            //adiciona na ultima posição 
            // cria um novo no com proximo apontando para null
            NodeDuplo novoNo = new NodeDuplo(info, null, fim);
            //seta ProximoNo do ultimo no para novo no
            fim.setProximo(novoNo);
            //altera o ponteiro do ultimo no para novoNo
            fim = novoNo;
            tamanho++; 

        }
    }

    public void adicionar(Object info, int indice){
        //adiciona em qualquer posição
        NodeDuplo novoNo;
        if(indice == 0){
            novoNo = new NodeDuplo(info, inicio, null);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
            tamanho++;
        }else if(indice == tamanho - 1){
            adicionar(info);
        }else if(indice < tamanho - 1){
            NodeDuplo aux = percorreLista(indice);
            novoNo = new NodeDuplo(info, aux, aux.getAnterior());
            aux.setAnterior(novoNo);
            novoNo.getAnterior().setProximo(novoNo);
        }
    }

    public Object getLista(int indice){
        // retorna a informação do nó apontado pelo incide 
        return null;
    }

    private NodeDuplo percorreLista(int indice){
        //percorre a lista e retorna o nó referente ao indice
        NodeDuplo aux;
        if(indice < tamanho / 2){
            // percorre a lista do inicio para o fim
            aux = inicio;
            for(int i = 0; i < indice; i++){
                aux = aux.getProximo();
            }
            return aux;
        }else{
            //percorre a lista do fim para o inicio
            aux = fim; 
            for(int i = tamanho - 1; i > indice; i--){
                aux = aux.getAnterior();
            }
            return aux;
        }

    }

    public void imprimirTodaLista(){
        //percorre a lista até proximo No igual a null
        NodeDuplo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo().toString());
            //percorre a lista
            aux = aux.getProximo();
        }
    }
}
