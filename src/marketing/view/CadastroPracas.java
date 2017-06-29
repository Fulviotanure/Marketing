/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketing.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Fulvio
 */
public class CadastroPracas extends javax.swing.JFrame {

  
            
            
    public CadastroPracas() {
        initComponents();
        
        setLocationRelativeTo(null);
        jLabelMsgObrigatotioNome.setVisible(false);
        jLabelMsgObrigatotioMedia.setVisible(false);
        
    }

     
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMedia = new javax.swing.JTextField();
        ComboBoxTipo = new javax.swing.JComboBox<>();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelMsgObrigatotioMedia = new javax.swing.JLabel();
        jLabelMsgObrigatotioNome = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Praças");

        jLabel1.setText("Cadastro Praças");

        jLabel2.setText("<html>Nome<font color=\"red\">*</font>");

        jLabel3.setText("Tipo");

        txtMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMediaActionPerformed(evt);
            }
        });
        txtMedia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMediaKeyReleased(evt);
            }
        });

        ComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione", "Digital (imagem)", "Digital (video)", "Televisivo", "Audio", "Impresso" }));

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("* Campos Obrigatórios");

        jLabelMsgObrigatotioMedia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMsgObrigatotioMedia.setText("Campo Obrigatório");

        jLabelMsgObrigatotioNome.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMsgObrigatotioNome.setText("Campo Obrigatório");

        jLabel7.setText("<html>Valor Media Diaria<font color=\"red\">*</font>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSalvar)
                .addGap(65, 65, 65)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelMsgObrigatotioMedia))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelMsgObrigatotioNome))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMsgObrigatotioNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMsgObrigatotioMedia)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar)
                    .addComponent(btVoltar))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMediaActionPerformed
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_txtMediaActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
         if (txtNome.getText().length()>0) {
            jLabelMsgObrigatotioNome.setVisible(false);
        } else {
             jLabelMsgObrigatotioNome.setVisible(true);
        }
         if(txtMedia.getText().length()>0){
            jLabelMsgObrigatotioMedia.setVisible(false);
         } else {
            jLabelMsgObrigatotioMedia.setVisible(true);    
        }
          if ((txtNome.getText().length()>0)
                &&(txtMedia.getText().length()> 0)){
               JOptionPane.showMessageDialog(null, "Dados Validados !!");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios !!");
              
          }
          
           /*
         if (txtNome.getText().length()>5) {
           JOptionPane.showMessageDialog(rootPane,"Esse Campo não pode conter mais de 5 caracteres!");
         } else if (txtPeriodo.getText().length() > 5){
           JOptionPane.showMessageDialog(rootPane,"Esse Campo não pode conter mais de 5 caracteres!");  
         } else if (txtLink.getText().length()>5){
           JOptionPane.showMessageDialog(rootPane,"Esse Campo não pode conter mais de 5 caracteres!");     
         }
         */
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
           txtNome.setText("");
           txtMedia.setText("");
           
    }//GEN-LAST:event_btLimparActionPerformed

    private void txtMediaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMediaKeyReleased
      
        txtMedia.setText(txtMedia.getText().replaceAll("[^0-9]",""));
    }//GEN-LAST:event_txtMediaKeyReleased

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
  this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPracas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPracas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPracas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPracas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPracas().setVisible(true);
               
           
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxTipo;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelMsgObrigatotioMedia;
    private javax.swing.JLabel jLabelMsgObrigatotioNome;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
