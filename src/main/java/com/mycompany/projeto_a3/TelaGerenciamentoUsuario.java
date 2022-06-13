package com.mycompany.projeto_a3;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaGerenciamentoUsuario extends javax.swing.JFrame {

    private void buscarUsuarios() {
        try {
            DAO dao = new DAO();
            Usuario[] usuarios = dao.obterUsuario();
            usuariosComboBox.setModel(new DefaultComboBoxModel<>(usuarios));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuarios indisponíveis, tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    public boolean VerificarCampo() {

        String nomeUsuario = nomeTextField.getText();
        int idadeUsuario = Integer.parseInt(idadeTextField.getText());
        String senhaUsuario = senhaTextField.getText();
        String enderecoUsuario = enderecoTextField.getText();
        if (nomeUsuario == null || nomeUsuario.length() == 0 || idadeUsuario < 0 || senhaUsuario == null || senhaUsuario.length() == 0 || enderecoUsuario == null || enderecoUsuario.length() == 0) {
            return false;
        } else {
            return true;
        }

    }

    public TelaGerenciamentoUsuario() {
        super("Usuarios");
        initComponents();
        buscarUsuarios();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idadeTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();
        senhaTextField = new javax.swing.JTextField();
        usuariosComboBox = new javax.swing.JComboBox();
        enderecoTextField = new javax.swing.JTextField();
        prioridadeUsuarioCheckBox = new javax.swing.JCheckBox();
        administradorUsuarioCheckBox = new javax.swing.JCheckBox();
        novoUsuarioButton = new javax.swing.JButton();
        removerUsuarioButton = new javax.swing.JButton();
        atualizarUsuarioButton = new javax.swing.JButton();
        voltarUsuarioButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciamento de Usuarios"));

        idadeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Idade:"));

        nomeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome:"));

        senhaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha:"));

        usuariosComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        usuariosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosComboBoxActionPerformed(evt);
            }
        });

        enderecoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));

        prioridadeUsuarioCheckBox.setText("Prioritario");

        administradorUsuarioCheckBox.setText("Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nomeTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(prioridadeUsuarioCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(administradorUsuarioCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usuariosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enderecoTextField)
                    .addComponent(senhaTextField)
                    .addComponent(idadeTextField))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuariosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prioridadeUsuarioCheckBox)
                    .addComponent(administradorUsuarioCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        novoUsuarioButton.setText("Adicionar novo usuario");
        novoUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsuarioButtonActionPerformed(evt);
            }
        });

        removerUsuarioButton.setText("Remover usuário");
        removerUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerUsuarioButtonActionPerformed(evt);
            }
        });

        atualizarUsuarioButton.setText("Atualizar dados");
        atualizarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarUsuarioButtonActionPerformed(evt);
            }
        });

        voltarUsuarioButton.setText("Voltar");
        voltarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarUsuarioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(removerUsuarioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(novoUsuarioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atualizarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(voltarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoUsuarioButton)
                    .addComponent(atualizarUsuarioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerUsuarioButton)
                    .addComponent(voltarUsuarioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosComboBoxActionPerformed
        Usuario usuario = (Usuario) 
        usuariosComboBox.getSelectedItem();
        nomeTextField.setText(usuario.getNome());
        idadeTextField.setText(Integer.toString(usuario.getIdade()));
        senhaTextField.setText(usuario.getSenha());
        enderecoTextField.setText(usuario.getEndereco());
    }//GEN-LAST:event_usuariosComboBoxActionPerformed

    private void novoUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuarioButtonActionPerformed

        String nomeUsuario = nomeTextField.getText();
        String senhaUsuario = senhaTextField.getText();
        int idadeUsuario = Integer.parseInt(idadeTextField.getText());
        String enderecoUsuario = enderecoTextField.getText();
        int prioridadeUsuario;
        int administradorUsuario;
        String cadast;
        String confirm;
        
        //Lógica checkbox prioritario
        if(prioridadeUsuarioCheckBox.isSelected()){
        prioridadeUsuario = 1;
        }else{
            prioridadeUsuario = 0;
        }
        
        //Lógica checkbox dos colaboradores
        if(administradorUsuarioCheckBox.isSelected()){
        administradorUsuario =   1;
        cadast = "Confirmar cadastro de um novo administrador?";
        confirm = "Administrador criado com sucesso!";
        }else{
            administradorUsuario = 0;
            cadast = "Confirmar cadastro de um novo colaborador?";
            confirm = "Colaborador criado com sucesso!";
        }

        if (!this.VerificarCampo()) {
            JOptionPane.showMessageDialog(null, "Preencha nome, idade, senha e endereço");
        } else {
            try {
                int escolha = JOptionPane.showConfirmDialog(null, cadast);
                if (escolha == JOptionPane.YES_OPTION) {
                    Usuario usuario = new Usuario(nomeUsuario, senhaUsuario, idadeUsuario, enderecoUsuario, prioridadeUsuario, administradorUsuario);
                    DAO dao = new DAO();
                    dao.inserirUsuario(usuario);
                    JOptionPane.showMessageDialog(null, confirm);
                    nomeTextField.setText("");
                    idadeTextField.setText("");
                    senhaTextField.setText("");
                    enderecoTextField.setText("");
                    administradorUsuarioCheckBox.setSelected(false);
                    prioridadeUsuarioCheckBox.setSelected(false);
                    buscarUsuarios();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha tecnica, tente mais tarde");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_novoUsuarioButtonActionPerformed

    private void removerUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerUsuarioButtonActionPerformed
        if (!this.VerificarCampo()) {
            JOptionPane.showMessageDialog(null, "Nao existem campos a serem deletados.");
        } else {
            try {
                int escolha = JOptionPane.showConfirmDialog(null, "Remover usuario?");
                if (escolha == JOptionPane.YES_OPTION) { 
                    
                    String nomeUsuario = nomeTextField.getText();
                    String senhaUsuario = senhaTextField.getText();
                    
                    Usuario usuario = new Usuario(nomeUsuario, senhaUsuario);
                    
                    DAO dao = new DAO();                   
                    dao.removerUsuario(usuario);
                    
                    JOptionPane.showMessageDialog(null, "Usuario removido com sucesso!");
                    buscarUsuarios();
                    
                    nomeTextField.setText("");
                    senhaTextField.setText("");
                    idadeTextField.setText("");
                    enderecoTextField.setText("");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha tecnica. Tente novamente mais tarde.");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_removerUsuarioButtonActionPerformed

    private void atualizarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarUsuarioButtonActionPerformed
        if (!this.VerificarCampo()) {
            JOptionPane.showMessageDialog(null, "Preencha nome, idade, senha e endereco.");
        } else {
            try {
                int escolha = JOptionPane.showConfirmDialog(null, "Atualizar dados?");
                if (escolha == JOptionPane.YES_OPTION) {
                    String nome = nomeTextField.getText();
                    int idade = Integer.parseInt(idadeTextField.getText());
                    String senha = senhaTextField.getText();
                    String endereco = enderecoTextField.getText();
                    int prioritario;
                    int administrador;
                    
                    if(prioridadeUsuarioCheckBox.isSelected()){
                        prioritario = 1;
                    }else{
                        prioritario = 0;
                    }
                    
                    if(administradorUsuarioCheckBox.isSelected()){
                        administrador = 1;
                    }else{
                        administrador = 0;
                    }
                    
                    Usuario usuario = new Usuario(nome, senha, idade, endereco, prioritario, administrador);
                    
                    DAO dao = new DAO();
                    dao.atualizarUsuario(usuario);
                    
                    JOptionPane.showMessageDialog(null, "Colaborador atualizado com sucesso");
                    buscarUsuarios();
                    
                    idadeTextField.setText("");
                    nomeTextField.setText("");
                    senhaTextField.setText("");
                    enderecoTextField.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha tecnica. Tente novamente mais tarde.");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_atualizarUsuarioButtonActionPerformed

    private void voltarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarUsuarioButtonActionPerformed
        TelaAdministradores dt = new TelaAdministradores();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarUsuarioButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaGerenciamentoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciamentoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciamentoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox administradorUsuarioCheckBox;
    private javax.swing.JButton atualizarUsuarioButton;
    private javax.swing.JTextField enderecoTextField;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton novoUsuarioButton;
    private javax.swing.JCheckBox prioridadeUsuarioCheckBox;
    private javax.swing.JButton removerUsuarioButton;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JComboBox usuariosComboBox;
    private javax.swing.JButton voltarUsuarioButton;
    // End of variables declaration//GEN-END:variables
}
