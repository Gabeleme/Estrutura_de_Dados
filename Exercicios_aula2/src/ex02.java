public class ex02 {
    public static void main(String[] args) {
        System.out.println(potencia(2, 2));
    }

    public static int potencia(int base, int pot) {
        if (pot == 0) {
            return 1;
        } else {
            return base * potencia(base, pot - 1);

        }
    }
}
