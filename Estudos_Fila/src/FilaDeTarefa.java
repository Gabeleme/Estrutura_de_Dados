import java.util.LinkedList;
import java.util.Queue;

class tarefa { // declara a class tarefa
    private String descricao; // Atributo privado que armazena a descrição da tarefa.
    private boolean concluida; // Atributo privado que indica se a tarefa está concluída.

    public tarefa(String descricao) { // Construtor da classe tarefa que recebe a descrição como parâmetro.
        this.descricao = descricao; // Inicializa o atributo descricao com o valor passado
        this.concluida = false; // Inicializa o atributo concluida como false (não concluída).
    }

    public String getDescricao() { // Método público que retorna a descrição da tarefa.
        return descricao; // Retorna a descrição.
    }

    public boolean isCompleto() { // Método público que verifica se a tarefa está concluída.
        return concluida; // Retorna o estado do atributo concluida.
    }

    public void concluir() { // Método público que marca a tarefa como concluída.
        concluida = true; // Altera o estado de concluida para true (concluída).
    }

    @Override
    public String toString() { // Método para representar a tarefa como string
        return descricao + (concluida ? " (Concluída)" : " (Pendente)"); // Retorna a descrição com o status
    }
}

public class FilaDeTarefa { // declara a class fila
    private Queue<tarefa> filaDeTarefas; // Atributo privado que representa a fila de tarefas.

    public FilaDeTarefa() { // Construtor da classe FilaDeTarefa.
        this.filaDeTarefas = new LinkedList<>(); // Inicializa filaDeTarefas como uma nova LinkedList.
    }

    public void adicionarTarefa(String descricao) { // Método público que adiciona uma nova tarefa à fila.
        tarefa novatarefa = new tarefa(descricao); // Cria uma nova tarefa com a descrição passada.
        filaDeTarefas.offer(novatarefa); // Adiciona a nova tarefa à fila.
        System.out.println("Tarefa adicionada: " + descricao); // Exibe uma mensagem confirmando a adição da tarefa.
    }

    public void concluirProximaTarefa() { // Método público que conclui a próxima tarefa na fila.
        if (filaDeTarefas.isEmpty()) { // Verifica se a fila está vazia.
            System.out.println("Não há tarefas na fila."); // Exibe uma mensagem se não houver tarefas.
            return; // Retorna do método se a fila estiver vazia.
        }
        tarefa proximaTarefa = filaDeTarefas.poll(); // Remove e retorna a tarefa mais antiga da fila.
        if (proximaTarefa != null) { // Verifica se a tarefa não é nula.
            proximaTarefa.concluir(); // Chama o método para marcar a tarefa como concluída.
            System.out.println("Tarefa concluída: " + proximaTarefa.getDescricao()); // Exibe a descrição da tarefa
                                                                                    
        }
    }

    public void listarTarefas() { // Método público que lista todas as tarefas na fila.
        if (filaDeTarefas.isEmpty()) { // Verifica se a fila está vazia.
            System.out.println("Não há tarefas na fila."); // Exibe uma mensagem se não houver tarefas.
            return; // Retorna do método se a fila estiver vazia.
        }
        System.out.println("Tarefas na fila:"); // Exibe um cabeçalho para a lista de tarefas.
        for (tarefa tarefa : filaDeTarefas) { // Itera sobre cada tarefa na fila.
            System.out.println(tarefa); // Exibe a tarefa atual.
        }
    }

    public static void main(String[] args) {
        FilaDeTarefa filaDeTarefas = new FilaDeTarefa(); // Cria uma nova instância da fila de tarefas.

        // Adicionando tarefas
        System.out.println("\n============================================");
        filaDeTarefas.adicionarTarefa("Estudar para a prova de matemática"); 

        System.out.println("============================================");
        filaDeTarefas.adicionarTarefa("Comprar ingredientes para o jantar"); 

        System.out.println("============================================");
        filaDeTarefas.adicionarTarefa("Finalizar o projeto de programação"); 
        
        System.out.println("============================================");

        // Listando tarefas
        filaDeTarefas.listarTarefas(); // Lista todas as tarefas na fila.
        System.out.println("============================================"); 

        // Concluindo a próxima tarefa
        filaDeTarefas.concluirProximaTarefa(); // Conclui a tarefa mais antiga na fila.
        System.out.println("============================================");

        // Listando tarefas novamente
        filaDeTarefas.listarTarefas(); // Lista as tarefas restantes após a conclusão.
        System.out.println("============================================");

        // Concluindo outra tarefa
        filaDeTarefas.concluirProximaTarefa(); // Conclui a próxima tarefa na fila.
        System.out.println("============================================");

        // Listando tarefas finais
        filaDeTarefas.listarTarefas(); // Lista as tarefas restantes após a segunda conclusão.
        System.out.println("============================================");
    }
}
