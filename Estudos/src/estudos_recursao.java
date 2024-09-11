/**
 * estudos_recursao
 */
public class estudos_recursao {

    public static void main(String[] args) {
        int resultado = somaNumeros(5); 
        System.out.println(resultado);
    }

    public static int somaNumeros(int n){
        if(n == 1){
            return 1; 
        }else{
            return n + somaNumeros(n -1); 
        }
    }
}