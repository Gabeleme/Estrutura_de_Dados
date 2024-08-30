public class atividade3 {
    public static void main(String[] args) {
        int vetorbi[] = {0, 0, 0, 0, 1, 0, 1, 0}; 

        int resultado = binarioToDecimal(vetorbi); 
        System.out.println("Resposta: " + resultado);
    }
    public static int binarioToDecimal (int[] binario){
        int decimal = 0; 
        int base = 1; 
        
        for (int i = binario.length - 1; i >= 0; i--) {
            decimal += binario[i] * base;
            base *= 2; 
        }

        return decimal;
    }
}

