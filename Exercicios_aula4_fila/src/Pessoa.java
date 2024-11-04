public class Pessoa {
    // Atributos da classe
    int idade; // Atributo para armazenar a idade da pessoa
    String nome; // Atributo para armazenar o nome da pessoa

    // Construtor para inicializar os atributos da pessoa
    public Pessoa(int idade, String nome) {
        this.idade = idade; // Inicializa a idade com o valor fornecido
        this.nome = nome; // Inicializa o nome com o valor fornecido
    }

    // Setter para idade
    public void setIdade(int idade) {
        this.idade = idade; // Atualiza a idade com o valor fornecido
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome; // Atualiza o nome com o valor fornecido
    }

    // Getter para o atributo idade
    public int getIdade() {
        return idade; // Retorna o valor atual da idade
    }

    // Getter para nome
    public String getNome() {
        return nome; // Retorna o valor atual do nome
    }

}
