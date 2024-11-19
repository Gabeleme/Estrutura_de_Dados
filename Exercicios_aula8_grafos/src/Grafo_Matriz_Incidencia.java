import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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

    // metodo para adicionar a relação entre o vertice A para o vertice B
    public void addArestasUnidirecionais(int iVerticeA, int iVerticeB, int valor) {
        matrizAdjacencia[iVerticeA][iVerticeB] = valor;
    }

    // retorna as relações dos vertices indicado pelo indice iVertice
    public String relacoesDosVertices(int iVertice) {
        String relacoes = "";
        for (int i = 0; i < vertices.length; i++) {
            relacoes += "\n Vertice: " + i + "=>";
            for (int j = 0; j < vertices.length; j++) {
                if (matrizAdjacencia[i][j] != 0) {
                    relacoes = relacoes + "Vertice " + j + "(" + matrizAdjacencia[i][j] + ")";
                }
            }
        }
        return relacoes;
    }

    /*
     * Método que implementa a busca em profundidade entre dois vértices.
     * A busca em profundidade explora os vértices do grafo a partir de um vértice
     * inicial, indo o mais fundo possível antes de voltar e explorar outras opções.
     */
    public String buscaProfundidade(int iVerticeInicial, int iVerticeFinal) {
        Stack<Integer> pilha = new Stack<>(); // Pilha para empilhar e armazenar os valores
        Stack<Integer> pilhaAux = new Stack<>(); // pilha auxiliar
        List<Integer> valoresVisitados = new ArrayList<>(); // lista para armazenar os valores visitados

        pilha.push(iVerticeInicial); // começa pelo vertice inicial colocando ele na pilha

        while (!pilha.isEmpty()) { // enquanto a pilha não estiver vazia
            int atual = pilha.pop(); // desempilha o valor do topo da pilha, o ultimo adicionado

            /*
             * verifica se o valor atual ja foi visitado, se ele ja foi visitado nada
             * acontece, agora se ele ainda não foi visitado cai dentro do if e ele é
             * adicionado a lista de visitados
             */
            if (!valoresVisitados.contains(atual)) {
                valoresVisitados.add(atual); // adiciona ele como visitado

                /* Verifica se o valor final ja foi encontrado */
                if (atual == iVerticeFinal) {
                    return "Busca:" + valoresVisitados; // retorna os valores que ja foram visitados caso o valor que queremos ja foi encontrado
                }

                /*
                 * Percorre todos os vertices do grafo do valor atual
                 * verifica se existe alguma aresta se conectando
                 * verifica se o vertice i ainda não foi visitado
                 * se as condições forem verdadeiras o i é considerado um vizinho que ainda não
                 * foi visitado, então empilha
                 */
                for (int i = 0; i < vertices.length; i++) { // Loop para percorrer os vértices
                    if (matrizAdjacencia[atual][i] != 0 && !valoresVisitados.contains(i)) {
                        pilhaAux.push(i); // empilha o vertice na pilha
                    }
                }

                // transfere os vertices de pilhas
                while (!pilhaAux.isEmpty()) { // Enquanto a pilhaAux não estiver vazia
                    pilha.push(pilhaAux.pop()); // desempilha os vertices na mesma ordem
                }
            }
        }

        return "Caminho não Encontrado"; // retorna se não foi encontrado o caminho
    }

    /*
     * A busca em largura explora os vértices do grafo nível por nível, ou seja,
     * visitando todos os vértices de um nível antes de avançar para o próximo.
     */
    public String buscaLargura(int iVerticeInicial, int iVerticeFinal) {
        Queue<Integer> fila = new LinkedList<>(); // fila para armazenar os valores
        List<Integer> valoresVisitados = new ArrayList<>(); // lista para guardar os valores visitados

        fila.add(iVerticeInicial); // começa pelo vertice inicial

        while (!fila.isEmpty()) { // enquanto a fila não estiver vazia
            int atual = fila.poll(); // remove o primeiro valor da fila
            // variavel atual criada para armazenar o valor atual do vertice

            if (!valoresVisitados.contains(atual)) { // verifica se ja foi visitado
                valoresVisitados.add(atual); // caso ele ainda não tenha sido visitado adiciona ele como visitado

                if (atual == iVerticeFinal) { // verifica se o vertice que estamos procurando foi encontrado
                    return "Busca Largura: " + valoresVisitados; // se ele foi encontrado então retorna os valores visitados
                }

                for (int i = 0; i < vertices.length; i++) { // Loop para percorrer os vértices
                    if (matrizAdjacencia[atual][i] != 0 && !valoresVisitados.contains(i)) {
                        fila.add(i); // adiciona na fila
                    }
                }
            }
        }

        return "Caminho não Encontrado"; // retorna caso não encontre o caminho
    }

    /* Sempre escolhendo o que tem maior peso */
    public String buscaGulosa(int iVerticeInicial, int iVerticeFinal) {
        Stack<Integer> pilha = new Stack<>(); // pilha para armazenar os valores
        List<Integer> valoresVisitados = new ArrayList<>(); // lista para armazenar os valores visitados

        pilha.push(iVerticeInicial); // começa pelo vertice inicial

        while (!pilha.isEmpty()) { // enquanto pilha não estiver vazia
            int atual = pilha.pop(); // desempilha o valor do topo da pilha, o ultimo adicionado

            // contains verifica se o valor ja não esta presente na lista de visitados
            if (!valoresVisitados.contains(atual)) {
                valoresVisitados.add(atual); // adiciona ele como visitado

                if (atual == iVerticeFinal) { // verifica se o vertice atual é igual ao final, se for igual o valor que queremos foi encontrado e retornamos a resposta
                    return "Busca Gulosa: " + valoresVisitados; // retorna o caminho visitado
                }

                /*
                 * Estava pesquisando o que eu poderia usar para marcar que ainda não existia
                 * peso valido e encontrei que o -1 é utilizado para isso e por conta disso que
                 * iniciei as variaveis com peso -1, por que os valores ainda vão ser atribuidos
                 * e mudaram conforme o andamento do código
                 */

                int menorValor = -1; // variavel para armazenar o menor peso encontrado, iniciando ela com um valor negativo (valor indefinido)
                int proximo = -1; // variavel que vai armazenar o proximo vertice a ser visitado

                // percorre todos os vertices para encontrar seus vizinhos
                for (int i = 0; i < vertices.length; i++) {
                    // verifica se existe ligação entre os vertices e ve se o vertice ainda não foi
                    // visitado
                    if (matrizAdjacencia[atual][i] != 0 && !valoresVisitados.contains(i)) {
                        int valor = matrizAdjacencia[atual][i]; // pefa o peso entre o vertice atual e o vertice i

                        // verifica se o menor valor ainda esta com o peso invalido (não foi encontrado nenhum valor, essa aqui vai ser verdadeira na primeira iteração)
                        // verifica também se o peso atual é menor que o menorPeso encontrado
                        if (menorValor == -1 || valor < menorValor) {
                            menorValor = valor; // atualiza para o menor peso encontrado ate o momento
                            proximo = i; // armazena o vertice associado com menor peso
                        }
                    }
                }

                // verifica se o proximo vertice é valido para que possa continuar
                if (proximo != -1) {
                    pilha.push(proximo); // adiciona o vertice com o menor peso na pilha
                }
            }
        }
        return "Caminho não Encontrado"; // retorna caso não encontre o caminho
    }
}