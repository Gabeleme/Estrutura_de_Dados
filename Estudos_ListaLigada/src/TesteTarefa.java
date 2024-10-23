public class TesteTarefa {
    public static void main(String[] args) {
        TarefaListaLigada lista = new TarefaListaLigada();

        // Cria algumas tarefas com diferentes graus de prioridades
        Tarefa tarefa1 = new Tarefa("Estudar Java", "Revisar conceitos de POO e listas", 2);
        Tarefa tarefa2 = new Tarefa("Lavar a louça", "Lavar toda a louça da cozinha", 3);
        Tarefa tarefa3 = new Tarefa("Fazer exercícios", "Fazer exercícios de matemática", 1);
        Tarefa tarefa4 = new Tarefa("Comprar mantimentos", "Comprar frutas e verduras", 2);

        // Adiciona as tarefas à lista
        lista.adicionarTarefa(tarefa1);
        lista.adicionarTarefa(tarefa2);
        lista.adicionarTarefa(tarefa3);
        lista.adicionarTarefa(tarefa4);

        System.out.println(""); //pular linha
        System.out.println("=".repeat(50)); //sepração das linhas

        // Lista as tarefas antes da ordenação
        System.out.println("Tarefas antes da ordenação:");
        lista.listartarefas();

        System.out.println("=".repeat(50)); //separação das linhas

        // Lista as tarefas após a ordenação
        System.out.println("Tarefas após a ordenação por prioridade:");
        // Ordena as tarefas por prioridade
        lista.ordenarPorPrioridade();
        lista.listartarefas();

        System.out.println("=".repeat(50)); //separação das linhas

        // Busca uma tarefa específica
        String tituloBusca = "Lavar a louça";
        Tarefa tarefaBuscada = lista.buscarTarefa(tituloBusca);
        if (tarefaBuscada != null) {
            System.out.println("Tarefa encontrada: " + tarefaBuscada.getTitulo() + " com prioridade "
                    + tarefaBuscada.getPrioridade());
        }

        System.out.println("=".repeat(50)); //separação das linhas

        // Remove uma tarefa
        lista.removerTarefa("Estudar Java");

        System.out.println("=".repeat(50)); //separação das linhas

        System.out.println("Tarefas após remover 'Estudar Java':");
        lista.listartarefas();

        System.out.println("=".repeat(50)); //separação das linhas
    }
}
