import java.util.ArrayList;
// import java.util.List;

public class FilaPacientes {

    ArrayList<Paciente> fila = new ArrayList<Paciente>();

    // metodo para adicionar os pacientes na fila
    public void adicionar(Paciente item) {

        boolean sinaleiro = false; 

        // verifica se a fila está vazia
        if (fila.size() == 0) {
            fila.add(item); // adiciona o paciente na fila
        } else {
            for (int i = 0; i < fila.size(); i++) { // for para percorrer a fila
                if (fila.get(i).getPrioridade() <= item.getPrioridade()) {
                    fila.add(i, item); // adiciona a pessoa
                    sinaleiro = true; //sinaleiro
                    break;// encerra o loop for
                }

            }
            if (sinaleiro == false) { // se o paciente não foi adicionado no loop
                fila.add(item); // adiciona o paciente no final da fila
            }
        }

    }

    public Paciente remover() {
        // Remove do inicio da Lista.....
        return fila.remove(0);
    }

    public Paciente exibirInicio() {
        // Lê a primeira posição sem remover
        return fila.get(0);
    }

    public int tamanho() {
        // retorna o tamanho da lista.
        return fila.size();
    }

    public ArrayList<Paciente> getFila() {
        // Retorna a Lista completa
        return fila;
    }
}
