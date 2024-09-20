public class MediaMovelVetor {
    /*
     * Em estatística, a média móvel é um recurso utilizado para se
     * identificar a tendência de um conjunto de dados dispostos em uma série de
     * tempo.
     * A média móvel é calculada com base em uma janela de amostras que se desloca
     * ao longo do tempo.
     */
    int[] vetorAmostras;// Armazena todos os dados da amostra
    int[] mediaMovel; // Armazena os dados da janela móvel
    int janela;// Tamanho da janela móvel

    public MediaMovelVetor(int tamanhoAmostras, int janela) {
        this.janela = janela; // inicializa o tamanho da janela movel
        vetorAmostras = new int[tamanhoAmostras]; // cria um vetor para armazenar as amostras 
        mediaMovel = new int[tamanhoAmostras - janela]; // cria um vetor para media moveis
        preencherAmostras(); // preenche o vetor de amostra
    }

    public void calculaMediaMovel() {
        // Calcula a média das amostras considerando a janela estipulada
        int media; // variavel para a media

        System.out.println("Médias: ");
        // implemente o calculo da media movel aqui 
        for (int i = 0; i < vetorAmostras.length - janela; i++) {
            // desloca a janela ao longo do vetor de amostra
            int soma = 0; // inicializa a soma da janela
            for (int j = 0; j < janela; j++) {
                soma += vetorAmostras[i + j]; // soma os elementos da janela

            }
            media = soma / janela; // calcula a média
            mediaMovel[i] = media; // Armazena a média
        }

    }

    private void preencherAmostras() {
        // Preenche o vetor de amostras com valores aleatórios
        Double numeroRandomico; // variavel que armazena números aleatorios
        System.out.println("Amostras: ");
        for (int i = 0; i < vetorAmostras.length; i++) {
            numeroRandomico = (Math.random() * 400); // gera número aleatorio entre 0 e 400
            vetorAmostras[i] = numeroRandomico.intValue(); // armazena o número aleatorio convertido para inteiro
            System.out.print(vetorAmostras[i] + " | "); // imprime o valor da amostra 
        }
    }
}
