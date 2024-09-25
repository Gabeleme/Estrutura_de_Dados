/* Sistema de estacionamento de carros, um carro entra na fila para poder entrar no estacionamnto e quando isso acontece ele precisa passar os dados dele, depiis ele procura vaga e se ele encontra ele estaciona e depois quando ele for sair do estacionamento ele é removido da fila, o sistema deve falar: - quem entrou na fila, - quem saiu da fila, - quem ainda está na fila, - quantidade de pessoas na fila, - quem é a primeira pessoa da fila.

- enqueue : Adiciona um elemento ao final da fila.
- dequeue: Remove e retorna o elemento do início da fila.
- peek (ou front): Retorna o elemento do início da fila sem removê-lo.
- isEmpty: Verifica se a fila está vazia.
- size: Retorna o número de elementos na fila. 
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Classe que representa um carro
class Carro {
    private String nomeMotorista; // Nome do motorista
    private String nomeCarro; // Nome do carro
    private String placa; // Placa do carro

    // Construtor da classe Carro
    public Carro(String nomeMotorista, String nomeCarro, String placa) {
        this.nomeMotorista = nomeMotorista; // Inicializa o nome do motorista
        this.nomeCarro = nomeCarro; // Inicializa o nome do carro
        this.placa = placa; // Inicializa a placa do carro
    }

    // Método para obter o nome do motorista
    public String getNomeMotorista() {
        return nomeMotorista;
    }

    // Método para obter o nome do carro
    public String getNomeCarro() {
        return nomeCarro;
    }

    // Método para obter a placa do carro
    public String getPlaca() {
        return placa;
    }

    // Método toString para representar o carro como string
    @Override
    public String toString() {
        return "Carro [Motorista: " + nomeMotorista + ", Modelo: " + nomeCarro + ", Placa: " + placa + "]";
    }
}

// Classe que representa o estacionamento
class Estacionamento {
    private Queue<Carro> fila; // Fila para armazenar os carros

    // Construtor da classe Estacionamento
    public Estacionamento() {
        fila = new LinkedList<>(); // Inicializa a fila como uma LinkedList
    }

    // Método para adicionar um carro à fila
    public void entrarNoEstacionamento(Carro carro) {
        fila.add(carro); // Adiciona o carro à fila
        System.out.println(carro.getNomeMotorista() + " entrou na fila."); // Informa que o carro entrou
    }

    // Método para remover um carro da fila (estacionamento)
    public void sairEstacionamento() {
        if (!fila.isEmpty()) { // Verifica se a fila não está vazia
            Carro carro = fila.poll(); // Remove o carro da frente da fila
            System.out.println(carro.getNomeMotorista() + " saiu do estacionamento."); // Informa que o carro saiu
        } else {
            System.out.println("Não há carros na fila."); // Informa que a fila está vazia
        }
    }

    // Método para mostrar todos os carros na fila
    public void mostrarFila() {
        System.out.println("Carros na fila:"); // Título da lista de carros
        for (Carro carro : fila) { // Percorre todos os carros na fila
            System.out.println(carro); // Imprime as informações do carro
        }
    }

    // Método para mostrar a quantidade de carros na fila
    public void quantidadePessoas() {
        System.out.println("Quantidade de carros na fila: " + fila.size()); // Mostra a quantidade de carros
    }

    // Método para mostrar o primeiro carro da fila
    public void primeiraPessoa() {
        if (!fila.isEmpty()) { // Verifica se a fila não está vazia
            System.out.println("A primeira pessoa na fila é: " + fila.peek()); // Mostra o primeiro carro
        } else {
            System.out.println("A fila está vazia."); // Informa que a fila está vazia
        }
    }
}

// Classe principal
public class FilaEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
        Estacionamento estacionamento = new Estacionamento(); // Cria um novo estacionamento

        // Laço principal para o menu do sistema
        while (true) {
            System.out.println("\n--- Sistema do Estacionamento ---"); 
            System.out.println("1. Entrar no estacionamento"); 
            System.out.println("2. Sair do estacionamento"); 
            System.out.println("3. Mostrar fila"); 
            System.out.println("4. Quantidade de carros na fila"); 
            System.out.println("5. Primeira pessoa na fila"); 
            System.out.println("6. Sair"); 
            System.out.print("Escolha uma opção: "); 

            int opcao = sc.nextInt(); // Lê a opção do usuário
            sc.nextLine(); // Limpa o buffer do scanner

            // Processa a opção escolhida pelo usuário
            if (opcao == 1) { // Se escolher entrar
                System.out.print("Nome do motorista: "); // Solicita o nome do motorista
                String nomeMotorista = sc.nextLine(); // Lê o nome do motorista
                System.out.print("Nome do carro: "); // Solicita o nome do carro
                String nomeCarro = sc.nextLine(); // Lê o nome do carro
                System.out.print("Placa do carro: "); // Solicita a placa do carro
                String placa = sc.nextLine(); // Lê a placa do carro

                Carro carro = new Carro(nomeMotorista, nomeCarro, placa); // Cria um novo carro
                estacionamento.entrarNoEstacionamento(carro); // Adiciona o carro ao estacionamento

            } else if (opcao == 2) { // Se escolher sair do estacionamento
                estacionamento.sairEstacionamento(); // Remove o carro da fila
            } else if (opcao == 3) { // Se escolher mostrar a fila
                estacionamento.mostrarFila(); // Mostra os carros na fila
            } else if (opcao == 4) { // Se escolher a quantidade de carros
                estacionamento.quantidadePessoas(); // Mostra a quantidade de carros na fila
            } else if (opcao == 5) { // Se escolher a primeira pessoa na fila
                estacionamento.primeiraPessoa(); // Mostra o primeiro carro na fila
            } else if (opcao == 6) { // Se escolher sair do sistema
                break; // Sai do laço e encerra o programa
            } else {
                System.out.println("Opção inválida. Tente novamente."); // Informa que a opção é inválida
            }
        }
        sc.close(); // Fecha o scanner
    }
}