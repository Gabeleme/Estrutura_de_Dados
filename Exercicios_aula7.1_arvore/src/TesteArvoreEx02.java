public class TesteArvoreEx02 {
    public static void main(String[] args) {
        ArvoreEx02 arvore = new ArvoreEx02(10); // cria a árvore com raiz 10
        NoEx02 no1 = new NoEx02(5);
        NoEx02 no2 = new NoEx02(15);
        NoEx02 no3 = new NoEx02(20);
        
        // Adiciona filhos à raiz
        arvore.getRaiz().adicionarFilho(no1);
        arvore.getRaiz().adicionarFilho(no2);
        
        // Adiciona filhos ao nó no2
        no2.adicionarFilho(no3);

        // Soma os valores dos filhos da raiz
        int somaFilhos = arvore.somarFilhos(arvore.getRaiz());
        System.out.println("\nSoma dos filhos da raiz é igual a: " + somaFilhos);
    }
}
