import java.util.Stack;

public class ValidaBalanceamento {

    public static boolean ValidaBalanceamento (String expressao) {

        Stack<Character> pilha = new Stack<>(); // cria a pilha

        // percorre cada um dos caracteres da String
        for (int i = 0; i < expressao.length(); i++) {
            char valor = expressao.charAt(i); // obtem o total de caractere

            // Se o caractere for um de abertura, empilha o que completa para fechar ele
            if (valor == '{' || valor == '[' || valor == '(') {
                pilha.push(fechamento(valor)); // Adiciona o fechamento correspondente na pilha
                // Se o caractere for um de fechamento
            } else if (valor == '}' || valor == ']' || valor == ')') {
                // Verifica se a pilha está vazia ou se o topo da pilha não corresponde ao fechamento
                if (pilha.isEmpty() || pilha.pop() != valor) {
                    return false; // Retorna false se houver um erro de balanceamento
                }
            }
        }
         // Retorna true se a pilha estiver vazia, indicando que todos os caracteres estão balanceados
        return pilha.isEmpty();
    }

    // Método que retorna o caractere de fechamento 
    public static char fechamento(char abertura) {
        if (abertura == '{') {
            return '}'; // Retorna '}' se a abertura for '{'
        } else if (abertura == '[') {
            return ']'; // Retorna ']' se a abertura for '['
        } else if (abertura == '(') {
            return ')'; // Retorna ')' se a abertura for '('
        } else {
            return '0'; // Retorna '0' se não for um caractere de abertura conhecido
        }
    }
    

}
