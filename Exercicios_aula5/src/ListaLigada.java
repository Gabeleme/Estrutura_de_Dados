public class ListaLigada {
    private No inicio;
    private No fim;
    private int tamanho;

    // criando um cosntrutor para permitir instanciar uma lista ligada vazia
    public ListaLigada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void adicionar(Object info) {
        // adiciona um novo nó na ultima posição da lista ligada

        No novoNo; // declara a variavel

        if (tamanho == 0) { // verifica se esta vazia
            // criando o primeiro nó que aponta para nulo
            novoNo = new No(info, null);
            inicio = fim = novoNo; // atribui o ponteiro inicio e fim para o primeiro nó
            tamanho++; // incrementa o tamanho
        } else { //adiciona na ultima posição da lista
            novoNo = new No(info, null);
            // atribui o ponteiro do ultimo Nó para o novo Nó
            // fim é somente um ponteiro...
            fim.setProximoNo(novoNo);
            // atribui o ponteiro fim para o novoNo
            fim = novoNo;
            tamanho++; // incrementa o tamanho

        }

    }

    // adiciona na posição definida pelo indice 
    public void adicionar(Object info, int indice){
        No aux; // Variáveis auxiliares
        No novoNo; // declara um novo no
        //Atividade: Altere a método Adicionar da Lista Ligada para permitir adicionar na posição do índice 0;

        if(indice == 0){ // Verifica se o índice é 0, para adicionar no início da lista
            novoNo = new No(info, inicio); 
            inicio =  novoNo; 
            tamanho++;
        }
        else if(indice < tamanho){
            // adiciona nas demais posições 
            //aux aponta para o No que está na posição anterior a posição que será adicionada
            aux = percorreLista(indice - 1); 
            novoNo = new No (info, aux.getProximoNo());
            aux.setProximoNo(novoNo);
            tamanho++;
        }
        else if(indice == tamanho){
            //adiciona na ultima posição
            adicionar(info);
            
        }
    }

    // retornará info do nó apontado pelo indice
    public Object getLista(int indice) {
        return percorreLista(indice).getInfo();
    }

    // percorre a lista ligada e retorna o No referente ao indice
    public No percorreLista(int indice) {
        No aux = inicio; // atribui o primeiro nó a aux
        if (indice <= tamanho) { // verifica se o indice é valido
            for (int i = 0; i < indice; i++) {
                // percorre a lista até a posição indicada pelo indice
                aux = aux.getProximoNo();
            }
            return aux;
        } else {
            return null;
        }
    }

    public int getTamanho(){
        // retorna o tamanho da lista
        return tamanho;
    }
    
    //Atividade: Implemente o método void remover(int posição);  
    //Que removerá o nó definido pelo índice

    // remove o no apontado pelo indice 
    public void remover(int indice){
        if(indice == 0){ // se o indice for 0 vai remover do primeiro no
            inicio = inicio.getProximoNo(); //atualiza o inicio da lista
            tamanho--;
        }else if(indice < tamanho -1){ // veridica se esta no limite da lista
            No anterior = percorreLista(indice - 1); // Pega o nó anterior ao que será removido
            anterior.setProximoNo(anterior.getProximoNo().getProximoNo()); // Faz o nó anterior apontar para o próximo do que será removido
            tamanho--;  // decrementa o tamanho da lista
        }
        else if(indice == tamanho -1){
            No aux = percorreLista(indice - 1);
            aux.setProximoNo(null);
            fim = aux;
            tamanho--; 
        }
    }




}