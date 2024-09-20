import javax.swing.SwingUtilities;

public class TesteMediaMovel {
    public static void main(String[] args) {
        int tamanhoAmostras = 200; // tamanho do vetor de amostra
        int tamanhoJanela = 50; // tamanho da janela móvel

        MediaMovelVetor media = new MediaMovelVetor(tamanhoAmostras, tamanhoJanela); // cria um objeto para calcular a media movel 
        
        media.calculaMediaMovel(); // calcula as medias movel

        int[] amostras = media.vetorAmostras; // obtem o vetor de amostra
        int[] mediasMovel = media.mediaMovel; // obtem o vetor de médias moveis

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                
                // DesenhoJanela janela 
                new DesenhoJanela(amostras, mediasMovel); // cria a janela de desenho
            }
        });
    }
}
