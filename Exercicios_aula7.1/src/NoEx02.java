public class NoEx02 {
    private Object valor; // valor do nó
    private ListaLigadaF filhos; // lista ligada de nós filhos

    public NoEx02(Object valor) {
        this.valor = valor;
        this.filhos = new ListaLigadaF(); // inicializa a lista de filhos
    }

    public void adicionarFilho(NoEx02 filho) {
        filhos.adicionar(filho); // adiciona o filho à lista ligada
    }

    public Object getValor() {
        return valor; // retorna o valor do nó
    }

    public ListaLigadaF getFilhos() {
        return filhos; // retorna a lista de filhos
    }

}
