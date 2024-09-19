public class estudos_matriz07 {
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { //percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // percorre as colunas
                System.out.print(matriz[i][j]); // imprime o valor atual

                // Adiciona o separador '|' após cada elemento, exceto o último da linha
                if (j < matriz[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println(); // pula linha
        }
    }

    // Função para modificar a matriz substituindo elementos negativos por 0
    public static void matrizModificada(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // percorre as colunas
                // Se o valor da célula é negativo, substitui por 0
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
            }
        }
    }

    // Função para calcular e imprimir a soma dos elementos de cada coluna
    public static void somaDaMatrizModificada(int[][] matriz) {
        System.out.println("Soma dos elementos de cada coluna da matriz modificada:");

        // Determina o número de colunas da matriz
        int numColunas = matriz[0].length;
        // Cria um array para armazenar a soma de cada coluna
        int[] somasColunas = new int[numColunas];

        // Calcula a soma das colunas
        for (int j = 0; j < numColunas; j++) { // percorre as colunas
            for (int i = 0; i < matriz.length; i++) { // percorre as linhas
                // Adiciona o valor da célula à soma da coluna correspondente
                somasColunas[j] += matriz[i][j];
            }
        }

        // Imprime a soma das colunas
        for (int i = 0; i < somasColunas.length; i++) {
            System.out.printf("Soma da coluna %d: %d%n", i + 1, somasColunas[i]);
        }
    }

    public static void main(String[] args) {
        // Define a matriz inicial com valores
        int[][] matriz = {
                { -1, 10, -2, 20, 3 },
                { -2, 40, -3, 50, 4 },
                { -3, 60, -4, 70, 5 }
        };
        
        System.out.println("\n----------------------------");
        System.out.println("Matriz Original: ");
        imprimirMatriz(matriz);
        matrizModificada(matriz);
        System.out.println("----------------------------");
        System.out.println("Matriz Modificada:");
        imprimirMatriz(matriz);
        System.out.println("----------------------------");
        // Calcular e imprimir a soma das colunas da matriz modificada
        somaDaMatrizModificada(matriz);
        System.out.println("----------------------------");
    }
}
