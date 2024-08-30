public class atividade5 {
    public static Object[] intercalarVetores(Object[] vetor1, Object[] vetor2) {
        Object[] V = new Object[10]; // cria o vetor 
        for (int i = 0; i < 5; i++) {
            V[2 * i] = vetor1[i];  //posiciona cada elemento do vetor 
            V[2 * i + 1] = vetor2[i]; //posiciona cada elemento do vetor 
        }

        return V;
    }
    
    public static void main(String[] args) {
        String[] vetor1 = {"A", "B", "C", "D", "E"}; //passa os valores
        Integer[] vetor2 = {1, 2, 3, 4, 5}; // passa os valores 

        Object[] resultado = intercalarVetores(vetor1, vetor2); //chama o metodo

        System.out.println("Vetor intercalado:"); //printa na tela
        for (Object elem : resultado) { // imprime casa elemento do vetor
            System.out.print(elem + " "); // printa na tela
        }
        System.out.println();
    }
}
