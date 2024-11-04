import java.util.Stack;

public class ValidaBalanceamento {
    // metodo que valida os caracteres
    public static boolean validaBalanceamento(String carateres) {
        Stack<Character> pilha = new Stack<>(); // cria a pilha

        // percorre cada um dos caracteres da String
        for (int i = 0; i < carateres.length(); i++) {
            char valor = carateres.charAt(i); // obtem o total de caractere

            // Se o caractere for um de abertura, empilha seu correspondente de fechamento
            if (valor == '{' || valor == '[' || valor == '(') {
                pilha.push(fechamento(valor));// Adiciona o fechamento correspondente na pilha
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

    // Método que retorna o caractere de fechamento correspondente ao caractere de abertura
    public static char fechamento(char abertura) {
        switch (abertura) {
            case '{':
                return '}'; // Retorna '}' se a abertura for '{'
            case '[':
                return ']'; // Retorna ']' se a abertura for '['
            case '(':
                return ')'; // Retorna ')' se a abertura for '('
            default:
                return '0'; // Retorna '0' se não for um caractere de abertura conhecido

        }
    }

    public static void main(String[] args) {
        // Exemplo de strings para verificar o balanceamento
        String[] exemplos = { "\n{[ () ( ) ] }", "{[ () ) ] }" };
        for (String exemplo : exemplos) {
            // Imprime o resultado da validação de balanceamento para cada exemplo
            System.out.println(exemplo + " -> " + validaBalanceamento(exemplo));
        }
    }
}
