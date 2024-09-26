public class Console {

    public static void main(String[] args) {
        
        System.out.println("\n===============================");
        boolean resp1= ValidaBalanceamento.ValidaBalanceamento("{[()()]}");
        System.out.println("Resposta deve ser TRUE: = " + resp1);
        
        System.out.println("===============================");
        resp1= ValidaBalanceamento.ValidaBalanceamento("{[())]}");
        System.out.println("Resposta deve ser FALSE: = " + resp1);
        System.out.println("===============================");
        
        //******* TESTA FILA PRIORIDADE *******
        FilaPacientes fila = new FilaPacientes();
        
        fila.adicionar(new Paciente("João",5));
        fila.adicionar(new Paciente("Maria",2));
        fila.adicionar(new Paciente("Pedro",0));
        fila.adicionar(new Paciente("Jorge",2));
        
        System.out.println("Sequencia Correta: Pedro => Maria => Jorge => João");
        
        while(fila.tamanho()>0){
            Paciente p = fila.remover();
            System.out.println(p.getPrioridade() + " - "+ p.getNome());
        }
        
    }
    
}
