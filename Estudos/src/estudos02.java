public class estudos02 {
    public static void main(String[] args) {
         int[] num = {10, 20, 1, 3}; 
         parImpar(num); 
         
    }
    public static void parImpar(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                System.err.println(vetor[i] + " é par");
            }else{
                System.out.println(vetor[i] + " é ímpar");
            }
        }
    }
}
