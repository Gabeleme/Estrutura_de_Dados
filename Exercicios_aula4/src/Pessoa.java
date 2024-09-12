public class Pessoa {
    int idade;
    String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    // Setter para idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

}
