public class TarefaListaLigada {

    // Classe interna para representar cada nó da lista ligada
    private class No {
        Tarefa tarefa; // A tarefa armazenada no nó
        No proximo; // Referência para o próximo nó na lista

        // Construtor do nó
        No(Tarefa tarefa) {
            this.tarefa = tarefa;
            this.proximo = null; // Inicialmente, o próximo é null
        }
    }

    private No primeiro; // atributo que aponta para o primeiro no da lista

    public TarefaListaLigada() {
        this.primeiro = null; // inicia a lista como vazia
    }

    // Metodo para adicionar uma tarefa no final da lista
    public void adicionarTarefa(Tarefa tarefa) {
        No novoNoTarefa = new No(tarefa); // cria um novo nó com a tarefa

        // verifica se a lista está vazia
        if (primeiro == null) {
            primeiro = novoNoTarefa; // se a lista estiver vazia atribui o novoNo como primeiro
        } else { // se o primeiro não é null, significa que a lista ja tem pelo menos um nó então
                 // ele cai aqui no else
            No atual = primeiro; // criação da variavel chamada atual que começa apontando para o primeiro no da
                                 // lista
            while (atual.proximo != null) { // o laço percorre a lista enquanto o proximo nó for diferente de null, no caso vai ficar percorrendo até que o nó seja null, no caso até chegar ate o ultimo no
                atual = atual.proximo; // Move 'atual' para o próximo nó da lista
            }
            // Aqui, 'atual' é o último nó da lista, então adicionamos o novo nó a ele
            atual.proximo = novoNoTarefa; // Atribui o novo nó como o próximo do último nó
        }
    }

    // metodo de remover as tarefas
    public void removerTarefa(String titulo) {
        // veridicase a lista esta vazia
        if (primeiro == null) {
            System.out.println("A lista está vazia. Não tem tarefas para remover");
            return; // sai do metodo ja que a lista esta vazia
        }

        // remove o primeiro da lista
        if (primeiro.tarefa.getTitulo().equals(titulo)) {
            primeiro = primeiro.proximo; // Atribui o próximo nó como o novo primeiro
            System.out.println("Tarefa removida: " + titulo); // Mensagem de confirmação
            return; // Sai do método após a remoção
        }

        // criando variaveis que serão usadas para percorrer a lista
        No atual = primeiro; // começa no primeiro no
        No anterior = null; // variavel que vai armazenar o nó anterior

        // percorrer a lista até que o atual seja null
        while (atual != null) {
            // verifica se o titulo que queremos remover é o do no atual
            if (atual.tarefa.getTitulo().equals(titulo)) {
                anterior.proximo = atual.proximo; // remove o no atual da lista
                System.out.println("Tarefa removida: " + titulo); // Mensagem de confirmação
                return; // Sai do método após a remoção
            }
            anterior = atual; // atualiza o no anterior para o no atual ja que um foi removido
            atual = atual.proximo; // move para o proximo no
        }

        // Se a tarefa não for encontrada
        System.out.println("Tarefa não encontrada: " + titulo);
    }

    // metodo de listar as tarefas
    public void listartarefas() {
        // Verifica se a lista está vazia
        if (primeiro == null) {
            System.out.println("Não há tarefas na lista."); // Mensagem se a lista estiver vazia
            return; // Sai do método se a lista estiver vazia
        }

        //inicializa o no atual para poder percorrer a lista 
        No atual = primeiro; //começando no primeiro no 

        // percorre a lista enquanto houver no 
        while (atual != null) {
            //Exibe todas as informações das tarefas do nó atual
            System.out.println("Titulo: " + atual.tarefa.getTitulo() + ", Descrição: " + atual.tarefa.getDescricao() + ", Prioridade: " + atual.tarefa.getPrioridade());

            atual = atual.proximo; // move para o proximo no 
        }
    }

    // metodo para buscar as tarefas
    public Tarefa buscarTarefa(String titulo) {
        // Inicializa o nó atual para percorrer a lista
        No atual = primeiro; // Começa no primeiro nó

        //percorre a lista enquanto o no for diferente de null
        while (atual != null) {
            //verifica se o titulo da tarefa é igual ao titulo buscado
            if(atual.tarefa.getTitulo().equals(titulo)){
                return atual.tarefa; // retorna a tareda encontrada
            }
            
            atual = atual.proximo; //move para o proximo no
        }

        // Se a tarefa não for encontrada, imprime mensagem
        System.out.println("Tarefa não encontrada: " + titulo);
        return null; // Retorna null se a tarefa não for encontrada
    }

    // metodo de ordenar as tarefas conforme suas prioridades
    public void ordenarPorPrioridade() {
        // Verifica se a lista está vazia ou tem apenas um elemento
        if (primeiro == null || primeiro.proximo == null) {
            return; // Não há necessidade de ordenar se a lista estiver vazia ou tiver um único elemento
        }

        boolean trocou; // Variável para verificar se houve troca durante a ordenação

        do {
            trocou = false; // Reseta a variável a cada iteração

            No atual = primeiro; // Começa do primeiro nó

            // Percorre a lista até o penúltimo nó
            while (atual.proximo != null) {
                // Verifica se a prioridade da tarefa atual é maior do que a do próximo nó
                if (atual.tarefa.getPrioridade() > atual.proximo.tarefa.getPrioridade()) {
                    // Troca as tarefas entre os nós
                    Tarefa temp = atual.tarefa; // Armazena a tarefa atual
                    atual.tarefa = atual.proximo.tarefa; // Substitui pela tarefa do próximo nó
                    atual.proximo.tarefa = temp; // Coloca a tarefa armazenada no próximo nó

                    trocou = true; // Indica que houve troca
                }
                atual = atual.proximo; // Move para o próximo nó
            }
        } while (trocou); // Continua enquanto houve troca
    }

}
