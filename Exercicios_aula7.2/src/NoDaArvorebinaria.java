public class NoDaArvorebinaria {
    int valor; // Valor armazenado no nó
    NoDaArvorebinaria esquerda;//Ponteiro para o filho à esquerda
    NoDaArvorebinaria direita;// Ponteiro para o filho à direita

    // Construtor para inicializar um nó com um valor
    NoDaArvorebinaria(int valor){
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}
