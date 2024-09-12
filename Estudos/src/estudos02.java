public class estudos02 {
    public static void main(String[] args) {
        // Inicializa um array de inteiros com valores pré-definidos
         int[] num = {10, 20, 1, 3}; 
         parImpar(num); // Chama o método parImpar para verificar e exibir se cada número é par ou ímpar
         
    }

    // Método que verifica se os números em um array são pares ou ímpares e exibe o resultado
    public static void parImpar(int[] vetor){
        // Loop para iterar sobre cada elemento do array
        for(int i = 0; i < vetor.length; i++){ // Itera sobre cada índice do array
            // Verifica se o número é par (resto da divisão por 2 é 0)
            if(vetor[i] % 2 == 0){
                System.out.println(vetor[i] + " é par"); // Imprime no console que o número é par
            }else{
                System.out.println(vetor[i] + " é ímpar"); // Imprime no console que o número é impar
            }
        }
    }
}
