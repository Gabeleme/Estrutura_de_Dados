public class atividade4 {
    public static void main(String[] args) {
        // Define o número decimal a ser convertido para binário
        int numdecimal = 10; 

        // Chama o método que converte o número decimal em binário e armazena no vetor
        int[] vetorbi = decimaltobinario(numdecimal); 
        
       
        System.out.println("Numero binario: "); // Imprime o número binário gerado
        for (int i = 0; i < vetorbi.length; i++) {
            System.out.print(vetorbi[i]); // Imprime cada bit do vetor binário
            ; 
        }
    }
    
    public static int[] decimaltobinario(int decimal) {
        // Cria um vetor de tamanho 8 para armazenar o número binário
        int[] binario = new int[8]; 
        
         // Converte o número decimal para binário
        for (int i = binario.length - 1; i >= 0; i--) {
            binario[i] = decimal % 2; // Armazena o resto da divisão por 2 (0 ou 1) no vetor
            decimal = decimal / 2; // Atualiza o valor decimal dividindo-o por 2
        }
        
        return binario; // Retorna o vetor contendo o número binário
    }
}
