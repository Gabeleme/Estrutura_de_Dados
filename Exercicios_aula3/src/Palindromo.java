public class Palindromo {
    // Recebe um vetor de char e retorna verdadeiro se for palindromo

    public boolean palindromo(char[] palavra) {

        Pilha pilhaAux = new Pilha();
        char[] palavraInvertida = new char[palavra.length];

        // le a palavra auxiliar em pilhaauxiliar
        for (int i = 0; i < palavra.length; i++) {
            pilhaAux.empilhar(palavra[i]);
        }

        // desempilha pilhaauxiliar e preenche o vetor palavraInvertida
        for (int i = 0; i < palavra.length; i++) {
            palavraInvertida[i] = (char) pilhaAux.desempilhar();
        }

        // compara palavras [] com palavra invertida
        for (int j = 0; j < palavra.length; j++) {
            if (palavra[j] != palavraInvertida[j]) {
                return false;
            }
        }
        return true;
        // se todas as posições forem iguais é palindromo

    }
}
