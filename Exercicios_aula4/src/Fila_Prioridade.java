import java.util.ArrayList;
import java.util.List;

public class Fila_Prioridade {

    // FILA conceito FiFo (First-In First-out)

    // public void adiciona(Object item); ------ Adiciona no final da fila
    // public Object remove() ----- Remove do final da fila
    // public Object exibirInicio(); ----- Exibe o final da fila
    // public int tamanho(); ----- Retorna o tamanho da fila

    // ** A fila deverá ser implementada utilizando Arraylist

    List<Pessoa> fila = new ArrayList<>();

    public void adicionar(Pessoa pessoa) {
        // verifica se a pessoa possuir + de 60 anos
        // Se possuir, verifica a ultima pessoa com + de 60 anos e adiciona após essa
        // pessoa
        boolean sinaleiro = false;

        if (pessoa.getIdade() < 60) {
            fila.add(pessoa); // adiciona no final da lista
        } else {
            // Verifica se no inicio da lista possui uma pessoa com 60 anos ou +
            for (int i = 0; i < fila.size(); i++) {
                if (fila.get(i).getIdade() < 60) {
                    fila.add(i, pessoa);
                    sinaleiro = true;
                    break;// encerra o loop for
                }
            }
            if (sinaleiro == false) {
                fila.add(pessoa);
            }
        }

    }

    public Pessoa remover() {
        // remove do inicio da Lista (índice 0)
        return fila.remove(0);
    }

    public Pessoa exibirInicio() {
        // lê a primeira posição sem remover
        return fila.get(0);
    }

    public int tamanho() {
        // retorna o tamanho da lista
        return fila.size();
    }

}

