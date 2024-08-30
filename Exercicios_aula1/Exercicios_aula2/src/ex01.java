public class ex01 {
    public static void main(String[] args) {
        System.out.println("Valor: ");
        decimaltobinario(10);
        System.out.println("");
    }

    public static void decimaltobinario(int n) {
        if (n <= 2) {
            System.out.print(n / 2);
            System.out.print(n % 2);

        } else {
            decimaltobinario(n / 2);
            System.out.print(n % 2);
        }
    }
}
