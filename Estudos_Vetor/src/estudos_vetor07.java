
public class estudos_vetor07 {

    public static void main(String[] args) {
        // Array com os nomes dos meses
        String mes[] = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" };

        // Array com o número total de dias de cada mês
        int tot[] = { 31, 28, 31, 30, 30, 31, 31, 30, 31, 30, 31, 31 };

        // Loop para iterar sobre os meses e imprimir o número de dias de cada um
        for (int i = 0; i < mes.length; i++) {
            // Exibe o nome do mês e o número total de dias no mês
            System.out.println("O mês de " + mes[i] + " tem " + tot[i] + " dias.");
        }
    }

}
