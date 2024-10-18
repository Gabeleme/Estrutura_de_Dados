public class NoListaCircular {
    private Object valor;
    private NoListaCircular proximo; 

    public NoListaCircular(Object valor){
        this.valor = valor;
        this.proximo = null; 
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public NoListaCircular getProximo() {
        return proximo;
    }

    public void setProximo(NoListaCircular proximo) {
        this.proximo = proximo;
    }

    
}
