/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MbsCompra;
import bean.MbsCompraProduto;
import bean.MbsFornecedor;
import bean.MbsFuncionario;
import controle.MbsCompraControle;
import controle.MbsCompraProdutoControle;
import dao.MbsCompraDAO;
import dao.MbsCompraProdutoDAO;
import dao.MbsFornecedorDAO;
import dao.MbsFuncionarioDAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author marcelbenitezdasilva
 */
public class jDlgMbsCompra extends javax.swing.JDialog {

    /**
     * Creates new form jDlgMbsPedidosProdutos
     */
    private boolean incluindo;
    MaskFormatter mascaraMbsDataCompra;

    public MbsCompra mbsCompra = new MbsCompra();
    public MbsCompraDAO mbsCompraDAO = new MbsCompraDAO();
    public MbsCompraProduto mbsCompraProduto = new MbsCompraProduto();
    public MbsCompraProdutoDAO mbsCompraProdutoDAO = new MbsCompraProdutoDAO();
    public MbsCompraControle mbsCompraControle = new MbsCompraControle();
    public MbsCompraProdutoControle mbsCompraProdutoControle = new MbsCompraProdutoControle();

    public jDlgMbsCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Tela de Compras");
        List lista = new ArrayList();
        Util.habilitar(false, jTxtCompra, jTxtTotal, jFmtData, jCboFornecedor, jCboFuncionario, jTxtQuantidade, jBtnConfirmar, jBtnCancelar,jBtnIncluirProd, jBtnExcluirProd, jBtnAlterarProd);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        setLocationRelativeTo(null);
        List listaprod = mbsCompraProdutoDAO.listAll();
        mbsCompraProdutoControle.setList(lista);
        jTable1.setModel(mbsCompraProdutoControle);

        MbsFornecedorDAO mbsFornecedorDAO = new MbsFornecedorDAO();
        List listaFor = mbsFornecedorDAO.listAll();
        for (int i = 0; i < listaFor.size(); i++) {
            jCboFornecedor.addItem((MbsFornecedor) listaFor.get(i));
        }

        MbsFuncionarioDAO mbsFuncionarioDAO = new MbsFuncionarioDAO();
        List listaFu = mbsFuncionarioDAO.listAll();
        for (int i = 0; i < listaFu.size(); i++) {
            jCboFuncionario.addItem((MbsFuncionario) listaFu.get(i));
        }
        try {
            mascaraMbsDataCompra = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            Logger.getLogger(jDlgMbsUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraMbsDataCompra));

    }

    public int getSelectedRowProd() {
        return jTable1.getSelectedRow();
    }

    public MbsCompra viewBean() {

        MbsCompra mbscompra = new MbsCompra();
        int id = Util.strInt(jTxtCompra.getText());
        mbscompra.setMbsIdCompra(id);
        Date datacomp = Util.StrDate(jFmtData.getText());
        mbscompra.setMbsDataCompra(datacomp);
        mbscompra.setMbsFornecedor((MbsFornecedor) jCboFornecedor.getSelectedItem());
        mbscompra.setMbsFuncionario((MbsFuncionario) jCboFuncionario.getSelectedItem());
        mbscompra.setMbsQuantidadeCompra(Util.strInt(jTxtQuantidade.getText()));
        mbscompra.setMbsPrecoCompra(Util.strDouble(jTxtTotal.getText()));

        return mbscompra;

    }

    public void beanView(MbsCompra mbsCompra) {

        String id = Util.intStr(mbsCompra.getMbsIdCompra());
        jTxtCompra.setText(id);
        String datecomp = Util.dateStr(mbsCompra.getMbsDataCompra());
        jFmtData.setText(datecomp);
        jCboFornecedor.setSelectedItem(mbsCompra.getMbsFornecedor());
        jCboFuncionario.setSelectedItem(mbsCompra.getMbsFuncionario());
        jTxtQuantidade.setText(Util.intStr(mbsCompra.getMbsQuantidadeCompra()));
        jTxtTotal.setText(Util.doubleStr((mbsCompra.getMbsPrecoCompra())));

        MbsCompraProdutoDAO mbsCompraProdutoDAO = new MbsCompraProdutoDAO();
        List listaProd = (List) mbsCompraProdutoDAO.listProduto(mbsCompra);

        mbsCompraProdutoControle.setList(listaProd);
    }

    /**
     *
     * @return
     */
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
        jLabel5 = new javax.swing.JLabel();
        jTxtCompra = new javax.swing.JTextField();
        jCboFornecedor = new javax.swing.JComboBox<MbsFornecedor>();
        jCboFuncionario = new javax.swing.JComboBox<MbsFuncionario>();
        jTxtTotal = new javax.swing.JTextField();
        jFmtData = new javax.swing.JFormattedTextField();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnIncluirProd = new javax.swing.JButton();
        jBtnAlterarProd = new javax.swing.JButton();
        jBtnExcluirProd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTxtQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Num. Compra");

        jLabel2.setText("Data");

        jLabel3.setText("Fornecedor");

        jLabel4.setText("Funcionario");

        jLabel5.setText("Preço Compra");

        jTxtCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCompraActionPerformed(evt);
            }
        });

        jCboFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboFornecedorActionPerformed(evt);
            }
        });

        jTxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTotalActionPerformed(evt);
            }
        });

        jFmtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDataActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar_preto.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir_preto.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar_preto.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar_preto.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir_preto.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar_preto.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBtnIncluirProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir_preto.png"))); // NOI18N
        jBtnIncluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirProdActionPerformed(evt);
            }
        });

        jBtnAlterarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar_preto.png"))); // NOI18N
        jBtnAlterarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarProdActionPerformed(evt);
            }
        });

        jBtnExcluirProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir_preto.png"))); // NOI18N
        jBtnExcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirProdActionPerformed(evt);
            }
        });

        jLabel6.setText("Quantidade Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnConfirmar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnPesquisar))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnIncluirProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnAlterarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnExcluirProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtCompra)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jCboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jCboFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtQuantidade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jBtnIncluirProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterarProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnExcluirProd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCboFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboFornecedorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCboFornecedorActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        jDlgMbsCompraPesquisa jDlgMbsCompraPesquisa = new jDlgMbsCompraPesquisa(null, true);
        jDlgMbsCompraPesquisa.setTelaAnterior(this);
        jDlgMbsCompraPesquisa.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if (mbsCompra != null) {
            if (Util.perguntar("Deseja excluir a Compra?") == true) {
                MbsCompraProdutoDAO mbsCompraProdutoDAO = new MbsCompraProdutoDAO();
                MbsCompraProduto mbsCompraProduto;
                for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                    mbsCompraProduto = mbsCompraProdutoControle.getBean(linha);
                    mbsCompraProdutoDAO.delete(mbsCompraProduto);
                }
                mbsCompraProdutoDAO.delete(mbsCompra);
            } else {
                Util.mensagem("Deve ser realizada uma pesquisa antes");
            }
            Util.limparCampos(jTxtCompra, jFmtData, jCboFornecedor, jCboFuncionario, jTxtQuantidade, jTxtTotal, jBtnConfirmar, jBtnCancelar);
            mbsCompraProdutoControle.setList(new ArrayList());
        }

    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        mbsCompra = viewBean();
        if (incluindo == true) {
            mbsCompraDAO.insert(mbsCompra);
            MbsCompraProdutoDAO mbsCompraProdutoDAO = new MbsCompraProdutoDAO();
            MbsCompraProduto mbsCompraProduto;
            for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                mbsCompraProduto = mbsCompraProdutoControle.getBean(linha);
                mbsCompraProduto.setMbsCompra(mbsCompra);
                mbsCompraProdutoDAO.insert(mbsCompraProduto);
            }
        } else {
           mbsCompraDAO.update(mbsCompra);
            List<MbsCompraProduto> produtosDaVenda = mbsCompraProdutoDAO.listProduto(mbsCompra);           
            for (MbsCompraProduto produto : produtosDaVenda) {
                mbsCompraProdutoDAO.delete(produto);
            }            
            for (int linha = 0; linha < jTable1.getRowCount(); linha++) {
                mbsCompraProduto = mbsCompraProdutoControle.getBean(linha);
                mbsCompraProduto.setMbsCompra(mbsCompra);
                mbsCompraProdutoDAO.insert(mbsCompraProduto);

        }
            }
        mbsCompraProdutoControle.setList(new ArrayList());
        Util.habilitar(false, jTxtCompra, jTxtTotal, jFmtData, jCboFornecedor, jCboFuncionario, jTxtQuantidade, jBtnConfirmar, jBtnCancelar,jBtnIncluirProd, jBtnExcluirProd, jBtnAlterarProd);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampos(jTxtCompra, jTxtTotal, jFmtData, jCboFornecedor, jCboFuncionario, jTxtQuantidade);
        
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jTxtCompra, jTxtTotal, jFmtData, jCboFornecedor, jCboFuncionario, jTxtQuantidade, jBtnConfirmar, jBtnCancelar,jBtnIncluirProd, jBtnExcluirProd, jBtnAlterarProd);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.mensagem("Cancelado com sucesso!");
        Util.limparCampos(jTxtCompra, jTxtTotal, jFmtData, jCboFornecedor, jCboFuncionario, jTxtQuantidade);
        mbsCompraProdutoControle.setList(new ArrayList());
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        mbsCompraProdutoControle.setList(new ArrayList());
        Util.habilitar(true, jTxtCompra, jTxtTotal, jFmtData, jCboFornecedor, jCboFuncionario, jTxtQuantidade, jBtnConfirmar, jBtnCancelar,jBtnIncluirProd, jBtnExcluirProd, jBtnAlterarProd);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.limparCampos(jTxtCompra, jTxtTotal, jFmtData, jCboFornecedor, jCboFuncionario, jTxtQuantidade);
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtCompra, jTxtTotal, jFmtData, jCboFornecedor, jCboFuncionario, jTxtQuantidade, jBtnConfirmar, jBtnCancelar,jBtnIncluirProd, jBtnExcluirProd, jBtnAlterarProd);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluindo = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jTxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTotalActionPerformed

    private void jFmtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDataActionPerformed

    private void jTxtCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCompraActionPerformed

    private void jBtnIncluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirProdActionPerformed
        // TODO add your handling code here:
        jDlgMbsCompraProduto compraproduto = new jDlgMbsCompraProduto(new javax.swing.JFrame(), true);
        compraproduto.setTitle("Inclusão");
        compraproduto.setIncluindo(true);
        compraproduto.setTelaAnterior(this);
        compraproduto.setVisible(true);
    }//GEN-LAST:event_jBtnIncluirProdActionPerformed

    private void jBtnAlterarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarProdActionPerformed
        // TODO add your handling code here:
        int rowSel = jTable1.getSelectedRow();
        if (rowSel != -1) {
            mbsCompraProduto = mbsCompraProdutoControle.getBean(rowSel);

            jDlgMbsCompraProduto compraproduto = new jDlgMbsCompraProduto(new javax.swing.JFrame(), true);
            compraproduto.setTitle("Alteração");
            compraproduto.setIncluindo(false);
            compraproduto.setTelaAnterior(this);
            compraproduto.beanView(mbsCompraProduto);

            compraproduto.setVisible(true);
        } else {
            Util.mensagem("Selecione um Registro para poder ser Alterado.");
        }
    }//GEN-LAST:event_jBtnAlterarProdActionPerformed

    private void jBtnExcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirProdActionPerformed
        // TODO add your handling code here:
        MbsCompraProdutoControle mbsCompraProdutoControle = new MbsCompraProdutoControle();
        int linha = jTable1.getSelectedRow();
        if (linha == -1) {
            Util.mensagem("Selecione uma linha para oder Excluir");
        } else {
            if (Util.perguntar("Deseja Confirmar a Exclusão do Produto") == true) {
                mbsCompraProdutoControle.removeBean(linha);
            }
        }
        Util.mensagem("Produto Excluido com Sucesso");
        ((MbsCompraProdutoControle) jTable1.getModel()).removeBean(linha);

    }//GEN-LAST:event_jBtnExcluirProdActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            jBtnConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(jDlgMbsCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jDlgMbsCompra dialog = new jDlgMbsCompra(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterarProd;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnExcluirProd;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnIncluirProd;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<MbsFornecedor> jCboFornecedor;
    private javax.swing.JComboBox<MbsFuncionario> jCboFuncionario;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCompra;
    private javax.swing.JTextField jTxtQuantidade;
    private javax.swing.JTextField jTxtTotal;
    // End of variables declaration//GEN-END:variables
}
