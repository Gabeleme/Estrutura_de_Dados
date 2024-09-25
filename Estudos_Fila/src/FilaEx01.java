import java.util.LinkedList;
import java.util.Queue;

public class FilaEx01 {
    /*
     * Imprima os números de 1 a N em ordem utilizando uma fila.
     */

    public static void imprimirNumeros(int n) {
        /*
         * Queue é uma interface que define uma estrutura de dados do tipo fila 
         * (FIFO -First In First Out)
         * Uma fila é usada para processar elementos na ordem em que eles foram
         * adicionados, ou seja, o primeiro a entrar é o primeiro a sair (FIFO).
         * LinkedList é uma classe que implementa a interface Queue
         * Ela é uma lista encadeada onde cada elemento (nó) aponta para o próximo
         * É eficiente para adicionar e remover elementos nas extremidades (início e fim).
         */

        Queue<Integer> fila = new LinkedList<>(); // Criando uma fila

        //Adicionando números a fila
        for(int i = 0; i <= n; i++){
            fila.add(i);
        }

        // Enquanto a fila não estiver vazia, remover e imprimir os elementos
        // O método poll() remove o primeiro elemento da fila e retorna o valor dele.
        while (!fila.isEmpty()) { // Verifica se a fila ainda tem elementos.
            System.out.print(fila.poll() + " "); // Imprime e remove o primeiro número da fila.
        }
    }

    public static void main(String[] args) {
        int n = 10; // define o valor de n
        imprimirNumeros(n); // chama o método 
    }
}
