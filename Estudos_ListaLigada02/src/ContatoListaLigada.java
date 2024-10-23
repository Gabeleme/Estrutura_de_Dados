public class ContatoListaLigada {
    private No primeiro;

    private class No {
        Contato contato; // Contato armazenado no nó
        No proximo; // Ponteiro para o próximo nó

        // Construtor do nó
        No(Contato contato) {
            this.contato = contato;
            this.proximo = null;
        }
    }

    // metodo de adicionar contato a lista
    public void adicionarContato(Contato contato) {
        No novoNoContato = new No(contato); // criação de um novo no
        // verifica se a lista está vazia
        if (primeiro == null) {
            primeiro = novoNoContato; // se a lista estiver vazia atribui o novo no como o primeiro
        } else { // se a lista não estiver vazia ela vai no else, começando assim a percorrer a
                 // lista a aprtir do primeiro no
            No atual = primeiro;
            // começa a percorrer a lista ate o ultimo no, no caso ate o atual apontar para
            // null que significa que chegou ao fim
            while (atual.proximo != null) {
                atual = atual.proximo; // avança para o proximo no
            }
            // Quando chega ao final da lista, adiciona o novo nó como o próximo do último
            // nó
            atual.proximo = novoNoContato; // O novo nó é agora o último nó da lista
        }
    }

    // metodo de remover contato da lista
    public void removerContato(String nome) {
        // verifica se a lista está vazia
        if (primeiro == null) {
            System.out.println("A lista de Contato está vazia, não tem nenhum contato para remover.");
            return; // sai se a lista estiver vazia
        }

        // remove o primeiro da lista
        if (primeiro.contato.getNome().equals(nome)) {
            primeiro = primeiro.proximo; // atribui o proximo no como o novo primeiro
            System.out.println("Contato Removido: " + nome); // mensagem
            return; // sai do metodo
        }

        // criando variaveis que serão usadas para percorrer a lista
        No atual = primeiro; // começa no primeiro no
        No anterior = null; // variavel que vai armazenar o nó anterior

        // percorrer a lista ate que o atual seja null, chegando no fim
        while (atual != null) {
            // verifica se o nome que queremos remover é o do no atual
            if (atual.contato.getNome().equals(nome)) {
                anterior.proximo = atual.proximo; // remove o no atual da lista
                System.out.println("Contato Removido: " + nome); // mensagem
                return; // sai do metodo
            }
            anterior = atual; // atualiza o no anterior para o no atual ja que um foi removido
            atual = atual.proximo; // move para o proximo no
        }
        System.out.println("Contato não encontrado");
    }

    // metodo de listar os contatos que tem na lista
    public void listarContatos() {
        // verifica se a lista está vazia
        if (primeiro == null) {
            System.out.println("A lista de Contato está vazia!");
            return; // sai se a lista estiver vazia
        }

        // inicializa o no atual para poder percorrer a lista
        No atual = primeiro; // começando no primeiro no

        // percorre a lista enquanto houver no
        while (atual != null) {
            // Exibe todas as informações das tarefas do nó atual
            System.out.println("Nome: " + atual.contato.getNome() + ", Telefone: " + atual.contato.getTelefone()
                    + ", E-mail: " + atual.contato.getEmail());

            atual = atual.proximo; // move para o proximo no
        }
    }

    // metodo de buscar os contatos
    public Contato buscarContatos(String nome) {
        // Verifica se a lista está vazia
        if (primeiro == null) {
            System.out.println("A lista de Contatos está vazia.");
            return null;
        }

        // Percorre a lista para encontrar o contato
        No atual = primeiro;
        while (atual != null) {
            // Compara o nome do contato atual com o nome que estamos procurando
            if (atual.contato.getNome().equals(nome)) {
                System.out.println("Contato encontrado: " + atual.contato.getNome());
                return atual.contato; // Retorna o contato encontrado
            }
            atual = atual.proximo; // Avança para o próximo nó
        }

        // Se percorreu toda a lista e não encontrou o contato
        System.out.println("Contato não encontrado: " + nome);
        return null;
    }

    // metodo de ordenar os contatos
    public void ordenarContatos() {
        //verifica se a lista esta vazia
        if (primeiro == null) {
            System.out.println("A lista de contatos está vazia.");
            return; // Sai se a lista estiver vazia
        }

        boolean trocou; 
        do{
            trocou = false; // inicializa como falso
            No atual = primeiro; // começa com o primeiro no da lista

            while (atual.proximo != null) { //percorre ate chegar no ultimo no
                //compara os contatos e troca de lugar deixando em ordem alfabetica 
                if(atual.contato.getNome().compareToIgnoreCase(atual.proximo.contato.getNome()) > 0); 
                // se o nome do contato atual for maior faz a troca
                Contato temp = atual.contato; // Armazena o contato atual temporariamente
                atual.contato = atual.proximo.contato; // Coloca o próximo contato no lugar do atual
                atual.proximo.contato = temp; // Coloca o contato armazenado no próximo
                trocou = true; // Marca que houve uma troca
            }
            atual = atual.proximo; //vai para o proximo no
        }while (trocou);

        System.out.println("Contatos ordenados."); 
    }

    // metodo de atualizar contato
    public void atualizarcontato(String nome, Contato novoContato) {
        // Verifica se a lista está vazia
    if (primeiro == null) {
        System.out.println("A lista de contatos está vazia.");
        return; // Sai se a lista estiver vazia
    }

    No atual = primeiro; // Inicia a busca a partir do primeiro nó
    while (atual != null) { // Percorre a lista até encontrar o contato ou chegar ao final
        if (atual.contato.getNome().equals(nome)) { // Verifica se o nome do contato atual corresponde ao nome procurado
            atual.contato = novoContato; // Atualiza o contato com os novos dados
            System.out.println("Contato atualizado: " + nome); // Mensagem de sucesso
            return; // Sai do método após a atualização
        }
        atual = atual.proximo; // Avança para o próximo nó
    }

    // Se o contato não foi encontrado
    System.out.println("Contato não encontrado: " + nome); // Mensagem de erro
    }

    // metodo de contar quantos contatos tem na lista
    public int contarContatos() {
        int contador = 0; // Inicializa o contador em zero
    No atual = primeiro; // Começa a contagem a partir do primeiro nó

    while (atual != null) { // Continua até chegar ao final da lista
        contador++; // Incrementa o contador para cada nó
        atual = atual.proximo; // Avança para o próximo nó
    }

    System.out.println("Total de contatos: " + contador); // Exibe o total de contatos
    return contador; // Retorna o total de contatos
        
    }

    // metodo de filtrar os contatos pela letra do nome
    public void filtrarcontatosPorLetraDoNome(char letra) {
        // Verifica se a lista está vazia
    if (primeiro == null) {
        System.out.println("A lista de contatos está vazia.");
        return; // Sai se a lista estiver vazia
    }

    No atual = primeiro; // Começa a busca a partir do primeiro nó
    boolean encontrou = false; // Inicializa uma flag para verificar se encontrou algum contato

    while (atual != null) { // Percorre a lista até chegar ao final
        // Verifica se o nome do contato começa com a letra fornecida (maiúsculas ou minúsculas)
        if (atual.contato.getNome().charAt(0) == Character.toUpperCase(letra) ||
            atual.contato.getNome().charAt(0) == Character.toLowerCase(letra)) {
            System.out.println("Contato encontrado: " + atual.contato.getNome()); // Exibe o nome do contato encontrado
            encontrou = true; // Marca que encontrou pelo menos um contato
        }
        atual = atual.proximo; // Avança para o próximo nó
    }

    // Se nenhum contato foi encontrado
    if (!encontrou) {
        System.out.println("Nenhum contato encontrado com a letra: " + letra); // Mensagem de erro
    }
    }

}
