/**
 * estudos_recursao
 */
public class estudos_recursao {

    public static void main(String[] args) {
        int resultado = somaNumeros(5); // chamada do método recursivo e passa seu valor
        System.out.println(resultado); // imprime o resultado do metodo
    }

    // // Método recursivo que calcula a soma dos números de 1 até n
    public static int somaNumeros(int n){
        // Caso base: quando n é igual a 1, retorna 1
        if(n == 1){ 
            return 1; // Retorna 1 porque é o menor valor da soma
        }else{
             // Caso recursivo: soma n ao resultado da chamada recursiva com n - 1
            return n + somaNumeros(n -1); // Adiciona n à soma dos números menores que n
        }
    }
}