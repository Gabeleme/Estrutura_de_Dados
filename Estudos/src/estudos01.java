public class estudos01 {
    
    public static void main(String[] args) {
        double notas[] = {7.5, 8.0, 6.5, 9.0, 7.0, 6.0, 8.5, 7.8, 9.5, 8.2}; 
        double mediaGeral = calcularMedia(notas); 
        System.out.println("Média Geral: " + mediaGeral);
    }

    public static double calcularMedia(double[] notas){
        double soma = 0; 
        for(int i = 0; i < notas.length; i++){
            soma += notas[i]; 
        }
        return soma / notas.length; 
    }

}
