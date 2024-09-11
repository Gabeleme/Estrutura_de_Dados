public class estudos_vetor04 {
    // Desenvolva um método que remova elementos duplicados de um vetor de inteiros, retornando um novo vetor sem duplicatas.

    public static void main(String[] args) {
        int valores[] = {10, 1, 4, 5, 7, 1, 7}; 
        encontrar_duplicados(valores); 
    }

    public static void encontrar_duplicados(int[] valores){

        for(int i = 0; i < valores.length; i++){
            boolean duplicado = false;
            for (int j = 0; j < i; j++) {
                if (valores[i] == valores[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (duplicado) {
                boolean jaImprimido = false;
                for (int k = 0; k < i; k++) {
                    if (valores[i] == valores[k]) {
                        jaImprimido = true;
                        break;
                    }
                }
                if (!jaImprimido) {
                    System.out.println(valores[i]);
                }
    
    
            }
        }
        
    }
}
