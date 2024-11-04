public class NoListaLigada {
    private NoEx02 valor; 
    private NoListaLigada proximo;

    public NoListaLigada(NoEx02 valor) {
        this.valor = valor;
        this.proximo = null;
    }
    public NoEx02 getValor() {
        return valor;
    }
    public void setValor(NoEx02 valor) {
        this.valor = valor;
    }
    public NoListaLigada getProximo() {
        return proximo;
    }
    public void setProximo(NoListaLigada proximo) {
        this.proximo = proximo;
    } 

    
}
