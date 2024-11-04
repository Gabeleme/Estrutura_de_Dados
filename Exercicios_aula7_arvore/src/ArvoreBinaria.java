public class ArvoreBinaria {
    // O nó deverá possuir um campo info e dois ponteiros para nós

    private Object info;
    private ArvoreBinaria noEsquerda, noDireita;
    
    public ArvoreBinaria(Object info, ArvoreBinaria noEsquerda, ArvoreBinaria noDireita) {
        this.info = info;
        this.noEsquerda = noEsquerda;
        this.noDireita = noDireita;
    }
    
    public Object getInfo() {
        return info;
    }
    public void setInfo(Object info) {
        this.info = info;
    }
    public ArvoreBinaria getNoEsquerda() {
        return noEsquerda;
    }
    public void setNoEsquerda(ArvoreBinaria noEsquerda) {
        this.noEsquerda = noEsquerda;
    }
    public ArvoreBinaria getNoDireita() {
        return noDireita;
    }
    public void setNoDireita(ArvoreBinaria noDireita) {
        this.noDireita = noDireita;
    } 

    
}
