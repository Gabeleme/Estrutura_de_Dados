import java.util.Scanner;

public class estudos_recursao3 {
    // método que inverte a string usando recursão
    public static String inverterString(String str) {
        // Caso base: se a string tem 1 ou 0 caracteres, retorna a própria string, pois
        // ai não vai ter o que inverter
        if (str.length() <= 1) { // aqui que colocamos a condição de parada
            return str;
        } else {
            // Chama recursivamente, invertendo a substring e adiciona o primeiro caractere no final
            return inverterString(str.substring(1)) + str.charAt(0);
            // aqui que acontece a parte da recursão pois o metodo chama ele mesmo
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // cria o scanner

        System.out.println("\nInforme a palavra que deseja: "); // pede ao usuario par ainformar a palavra
        String palavraRecebida = sc.nextLine(); // le a palavra

        String inverter = inverterString(palavraRecebida); // chama o metodo recursivo 

        System.out.println("A palavra invertida é:" + inverter); // imprime a string invertida
        sc.close(); // fecha o scanner
    }
}
