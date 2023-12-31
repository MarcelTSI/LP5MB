/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MbsCompraProduto;
import bean.MbsProduto;
import controle.MbsCompraProdutoControle;
import dao.MbsCompraProdutoDAO;
import dao.MbsProdutoDAO;
import java.util.List;
import tools.Util;

/**
 *
 * @author marcelbenitezdasilva
 */
public class jDlgMbsCompraProduto extends javax.swing.JDialog {
    private jDlgMbsCompra jDlgMbsCompras;
    private boolean incluindo;
    public MbsCompraProduto mbsCompraProduto = new MbsCompraProduto();
    public MbsCompraProdutoDAO mbsCompraProdutoDAO = new MbsCompraProdutoDAO();
    public MbsCompraProdutoControle mbsCompraProdutoControle = new MbsCompraProdutoControle();
    public MbsProdutoDAO mbsProdutoDAO = new MbsProdutoDAO();
    
    
    private jDlgMbsCompra jDlgMbsCompra;

    /**
     * Creates new form jDlgMbsPedidosPesquisa
     */
    public jDlgMbsCompraProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Compra Produto");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtTotal);
    
    if (incluindo) {
            setTitle("Inclusão de produtos");
        } else {
            setTitle("Alteração de produtos");
        }
        setLocationRelativeTo(null);
        mbsProdutoDAO = new MbsProdutoDAO();

        MbsProdutoDAO mbsProdutoDAO = new MbsProdutoDAO();
        List listaPro = mbsProdutoDAO.listAll();
        for (int i = 0; i < listaPro.size(); i++) {
            jCboProduto.addItem((MbsProduto) listaPro.get(i));
        }
    }
    
    public MbsCompraProduto viewBean() {
        mbsCompraProduto.setMbsProduto((MbsProduto) jCboProduto.getSelectedItem());
        int quant = Util.strInt(jTxtQuantidade.getText());
        mbsCompraProduto.setMbsQuantidade(quant);
        double valorun = Util.strDouble(jTxtValor.getText());
        mbsCompraProduto.setMbsValorUnitario(valorun);
        return mbsCompraProduto;
    };

    public void beanView(MbsCompraProduto mbsCompraProduto) {
        jCboProduto.setSelectedItem(mbsCompraProduto.getMbsIdComprasProduto());
        String quant = Util.intStr(mbsCompraProduto.getMbsQuantidade());
        jTxtQuantidade.setText(quant);
        String valor = Util.doubleStr(mbsCompraProduto.getMbsValorUnitario());
        jTxtValor.setText(valor);
        
        
    };
    

        public void setIncluindo(boolean incluindo) {
        this.incluindo = incluindo;
    }
        public void setTelaAnterior(jDlgMbsCompra jDlgMbsCompra) { 
            this.jDlgMbsCompra = jDlgMbsCompra;
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
        jLabel4 = new javax.swing.JLabel();
        jTxtQuantidade = new javax.swing.JTextField();
        jTxtValor = new javax.swing.JTextField();
        jTxtTotal = new javax.swing.JTextField();
        jBtnOk = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jCboProduto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Produto");

        jLabel2.setText("Quantidade");

        jLabel3.setText("Valor Unitário");

        jLabel4.setText("Total");

        jTxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtQuantidadeActionPerformed(evt);
            }
        });
        jTxtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtQuantidadeKeyReleased(evt);
            }
        });

        jTxtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtValorActionPerformed(evt);
            }
        });

        jTxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTotalActionPerformed(evt);
            }
        });

        jBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar_preto.png"))); // NOI18N
        jBtnOk.setText("OK");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar_preto.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jCboProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCboProdutoItemStateChanged(evt);
            }
        });
        jCboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboProdutoActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 179, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtTotal)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBtnOk)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnCancelar))
                            .addComponent(jCboProduto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jCboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTotal))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOk)
                    .addComponent(jBtnCancelar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtQuantidadeActionPerformed

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        // TODO add your handling code here:
        mbsCompraProduto = new MbsCompraProduto();
        mbsCompraProduto.setMbsProduto((MbsProduto) jCboProduto.getSelectedItem());
        mbsCompraProduto.setMbsQuantidade(Util.strInt(jTxtQuantidade.getText()));
        mbsCompraProduto.setMbsValorUnitario(Util.strDouble(jTxtValor.getText()));
        if (getTitle().toUpperCase().substring(0, 1).equals("I")) {
           
            jDlgMbsCompra.mbsCompraProdutoControle.addBean(mbsCompraProduto);
            Util.limparCampos(jCboProduto, jTxtQuantidade, jTxtValor);
        }
        else {
            jDlgMbsCompra.mbsCompraProdutoControle.updateBean(jDlgMbsCompra.getSelectedRowProd(), mbsCompraProduto);
            Util.limparCampos(jCboProduto, jTxtQuantidade, jTxtValor);
        }
        setVisible(false);        
    }//GEN-LAST:event_jBtnOkActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Util.mensagem("Cancelado com sucesso!");
        Util.limparCampos(jCboProduto, jTxtQuantidade ,jTxtValor , jTxtTotal);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTotalActionPerformed

    private void jTxtQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtQuantidadeKeyReleased
        // TODO add your handling code here:
        if(jTxtQuantidade.getText().isEmpty() == false ) {
            double unitario = Util.strDouble(jTxtValor.getText());
            double quantidade = Util.strDouble(jTxtQuantidade.getText());
            jTxtTotal.setText(String.valueOf(quantidade * unitario));
        } else {
            jTxtTotal.setText("0");
        }
        
    }//GEN-LAST:event_jTxtQuantidadeKeyReleased

    private void jTxtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtValorActionPerformed

    private void jCboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboProdutoActionPerformed

    private void jCboProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCboProdutoItemStateChanged
        // TODO add your handling code here:
        if (jCboProduto.getSelectedIndex() != -1) {
            jTxtQuantidade.setText("1");
            MbsProduto mbsProduto = (MbsProduto) jCboProduto.getSelectedItem();
            jTxtValor.setText(Util.doubleStr(mbsProduto.getMbsPreco()));
            jTxtTotal.setText(jTxtValor.getText());
        }
    }//GEN-LAST:event_jCboProdutoItemStateChanged

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
            java.util.logging.Logger.getLogger(jDlgMbsCompraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsCompraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsCompraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsCompraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jDlgMbsCompraProduto dialog = new jDlgMbsCompraProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JComboBox<MbsProduto> jCboProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTxtQuantidade;
    private javax.swing.JTextField jTxtTotal;
    private javax.swing.JTextField jTxtValor;
    // End of variables declaration//GEN-END:variables
}
