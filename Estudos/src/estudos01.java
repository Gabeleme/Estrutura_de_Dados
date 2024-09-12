public class estudos01 {
    
    public static void main(String[] args) {
        // Inicializa um array de notas com valores pré-definidos
        double notas[] = {7.5, 8.0, 6.5, 9.0, 7.0, 6.0, 8.5, 7.8, 9.5, 8.2}; 
        // Chama o método calcularMedia para calcular a média das notas
        double mediaGeral = calcularMedia(notas); 
        System.out.println("Média Geral: " + mediaGeral);  // Exibe a média geral no console
    }

    // Método que calcula a média dos valores em um array de notas
    public static double calcularMedia(double[] notas){
        double soma = 0;  // Inicializa a variável soma para acumular o total das notas
        // Loop para iterar sobre cada elemento do array de notas
        for(int i = 0; i < notas.length; i++){ // Itera sobre cada índice do array
            soma += notas[i]; // Adiciona o valor da nota atual à soma total
        }
        return soma / notas.length; // Retorna a média das notas
    }

}
