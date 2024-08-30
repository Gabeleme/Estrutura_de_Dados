public class atividade4 {
    public static void main(String[] args) {
        int numdecimal = 10; 
        int[] vetorbi = decimaltobinario(numdecimal); 
        
       
        System.out.println("Numero binario: ");
        for (int i = 0; i < vetorbi.length; i++) {
            System.out.print(vetorbi[i]);
            ; 
        }
    }
    
    public static int[] decimaltobinario(int decimal) {
        int[] binario = new int[8]; 
        
        for (int i = binario.length - 1; i >= 0; i--) {
            binario[i] = decimal % 2; 
            decimal = decimal / 2; 
        }
        
        return binario; 
    }
}
