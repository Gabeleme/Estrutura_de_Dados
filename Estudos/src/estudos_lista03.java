import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class estudos_lista03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner
        List<Integer> numeros = new ArrayList<>(); // cria uma lista de inteiros

        int numeroAdicionado; // declara variavel
        int soma = 0; // declara variavel soma iniciando em 0

        for (int i = 0; i < 10; i++) { // loop para executar detrminada quantidade de vezes a pergunta
            System.out.print("\nInforme o valor que deseja adicionar: "); // pede ao usuario um valor
            numeroAdicionado = sc.nextInt(); // le o valor passado pelo usuario

            numeros.add(numeroAdicionado); // adicona o valor passado na lista
            soma += numeroAdicionado; // faz a soma do valor armazenado na soma mais o valor inserido
        }

        System.out.println("\n-------------------------------------");
        System.out.println("Quantidade de elementos na lista é de: " + numeros.size()); // imprime a quantidade de valores adicionados
        System.out.println("-------------------------------------");
        System.out.println("A soma dos elementos da: " + soma); // imprime o resultado da soma dos valores 
        System.out.println("-------------------------------------");

        sc.close();
    }
}
