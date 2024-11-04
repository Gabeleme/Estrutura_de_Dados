public class Grafo_Matriz_Incidencia {
    int[][] matrizAdjacencia;
    String[] vertices;
    int indiceVertices;

    public Grafo_Matriz_Incidencia(int qtdVertices) {
        // instancia a matriz conforme a quantidade dos vertices
        this.matrizAdjacencia = new int[qtdVertices][qtdVertices];
        this.vertices = new String[qtdVertices];
        indiceVertices = 0;
    }

    // metodo para criar um novo vertice
    public void addVertice(String nome) {
        if (indiceVertices < vertices.length) {
            vertices[indiceVertices] = nome;
            indiceVertices++;
        }
    }

    // remover o ultimo vertice
    public void removerVertice() {
        if (indiceVertices > 0) {
            vertices[indiceVertices - 1] = "";
            indiceVertices--;
        }
    }

    // metodo de adicionar a relações (bidimensionais) emtre os vertices do grafo
    public void addArestaBidireconais(int iVerticeA, int iVerticeB, int valor) {
        matrizAdjacencia[iVerticeA][iVerticeB] = valor;
        matrizAdjacencia[iVerticeB][iVerticeA] = valor;
    }

    //metodo para adicionar a relação entre o vertice A para o vertice B
    public void addArestasUnidirecionais(int iVerticeA, int iVerticeB, int valor) {
        matrizAdjacencia[iVerticeA][iVerticeB] = valor; 
    }

    //retorna as relações dos vertices indicado pelo indice iVertice
    public String relacoesDosVertices(int iVertice){
        String relacoes = "";
        for(int i = 0; i < vertices.length; i++){
            relacoes += "\n Vertice: " + i + "=>"; 
            for(int j = 0; j < vertices.length; j++){
                if(matrizAdjacencia[i][j]!=0){
                    relacoes = relacoes + "Vertice " + j + "(" + matrizAdjacencia[i][j] + ")"; 
                }
            }
        }
        return relacoes; 
    }

    // exemplo vertice inicial 0 => 2 => 3 => 1 FIM
    public String buscaProfundidade(int iVerticeInicial, int iVerticeFinal){
        return ""; 
    }

    public String buscaLargura(int iVerticeInicial, int iVerticeFinal){
        return ""; 
    }

    public String buscaGulosa(int iVerticeInicial, int iVerticeFinal){
        return ""; 
    }

    public static void main(String[] args) {
        Grafo_Matriz_Incidencia meuGrafo = new Grafo_Matriz_Incidencia(4); 
        meuGrafo.addArestaBidireconais(0, 2, 10);
        meuGrafo.addArestaBidireconais(0, 3, 5);
        meuGrafo.addArestaBidireconais(0, 1, 2);
        meuGrafo.addArestaBidireconais(2, 3, 8);
        meuGrafo.addArestaBidireconais(3, 1, 7);

        System.out.println(meuGrafo.relacoesDosVertices(0));
    }
}

//fazer um que troca por lista (exercicio 2)
//impelmentação pela parte de busca

/* Implementar o metodo buscaProfundidade(iVerticeInicial, iVerticeFinal) que ira buscar em profundidade até encontrar o vertice final retornando uma String com o caminho percorrido*/