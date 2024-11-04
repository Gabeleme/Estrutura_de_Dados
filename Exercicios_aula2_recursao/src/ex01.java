public class ex01 {
    public static void main(String[] args) {
        System.out.println("Valor: ");
        decimaltobinario(10); // Chama o método que converte o número decimal para binário
        System.out.println(""); // Pula uma linha após a conversão
    }

    // Método recursivo para converter um número decimal em binário
    public static void decimaltobinario(int n) {
        // Caso base: se o número for menor ou igual a 2
        if (n <= 2) {
            System.out.print(n / 2); // Imprime o quociente da divisão por 2 (parte inteira)
            System.out.print(n % 2); // Imprime o resto da divisão por 2
        } else {
            decimaltobinario(n / 2); // Chamada recursiva, dividindo o número por 2
            System.out.print(n % 2);  // Imprime o resto da divisão por 2 (parte binária)
        }
    }
}
