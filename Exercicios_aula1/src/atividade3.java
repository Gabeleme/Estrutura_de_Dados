public class atividade3 {
    // Crie um método que receba como parâmetro um número binário na forma de um vetor com 8 posições e retorne esse número convertido para decimal.
    public static void main(String[] args) {
        // Define um vetor que representa um número binário
        int vetorbi[] = {0, 0, 0, 0, 1, 0, 1, 0};  // Esse binário corresponde a 10 em decimal

        // Converte o número binário para decimal e armazena o resultado
        int resultado = binarioToDecimal(vetorbi); 
         // Imprime o resultado da conversão
        System.out.println("Resposta: " + resultado);
    }
    public static int binarioToDecimal (int[] binario){
        int decimal = 0;  // Variável para armazenar o valor decimal resultante
        int base = 1; // Base começa em 1 (2^0) e vai multiplicando por 2 a cada iteração
        
        // Loop para percorrer o vetor binário de trás para frente
        for (int i = binario.length - 1; i >= 0; i--) {
            // Adiciona o valor do bit atual multiplicado pela base correspondente
            decimal += binario[i] * base;
            base *= 2;  // Multiplica a base por 2 para a próxima posição
        }

        return decimal; // Retorna o valor decimal convertido
    }
}

