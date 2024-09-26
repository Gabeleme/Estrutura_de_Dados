import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class ValidaBalanceamentoScreen extends javax.swing.JFrame {

    private FilaPacientes filaPrioridade;
    private DefaultListModel model = new DefaultListModel();

    public ValidaBalanceamentoScreen() {
        initComponents();
        filaPrioridade = new FilaPacientes();
        model.addElement("== ATENDIMENTOS ==");
        sequenciaAtendimentos.setModel(model);
        txtbFilaPrioridade.setText(" ==== Fila de Prioridades ==== \n \n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtbExpressao = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btoValidar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtbNome = new javax.swing.JTextField();
        cboxPrioridade = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btoAdicionar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        sequenciaAtendimentos = new javax.swing.JList<>();
        btoRemover = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtbFilaPrioridade = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(
                "Crie um método chamando validaBalanceamento que recebe uma String e verifica se uma sequência de caracteres contém parênteses balanceados. \nRetornando True ou False.\n\nPor  exemplo:\n“{ [ ( ) ( ) ] }”  Balanceado\n“{ [ ( ) ) ] }”    Desbalanceado\n\nUtilize a seguinte lógica: \n\nQuando encontrar um símbolo de abertura {, [, (, adiciona o símbolo de fechamento equivalente a pilha. \nPor exemplo: encontra “{“  Empilha “}”\nQuando encontrar um símbolo de fechamento }, ], ), compara com o topo da pilha.\nSe for verdadeiro remove o símbolo da pilha.\nSe for falso retorna False.\nSe o método chegar ao final da String e a pilha estiver vazia, retorna True.\n");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Expressão");

        txtbExpressao.setText("{[(A+B)*(C+D)]}");

        lblResultado.setText("....................");

        btoValidar.setText("Validar");
        btoValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoValidarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 831, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtbExpressao,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblResultado,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btoValidar)
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                        .addContainerGap())));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 444, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(txtbExpressao, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblResultado)
                                                .addComponent(btoValidar))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));

        jTabbedPane1.addTab("PILHAS (5.0 pt)", jPanel1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText(
                "Utilize o conceito de fila de prioridade para organizar a fila de atendimento de um ambulatório.\n\nO algoritmo deverá implementar a seguinte lógica:\n\n1º - O objeto Paciente possui o atributo prioridade que receberá valores de 0 a 9, sendo 0 de maior prioridade e 9 de menor prioridade.\n2º - Sempre que um paciente for adicionado a fila de atendimento deverá ser verificado seu nível de prioridade, sendo adicionado a frente \ndos pacientes de menor prioridade, mas atrás dos pacientes de mesma prioridade ou maior prioridade.\n\nPor exemplo: Se houver na fila um paciente de prioridade 2 e um paciente de prioridade 3, um paciente de prioridade 2 deverá ficar a frente \ndo paciente de prioridade 3 mas atrás do pacientes de prioridade 2.\n|  2  | (novo) | 3 |");
        jScrollPane2.setViewportView(jTextArea2);

        jLabel2.setText("Nome");

        cboxPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabel3.setText("Prioridade");

        btoAdicionar.setBackground(new java.awt.Color(153, 255, 153));
        btoAdicionar.setText("Adicionar Pacientes");
        btoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoAdicionarActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(sequenciaAtendimentos);

        btoRemover.setBackground(new java.awt.Color(255, 204, 204));
        btoRemover.setText("Atender Pacientes");
        btoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cboxPrioridade,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 124,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtbNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(btoRemover, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtbNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cboxPrioridade,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 221,
                                                Short.MAX_VALUE))
                                .addContainerGap()));

        txtbFilaPrioridade.setColumns(20);
        txtbFilaPrioridade.setRows(5);
        jScrollPane4.setViewportView(txtbFilaPrioridade);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 819,
                                                Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane4)))
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(15, Short.MAX_VALUE)))));

        jTabbedPane1.addTab("Fila (5.0 pt)", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoValidarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btoValidarActionPerformed

        if (ValidaBalanceamento.ValidaBalanceamento(txtbExpressao.getText()))
            lblResultado.setText("== TRUE ==");
        else
            lblResultado.setText("== FALSE ==");
    }// GEN-LAST:event_btoValidarActionPerformed

    private void btoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btoAdicionarActionPerformed

        filaPrioridade.adicionar(
                new Paciente(txtbNome.getText(), Integer.parseInt(cboxPrioridade.getSelectedItem().toString())));
        imprimirLista();
    }// GEN-LAST:event_btoAdicionarActionPerformed

    private void btoRemoverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btoRemoverActionPerformed

        Paciente p = filaPrioridade.remover();
        model.addElement(p.getPrioridade() + " - " + p.getNome());
        sequenciaAtendimentos.setModel(model);

    }// GEN-LAST:event_btoRemoverActionPerformed

    private void imprimirLista() {

        ArrayList<Paciente> aux = filaPrioridade.getFila();
        String texto = "=== Fila de Prioridade === \n \n | ";
        for (int i = 0; i < aux.size(); i++) {

            texto += aux.get(i).getPrioridade() + " - " + aux.get(i).getNome() + " | ";
        }
        txtbFilaPrioridade.setText(texto);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ValidaBalanceamentoScreen.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidaBalanceamentoScreen.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidaBalanceamentoScreen.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidaBalanceamentoScreen.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValidaBalanceamentoScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoAdicionar;
    private javax.swing.JButton btoRemover;
    private javax.swing.JButton btoValidar;
    private javax.swing.JComboBox<String> cboxPrioridade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JList<String> sequenciaAtendimentos;
    private javax.swing.JTextField txtbExpressao;
    private javax.swing.JTextArea txtbFilaPrioridade;
    private javax.swing.JTextField txtbNome;
    // End of variables declaration//GEN-END:variables
}
