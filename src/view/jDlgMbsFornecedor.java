/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MbsFornecedor;
import dao.MbsFornecedorDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/**
 *
 * @author marcel
 */
public class jDlgMbsFornecedor extends javax.swing.JDialog {

    /**
     * Creates new form jDlgFornecedores
     */
    private boolean incluindo;
    MaskFormatter mascaraCnpj;
    MaskFormatter mascaraCep;
    MaskFormatter mascaraDataCadastro;
    MaskFormatter mascaraTelefone;

    public jDlgMbsFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Util.habilitar(false, jBtnConfirmar, jBtnCancelar, jTxtCodigo, jTxtNome, jFmtTelefone, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtGarantia, jTxtPais, jTxtCidade, jTxtEstado, jTxtRamoAtuacao, jFmtDatadeCadastro, jChbAtivo, jTxtObservacoes, jFmtCep);
        setTitle("Fornecedores");
        setLocationRelativeTo(null);
        try {
            mascaraCnpj = new MaskFormatter("##.###.###/0001-##");
            mascaraCep = new MaskFormatter("#####-###");
            mascaraDataCadastro = new MaskFormatter("##/##/####");
            mascaraTelefone = new MaskFormatter("(##)#####-####");
            
        } catch (ParseException ex) {
            Logger.getLogger(jDlgMbsUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCnpj.setFormatterFactory(new DefaultFormatterFactory(mascaraCnpj));
        jFmtCep.setFormatterFactory(new DefaultFormatterFactory(mascaraCep));
        jFmtDatadeCadastro.setFormatterFactory(new DefaultFormatterFactory(mascaraDataCadastro));
        jFmtTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraTelefone));
        
        
    }

    public void limparCampos() {
        jTxtCodigo.setText("");
        jTxtNome.setText("");
        jFmtTelefone.setText("");
        jTxtEmail.setText("");
        jFmtCnpj.setText("");
        jTxtEndereco.setText("");
        jTxtGarantia.setText("");
        jTxtPais.setText("");
        jTxtCidade.setText("");
        jTxtEstado.setText("");
        jTxtRamoAtuacao.setText("");
        jFmtDatadeCadastro.setText("");
        jChbAtivo.setSelected(false);
        jTxtObservacoes.setText("");
        jFmtCep.setText("");
    }

    public MbsFornecedor viewBean() {
        MbsFornecedor mbsfornecedor = new MbsFornecedor();
        int id = Integer.valueOf(jTxtCodigo.getText());
        mbsfornecedor.setMbsIdFornecedor(id);
        mbsfornecedor.setMbsNome(jTxtNome.getText());
        mbsfornecedor.setMbsTelefone(jFmtTelefone.getText());
        mbsfornecedor.setMbsEmail(jTxtEmail.getText());
        mbsfornecedor.setMbsCnpj(jFmtCnpj.getText());
        mbsfornecedor.setMbsEndereco(jTxtEndereco.getText());
        mbsfornecedor.setMbsGarantia(jTxtGarantia.getText());
        mbsfornecedor.setMbsPais(jTxtPais.getText());
        mbsfornecedor.setMbsCidade(jTxtCidade.getText());
        mbsfornecedor.setMbsEstado(jTxtEstado.getText());
        mbsfornecedor.setMbsRamoAtuacao(jTxtRamoAtuacao.getText());
        Date datacadas = Util.StrDate(jFmtDatadeCadastro.getText());
        mbsfornecedor.setMbsDataCadastro(datacadas);
        mbsfornecedor.setMbsAtivo(jChbAtivo.getText());
        mbsfornecedor.setMbsObservacoes(jTxtObservacoes.getText());
        mbsfornecedor.setMbsCep(jFmtCep.getText());
        mbsfornecedor.setMbsAtivo(jChbAtivo.isSelected() == true ? "S" : "N");
        return mbsfornecedor;
    }

    public void beanView(MbsFornecedor mbsfornecedor) {
        String valor = String.valueOf(mbsfornecedor.getMbsIdFornecedor());
        jTxtCodigo.setText(valor);
        jTxtNome.setText(mbsfornecedor.getMbsNome());
        jFmtTelefone.setText(mbsfornecedor.getMbsTelefone());
        jTxtEmail.setText(mbsfornecedor.getMbsEmail());
        jFmtCnpj.setText(mbsfornecedor.getMbsCnpj());
        jTxtEndereco.setText(mbsfornecedor.getMbsEndereco());
        jTxtGarantia.setText(mbsfornecedor.getMbsGarantia());
        jTxtPais.setText(mbsfornecedor.getMbsPais());
        jTxtCidade.setText(mbsfornecedor.getMbsCidade());
        jTxtEstado.setText(mbsfornecedor.getMbsEstado());
        jTxtRamoAtuacao.setText(mbsfornecedor.getMbsRamoAtuacao());
        String cadas = Util.dateStr(mbsfornecedor.getMbsDataCadastro());
        jFmtDatadeCadastro.setText(cadas);
        jChbAtivo.setText(mbsfornecedor.getMbsAtivo());
        jTxtObservacoes.setText(mbsfornecedor.getMbsObservacoes());
        jFmtCep.setText(mbsfornecedor.getMbsCep());

        if (mbsfornecedor.getMbsAtivo().equals("S") == true) {
            jChbAtivo.setSelected(true);
        } else {
            jChbAtivo.setSelected(false);
        }

    }
        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFmtCnpj = new javax.swing.JFormattedTextField();
        jTxtEmail = new javax.swing.JTextField();
        jFmtTelefone = new javax.swing.JFormattedTextField();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtGarantia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtPais = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtEstado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtObservacoes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtRamoAtuacao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jChbAtivo = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jFmtCep = new javax.swing.JFormattedTextField();
        jFmtDatadeCadastro = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setText("Email");

        jLabel14.setText("Telefone");

        jLabel1.setText("Nome");

        jLabel4.setText("CNPJ");

        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
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

        jTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Código");

        jTxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEnderecoActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço");

        jTxtGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtGarantiaActionPerformed(evt);
            }
        });

        jLabel5.setText("Garantia");

        jLabel6.setText("País");

        jTxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCidadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Cidade");

        jTxtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEstadoActionPerformed(evt);
            }
        });

        jLabel8.setText("Estado");

        jLabel10.setText("Observações");

        jTxtObservacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtObservacoesActionPerformed(evt);
            }
        });

        jLabel11.setText("Ramo de Atuação");

        jTxtRamoAtuacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRamoAtuacaoActionPerformed(evt);
            }
        });

        jLabel12.setText("Data de Cadastro");

        jChbAtivo.setText("Ativo");

        jLabel13.setText("Cep");

        jFmtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCepActionPerformed(evt);
            }
        });

        jFmtDatadeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDatadeCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addComponent(jFmtTelefone, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5)
                            .addComponent(jTxtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtDatadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFmtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel4))
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTxtObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54)
                                    .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jTxtRamoAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                                .addComponent(jChbAtivo))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnAlterar)
                                .addGap(10, 10, 10)
                                .addComponent(jBtnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnPesquisar)))
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFmtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtDatadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jChbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtRamoAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
         
        jDlgMbsFornecedorPesquisa jDlgFornecedorPesquisa = new jDlgMbsFornecedorPesquisa(null, true);
        jDlgFornecedorPesquisa.setTelaAnterior(this);
        jDlgFornecedorPesquisa.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        MbsFornecedor mbsfornecedor = viewBean();
        MbsFornecedorDAO fornecedorDAO = new MbsFornecedorDAO();
        if (incluindo == true) {
            fornecedorDAO.insert(mbsfornecedor);
        } else {
            fornecedorDAO.update(mbsfornecedor);
        }
        Util.habilitar(false, jTxtCodigo, jTxtNome, jFmtTelefone, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtGarantia, jTxtPais, jTxtCidade, jTxtEstado, jTxtRamoAtuacao, jFmtDatadeCadastro, jChbAtivo, jTxtObservacoes, jFmtCep);

        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        limparCampos();
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jTxtCodigo, jTxtNome, jFmtTelefone, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtGarantia, jTxtPais, jTxtCidade, jTxtEstado, jTxtRamoAtuacao, jFmtDatadeCadastro, jChbAtivo, jTxtObservacoes, jFmtCep);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        jBtnPesquisar.setEnabled(true);
        jBtnIncluir.setEnabled(true);

        limparCampos();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true,  jBtnConfirmar, jBtnCancelar, jTxtCodigo, jTxtNome, jFmtTelefone, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtGarantia, jTxtPais, jTxtCidade, jTxtEstado, jTxtRamoAtuacao, jFmtDatadeCadastro, jChbAtivo, jTxtObservacoes, jFmtCep);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        limparCampos();
        incluindo = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar, jTxtCodigo, jTxtNome, jFmtTelefone, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtGarantia, jTxtPais, jTxtCidade, jTxtEstado, jTxtRamoAtuacao, jFmtDatadeCadastro, jChbAtivo, jTxtObservacoes, jFmtCep);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluindo = false;
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jBtnConfirmar, jBtnCancelar, jTxtCodigo, jTxtNome, jFmtTelefone, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtGarantia, jTxtPais, jTxtCidade, jTxtEstado, jTxtRamoAtuacao, jFmtDatadeCadastro, jChbAtivo, jTxtObservacoes, jFmtCep);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro",
                "confirmar", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            MbsFornecedor mbsfornecedor = viewBean();
            MbsFornecedorDAO fornecedorDAO = new MbsFornecedorDAO();
            fornecedorDAO.delete(mbsfornecedor);
            Util.habilitar(false, jTxtCodigo, jTxtNome, jFmtTelefone, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtGarantia, jTxtPais, jTxtCidade, jTxtEstado, jTxtRamoAtuacao, jFmtDatadeCadastro, jChbAtivo, jTxtObservacoes, jFmtCep
);
        Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);

        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada ",
                    "alerta", 2
            );
        }
        limparCampos();

        jBtnConfirmar.setEnabled(false);
        jBtnAlterar.setEnabled(true);
        jBtnPesquisar.setEnabled(true);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCodigoActionPerformed

    private void jTxtGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtGarantiaActionPerformed

    private void jTxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEnderecoActionPerformed

    private void jTxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCidadeActionPerformed

    private void jTxtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEstadoActionPerformed

    private void jTxtObservacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtObservacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtObservacoesActionPerformed

    private void jTxtRamoAtuacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRamoAtuacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRamoAtuacaoActionPerformed

    private void jFmtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCepActionPerformed

    private void jFmtDatadeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDatadeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDatadeCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(jDlgMbsFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jDlgMbsFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                jDlgMbsFornecedor dialog = new jDlgMbsFornecedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JCheckBox jChbAtivo;
    private javax.swing.JFormattedTextField jFmtCep;
    private javax.swing.JFormattedTextField jFmtCnpj;
    private javax.swing.JFormattedTextField jFmtDatadeCadastro;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtEstado;
    private javax.swing.JTextField jTxtGarantia;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtObservacoes;
    private javax.swing.JTextField jTxtPais;
    private javax.swing.JTextField jTxtRamoAtuacao;
    // End of variables declaration//GEN-END:variables
}
