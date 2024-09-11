import java.util.ArrayList;
import java.util.Random;

public class estudos_lista01 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(50);
            numeros.add(numeroAleatorio);
        }

        System.out.println("Elementos da lista: " + numeros);

        double soma = 0;
        double media = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i); // acessando o elemento pelo indice
        }
        media = soma / numeros.size();

        System.out.println("Média dos valores: " + media);

        int maior_numero = numeros.get(0);
        int menor_numero = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++) {
            int numeroAtual = numeros.get(i);
            if (numeroAtual > maior_numero) {
                maior_numero = numeroAtual;
            }
            if (numeroAtual < menor_numero) {
                menor_numero = numeroAtual;
            }
        }

        System.out.println("O maior número é: " + maior_numero);
        System.out.println("O menor número é: " + menor_numero);

    }

}
