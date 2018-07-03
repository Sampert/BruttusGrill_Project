/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brutus.view;

import br.com.brutus.bean.Cliente;
import br.com.brutus.bean.Pedido;
import br.com.brutus.bean.PedidoProduto;
import br.com.brutus.bean.Produto;
import br.com.brutus.dao.ClienteDaoImpl;
import br.com.brutus.dao.EnderecoDaoImpl;
import br.com.brutus.dao.PedidoProdutoDao;
import br.com.brutus.dao.PedidoProdutoDaoImpl;
import br.com.brutus.dao.ProdutoDaoImpl;
import br.com.brutus.dao.UsuarioDaoImpl;
import br.com.brutus.util.CalcularValor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thiag
 */
public class JanelaNovoPedido extends javax.swing.JFrame {

    private EntityManager entityManagem;
    private ClienteDaoImpl cdi;
    private EnderecoDaoImpl edi;
    private ProdutoDaoImpl pdi;
    private DefaultTableModel clienteTableModel;
    private DefaultTableModel produtoTableModel;
    private DefaultTableModel pedidoTableModel;
    private Pedido pedido = new Pedido();
    private CalcularValor cv = new CalcularValor();
    private Cliente cliente;
    private Produto produto;
    private DefaultTableModel prodPedido;
    private List<Produto> produtos = new ArrayList<>();

    /**
     * Creates new form JanelaNovoPedido
     */
    public JanelaNovoPedido() {
        initComponents();
    }

    public JanelaNovoPedido(EntityManager em, ClienteDaoImpl cdi, EnderecoDaoImpl edi, DefaultTableModel dtm, ProdutoDaoImpl pdi, DefaultTableModel pedtm) {
        initComponents();
        this.setTitle("Novo pedido");
        this.prodPedido = (DefaultTableModel) this.tableProdPedido.getModel();
        this.produtoTableModel = (DefaultTableModel) this.tableProd.getModel();
        this.entityManagem = em;
        this.cdi = cdi;
        this.edi = edi;
        this.clienteTableModel = dtm;
        this.pedidoTableModel = pedtm;
        this.pdi = pdi;
        preencherTabelaProduto();
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
        labelTitulo = new javax.swing.JLabel();
        labelAvisoErroLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelCpf = new javax.swing.JLabel();
        textCpf = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        labelPeso = new javax.swing.JLabel();
        textPeso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProd = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textTotal = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        combFormaPagamento = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProdPedido = new javax.swing.JTable();
        labelEstoque = new javax.swing.JLabel();
        labelPedido = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelTitulo.setText("Novo Pedido");

        labelAvisoErroLogin.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        labelAvisoErroLogin.setForeground(new java.awt.Color(255, 0, 0));

        labelCpf.setText("CPF:");

        labelNome.setText("NOME:");

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/brutus/icons/find_new_users.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        labelPeso.setText("PESO:(KG)");

        tableProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Preço (KG)"
            }
        ));
        jScrollPane1.setViewportView(tableProd);

        jLabel1.setText("TOTAL:");

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/brutus/icons/add.png"))); // NOI18N
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/brutus/icons/xVermelho.png"))); // NOI18N
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        jLabel2.setText("FORMA DE PAGAMENTO:");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        combFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Débito", "Crédito a vista", "Crédito 2x" }));

        tableProdPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Peso", "Valor Total"
            }
        ));
        jScrollPane2.setViewportView(tableProdPedido);

        labelEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEstoque.setText("ESTOQUE:");

        labelPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPedido.setText("PEDIDO:");

        labelAviso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelAviso.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPedido)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelPeso)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelCpf)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelNome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(combFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btPesquisar))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelEstoque)
                                        .addGap(91, 91, 91)
                                        .addComponent(labelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(labelAvisoErroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(labelTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAvisoErroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCpf)
                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPeso)
                    .addComponent(textPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(combFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEstoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAdd)
                        .addGap(204, 204, 204)
                        .addComponent(btDeletar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btInserir)
                            .addComponent(btSair)
                            .addComponent(jLabel1)
                            .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

        if (this.textNome.getText().equals("") && !this.textCpf.getText().equals("")) {
            try {

                String cpfInteiro = this.textCpf.getText();
                String[] filtered = cpfInteiro.split("");

                String cpf = "";

                if (filtered.length == 14) {
                    cpf = filtered[0];
                    cpf += filtered[1];
                    cpf += filtered[2];
                    cpf += filtered[3];
                    cpf += filtered[4];
                    cpf += filtered[5];
                    cpf += filtered[6];
                    cpf += filtered[7];
                    cpf += filtered[8];
                    cpf += filtered[9];
                    cpf += filtered[10];
                    cpf += filtered[11];
                    cpf += filtered[12];
                    cpf += filtered[13];
                } else if (filtered.length == 11) {
                    cpf = filtered[0];
                    cpf += filtered[1];
                    cpf += filtered[2];
                    cpf += ".";
                    cpf += filtered[3];
                    cpf += filtered[4];
                    cpf += filtered[5];
                    cpf += ".";
                    cpf += filtered[6];
                    cpf += filtered[7];
                    cpf += filtered[8];
                    cpf += "-";
                    cpf += filtered[9];
                    cpf += filtered[10];
                } else {
                    JOptionPane.showMessageDialog(null, "CPF Invalido");
                }

                List<Cliente> clientes = this.cdi.pesquisarPorCpf(cpf);
                for (int i = 0; i < clientes.size(); i++) {
                    if (clientes.get(i).getCpf().equalsIgnoreCase(cpf)) {
                        this.cliente = clientes.get(i);
                        this.textCpf.setText(clientes.get(i).getCpf());
                        this.textNome.setText(clientes.get(i).getNome());
                    }
                }

            } catch (Exception e) {
                JanelaPerguntaCriarNovoCliente jpcc = new JanelaPerguntaCriarNovoCliente(this.entityManagem, this.cdi, this.edi, this.clienteTableModel);
                jpcc.setVisible(true);
            }
        } else if (this.textCpf.getText().equals("") && !this.textNome.getText().equals("")) {
            try {
                String nome = this.textNome.getText();
                List<Cliente> clientes = this.cdi.pesquisarPorNome(this.textNome.getText());
                for (int i = 0; i < clientes.size(); i++) {
                    if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                        this.cliente = clientes.get(i);
                        this.textCpf.setText(this.cliente.getCpf());
                    }
                }
            } catch (Exception e) {
                JanelaPerguntaCriarNovoCliente jpcc = new JanelaPerguntaCriarNovoCliente(this.entityManagem, this.cdi, this.edi, this.clienteTableModel);
                jpcc.setVisible(true);
            }
        } else {
            JanelaPerguntaCriarNovoCliente jpcc = new JanelaPerguntaCriarNovoCliente(this.entityManagem, this.cdi, this.edi, this.clienteTableModel);
            jpcc.setVisible(true);
        }

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed

        int[] linhasSelecionadas = this.tableProd.getSelectedRows();

        for (int i = 0; i < linhasSelecionadas.length; i++) {

            this.prodPedido.removeRow(linhasSelecionadas[i]);

            for (int j = i + 1; j < linhasSelecionadas.length; j++) {

                linhasSelecionadas[j] = linhasSelecionadas[j] - 1;
            }
        }

    }//GEN-LAST:event_btDeletarActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed

        Double peso = Double.parseDouble(this.textPeso.getText());
        Double valor = 0.0;
        Double valorTotal = 0.0;

        int[] linhasSelecionadas = this.tableProd.getSelectedRows();

        for (int i = 0; i < linhasSelecionadas.length; i++) {

            int id = (int) this.produtoTableModel.getValueAt(linhasSelecionadas[i], 0);
            this.produto = (Produto) this.pdi.searchById(Produto.class, id);
            valor = this.cv.calcularValor(produto.getValor(), peso);
            valorTotal += valor;
            for (int j = i + 1; j < linhasSelecionadas.length; j++) {

                linhasSelecionadas[j] = linhasSelecionadas[j] - 1;
            }
        }
        this.prodPedido.addRow(new Object[]{this.produto.getId(), this.produto.getNome(), peso, valor});
        this.textTotal.setText(valorTotal.toString());
    }//GEN-LAST:event_btAddActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed

        PedidoProdutoDaoImpl ppdi = new PedidoProdutoDaoImpl(entityManagem);
        Double valorTotal = 0.0;
        if (!this.textCpf.getText().equals("") && !this.textNome.getText().equals("") && !this.textPeso.getText().equals("")) {
            this.pedido.setCliente(this.cliente);
            this.pedido.setDtPedido(new Date());
            this.pedido.setFormaPagamento(this.combFormaPagamento.getSelectedItem().toString());

            for (int i = 0; i < tableProdPedido.getRowCount(); i++) {
                valorTotal = valorTotal + Double.parseDouble(tableProdPedido.getValueAt(i, 3).toString());
            }
            this.pedido.setValorTotal(valorTotal);
            this.pdi.save(this.pedido);
            
            for (int item = 0; item < tableProdPedido.getRowCount(); item++) {

                PedidoProduto pp = new PedidoProduto();

                pp.setPedido(this.pedido);
                pp.setProduto(this.produto = (Produto) this.pdi.searchById(Produto.class, Integer.parseInt(tableProdPedido.getValueAt(item, 0).toString())));
                pp.setPeso(Double.parseDouble(tableProdPedido.getValueAt(item, 2).toString()));
                pp.setValor(Double.parseDouble(tableProdPedido.getValueAt(item, 3).toString()));
                ppdi.save(pp);
            }
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            this.pedidoTableModel.addRow(new Object[]{pedido.getId(), cliente.getNome(),
                pedido.getValorTotal(), formatador.format(pedido.getDtPedido()), pedido.getFormaPagamento()});
            this.dispose();
        } else {
            this.labelAviso.setText("Preencha todos os campos!");
        }

    }//GEN-LAST:event_btInserirActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void preencherTabelaProduto() {

        List<Produto> produtos = this.pdi.pesquisarTodosProdutos();
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);

            this.produtoTableModel.addRow(new Object[]{produto.getId(), produto.getNome(), produto.getValor()});
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox combFormaPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelAvisoErroLogin;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEstoque;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPedido;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableProd;
    private javax.swing.JTable tableProdPedido;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textPeso;
    private javax.swing.JTextField textTotal;
    // End of variables declaration//GEN-END:variables
}