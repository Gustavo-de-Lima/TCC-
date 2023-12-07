package GUI;

import Controller.*;
import Controller.VendaController;
import GUI.ProdutoConsultaView;
import Model.Pessoas.Cliente;
import Model.Produto.Produto;
import Model.Venda.ItemVenda;
import Model.Venda.Venda;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/*
*@author – GabrielaYamamoto
 */
public class VendaView extends javax.swing.JInternalFrame {
//==============================================================================
//NAO MEXER
//==============================================================================  
    //INICIALIZAÇÃO DOS COMPONENTES

    public VendaView() {
        initComponents();
    }

    //CÓDIGO GERADOR DA INTERFACE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        lbSairVenda = new javax.swing.JLabel();
        lbProdutoNome = new javax.swing.JLabel();
        txtProdutoNome = new javax.swing.JTextField();
        lbProdutoQuantidade = new javax.swing.JLabel();
        jsProdutoQuantidade = new javax.swing.JSpinner();
        lbProdutoValorUnitario = new javax.swing.JLabel();
        txtProdutoValorUnitario = new javax.swing.JTextField();
        lbProdutoValorTotal = new javax.swing.JLabel();
        txtClienteId = new javax.swing.JTextField();
        lbVendaClienteCpf = new javax.swing.JLabel();
        btAdicionarItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        jpDadosCliente = new javax.swing.JPanel();
        txtClienteNomeInfo = new javax.swing.JTextField();
        txtClienteCpfInfo = new javax.swing.JTextField();
        txtClienteCidadeInfo = new javax.swing.JTextField();
        txtClienteLogradouroInfo = new javax.swing.JTextField();
        txtClienteNumeroInfo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbDinheiro = new javax.swing.JCheckBox();
        txtPagamentoDinheiro = new javax.swing.JFormattedTextField();
        cbCartão = new javax.swing.JCheckBox();
        txtPagamentoCartao = new javax.swing.JFormattedTextField();
        jpSubtotal = new javax.swing.JPanel();
        lbSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        btRegistrarVenda = new javax.swing.JButton();
        btRemoverItem = new javax.swing.JButton();
        cbPix = new javax.swing.JCheckBox();
        txtPix = new javax.swing.JFormattedTextField();
        txtProdutoValorTotal1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jpCabecalho.setBackground(new java.awt.Color(51, 255, 51));
        jpCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Venda nº 320");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbSairVenda.setForeground(new java.awt.Color(255, 255, 255));
        lbSairVenda.setText("Sair");
        lbSairVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSairVendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecalhoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbSairVenda)
                .addContainerGap())
        );
        jpCabecalhoLayout.setVerticalGroup(
            jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbSairVenda))
        );

        lbProdutoNome.setText("Produto");

        txtProdutoNome.setEditable(false);
        txtProdutoNome.setText("Clique aqui para pesquisar o produto...");
        txtProdutoNome.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoNome.setPreferredSize(new java.awt.Dimension(14, 25));
        txtProdutoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProdutoNomeMouseClicked(evt);
            }
        });

        lbProdutoQuantidade.setText("Quantidade");

        jsProdutoQuantidade.setMinimumSize(new java.awt.Dimension(14, 25));
        jsProdutoQuantidade.setPreferredSize(new java.awt.Dimension(14, 25));
        jsProdutoQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsProdutoQuantidadeStateChanged(evt);
            }
        });
        jsProdutoQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsProdutoQuantidadeFocusLost(evt);
            }
        });

        lbProdutoValorUnitario.setText("Valor unitario");

        txtProdutoValorUnitario.setEditable(false);
        txtProdutoValorUnitario.setText("0");
        txtProdutoValorUnitario.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoValorUnitario.setPreferredSize(new java.awt.Dimension(14, 25));

        lbProdutoValorTotal.setText("Valor Total");

        txtClienteId.setEditable(false);
        txtClienteId.setMinimumSize(new java.awt.Dimension(14, 25));
        txtClienteId.setPreferredSize(new java.awt.Dimension(14, 25));
        txtClienteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteIdActionPerformed(evt);
            }
        });

        lbVendaClienteCpf.setText("ID Cliente");

        btAdicionarItem.setBackground(new java.awt.Color(17, 128, 216));
        btAdicionarItem.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionarItem.setText("Adicionar Item");
        btAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarItemActionPerformed(evt);
            }
        });

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id do Item", "id do Produto", "Nome", "Quantidade", "Valor unitário", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVenda.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaVenda);
        if (tabelaVenda.getColumnModel().getColumnCount() > 0) {
            tabelaVenda.getColumnModel().getColumn(0).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(0).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(1).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(1).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(2).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(3).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(3).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(4).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(4).setPreferredWidth(6);
            tabelaVenda.getColumnModel().getColumn(5).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(5).setPreferredWidth(6);
        }

        jpDadosCliente.setBackground(new java.awt.Color(204, 204, 204));
        jpDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jpDadosCliente.setMaximumSize(new java.awt.Dimension(182, 134));
        jpDadosCliente.setMinimumSize(new java.awt.Dimension(182, 134));

        txtClienteNomeInfo.setEditable(false);
        txtClienteNomeInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteNomeInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteNomeInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteCpfInfo.setEditable(false);
        txtClienteCpfInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteCpfInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteCpfInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteCidadeInfo.setEditable(false);
        txtClienteCidadeInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteCidadeInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteCidadeInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteLogradouroInfo.setEditable(false);
        txtClienteLogradouroInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteLogradouroInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteLogradouroInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteNumeroInfo.setEditable(false);
        txtClienteNumeroInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteNumeroInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteNumeroInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        javax.swing.GroupLayout jpDadosClienteLayout = new javax.swing.GroupLayout(jpDadosCliente);
        jpDadosCliente.setLayout(jpDadosClienteLayout);
        jpDadosClienteLayout.setHorizontalGroup(
            jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtClienteNomeInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpDadosClienteLayout.createSequentialGroup()
                .addGroup(jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClienteCpfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteCidadeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteLogradouroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteNumeroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpDadosClienteLayout.setVerticalGroup(
            jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtClienteNomeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteCpfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteCidadeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteLogradouroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteNumeroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setText("Pagamento em:");

        cbDinheiro.setBackground(new java.awt.Color(255, 255, 255));
        cbDinheiro.setForeground(new java.awt.Color(51, 51, 51));
        cbDinheiro.setText("Dinheiro");
        cbDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDinheiroActionPerformed(evt);
            }
        });

        txtPagamentoDinheiro.setEditable(false);
        txtPagamentoDinheiro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPagamentoDinheiro.setText("0");
        txtPagamentoDinheiro.setMaximumSize(new java.awt.Dimension(101, 24));
        txtPagamentoDinheiro.setMinimumSize(new java.awt.Dimension(101, 24));
        txtPagamentoDinheiro.setPreferredSize(new java.awt.Dimension(101, 24));
        txtPagamentoDinheiro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPagamentoDinheiroFocusLost(evt);
            }
        });

        cbCartão.setBackground(new java.awt.Color(255, 255, 255));
        cbCartão.setForeground(new java.awt.Color(51, 51, 51));
        cbCartão.setText("Cartão");
        cbCartão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCartãoActionPerformed(evt);
            }
        });

        txtPagamentoCartao.setEditable(false);
        txtPagamentoCartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPagamentoCartao.setText("0");
        txtPagamentoCartao.setMaximumSize(new java.awt.Dimension(101, 24));
        txtPagamentoCartao.setMinimumSize(new java.awt.Dimension(101, 24));
        txtPagamentoCartao.setPreferredSize(new java.awt.Dimension(101, 24));
        txtPagamentoCartao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPagamentoCartaoFocusLost(evt);
            }
        });

        jpSubtotal.setBackground(new java.awt.Color(153, 153, 153));

        lbSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtotal.setText("SUBTOTAL DA COMPRA");

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(153, 153, 153));
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubtotal.setText("0");
        txtSubtotal.setBorder(null);

        javax.swing.GroupLayout jpSubtotalLayout = new javax.swing.GroupLayout(jpSubtotal);
        jpSubtotal.setLayout(jpSubtotalLayout);
        jpSubtotalLayout.setHorizontalGroup(
            jpSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSubtotalLayout.createSequentialGroup()
                .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
        );
        jpSubtotalLayout.setVerticalGroup(
            jpSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addComponent(txtSubtotal)
        );

        btRegistrarVenda.setBackground(new java.awt.Color(0, 102, 51));
        btRegistrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btRegistrarVenda.setText("Registrar Venda");
        btRegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarVendaActionPerformed(evt);
            }
        });

        btRemoverItem.setBackground(new java.awt.Color(153, 0, 0));
        btRemoverItem.setForeground(new java.awt.Color(255, 255, 255));
        btRemoverItem.setText("Remover Item");
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });

        cbPix.setBackground(new java.awt.Color(255, 255, 255));
        cbPix.setForeground(new java.awt.Color(51, 51, 51));
        cbPix.setText("Transferencia PIX");
        cbPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPixActionPerformed(evt);
            }
        });

        txtPix.setEditable(false);
        txtPix.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPix.setText("0");
        txtPix.setMaximumSize(new java.awt.Dimension(101, 24));
        txtPix.setMinimumSize(new java.awt.Dimension(101, 24));
        txtPix.setPreferredSize(new java.awt.Dimension(101, 24));
        txtPix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPixFocusLost(evt);
            }
        });

        txtProdutoValorTotal1.setEditable(false);
        txtProdutoValorTotal1.setText("0");
        txtProdutoValorTotal1.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoValorTotal1.setPreferredSize(new java.awt.Dimension(14, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbProdutoNome)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtProdutoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsProdutoQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProdutoQuantidade, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProdutoValorUnitario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProdutoValorUnitario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbProdutoValorTotal)
                            .addComponent(txtProdutoValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbVendaClienteCpf)
                            .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addComponent(jpSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAdicionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRegistrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbDinheiro)
                                    .addComponent(cbCartão)
                                    .addComponent(cbPix, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPagamentoDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPagamentoCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbVendaClienteCpf)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbProdutoValorUnitario)
                                .addComponent(lbProdutoQuantidade)
                                .addComponent(lbProdutoValorTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbProdutoNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProdutoValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsProdutoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProdutoValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDinheiro)
                            .addComponent(txtPagamentoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCartão)
                            .addComponent(txtPagamentoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPix)
                            .addComponent(txtPix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRegistrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jpSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//==============================================================================
//DECLARACOES
//============================================================================== 
    private VendaConsultaProdutoView consultaProduto;
    public MenuView menuView;
    private DefaultTableModel tableModel;
    private Produto produto;
    private Venda venda;
//==============================================================================
//FUNÇÕES
//==============================================================================     
    //ATUALIZA QUANTIDADE DE PRODUTO

    public void alteraQuantidade() {
        //Coloca dados da tela numa instancia de produto
        Produto produtoTela = new Produto();
        produtoTela.setNome(txtProdutoNome.getText());
        produtoTela.setQuant((Integer) jsProdutoQuantidade.getValue());
        produtoTela.setValorUnitario(Double.parseDouble(txtProdutoValorUnitario.getText()));
        Double valorTotal = 0.0;

        //se quantidade for negativa ou maior que 999 altera o valor para 1
        if (produtoTela.getQuant() < 1 || produtoTela.getQuant() > 999) {
            jsProdutoQuantidade.setValue(1);
            produtoTela.setQuant(1);
        }

        //faz calculo de valor total
        valorTotal = produtoTela.getQuant() * produtoTela.getValorUnitario();
        txtClienteId.setText(valorTotal.toString());
    }

    //VERIFICA A QUANTIDADE EM ESTOQUE
    public boolean verificaEstoque() {
        Produto produtoTela = new Produto();
        produtoTela.setNome(txtProdutoNome.getText());
        produtoTela.setQuant((Integer) jsProdutoQuantidade.getValue());
        produtoTela.setValorUnitario(Double.parseDouble(txtProdutoValorUnitario.getText()));

        Integer quantidadeNaLista = 0;

        for (int i = 0; i + 1 <= tabelaVenda.getModel().getRowCount(); i++) {
            if (produto != null) {
                if (produto.getId() == (Integer) tabelaVenda.getValueAt(i, 1)) {
                    quantidadeNaLista += (Integer) tabelaVenda.getValueAt(i, 3);
                }
            }
        }

        if (produto != null && produto.getId() != null) {
            if (produto.getQuant() < (produtoTela.getQuant() + quantidadeNaLista)) {
                return false;
            }
        }
        return true;
    }

    public void atualizaSubtotal() {
        Float subtotal = 0f;

        //faz cálculo de subtotal da compra
        for (int i = 1; i <= tableModel.getRowCount(); i++) {
            subtotal += (Float) tabelaVenda.getValueAt(i - 1, 5);
        }

        //insere valor subtotal da compra na label
        txtSubtotal.setText(subtotal.toString());
    }

//ATUALIZA O INDICE DA VENDA NO CABEÇALHO
    public void atualizaIndiceVenda() {
        Venda venda = new Venda();

        venda = VendaController.obterUltima();
        Integer ultimaVenda = venda.getId();

        if (ultimaVenda == null) {
            lbCabecalho.setText("Venda nº 1");
        } else {
            ultimaVenda += 1;
            lbCabecalho.setText("Venda nº " + ultimaVenda);
        }
    }
//LIMPA TELA DE VENDAS

    public void limpaTelaVenda() {
        //Limpa todos os campos de produto
        txtProdutoNome.setText("Clique aqui para pesquisar o produto...");
        jsProdutoQuantidade.setValue(0);
        txtProdutoValorUnitario.setText("0");
        txtClienteId.setText("0");

        //Limpa todos os campos de cliente
        txtClienteId.setText("");
        txtClienteNomeInfo.setText("");
        txtClienteCpfInfo.setText("");
        txtClienteCidadeInfo.setText("");
        txtClienteLogradouroInfo.setText("");
        txtClienteNumeroInfo.setText("");

        //Limpa todos os campos da venda
        cbDinheiro.setSelected(false);
        cbCartão.setSelected(false);
        cbPix.setSelected(false);
        txtPagamentoDinheiro.setValue(0);
        txtPagamentoCartao.setValue(0);
        txtPix.setValue(0);
        txtPagamentoDinheiro.setEditable(false);
        txtPagamentoCartao.setEditable(false);
        txtPix.setEditable(false);
        txtSubtotal.setText("0");

        //Obtém a tabela para trabalhar nela
        tableModel = (DefaultTableModel) tabelaVenda.getModel();

        //Limpa todas as linhas 
        tableModel.setRowCount(0);

        //Limpa a instância de produto que está na tela de consulta de produto 
        //que está na memória pq sempre que a tela inicia ele pega informações 
        //da instancia da outra tela e nao dos campos dela mesmo
        //consultaProduto.setProduto(null);
    }

    //VERIFICA SE O VALOR DO CARTÃO É MAIOR QUE SUBTOTAL DA COMPRA
    public boolean verificaValorCartao() {
        Double subtotal = Double.parseDouble(txtSubtotal.getText().replaceAll(",", "."));
        Double valorCartao = Double.parseDouble(txtPagamentoCartao.getText().replaceAll(",", "."));
        if (valorCartao > subtotal) {
            return false;
        }
        return true;
    }
    
    
    
    public boolean verificaValorPix(){
        Double subTotal = Double.parseDouble(txtSubtotal.getText().replaceAll(",", "."));
        Double valorpix = Double.parseDouble(txtPix.getText().replaceAll(",", "."));
        if(valorpix > subTotal){
            return false;
        }
        return true;
    }

//////////////==============================================================================
//////////////EVENTOS
//////////////============================================================================== 
//INTERFACE INICIA

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //Muda a cor do cabecalho da tabela
        tabelaVenda.getTableHeader().setBackground(new Color(017, 128, 216));
        tabelaVenda.getTableHeader().setForeground(Color.white);

        //Muda a cor da fonte da tabela
        tabelaVenda.setForeground(Color.black);

        //Altera o tamanha da fonte do cabecalho do form
        //coloca quantidade = 1 para quantidade de produto
        jsProdutoQuantidade.setValue(1);

        //informa no cabecario o número da venda
        atualizaIndiceVenda();
    }//GEN-LAST:event_formInternalFrameOpened

    //PESQUISA PRODUTO
    private void txtProdutoNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProdutoNomeMouseClicked

        //verifica se a tela ja existe
        if (consultaProduto == null) {
            //se não existir faz uma tela
            consultaProduto = new VendaConsultaProdutoView();

            //Centraliza o jInternalFrame no painel principal
            consultaProduto.setLocation(170, 100);
        }

        //verifico se a tela ja esta no painel
        if (!consultaProduto.isVisible()) {
            //mostro a tela no painel principal caso nao esteja la
            menuView.getDskPainelPrincipal().add(consultaProduto);
            consultaProduto.setVisible(true);
        }

        //coloco ela na frente de todas para todos os casos
        consultaProduto.toFront();

        //retira o painel superior
        ((BasicInternalFrameUI) consultaProduto.getUI()).setNorthPane(null);
    }//GEN-LAST:event_txtProdutoNomeMouseClicked

    //INTERFACE ATIVADA
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
//        //produto = new Produto();

        try {
            //coloca dados do produto a partir do produto selecionado 
            //na tela de consulta de produto da venda
            produto.setId(consultaProduto.getProduto().getId());
            produto.setNome(consultaProduto.getProduto().getNome());
            produto.setQuant(consultaProduto.getProduto().getQuant());
            produto.setValorUnitario(consultaProduto.getProduto().getValorUnitario());
////
////            //coloca na tela de venda nome e valor do produto
            txtProdutoNome.setText(produto.getNome());
            txtProdutoValorUnitario.setText(produto.getValorUnitario().toString());
            jsProdutoQuantidade.setValue(1);
            //verifica se o produto selecionado tem mais que 1 item no estoque
            alteraQuantidade();

        } catch (Exception e) {

        }
    }//GEN-LAST:event_formInternalFrameActivated

    //ALTERA QUANTIDADE
    private void jsProdutoQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsProdutoQuantidadeStateChanged
        alteraQuantidade();
    }//GEN-LAST:event_jsProdutoQuantidadeStateChanged

    //ALTERA QUANTIDADE
    private void jsProdutoQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsProdutoQuantidadeFocusLost
        alteraQuantidade();
    }//GEN-LAST:event_jsProdutoQuantidadeFocusLost

    //ADICIONA ITEM NA VENDA
    private void btAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarItemActionPerformed
        //Obtém a tabela para trabalhar nela
        tableModel = (DefaultTableModel) tabelaVenda.getModel();
        //se a quantidade solicitada for maior que valor em estoque
        if (verificaEstoque()) {

            if (!txtProdutoNome.getText().equalsIgnoreCase("Clique aqui para pesquisar o produto...")) {
                Integer idItem;

                //pega numero do ultimo item adicionado
                Integer ultimaLinha = tabelaVenda.getModel().getRowCount();
                if (ultimaLinha < 1) {
                    idItem = 1;
                } else {
                    idItem = (Integer) tabelaVenda.getValueAt(ultimaLinha - 1, 0);
                    idItem += 1;
                }

                //Cria array com valores do produto
                Object[] dadosTabela = new Object[6];
                //Cada dado na coluna correspondente
                dadosTabela[0] = idItem;
                dadosTabela[1] = produto.getId();
                dadosTabela[2] = produto.getNome();
                dadosTabela[3] = (Integer) jsProdutoQuantidade.getValue();
                dadosTabela[4] = produto.getValorUnitario();
                dadosTabela[5] = Float.parseFloat(txtClienteId.getText());

                //Adiciona a linha de dados na tabela
                tableModel.addRow(dadosTabela);

                atualizaSubtotal();
            }
        } else {
            //informa usuario que nao tem quantidade suficiente em estoque 
            //para inserir na venda
            JOptionPane.showMessageDialog(rootPane,
                    "Usuário, a quantidade de produtos solicitadas não existem em estoque! \n"
                    + "A quantidade deste produto em estoque é " + produto.getQuant() + ".",
                    "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btAdicionarItemActionPerformed

    //REMOVE ITEM DA VENDA
    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
//        try{
//            //Resgato o índice da linha selecionada
//            int row = tabelaVenda.getSelectedRow();
//
//            //Passo o indice da linha a ser removida
//            tableModel.removeRow(row);
//            
//            atualizaSubtotal();
//        }
//        catch(Exception e){}
//        
    }//GEN-LAST:event_btRemoverItemActionPerformed

    //REGISTRA A VENDA
    private void btRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarVendaActionPerformed
        venda = new Venda();
        Double valorTotal = 0.0;
        Double valorFaltante = 0.0;
        Double troco = 0.0;
        Integer vendaIndex = Integer.parseInt(lbCabecalho.getText().replaceAll("Venda nº ", ""));
        String respostaController = null;
        String respostaController2 = null;
        String respostaController3 = null;

        //se compra não tiver itens
        if (tabelaVenda.getModel().getRowCount() < 1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Você precisa adicionar itens no carrinho!",
                    "Atencão",
                    JOptionPane.ERROR_MESSAGE);
            //sai do método 
            return;
        }

        //se não foi selecionada uma forma de pagamento
        if (!cbCartão.isSelected() && !cbDinheiro.isSelected()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Você deve selecionar uma forma de pagamento!",
                    "Atenção",
                    JOptionPane.ERROR_MESSAGE);
            //sai do método 
            return;
        }

        //se não houver cliente na venda
        //avisa que não existe cliente para registrar junto a venda
        int respostaConfirmacao = JOptionPane.showConfirmDialog(
                rootPane,
                "Não existe cliente na venda.\n\n"
                + "Deseja continuar?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

        //se resposa for não para continuar o registro da venda
        //se o valor do cartao for maior que o subtotal
        if (!verificaValorCartao()) {
            JOptionPane.showMessageDialog(rootPane,
                    "O Valor de pagamento em cartão não pode ser maior que o subtotal da venda!",
                    "Atencão",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        //coloca dados da venda na instancia
        venda.setId(Integer.parseInt(lbCabecalho.getText().replaceAll("Venda nº ", "")));
        venda.setValor(Double.parseDouble(txtSubtotal.getText()));
        venda.setTipoDinheiro(Float.parseFloat(txtPagamentoDinheiro.getText().replaceAll(",", ".")));
        venda.setTipoCartao(Float.parseFloat(txtPagamentoCartao.getText().replaceAll(",", ".")));
        venda.setTipoPix(Float.parseFloat(cbPix.getText().replaceAll(",", ".")));

        //coloca cada item da venda na lista de itens da venda da instancia de venda
        for (int i = 0; i + 1 <= tabelaVenda.getModel().getRowCount(); i++) {
            //obtem o id dessa linha
            ItemVenda itemVenda = new ItemVenda();
            itemVenda.setIdVenda(venda.getId());
            itemVenda.setCodProduto((Integer) tabelaVenda.getValueAt(i, 0));
            itemVenda.setId((Integer) tabelaVenda.getValueAt(i, 1));
            itemVenda.setNome((String) tabelaVenda.getValueAt(i, 2));
            itemVenda.setQuant((Integer) tabelaVenda.getValueAt(i, 3));
            itemVenda.setValorUnitario((Double) tabelaVenda.getValueAt(i, 4));
            itemVenda.setValorTotal(itemVenda.getQuant() * itemVenda.getValorUnitario());

            venda.adicionarItem(itemVenda);
        }

        //coloca dados do cliente da venda na instancia de venda
        venda.getCliente().setNome(txtClienteNomeInfo.getText());
        venda.getCliente().getEndereco().setCidade(txtClienteCidadeInfo.getText());
        venda.getCliente().getEndereco().setRua(txtClienteLogradouroInfo.getText());
        venda.getCliente().getEndereco().setBairro(txtClienteNumeroInfo.getText());

        //se o valor pago for maior ou igual que o subtotal da compra
        if (venda.getTipoCartao() + venda.getTipoDinheiro() + venda.getTipoPix() >= venda.getValor()) {

            //envia venda para salvar para o controller
            respostaController = VendaController.salvar(venda);

            //se a resposta for positiva salva os itens da venda
            if (respostaController == null) {
                //salva todos os itens da venda - (faz loop na lista de itens)
                for (int i = 0; i < venda.getListaProd().size(); i++) {

                    //envia item da venda para para o controller salvar
                    respostaController2 = ItemVendaController.salvar(venda.getListaProd().get(i));

                    //atualiza quantidade de produto em estoque.
                    //para cada item da venda, pega o produto em estoque
                    //decrementa a quantidade vendida e envia ele com a quantidade 
                    //atualizada para o controller atualizar no estoque
                    Produto produtoAtualizado = ProdutoController.obter(venda.getListaProd().get(i).getId());
                    produtoAtualizado.setQuant(produtoAtualizado.getQuant() - venda.getListaProd().get(i).getQuant());
                    respostaController3 = ProdutoController.atualizar(produtoAtualizado);
                }

                //dando tudo certo envia mensagem para usuário o resumo da compra
                troco = (venda.getTipoCartao() + venda.getTipoDinheiro()) + venda.getTipoPix() - venda.getValor();
                JOptionPane.showMessageDialog(rootPane,
                        "Venda número " + vendaIndex + " registrada!\n\n"
                        + "Subtotal da compra R$" + venda.getValor() + "\n"
                        + "Total pago em Dinheiro R$" + venda.getTipoDinheiro() + "\n"
                        + "Total pago em Cartão R$" + venda.getTipoCartao() + "\n"
                        + "Total pago em Pix R$" + venda.getTipoPix() + "\n"        
                        + "Troco R$" + troco + "\n\n"
                        + "Agora você pode consultar sua venda em:\n"
                        + "Menu > Relatório",
                        "Informe de registro",
                        JOptionPane.INFORMATION_MESSAGE);

                //Limpa o formulário da tela de vendas
                limpaTelaVenda();

                //Atualiza número da venda na tela de vendas
                atualizaIndiceVenda();
            } else//se a resposta do controller for negativa
            {
                //Exibe mensagens de erro para o usuário
                JOptionPane.showMessageDialog(rootPane,
                        respostaController
                        + "\n Procure o administrador do sistema!",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
            //se o valor pago for menor que o valor da compra
        } else {
            valorFaltante = venda.getValor() - (venda.getTipoCartao() + venda.getTipoDinheiro() + venda.getTipoPix());
            //Exibe mensagens de erro para o usuário
            JOptionPane.showMessageDialog(rootPane,
                    "Subtotal da compra R$" + venda.getValor() + "\n"
                    + "Total em Dinheiro R$" + venda.getTipoDinheiro() + "\n"
                    + "Total em Cartão R$" + venda.getTipoCartao() + "\n\n"
                    + "Total pago em Pix R$" + venda.getTipoPix() + "\n"
                    + "Faltam R$" + valorFaltante + "\n\n"
                    + "Complete o e tente novamente.",
                    "Venda não registrada",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btRegistrarVendaActionPerformed

    //SELECIONA TIPO PAGAMENTO DINHEIRO
    private void cbDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDinheiroActionPerformed
        if (cbDinheiro.isSelected()) {
            txtPagamentoDinheiro.setEditable(true);
        } else {
            txtPagamentoDinheiro.setEditable(false);
        }
        txtPagamentoDinheiro.setValue(0);
    }//GEN-LAST:event_cbDinheiroActionPerformed

    //SELECIONA TIPO PAGAMENTO CARTÃO
    private void cbCartãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCartãoActionPerformed
        if (cbCartão.isSelected()) {
            txtPagamentoCartao.setEditable(true);
        } else {
            txtPagamentoCartao.setEditable(false);
        }
        txtPagamentoCartao.setValue(0);
    }//GEN-LAST:event_cbCartãoActionPerformed

    //PAGAMENTO DINHEIRO QUANTIDADE CARACTERES
    private void txtPagamentoDinheiroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPagamentoDinheiroFocusLost
        if (txtPagamentoDinheiro.getText().length() > 10) {
            txtPagamentoDinheiro.setValue(0);
        }
    }//GEN-LAST:event_txtPagamentoDinheiroFocusLost

    //PAGAMENTO CARTÃO QUANTIDADE CARACTERES
    private void txtPagamentoCartaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPagamentoCartaoFocusLost
        if (txtPagamentoCartao.getText().length() > 10) {
            txtPagamentoCartao.setValue(0);
        }
        if (!verificaValorCartao()) {
            JOptionPane.showMessageDialog(rootPane,
                    "O Valor de pagamento em cartão não pode ser maior que o subtotal da venda!",
                    "Atencão",
                    JOptionPane.ERROR_MESSAGE);
            txtPagamentoCartao.setValue(0);
        }
    }//GEN-LAST:event_txtPagamentoCartaoFocusLost

    //INTERFACE EXIBIDA
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        atualizaIndiceVenda();
    }//GEN-LAST:event_formComponentShown

    private void cbPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPixActionPerformed
        if(cbPix.isSelected()){
            txtPix.setEditable(true);
        }else{
            txtPix.setEditable(false);
        }
        txtPix.setValue(0);
    }//GEN-LAST:event_cbPixActionPerformed

    private void txtPixFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPixFocusLost
        if(txtPix.getText().length() > 10){
            txtPix.setValue(0);
        }
        if(!verificaValorPix()){
            JOptionPane.showMessageDialog(rootPane,
                    "O Valor de pagamento em Pix não pode ser maior que o subtotal da venda!",
                    "Atencão",
                    JOptionPane.ERROR_MESSAGE);
            txtPix.setValue(0);
        }
    }//GEN-LAST:event_txtPixFocusLost

    //SAIR DA TELA DE VENDA
    private void lbSairVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairVendaMouseClicked
        this.dispose();
        //this.doDefaultCloseAction();

        //realiza a limpeza dos campos para nova venda quando abrir
        limpaTelaVenda();
    }//GEN-LAST:event_lbSairVendaMouseClicked

    private void txtClienteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteIdActionPerformed

//==============================================================================
//NAO MEXER
//==============================================================================  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarItem;
    private javax.swing.JButton btRegistrarVenda;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JCheckBox cbCartão;
    private javax.swing.JCheckBox cbDinheiro;
    private javax.swing.JCheckBox cbPix;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCabecalho;
    private javax.swing.JPanel jpDadosCliente;
    private javax.swing.JPanel jpSubtotal;
    private javax.swing.JSpinner jsProdutoQuantidade;
    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JLabel lbProdutoNome;
    private javax.swing.JLabel lbProdutoQuantidade;
    private javax.swing.JLabel lbProdutoValorTotal;
    private javax.swing.JLabel lbProdutoValorUnitario;
    private javax.swing.JLabel lbSairVenda;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JLabel lbVendaClienteCpf;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JTextField txtClienteCidadeInfo;
    private javax.swing.JTextField txtClienteCpfInfo;
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtClienteLogradouroInfo;
    private javax.swing.JTextField txtClienteNomeInfo;
    private javax.swing.JTextField txtClienteNumeroInfo;
    private javax.swing.JFormattedTextField txtPagamentoCartao;
    private javax.swing.JFormattedTextField txtPagamentoDinheiro;
    private javax.swing.JFormattedTextField txtPix;
    private javax.swing.JTextField txtProdutoNome;
    private javax.swing.JTextField txtProdutoValorTotal1;
    private javax.swing.JTextField txtProdutoValorUnitario;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
