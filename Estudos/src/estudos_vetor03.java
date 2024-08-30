import java.util.Scanner;

public class estudos_vetor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valores[] = new double[10];

        System.out.println("Informe os valores: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe o " + (i + 1) + "Valor: ");
            valores[i] = sc.nextDouble();
        }

        double media = somaDaMedia(valores); 
        System.out.println("A média dos valores é de: " + media);

        sc.close();
    }

    public static double somaDaMedia(double[] valores) {
        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        double media = soma / valores.length;
        return media;

    }

}
