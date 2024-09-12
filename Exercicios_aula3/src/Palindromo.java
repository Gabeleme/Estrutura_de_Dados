public class Palindromo {
    // Recebe um vetor de char e retorna verdadeiro se for palindromo

    // Método que recebe um vetor de caracteres e retorna verdadeiro se for palíndromo
    public boolean palindromo(char[] palavra) {

        Pilha pilhaAux = new Pilha(); // Cria uma pilha auxiliar para armazenar os caracteres
        char[] palavraInvertida = new char[palavra.length]; // Vetor para armazenar a palavra invertida


        // le a palavra auxiliar em pilhaauxiliar
        for (int i = 0; i < palavra.length; i++) {
            pilhaAux.empilhar(palavra[i]); // Adiciona o caractere na pilha
        }

        // desempilha pilhaauxiliar e preenche o vetor palavraInvertida
        for (int i = 0; i < palavra.length; i++) {
            palavraInvertida[i] = (char) pilhaAux.desempilhar(); // Remove o caractere da pilha e armazena no vetor
        }

        // compara palavras original com palavra invertida
        for (int j = 0; j < palavra.length; j++) {
            // Se qualquer caractere não coincidir, não é um palíndromo
            if (palavra[j] != palavraInvertida[j]) {
                return false; // Retorna falso se as palavras não forem iguais
            }
        }
        return true;
        // se todas as posições forem iguais é palindromo

    }
}
