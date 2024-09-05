public class TestePilha {
    public static void main(String[] args) {
        // ---------------Pilha com vetor------------------------ 
        PilhaVetor minhaPilha = new PilhaVetor(10);

        System.out.println("Pilha está vazia?: " + minhaPilha.pilhaVazia());

        System.out.println("Pilha está cheia?: " + minhaPilha.pilhaCheia());

        for (int i = 0; i < 10; i++) {
            minhaPilha.empilhar(i);
            //System.out.println(i);
        }

        System.out.println("\n===================================");
        for (int i = 0; i < 10; i++) {
            System.out.println(minhaPilha.desempilha());
        }

        // ---------------Pilha com lista------------------------ 
        Pilha minhaPilha2 = new Pilha();

        System.out.println("Pilha está vazia?: " + minhaPilha2.pilhaVazia());


        // ------ empilhar ----------
        for (int i = 0; i < 10; i++) {
            minhaPilha.empilhar(i);
            System.out.println(i);
        }

        // ------------- desempilhar ---------
        System.out.println("\n===================================");
        for (int i = 0; i < 10; i++) {
            System.out.println(minhaPilha.desempilha());
        }


    }
}
