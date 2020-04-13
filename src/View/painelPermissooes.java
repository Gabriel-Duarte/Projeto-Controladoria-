/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BD.BdPermissoes;

import Classes.Permissao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Samuelson
 */
public class painelPermissooes extends javax.swing.JFrame {

    /**
     * Creates new form ViewJTable
     */
    public painelPermissooes() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        jTProdutos.setRowSorter(new TableRowSorter(modelo));

        pintura.removeAllItems();
        pintura.addItem("Negado");
        pintura.addItem("Permitido");
        estoquePa.removeAllItems();
        estoquePa.addItem("Negado");
        estoquePa.addItem("Permitido");
        vendas.removeAllItems();
        vendas.addItem("Negado");
        vendas.addItem("Permitido");
        admInd.removeAllItems();
        admInd.addItem("Negado");
        admInd.addItem("Permitido");
        Recebimento.removeAllItems();
        Recebimento.addItem("Negado");
        Recebimento.addItem("Permitido");
        injecao.removeAllItems();
        injecao.addItem("Negado");
        injecao.addItem("Permitido");
        compras.removeAllItems();
        compras.addItem("Negado");
        compras.addItem("Permitido");
        financeiro.removeAllItems();
        financeiro.addItem("Negado");
        financeiro.addItem("Permitido");
        estoqueMP.removeAllItems();
        estoqueMP.addItem("Negado");
        estoqueMP.addItem("Permitido");
        rh.removeAllItems();
        rh.addItem("Negado");
        rh.addItem("Permitido");
        manutencao.removeAllItems();
        manutencao.addItem("Negado");
        manutencao.addItem("Permitido");
        controladoria.removeAllItems();
        controladoria.addItem("Negado");
        controladoria.addItem("Permitido");
        seguranca.removeAllItems();
        seguranca.addItem("Negado");
        seguranca.addItem("Permitido");
        ferramentaria.removeAllItems();
        ferramentaria.addItem("Negado");
        ferramentaria.addItem("Permitido");
        recepcao.removeAllItems();
        recepcao.addItem("Negado");
        recepcao.addItem("Permitido");

        Acabamento.removeAllItems();
        Acabamento.addItem("Negado");
        Acabamento.addItem("Permitido");

        logistica.removeAllItems();
        logistica.addItem("Negado");
        logistica.addItem("Permitido");

        Adiretoria.removeAllItems();
        Adiretoria.addItem("Negado");
        Adiretoria.addItem("Permitido");
        
         Portaria.removeAllItems();
         Portaria.addItem("Negado");
         Portaria.addItem("Permitido");
        
          Moinho.removeAllItems();
        Moinho.addItem("Negado");
        Moinho.addItem("Permitido");
        
             SGQ.removeAllItems();
        SGQ.addItem("Negado");
        SGQ.addItem("Permitido");
        
           Administrativo.removeAllItems();
        Administrativo.addItem("Negado");
        Administrativo.addItem("Permitido");

        Usuario.setEditable(false);
        readJTable();
        this.setLocationRelativeTo(null);
        URL url = this.getClass().getResource("/Imagens/melc.jpg");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setTitle("APLICATIVO DE CONTROLADORIA");
        this.setResizable(false);

    }

    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        BdPermissoes pdao = new BdPermissoes();

        for (Permissao pe : pdao.readpermissoes()) {

            modelo.addRow(new Object[]{
                 pe.getId(),
                pe.getUser(),
                pe.getPintura(),
                pe.getEstoquePA(),
                pe.getRecebimento(),
                pe.getAdmIndustrial(),
                pe.getEstoquedeMateria(),
                pe.getManutencao(),
                pe.getSegurança(),
                pe.getFerramentaria(),
                pe.getInjecao(),
                pe.getVendas(),
                pe.getRecpecao(),
                pe.getFinaceiro(),
                pe.getCompras(),
                pe.getCon(),
                pe.getRh(),
                pe.getLogistica(),
                pe.getAdiretoria(),
                pe.getAcabamento(),
                    pe.getMoinho(),
                    pe.getPortaria(),
                    pe.getSGQ(),
                    pe.getAdministratvo()
                    

            });

        }

    }

    public void readJTableForDesc(String desc) {

        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        BdPermissoes pdao = new BdPermissoes();

  
        
        for (Permissao pe : pdao.readpermissoespes(desc)) {

            modelo.addRow(new Object[]{
                   pe.getId(),
                pe.getUser(),
                pe.getPintura(),
                pe.getEstoquePA(),
                pe.getRecebimento(),
                pe.getAdmIndustrial(),
                pe.getEstoquedeMateria(),
                pe.getManutencao(),
                pe.getSegurança(),
                pe.getFerramentaria(),
                pe.getInjecao(),
                pe.getVendas(),
                pe.getRecpecao(),
                pe.getFinaceiro(),
                pe.getCompras(),
                pe.getCon(),
                pe.getRh(),
                pe.getLogistica(),
                pe.getAdiretoria(),
                pe.getAcabamento(),
                    pe.getMoinho(),
                    pe.getPortaria(),
                    pe.getSGQ(),
                    pe.getAdministratvo()

            });

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtBuscaDesc = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        pintura = new javax.swing.JComboBox<>();
        estoquePa = new javax.swing.JComboBox<>();
        vendas = new javax.swing.JComboBox<>();
        admInd = new javax.swing.JComboBox<>();
        Recebimento = new javax.swing.JComboBox<>();
        injecao = new javax.swing.JComboBox<>();
        compras = new javax.swing.JComboBox<>();
        financeiro = new javax.swing.JComboBox<>();
        estoqueMP = new javax.swing.JComboBox<>();
        rh = new javax.swing.JComboBox<>();
        manutencao = new javax.swing.JComboBox<>();
        controladoria = new javax.swing.JComboBox<>();
        seguranca = new javax.swing.JComboBox<>();
        ferramentaria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        aca = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Acabamento = new javax.swing.JComboBox<>();
        logistica = new javax.swing.JComboBox<>();
        Adiretoria = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Moinho = new javax.swing.JComboBox<>();
        SGQ = new javax.swing.JComboBox<>();
        Administrativo = new javax.swing.JComboBox<>();
        Portaria = new javax.swing.JComboBox<>();
        recepcao = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        Fundo1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 515));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Rh/Dp");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel2.setText("Estoque de materia P.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel3.setText("Ferramentaria");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 90, -1));

        txtBuscaDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaDescActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscaDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 110, 140, -1));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 110, -1, -1));

        pintura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinturaActionPerformed(evt);
            }
        });
        jPanel1.add(pintura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        estoquePa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        estoquePa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoquePaActionPerformed(evt);
            }
        });
        jPanel1.add(estoquePa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        vendas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendasActionPerformed(evt);
            }
        });
        jPanel1.add(vendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 30, -1, -1));

        admInd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        admInd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admIndActionPerformed(evt);
            }
        });
        jPanel1.add(admInd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        Recebimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Recebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebimentoActionPerformed(evt);
            }
        });
        jPanel1.add(Recebimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        injecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        injecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                injecaoActionPerformed(evt);
            }
        });
        jPanel1.add(injecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, -1));

        compras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        jPanel1.add(compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        financeiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        financeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeiroActionPerformed(evt);
            }
        });
        jPanel1.add(financeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        estoqueMP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        estoqueMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueMPActionPerformed(evt);
            }
        });
        jPanel1.add(estoqueMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        rh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rhActionPerformed(evt);
            }
        });
        jPanel1.add(rh, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        manutencao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        manutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manutencaoActionPerformed(evt);
            }
        });
        jPanel1.add(manutencao, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        controladoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        controladoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controladoriaActionPerformed(evt);
            }
        });
        jPanel1.add(controladoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        seguranca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        seguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segurancaActionPerformed(evt);
            }
        });
        jPanel1.add(seguranca, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        ferramentaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ferramentaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ferramentariaActionPerformed(evt);
            }
        });
        jPanel1.add(ferramentaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

        jLabel4.setText("Pintura");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setText("Estoque Pa");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel6.setText("Recebimento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel7.setText("Adm industrial");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel8.setText("Manutenção");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jLabel9.setText("Segurança do trabalho");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel10.setText("Injeção");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, -1, -1));

        jLabel11.setText("Vendas");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        jLabel12.setText("Recepção");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel13.setText("Financeiro");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel14.setText("Compras");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel15.setText("Controladoria");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel18.setText("contabilidade");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        aca.setText("Acabamento");
        jPanel1.add(aca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));

        jLabel20.setText("Apoio diretoria");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        Usuario.setEditable(false);
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 140, -1));

        Acabamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Acabamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcabamentoActionPerformed(evt);
            }
        });
        jPanel1.add(Acabamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 30, -1, -1));

        logistica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        logistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logisticaActionPerformed(evt);
            }
        });
        jPanel1.add(logistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        Adiretoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Adiretoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdiretoriaActionPerformed(evt);
            }
        });
        jPanel1.add(Adiretoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jLabel21.setText("Moinho");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        jLabel25.setText("Administrativo");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel23.setText("Portaria");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel19.setText("Logistica/Expedição");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        Moinho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Moinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoinhoActionPerformed(evt);
            }
        });
        jPanel1.add(Moinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        SGQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SGQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SGQActionPerformed(evt);
            }
        });
        jPanel1.add(SGQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        Administrativo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Administrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrativoActionPerformed(evt);
            }
        });
        jPanel1.add(Administrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        Portaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Portaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortariaActionPerformed(evt);
            }
        });
        jPanel1.add(Portaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        recepcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        recepcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recepcaoActionPerformed(evt);
            }
        });
        jPanel1.add(recepcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel16.setText("Usuario");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, -1, -1));

        Fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO Tablea.jpg"))); // NOI18N
        jPanel1.add(Fundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -7, 1360, 180));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Pintura", "Estoque Pa", "Recebimento", "Adm industrial", "Estoque de materia P.", "Manutenção ", "Segurança do trabalho", "Ferramentaria", "Injeção", "vendas", "Recepção", "Financeiro", "Compras", "Controladoria", "Rh/Dp", "logística/Expedição", "Apoio Diretoria", "Acabamento", "Moinho", "Portaria", "SGQ", "Administrativo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jTProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTProdutosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1310, 248));

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jPanel3.add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 86, 31));

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel3.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 95, 31));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO Tablea.jpg"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1390, 370));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 172, 1350, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked

        if (jTProdutos.getSelectedRow() != -1) {

            Usuario.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString());

        }

    }//GEN-LAST:event_jTProdutosMouseClicked

    private void jTProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdutosKeyReleased
        // TODO add your handling code here:

        if (jTProdutos.getSelectedRow() != -1) {
            Usuario.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString());

        }


    }//GEN-LAST:event_jTProdutosKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTProdutos.getSelectedRow() != -1) {
            BdPermissoes dao = new BdPermissoes();
            Permissao p = new Permissao();

            p.setPintura(pintura.getSelectedItem().toString());

            p.setEstoquePA(pintura.getSelectedItem().toString());
            p.setRecebimento(Recebimento.getSelectedItem().toString());
            p.setAdmIndustrial(admInd.getSelectedItem().toString());
            p.setEstoquedeMateria(estoqueMP.getSelectedItem().toString());
            p.setManutencao(manutencao.getSelectedItem().toString());

            p.setSegurança(seguranca.getSelectedItem().toString());
            p.setFerramentaria(ferramentaria.getSelectedItem().toString());
            p.setInjecao(injecao.getSelectedItem().toString());
            p.setVendas(vendas.getSelectedItem().toString());
            p.setRecpecao(recepcao.getSelectedItem().toString());
            p.setFinaceiro(financeiro.getSelectedItem().toString());
            p.setCompras(compras.getSelectedItem().toString());
            p.setCon(controladoria.getSelectedItem().toString());
            p.setRh(rh.getSelectedItem().toString());

            p.setAcabamento(Acabamento.getSelectedItem().toString());
            p.setLogistica(logistica.getSelectedItem().toString());
            p.setAdiretoria(Adiretoria.getSelectedItem().toString());
            p.setMoinho(Moinho.getSelectedItem().toString());
               p.setPortaria(Portaria.getSelectedItem().toString());
                  p.setSGQ(SGQ.getSelectedItem().toString());
               p.setAdministratvo(Administrativo.getSelectedItem().toString());
            p.setId((int) jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 0));
            dao.updatePermi(p);

            Usuario.setText("");
            readJTable();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        readJTableForDesc(txtBuscaDesc.getText());

    }//GEN-LAST:event_jButton4ActionPerformed

    private void pinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinturaActionPerformed

    private void estoquePaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoquePaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estoquePaActionPerformed

    private void vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendasActionPerformed

    private void admIndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admIndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admIndActionPerformed

    private void RecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecebimentoActionPerformed

    private void financeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_financeiroActionPerformed

    private void estoqueMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueMPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estoqueMPActionPerformed

    private void manutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manutencaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manutencaoActionPerformed

    private void segurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segurancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segurancaActionPerformed

    private void ferramentariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ferramentariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ferramentariaActionPerformed

    private void injecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_injecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_injecaoActionPerformed

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprasActionPerformed

    private void rhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rhActionPerformed

    private void controladoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controladoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controladoriaActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        paineladm tl = new paineladm();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void AcabamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcabamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcabamentoActionPerformed

    private void logisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logisticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logisticaActionPerformed

    private void AdiretoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdiretoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdiretoriaActionPerformed

    private void txtBuscaDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaDescActionPerformed

    private void MoinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoinhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoinhoActionPerformed

    private void SGQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SGQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SGQActionPerformed

    private void AdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdministrativoActionPerformed

    private void PortariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PortariaActionPerformed

    private void recepcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recepcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recepcaoActionPerformed

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
            java.util.logging.Logger.getLogger(painelPermissooes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(painelPermissooes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(painelPermissooes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(painelPermissooes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new painelPermissooes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Acabamento;
    private javax.swing.JComboBox<String> Adiretoria;
    private javax.swing.JComboBox<String> Administrativo;
    private javax.swing.JLabel Fundo1;
    private javax.swing.JComboBox<String> Moinho;
    private javax.swing.JComboBox<String> Portaria;
    private javax.swing.JComboBox<String> Recebimento;
    private javax.swing.JComboBox<String> SGQ;
    private javax.swing.JButton Sair;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel aca;
    private javax.swing.JComboBox<String> admInd;
    private javax.swing.JComboBox<String> compras;
    private javax.swing.JComboBox<String> controladoria;
    private javax.swing.JComboBox<String> estoqueMP;
    private javax.swing.JComboBox<String> estoquePa;
    private javax.swing.JComboBox<String> ferramentaria;
    private javax.swing.JComboBox<String> financeiro;
    private javax.swing.JComboBox<String> injecao;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JComboBox<String> logistica;
    private javax.swing.JComboBox<String> manutencao;
    private javax.swing.JComboBox<String> pintura;
    private javax.swing.JComboBox<String> recepcao;
    private javax.swing.JComboBox<String> rh;
    private javax.swing.JComboBox<String> seguranca;
    private javax.swing.JTextField txtBuscaDesc;
    private javax.swing.JComboBox<String> vendas;
    // End of variables declaration//GEN-END:variables
}
