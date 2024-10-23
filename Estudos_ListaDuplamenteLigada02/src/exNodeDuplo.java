public class exNodeDuplo {
    private Object info;
    private exNodeDuplo proximo, anterior;

    public exNodeDuplo(Object info, exNodeDuplo proximo, exNodeDuplo anterior) {
        this.info = info;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public exNodeDuplo getProximo() {
        return proximo;
    }

    public void setProximo(exNodeDuplo proximo) {
        this.proximo = proximo;
    }

    public exNodeDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(exNodeDuplo anterior) {
        this.anterior = anterior;
    }

}
