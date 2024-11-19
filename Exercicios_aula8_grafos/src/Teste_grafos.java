public class Teste_grafos {
    public static void main(String[] args) {
        Grafo_Matriz_Incidencia meuGrafo = new Grafo_Matriz_Incidencia(4);

        meuGrafo.addArestaBidireconais(0, 2, 10);
        meuGrafo.addArestaBidireconais(0, 3, 5);
        meuGrafo.addArestaBidireconais(0, 1, 2);
        meuGrafo.addArestaBidireconais(2, 3, 8);
        meuGrafo.addArestaBidireconais(3, 1, 7);

        System.out.println("\n================================");
        System.out.print("--- Relações dos vertices ---");
        System.out.println(meuGrafo.relacoesDosVertices(0));

        System.out.println("================================");
        System.out.println("--- Busca em profundidade ---");
        System.out.println("Entre 0 e 3: ");
        System.out.println(meuGrafo.buscaProfundidade(0, 3));
        System.out.println("Entre 0 e 2: ");
        System.out.println(meuGrafo.buscaProfundidade(0, 2));
        System.out.println("Entre 0 e 1: ");
        System.out.println(meuGrafo.buscaProfundidade(0, 1));

        System.out.println("================================");
        System.out.println("--- Busca em largura ---");
        // Chamando o método de busca em largura
        System.out.println("Entre 0 e 3: ");
        System.out.println(meuGrafo.buscaLargura(0, 3)); 
        System.out.println("Entre 0 e 2: ");
        System.out.println(meuGrafo.buscaLargura(0, 2)); 
        System.out.println("Entre 2 e 1: ");
        System.out.println(meuGrafo.buscaLargura(2, 1)); 

        System.out.println("======================");
        System.out.println("--- Busca em Gulosa ---");
        System.out.println("Entre 0 e 3: ");
        System.out.println(meuGrafo.buscaGulosa(0, 3)); 
        System.out.println("Entre 0 e 2: ");
        System.out.println(meuGrafo.buscaGulosa(0, 2)); 
        System.out.println("Entre 2 e 1: ");
        System.out.println(meuGrafo.buscaGulosa(2, 1)); 
        System.out.println("======================");
    }
}
