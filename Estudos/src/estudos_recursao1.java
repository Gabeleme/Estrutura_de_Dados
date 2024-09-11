public class estudos_recursao1 {
    //Conte o número de dígitos em um número inteiro.
    public static void main(String[] args) {
        int n = 12345; 
        int quantidadeDigitos = contarDigitos(n); 
        System.out.println(quantidadeDigitos);
    }
    public static int contarDigitos(int n){
        if( n == 0){
            return 0;
        }else{
            return 1 + contarDigitos( n / 10); 
        }
    }
}
