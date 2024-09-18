import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class estudos_lista07 {
     //Escreva um método que receba uma lista de strings e um novo elemento, adicionando-o à lista apenas se ele ainda não existir.

    public static void main(String[] args) {
       // Cria uma lista de palavras inicializada com alguns valores
       List<String> palavras = new ArrayList<>(Arrays.asList("Banana", "Ovo", "Bolo"));

       // Chama o método adicionarLista passando a lista de palavras
       adicionarLista(palavras);
   }

   // Método que adiciona uma palavra à lista se ela não estiver presente
   public static void adicionarLista(List<String> palavras) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Informe qual palavra deseja adicionar à lista: ");
       String palavraadd = sc.nextLine();

       // Verifica se a lista já contém a palavra
       if (palavras.contains(palavraadd)) {
           System.out.println("A palavra já existe na lista.");
       } else {
           // Adiciona a palavra à lista e exibe a lista atualizada
           palavras.add(palavraadd);
           System.out.println("Palavra adicionada com sucesso.");
       }

       // Exibe a lista após a adição ou tentativa de adição
       System.out.println("Lista atual: " + palavras);
       sc.close();
   }
}
