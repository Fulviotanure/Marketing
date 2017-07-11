/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketing.view;

import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;
import marketing.model.Campanha;
import marketing.dao.CampanhaDAO;


/**
 *
 * @author Fulvio
 */
public class CadastroCampanhas extends javax.swing.JFrame {
    
Campanha campanha;
    /**
     * Creates new form CadastroCampanhas
     */
    public CadastroCampanhas() {
        initComponents();
        this.setLocationRelativeTo(null);
         this.campanha=new Campanha();
         
        
         jLabelMsgObrigatorioNome.setVisible(false);
         jLabelMsgObrigatorioPeriodo.setVisible(false);
         jLabelMsgObrigatorioLink.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPeriodo = new javax.swing.JTextField();
        jLabelMsgObrigatorioNome = new javax.swing.JLabel();
        jLabelMsgObrigatorioPeriodo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btNovapraca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCampanha = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtLink = new javax.swing.JTextField();
        jLabelMsgObrigatorioLink = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastrar novas Campanhas");

        jLabel2.setText("<html>Nome do Produto<font color=\"red\">*</font>");

        jLabel3.setText("<html>Periodo em dias<font color=\"red\">*</font>");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodoActionPerformed(evt);
            }
        });

        jLabelMsgObrigatorioNome.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMsgObrigatorioNome.setText("Campo Obrigatório");

        jLabelMsgObrigatorioPeriodo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMsgObrigatorioPeriodo.setText("Campo Obrigatório");

        jLabel6.setText("Selecione uma praça");

        btNovapraca.setText("+");
        btNovapraca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovapracaActionPerformed(evt);
            }
        });

        tabCampanha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Praça", "Tipo", "valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabCampanha.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabCampanha);
        if (tabCampanha.getColumnModel().getColumnCount() > 0) {
            tabCampanha.getColumnModel().getColumn(0).setResizable(false);
            tabCampanha.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel7.setText("Descrição");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        jLabel8.setText("<html>link da localização da imagem ou video a ser veiculado<font color=\"red\">*</font>");

        txtLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkActionPerformed(evt);
            }
        });

        jLabelMsgObrigatorioLink.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMsgObrigatorioLink.setText("Campo Obrigatório");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
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

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("* Campo Obrigatório");

        jLabel4.setText("Valor Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNovapraca)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMsgObrigatorioLink)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLink)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addGap(55, 55, 55)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btVoltar)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel1))
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMsgObrigatorioNome)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelMsgObrigatorioPeriodo)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtPeriodo)))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMsgObrigatorioNome))
                    .addComponent(jLabelMsgObrigatorioPeriodo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btNovapraca))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMsgObrigatorioLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar)
                    .addComponent(btVoltar))
                .addGap(18, 18, 18)
                .addComponent(jLabel10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkActionPerformed

    private void btNovapracaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovapracaActionPerformed
  SelecionarPraca frame = new SelecionarPraca();
        frame.setVisible(true);
  
    }//GEN-LAST:event_btNovapracaActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
      if (txtNome.getText().length()>0) {
            jLabelMsgObrigatorioNome.setVisible(false);
        } else {
             jLabelMsgObrigatorioNome.setVisible(true);
        }
         if(txtPeriodo.getText().length()>0){
            jLabelMsgObrigatorioPeriodo.setVisible(false);
         } else {
            jLabelMsgObrigatorioPeriodo.setVisible(true); 
         }
         if(txtLink.getText().length()>0){
            jLabelMsgObrigatorioLink.setVisible(false);
         } else {
            jLabelMsgObrigatorioLink.setVisible(true);
         }
         if ((txtNome.getText().length()>0)
                &&(txtPeriodo.getText().length()> 0)
                && (txtLink.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Dados Validados !!");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios !!");
         }
         campanha.setValor(parseDouble(txtValor.getText()));  
         campanha.setNome(txtNome.getText().trim());        
         campanha.setPeriodo(txtPeriodo.getText().trim());
         campanha.setDescricao(txtDescricao.getText().trim());
         campanha.setLink(txtLink.getText());
         
          CampanhaDAO campanhaDAO = new CampanhaDAO();
        boolean resultado;

        resultado = campanhaDAO.inserirCampanha(campanha);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Campanha inserida com sucesso!", "Inclusão", JOptionPane.INFORMATION_MESSAGE); 
         
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
        
         /*
        if(!txtNome.getText().isEmpty()){
        
        if(janela2==null){
           janela2 = new CadastroPracas();
           janela2.setLocationRelativeTo(null);
           janela2.setVisible(true);
           janela2.setResizable(false);
        }else{
           janela2.setLocationRelativeTo(null);
           janela2.setVisible(true);
           janela2.setResizable(false); 
        } 
        
        janela2.enviar(this, txtNome.getText());
    }
     */ 
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
    
           txtNome.setText("");
           txtPeriodo.setText("");
           txtDescricao.setText("");
           txtLink.setText("");
           
    }//GEN-LAST:event_btLimparActionPerformed

    private void txtPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodoActionPerformed
     txtPeriodo.setText(txtPeriodo.getText().replaceAll("[^0-9]",""));
    }//GEN-LAST:event_txtPeriodoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCampanhas().setVisible(true);
                  
                
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovapraca;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMsgObrigatorioLink;
    private javax.swing.JLabel jLabelMsgObrigatorioNome;
    private javax.swing.JLabel jLabelMsgObrigatorioPeriodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabCampanha;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtLink;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
