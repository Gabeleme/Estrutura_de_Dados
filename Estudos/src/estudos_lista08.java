import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class estudos_lista08 {
   
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40)); // criação da lista de inteiros

        acharMaior(numeros); // chama o método
    }

    // metodo para achar o maior valor da lista
    public static void acharMaior(List<Integer> numeros){
        int maiorNumero = numeros.get(0); // Inicializa a variável maiorNumero com o primeiro elemento da lista

        for(int i = 0; i < numeros.size(); i++){ // itera sobre cada elemento da lista
            // Se o elemento atual é maior que maiorNumero, atualiza maiorNumero
            if (numeros.get(i) > maiorNumero) {
                maiorNumero = numeros.get(i); 
            }
        }
        System.out.println("\nO maior número na lista é: " + maiorNumero); // imprime o resultado
    }
}
