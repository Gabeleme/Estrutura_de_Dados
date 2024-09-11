public class estudos_vetor05 {
    public static void main(String[] args) {
        int numeros[] = { 10, 10, 10 };
        somaInteiros(numeros);
    }

    public static void somaInteiros(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("O resultado da soma é: " + soma);
    }
}
