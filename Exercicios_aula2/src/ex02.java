public class ex02 {
    public static void main(String[] args) {
        // Imprime o resultado da função de potência (2^2)
        System.out.println(potencia(2, 2));
    }

    // Método recursivo para calcular a potência
    // base^pot é calculado multiplicando a base por ela mesma pot vezes
    public static int potencia(int base, int pot) {
        // Caso base: qualquer número elevado a 0 é 1
        if (pot == 0) {
            return 1;
        } else {
            // Chama a função recursivamente, reduzindo o expoente em 1
            // Multiplica a base pelo resultado da próxima chamada
            return base * potencia(base, pot - 1);

        }
    }
}
