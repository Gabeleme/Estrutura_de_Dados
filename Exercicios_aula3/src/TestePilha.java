public class TestePilha {
    public static void main(String[] args) {
        // ---------------Pilha com vetor------------------------ 
        PilhaVetor minhaPilha = new PilhaVetor(10); // instancia Pilhavetor e passa a capacidade de elementos 

        System.out.println();
        System.out.println("-".repeat(40)); //linha de separação

        System.out.println("\nPilha com Vetor:");
        System.out.println("Pilha está vazia?: " + minhaPilha.pilhaVazia()); // Verifica se a pilha está vazia e imprime o resultado
        System.out.println("Pilha está cheia?: " + minhaPilha.pilhaCheia());  // Verifica se a pilha está cheia e imprime o resultado

        // ------ empilhar ----------
        System.out.print("Empilhando: ");
        for (int i = 0; i < 10; i++) { // empilha os números de 0 a 9 na pilha
            minhaPilha.empilhar(i); 
        }

        System.out.println();
        System.out.println("-".repeat(40)); // linha de separação

        // ------------- desempilhar ---------
        System.out.println("Desempilhando:");
        for (int i = 0; i < 10; i++) { //desempilha os elementos
            System.out.println(minhaPilha.desempilha()); // imprime os elementos desempilhados 
        }

        System.out.println();
        System.out.println("-".repeat(40)); // linha de separação 

        // ---------------Pilha com lista------------------------ 
        Pilha minhaPilha2 = new Pilha(); // inmstancia a Pilha com Lista

        System.out.println("\nPilha com Lista:");

        System.out.println("Pilha está vazia?: " + minhaPilha2.pilhaVazia()); // Verifica se a pilha está vazia e imprime o resultado


        // ------ empilhar ----------
        System.out.print("\nEmpilhando: ");
        for (int i = 0; i < 10; i++) { // empilha de 0 a 9 na pilha
            minhaPilha2.empilhar(i); // empilha
            System.out.println(i); // imprime
        }

        System.out.println();
        System.out.println("-".repeat(40)); // linha de separação

        // ------------- desempilhar ---------
        System.out.println("Desempilhando:");
        for (int i = 0; i < 10; i++) { // desempilha
            System.out.println(minhaPilha2.desempilhar()); //imprime
        }

        System.out.println();
        System.out.println("-".repeat(40)); // linha de separação

        // ----------- Palindromo --------------
        Palindromo p = new Palindromo(); // instancia Palindromo

        //palavras para verificar
        char[] palavra1 = {'a', 'n', 'a'}; 
        char[] palavra2 = {'m', 'a', 'r', 'i', 'a'}; 

        System.out.println("Verificando Palíndromos:");
        // verifica se as palavras são palindromos
        System.out.println("A palavra 'ana' é palíndromo? " + p.palindromo(palavra1));
        System.out.println("A palavra 'maria' é palíndromo? " + p.palindromo(palavra2));
        
        System.out.println("-".repeat(40)); //linha de separação 


    }
}
