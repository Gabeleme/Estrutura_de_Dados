import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class estudos_lista09 {
    // Crie um método que receba uma lista de inteiros e retorne a lista ordenada em ordem crescente
    // Crie um método que receba uma lista de inteiros e retorne a lista ordenada em ordem decrescente
    // Escreva um método que remova duplicatas de uma lista de inteiros.
    // Crie um método que receba uma lista de inteiros e retorne uma nova lista contendo apenas os números pares.

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(); // Cria uma lista para armazenar os valores
        Scanner sc = new Scanner(System.in); // scanner

        System.out.println("\nLista com 10 valores"); // imprime
        for (int i = 0; i < 10; i++) { // for pra exibir determinada qunatidade de vezes o codigo
            System.out.print("Informe os valores que vc quer adicionar a Lista: "); // pede os valores ao usuario
            int valoresAdicionados = sc.nextInt(); // Lê o valor inteiro fornecido pelo usuário
            lista.add(valoresAdicionados); // Adiciona o valor à lista
        }

        System.out.println("-----------------------");
        System.out.println("Lista com valores adicionados: ");
        System.out.println(lista); // exibe a lista com os valores inseridos pelo usuario
        System.out.println("-----------------------");
        listaOrdemCrescente(lista); // chama o metodo que ordena a lista em ordem Crescente e imprime
        System.out.println("-----------------------");
        listaOrdemDecrescente(lista); // chama o metodo que ordena a lista em ordem Decrescente e imprime
        System.out.println("-----------------------");

        // Remover duplicados e exibir o resultado
        Resultado resultado = removerDuplicados(lista);  // Remove duplicados e obtém o resultado
        System.out.println("Lista sem duplicados: " + resultado.listaSemDuplicados); // exibe a lista
        System.out.println("Valores duplicados: " + resultado.duplicados); // exibe a lista
        System.out.println("-----------------------");
        // Encontra e exibe os números pares
        List<Integer> listaPares = numerosPares(lista); // Obtém a lista de números pares
        System.out.println("Lista com números pares: " + listaPares); // Exibe a lista com números pares
        System.out.println("-----------------------");

        sc.close(); // fecha o scanner

    }

    // metodo para ordenar a lista em ordem crescente
    // para ordenar a lista de modo crescente usamos o método sort, implementando junto com ele um collections
    public static void listaOrdemCrescente(List<Integer> lista) {
        // Ordenar a lista em ordem crescente (ordem natural)
        Collections.sort(lista); // Ordena a lista em ordem crescente usando o método sort
        System.out.println("Lista em ordem crescente: " + lista); // Exibe a lista ordenada
    }

    // metodo para ordenar a lista em ordem descrescente
    public static void listaOrdemDecrescente(List<Integer> lista) {
        // Ordena a lista em ordem decrescente usando o método sort da classe Collections
        // O Comparator.reverseOrder() cria um comparador que define a ordem decrescente dos elementos
        Collections.sort(lista, Comparator.reverseOrder());// Ordena a lista em ordem decrescente usando Comparator.reverseOrder()
        System.out.println("Lista em ordem decrescente: " + lista); // Exibe a lista ordenada
    }

    // metodo para remover valores duplicados
    public static Resultado removerDuplicados(List<Integer> lista) {
        // A principal característica de um Set é que ele não permite a presença de
        // elementos duplicados; se você tentar adicionar um elemento que já está
        // presente no Set, a operação de adição será ignorada

        Set<Integer> valoresJaVistos = new HashSet<>(); // Para rastrear os valores já vistos
        Set<Integer> valoresDuplicados = new HashSet<>(); // Para rastrear os valores duplicados
        List<Integer> listaSemDuplicados = new ArrayList<>(); // Para armazenar a lista sem duplicados

        for (Integer item : lista) {
            if (!valoresJaVistos.add(item)) {
                // Se o valor já estava no set 'vistos', é um duplicado
                valoresDuplicados.add(item); // Adiciona o item duplicado ao set 'valoresDuplicados'
            } else {
                // Se não estava no set 'vistos', é um valor único
                listaSemDuplicados.add(item); // Adiciona o item duplicado ao set 'valoresDuplicados'
            }
        }
        // return new é usado para criar uma nova instancia da classe resultado, é necessario fazer isso por que o método
        return new Resultado(listaSemDuplicados, valoresDuplicados); // Retorna a lista sem duplicados e os duplicados encontrados removerDuplicados precisa retornar um objeto que contém a lista sem duplicados e os valores duplicados. ele inicializa também os atributos passados a ele
        // O new é necessário porque queremos retornar uma nova instância da classe Resultado com dados atualizados. Sem new, o código não teria uma maneira de criar um novo objeto para encapsular o resultado.
    }

    // Classe para armazenar o resultado com lista sem duplicados e duplicados encontrados
    // Usada para retornar múltiplos valores de forma estruturada a partir de um método
    // public static permite acesso sem instanciar a classe externa e agrupar dados relacionados
    public static class Resultado {
        List<Integer> listaSemDuplicados; // Lista sem valores duplicados
        Set<Integer> duplicados; // Set contendo os valores duplicados

        // Construtor para inicializar a classe Resultado
        // O construtor recebe uma lista sem duplicados e um set de duplicados
        Resultado(List<Integer> listaSemDuplicados, Set<Integer> duplicados) {
            this.listaSemDuplicados = listaSemDuplicados; // inicializa a lista sem duplicados
            this.duplicados = duplicados; //inicia o set de duplicados
        }
    }

    // metodo para encontrar os valores par
    public static List<Integer> numerosPares(List<Integer> lista) {
        List<Integer> listaPares = new ArrayList<>(); //lista para armazenar os valores par

        for (Integer numero : lista) {
            if (numero % 2 == 0) { // Verifica se o número é par
                listaPares.add(numero); // Verifica se o número é par
            }
        }
        return listaPares; // Retorna a lista contendo apenas números pares
    }
}
