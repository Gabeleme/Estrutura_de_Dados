public class Tarefa {
    private String titulo; //Armazena o titulo da tarefa
    private String descricao; //Armazena a descrição da tareda
    private int prioridade; //Armazena o grau de prioridade (quanto menor o número, mais importante)
    

    //Construtor 
    public Tarefa(String titulo, String descricao, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }
    
    // Métodos getters e setters

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public int getPrioridade() {
        return prioridade;
    }


    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    // Sobrescreve o método toString para exibir as informações da tarefa de forma legível
    @Override
    public String toString(){
        return "Tarefa [Título=" + titulo + ", Descrição=" + descricao + ", Prioridade=" + prioridade + "]";
    }
  
    
}
