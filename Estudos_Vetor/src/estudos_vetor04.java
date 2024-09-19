public class estudos_vetor04 {
    // Desenvolva um método que remova elementos duplicados de um vetor de inteiros, retornando um novo vetor sem duplicatas.

    public static void main(String[] args) {
        // Inicializa um array de inteiros com valores que contêm duplicados
        int valores[] = {10, 1, 4, 5, 7, 1, 7}; 
        // Chama o método encontrar_duplicados para identificar e imprimir valores duplicados
        encontrar_duplicados(valores); 
    }

    // Método que encontra e imprime os valores duplicados em um array de inteiros
    public static void encontrar_duplicados(int[] valores){
        // Loop para iterar sobre cada elemento do array
        for(int i = 0; i < valores.length; i++){ // Itera sobre cada índice do array
            boolean duplicado = false; // Flag para verificar se o valor atual é duplicado
            // Loop para verificar se o valor atual já apareceu antes no array
            for (int j = 0; j < i; j++) { // Itera sobre os índices anteriores ao atual
                if (valores[i] == valores[j]) { // Verifica se o valor atual é igual a algum valor anterior
                    duplicado = true; // Marca o valor como duplicado
                    break; // Interrompe o loop interno
                }
            }
            // Se o valor for duplicado, verifica se já foi impresso
            if (duplicado) {
                boolean jaImprimido = false; // Flag para verificar se o valor já foi impresso
                // Loop para verificar se o valor duplicado já foi impresso
                for (int k = 0; k < i; k++) { // Itera sobre os índices anteriores ao atual
                    if (valores[i] == valores[k]) { // Verifica se o valor atual já foi impresso
                        jaImprimido = true; // Marca o valor como já impresso
                        break; // Interrompe o loop interno
                    }
                }
                // Se o valor ainda não foi impresso, imprime o valor duplicado
                if (!jaImprimido) {
                    System.out.println(valores[i]); // Imprime o valor duplicado
                }
    
    
            }
        }
        
    }
}
