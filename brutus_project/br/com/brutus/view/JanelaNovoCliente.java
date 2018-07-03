/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.view;

import br.com.brutus.bean.Cliente;
import br.com.brutus.bean.Endereco;
import br.com.brutus.dao.ClienteDaoImpl;
import br.com.brutus.dao.EnderecoDaoImpl;
import java.awt.Color;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thiag
 */
public class JanelaNovoCliente extends javax.swing.JFrame {

    private EntityManager entityManager;
    private ClienteDaoImpl clienteDaoImpl;
    private EnderecoDaoImpl enderecoDaoImpl;
    private DefaultTableModel tableModelCliente;

    /**
     * Creates new form JanelaNovoCliente
     */
    public JanelaNovoCliente() {
        initComponents();
    }

    public JanelaNovoCliente(EntityManager em, ClienteDaoImpl cdi, EnderecoDaoImpl edi, DefaultTableModel dtm) {
        initComponents();
        this.setTitle("Cadastro de cliente");
        this.entityManager = em;
        this.clienteDaoImpl = cdi;
        this.enderecoDaoImpl = edi;
        this.tableModelCliente = dtm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        btInsert = new javax.swing.JButton();
        labelTelefone = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        labelRua = new javax.swing.JLabel();
        textRua = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        textNumeroRua = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        textBairro = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        textCidade = new javax.swing.JTextField();
        labelUf = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();
        textPais = new javax.swing.JTextField();
        labelDadosAluno = new javax.swing.JLabel();
        labelDadosEndereco = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        labelEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        comboBoxUf = new javax.swing.JComboBox();
        labelAvisoSexo = new javax.swing.JLabel();
        labelErroIdade = new javax.swing.JLabel();
        logoBrutus = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        labelCpf = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Cliente");

        labelNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelNome.setText("NOME:");

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        btInsert.setText("Inserir");
        btInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertActionPerformed(evt);
            }
        });

        labelTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelTelefone.setText("TELEFONE:");

        labelRua.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelRua.setText("RUA:");

        textRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRuaActionPerformed(evt);
            }
        });

        labelNumero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelNumero.setText("NÚMERO:");

        labelBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelBairro.setText("BAIRRO:");

        textBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBairroActionPerformed(evt);
            }
        });

        labelCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelCidade.setText("CIDADE:");

        textCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCidadeActionPerformed(evt);
            }
        });

        labelUf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelUf.setText("UF:");

        labelPais.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPais.setText("PAÍS:");

        textPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaisActionPerformed(evt);
            }
        });

        labelDadosAluno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelDadosAluno.setText("DADOS CLIENTE:");

        labelDadosEndereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelDadosEndereco.setText("DADOS ENDEREÇO:");

        labelEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEmail.setText("EMAIL:");

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        comboBoxUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RN", "RS", "RJ", "RO", "RR", "SC", "SP", "SE", "TO" }));

        labelAvisoSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAvisoSexo.setForeground(new java.awt.Color(255, 0, 0));

        labelErroIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelErroIdade.setForeground(new java.awt.Color(255, 0, 0));

        logoBrutus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/brutus/icons/brutusgrill.png"))); // NOI18N

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        labelCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelCpf.setText("CPF:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDadosAluno)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(labelUf)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2)
                                            .addComponent(labelPais)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textPais))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelBairro)
                                                .addComponent(labelRua))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                    .addComponent(textRua)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(labelNumero)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textNumeroRua, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                    .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(labelCidade)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(labelDadosEndereco, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelEmail)
                                            .addComponent(labelCpf)
                                            .addComponent(labelNome))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(textCpf)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelTelefone)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(textEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                                            .addComponent(textNome)))))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelErroIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelAvisoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(btInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(logoBrutus))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(labelAvisoSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelErroIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoBrutus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDadosAluno)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCpf)
                        .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTelefone)
                        .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDadosEndereco)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRua)
                    .addComponent(textRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero)
                    .addComponent(textNumeroRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBairro)
                    .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCidade)
                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUf)
                    .addComponent(labelPais)
                    .addComponent(textPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInsert)
                    .addComponent(btSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void btInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertActionPerformed

        boolean teste = true;

        if (this.textNome.getText().equals("")) {
            this.labelNome.setForeground(Color.RED);
            teste = false;
        } else {
            this.labelNome.setForeground(Color.BLACK);
        }
        if (this.textCpf.getText().equals("")) {
            this.labelCpf.setForeground(Color.RED);
            teste = false;
        } else {
            this.labelCpf.setForeground(Color.BLACK);
        }
        
        
//        if (this.textTelefone.getText().equals("")) {
//            this.labelTelefone.setForeground(Color.RED);
//            teste = false;
//        } else {
//            this.labelTelefone.setForeground(Color.BLACK);
//        }
//        if (this.textEmail.getText().equals("")) {
//            this.labelEmail.setForeground(Color.RED);
//            teste = false;
//        } else {
//            this.labelEmail.setForeground(Color.BLACK);
//        }
//        if (this.textRua.getText().equals("")) {
//            this.labelRua.setForeground(Color.RED);
//            teste = false;
//        } else {
//            this.labelRua.setForeground(Color.BLACK);
//        }
//        if (this.textNumeroRua.getText().equals("")) {
//            this.labelNumero.setForeground(Color.RED);
//            teste = false;
//        } else {
//            this.labelNumero.setForeground(Color.BLACK);
//        }
//        if (this.textCidade.getText().equals("")) {
//            this.labelCidade.setForeground(Color.RED);
//            teste = false;
//        } else {
//            this.labelCidade.setForeground(Color.BLACK);
//        }
//        if (this.textBairro.getText().equals("")) {
//            this.labelBairro.setForeground(Color.RED);
//            teste = false;
//        } else {
//            this.labelBairro.setForeground(Color.BLACK);
//        }
//        if (this.textPais.getText().equals("")) {
//            this.labelPais.setForeground(Color.RED);
//            teste = false;
//        } else {
//            this.labelPais.setForeground(Color.BLACK);
//        }

        if (teste) {

            this.inserirDadosBd(this.textNome.getText(), this.textCpf.getText(), this.textTelefone.getText(), this.textEmail.getText(),
                    this.textRua.getText(), this.textNumeroRua.getText(), this.textBairro.getText(),
                    this.textCidade.getText(), this.comboBoxUf.getSelectedItem().toString(), this.textPais.getText());

            this.textNome.setText("");
            this.textCpf.setText("");
            this.textTelefone.setText("");
            this.textEmail.setText("");
            this.textRua.setText("");
            this.textNumeroRua.setText("");
            this.textCidade.setText("");
            this.textBairro.setText("");
            this.textPais.setText("");
            this.labelAvisoSexo.setText("");
            this.labelErroIdade.setText("");
        }
    }//GEN-LAST:event_btInsertActionPerformed

    private void textRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRuaActionPerformed

    private void textBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBairroActionPerformed

    private void textCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCidadeActionPerformed

    private void textPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPaisActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox comboBoxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelAvisoSexo;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDadosAluno;
    private javax.swing.JLabel labelDadosEndereco;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelErroIdade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUf;
    private javax.swing.JLabel logoBrutus;
    private javax.swing.JTextField textBairro;
    private javax.swing.JTextField textCidade;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNumeroRua;
    private javax.swing.JTextField textPais;
    private javax.swing.JTextField textRua;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables

    private void inserirDadosBd(String nome, String cpf, String telefone, String email, String rua, String numero,
            String bairro, String cidade, String uf, String pais) {

        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setUf(uf);
        endereco.setPais(pais);
        this.enderecoDaoImpl.save(endereco);

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        this.clienteDaoImpl.save(cliente);
        this.tableModelCliente.addRow(new Object[]{cliente.getId(),
            nome, telefone, email, rua, numero, bairro, cidade, uf, pais});
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!"
                + "\nNumero: " + cliente.getId() + ""
                + "\nCliente: " + nome);
        this.dispose();
    }
}