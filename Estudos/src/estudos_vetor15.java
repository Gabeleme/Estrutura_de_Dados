import java.util.Scanner;

public class estudos_vetor15 {

    public static void verificarVetor(int[] valores) {
        Scanner sc = new Scanner(System.in); // scanner
        System.out.println("Informe um número: "); // imprime a mensagem epdindo para o usuario passar um valor
        int valorInserido = sc.nextInt(); // Lê o número inserido pelo usuário
        int quantidade = 0; // Inicializa a variável para contar as ocorrências

        // Percorre todas as posições do vetor
        for (int i = 0; i < valores.length; i++) {
            // Se o valor inserido pelo usuário for igual ao valor no vetor na posição atual
            if (valorInserido == valores[i]) {
                quantidade++; // Incrementa a contagem de ocorrências
            }
        }
        // Se o número não estiver presente no vetor
        if (quantidade == 0) {
            System.out.println("O número " + valorInserido + " não está no vetor.");
        } else {
            // Se o número estiver presente, informa quantas vezes ele aparece
            System.out.println("O número " + valorInserido + " aparece " + quantidade + " vez(es) no vetor.");
        }

        sc.close(); // fecha o scanner
    }

    public static void imprimirVetor(int[] valores) {
        for (int i = 0; i < valores.length; i++) { // percorre o vetor
            System.out.print(valores[i] + " "); // imprime o vetor
        }
    }

    public static void main(String[] args) {
        int[] valores = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 1 }; // Inicializa o vetor com esses valores

        System.out.println("\n---------------------------");
        verificarVetor(valores); // chama o metodo que verifica o vetor
        System.out.println("\n---------------------------");
        System.out.println("Vetor: "); 
        imprimirVetor(valores); // chama o metodo que imprime o vetor
        System.out.println("\n---------------------------");

    }
}
