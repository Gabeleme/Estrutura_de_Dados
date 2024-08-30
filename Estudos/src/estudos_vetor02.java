import java.util.Scanner;

public class estudos_vetor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas[] = new double[4];

        System.out.println("Informe as notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a " + (i + 1) + "nota: ");
            notas[i] = sc.nextDouble();
        }

        System.out.println("As notas Digitas foram: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        System.out.println("A soma das notas é de: " + soma);

        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = soma / 4;
        }
        System.out.println("A media dos valores foi de: " + media);
        sc.close();
    }
}
