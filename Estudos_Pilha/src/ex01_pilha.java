public class ex01_pilha {
    public static void main(String[] args) {

        // Cria uma instância da pilha com capacidade 5
        PilhaEx pilha = new PilhaEx(3);

        // Adiciona elementos à pilha
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("-----------------------------");
        // Exibe o elemento do topo
        System.out.println("Elemento no topo: " + pilha.peek());
        System.out.println("-----------------------------");
        // Remove o elemento do topo
        System.out.println("Removendo o topo: " + pilha.pop());
        System.out.println("-----------------------------");
        // Exibe o novo elemento do topo
        System.out.println("Novo elemento no topo: " + pilha.peek());
    }
}
