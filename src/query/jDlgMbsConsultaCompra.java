/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import bean.MbsCompra;
import bean.MbsFornecedor;
import bean.MbsFornecedor;
import controle.MbsCompraControle;
import dao.MbsCompraDAO;
import dao.MbsFornecedorDAO;
import java.util.List;
import tools.Util;
import view.jDlgMbsCompra;


/**
 *
 * @author USER
 */
public class jDlgMbsConsultaCompra extends javax.swing.JDialog {
    private jDlgMbsCompra jDlgMbsCompra;
    private MbsCompraControle mbsCompraControle;
    private MbsCompraDAO mbsCompraDAO;
    /**
     * Creates new form jDlgConsultaUsuarios
     */
    public jDlgMbsConsultaCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Consulta de Clientes");
        mbsCompraControle = new MbsCompraControle();
        mbsCompraDAO = new MbsCompraDAO();
        List lista = mbsCompraDAO.listAll();
        mbsCompraControle.setList(lista);
        jTblTabelaColsulta.setModel(mbsCompraControle);
        
        MbsFornecedorDAO mbsFornecedorDAO = new MbsFornecedorDAO();
        List listaFo = mbsFornecedorDAO.listAll();
        for (int i = 0; i < listaFo.size(); i++) {
            jCboFornecedor.addItem((MbsFornecedor) listaFo.get(i));
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTxtPrecoCompra = new javax.swing.JTextField();
        jBtnConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCboFornecedor = new javax.swing.JComboBox<MbsFornecedor>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblTabelaColsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Fornecedor");

        jTxtPrecoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPrecoCompraActionPerformed(evt);
            }
        });

        jBtnConsultar.setText("Consultar");
        jBtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço Compra");

        jCboFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtPrecoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnConsultar)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtPrecoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConsultar)
                    .addComponent(jCboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTblTabelaColsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Data Cadastro", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(jTblTabelaColsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarActionPerformed
        if (jCboFornecedor.getSelectedItem() == null && jTxtPrecoCompra.getText().equals("")) {
            List lista = mbsCompraDAO.listAll();
            mbsCompraControle.setList(lista);
        } else {
            if (jCboFornecedor.getSelectedItem() != null && !jTxtPrecoCompra.getText().equals("")) {
                MbsFornecedor mbsFornecedor = (MbsFornecedor) jCboFornecedor.getSelectedItem();
                double valor = Util.strDouble(jTxtPrecoCompra.getText());
                jTxtPrecoCompra.setText(String.valueOf(valor));
                List lista = mbsCompraDAO.listFornecedorPreco(mbsFornecedor.getMbsIdFornecedor(), valor);
                mbsCompraControle.setList(lista);
            } else {
                if (jCboFornecedor.getSelectedItem() != null) {
                    MbsFornecedor mbsFornecedor = (MbsFornecedor) jCboFornecedor.getSelectedItem();
                    List lista = mbsCompraDAO.listFornecedor(mbsFornecedor.getMbsIdFornecedor());
                    mbsCompraControle.setList(lista);
                }
                if (!jTxtPrecoCompra.getText().equals("")) {
                    double preco = Util.strDouble(jTxtPrecoCompra.getText());
                    jTxtPrecoCompra.setText(String.valueOf(preco));
                    List lista = mbsCompraDAO.listPreco(preco);
                    mbsCompraControle.setList(lista);
                }
            }
        }
    }//GEN-LAST:event_jBtnConsultarActionPerformed

    private void jTxtPrecoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPrecoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPrecoCompraActionPerformed

    private void jCboFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(jDlgMbsConsultaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsConsultaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsConsultaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsConsultaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jDlgMbsConsultaCompra dialog = new jDlgMbsConsultaCompra(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnConsultar;
    private javax.swing.JComboBox<MbsFornecedor> jCboFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblTabelaColsulta;
    private javax.swing.JTextField jTxtPrecoCompra;
    // End of variables declaration//GEN-END:variables
}
