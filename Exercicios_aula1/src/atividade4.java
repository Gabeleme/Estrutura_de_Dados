public class atividade4 {
    public static void main(String[] args) {
        int numdecimal = 10; // Número decimal a ser convertido
        int[] vetorbi = decimaltobinario(numdecimal); 
        
       
        System.out.println("Numero binario: ");
        for (int bit : vetorbi) {
            System.out.print(bit);
            System.out.print(" "); 
        }
    }
    
    public static int[] decimaltobinario(int decimal) {
        int[] binario = new int[8]; // Vetor de 8 posições 
        
        for (int i = binario.length - 1; i >= 0; i--) {
            binario[i] = decimal % 2; // Armazena o resto da divisão por 2
            decimal = decimal / 2; // Atualiza o decimal para a próxima divisão
        }
        
        return binario; 
    }
}
