package com.mycompany.projeto_a3;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaGerenciamentoFila extends javax.swing.JFrame {

    public TelaGerenciamentoFila() {
        super ("Solicitaçoes");
        initComponents();
        buscarSolicitacoes();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recusarButton = new javax.swing.JButton();
        aceitarButton = new javax.swing.JButton();
        nomeComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prioritarioLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recusarButton.setText("Recusar solicitação");
        recusarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recusarButtonActionPerformed(evt);
            }
        });

        aceitarButton.setText("Aceitar solicitação");
        aceitarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceitarButtonActionPerformed(evt);
            }
        });

        nomeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nomeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Gerenciamento das Solicitação:");

        prioritarioLbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        prioritarioLbl.setBorder(javax.swing.BorderFactory.createTitledBorder("Prioritario:"));

        idLbl.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        idLbl.setBorder(javax.swing.BorderFactory.createTitledBorder("Id:"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(nomeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aceitarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prioritarioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 63, Short.MAX_VALUE))
                            .addComponent(recusarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioritarioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceitarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recusarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarSolicitacoes (){
    try{
        DAO dao = new DAO();
        Fila [] fila = dao.obterFila();
        nomeComboBox.setModel(new DefaultComboBoxModel<>(fila));
        }
    catch (Exception e){
       JOptionPane.showMessageDialog(null, "Solicitações indisponíveis, tente novamente mais tarde.");
        e.printStackTrace();
        }
    }

    
    private void nomeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeComboBoxActionPerformed
        Fila fila = (Fila) 
        nomeComboBox.getSelectedItem();
        idLbl.setText(Integer.toString(fila.getId()));
        if(fila.getPrioritario() == 0){
            prioritarioLbl.setText("Nao");
        }
        else{
            prioritarioLbl.setText("Sim");
        }
    }//GEN-LAST:event_nomeComboBoxActionPerformed

    private void aceitarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceitarButtonActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Aceitar solicitação?");
        if (escolha == JOptionPane.YES_OPTION){
            try{
                int id = Integer.parseInt(idLbl.getText());
                
            Fila fila = new Fila (id);
            
            DAO dao = new DAO();
            dao.removerFila(fila);
            
            JOptionPane.showMessageDialog(null, "Solicitação aceita!");
            
            buscarSolicitacoes();
            prioritarioLbl.setText("");
            idLbl.setText("");
            }
            catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente mais tarde.");
            e.printStackTrace();
            }
        }
       
    }//GEN-LAST:event_aceitarButtonActionPerformed

    private void recusarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recusarButtonActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Negar solicitação?");
        if (escolha == JOptionPane.YES_OPTION){
            try{
                int id = Integer.parseInt(idLbl.getText());
                
            Fila fila = new Fila (id);
            
            DAO dao = new DAO();
            dao.removerFila(fila);
            
            JOptionPane.showMessageDialog(null, "Solicitação negada!");
            
            buscarSolicitacoes();
            prioritarioLbl.setText("");
            idLbl.setText("");
            }
            catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha técnica. Tente novamente mais tarde.");
            e.printStackTrace();
            }
        }
       
    }//GEN-LAST:event_recusarButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciamentoFila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceitarButton;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox nomeComboBox;
    private javax.swing.JLabel prioritarioLbl;
    private javax.swing.JButton recusarButton;
    // End of variables declaration//GEN-END:variables
}
