public class estudos_recursao1 {
    //Conte o número de dígitos em um número inteiro.
    public static void main(String[] args) {
        int n = 12345; // Inicializa a variável n com o valor 12345
        int quantidadeDigitos = contarDigitos(n); // Chama o método recursivo contarDigitos para calcular a quantidade de dígitos em n
        System.out.println(quantidadeDigitos); // Imprime o valor retornado
    }

    // Método recursivo que conta o número de dígitos em um número inteiro
    public static int contarDigitos(int n){
         // Caso base: quando o número é 0, retorna 0 porque não há dígitos para contar
        if( n == 0){
            return 0;
        }else{
            return 1 + contarDigitos( n / 10); // Adiciona 1 para o dígito atual e continua com o número restante
        }
    }
}
