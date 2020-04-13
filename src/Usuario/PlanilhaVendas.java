package Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import BD.BdPermissoes;
import Classes.Funcionario;

import View.Planilha;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import static Classes.Funcionario.tot6;
import static Classes.Funcionario.totBen;
import static Classes.Funcionario.totCes;
import static Classes.Funcionario.totCon;
import static Classes.Funcionario.totCus;
import static Classes.Funcionario.totE;
import static Classes.Funcionario.totS;
import static Classes.Funcionario.totSM;
import static Classes.Funcionario.totVal;
/**
 *
 * @author Samuelson
 */
public class PlanilhaVendas extends javax.swing.JFrame {

    /**
     * Creates new form ViewJTable
     */
    public PlanilhaVendas() {
        initComponents();
        Busca.addItem("Funcionario");
        Busca.addItem("Cargo");

        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        jTProdutos.setRowSorter(new TableRowSorter(modelo));

        readJTable();
        this.setLocationRelativeTo(null);
        URL url = this.getClass().getResource("/Imagens/melc.jpg");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setTitle("APLICATIVO DE CONTROLADORIA");
        this.setResizable(false);
   textfild();
   getRootPane().setDefaultButton(jButton4);
    }
 public void textfild(){
         Sal.setEditable(false);
          SalMensal.setEditable(false);
          Encargos.setEditable(false);
          ConvMedico.setEditable(false);
          seis.setEditable(false);
          ValTran.setEditable(false);
         CestaB.setEditable(false);
          Beneficio.setEditable(false);
          cusTot.setEditable(false);
                   
    }
     public void print(){
     Sal.setText(String.valueOf(totS));
     SalMensal.setText(String.valueOf(totSM));
     Encargos.setText(String.valueOf(totE));
     ConvMedico.setText(String.valueOf(totCon));
     seis.setText(String.valueOf( tot6));
 ValTran.setText(String.valueOf(totVal));
 CestaB.setText(String.valueOf( totCes));
 Beneficio.setText(String.valueOf( totBen));
 cusTot.setText(String.valueOf(totCus));
     }

    public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        BdPermissoes pdao = new BdPermissoes();

        totS=0; totSM=0; totE=0; totCon=0; tot6=0; totVal=0; totCes=0; totBen=0; totCus=0;
        int id=1;
        
        for (Funcionario p : pdao.read("vendas")) {

            modelo.addRow(new Object[]{
                 id,
                p.getFunc(),
                p.getAdmicao(),
                p.getSetor(),
                p.getCargo(),
                p.getSalario(),
                p.getSalariomensal(),
                p.getEncargos(),
                p.getConvmed(),
                p.getSeis(),
                p.getValetrans(),
                p.getCestaBasica(),
                p.getBeneficio(),
                p.getCustot(),});
 p.total(p.getSalario(),p.getSalariomensal(), p.getEncargos(),p.getConvmed(), p.getSeis(),  p.getValetrans(), p.getCestaBasica(), p.getBeneficio(), p.getCustot());
       id=id+1;
        }
print();
    }

    @SuppressWarnings("empty-statement")
    public void readJTableForfenc(String desc) {

        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        BdPermissoes pdao = new BdPermissoes();

        totS=0; totSM=0; totE=0; totCon=0; tot6=0; totVal=0; totCes=0; totBen=0; totCus=0;
        int id=1;
        
        for (Funcionario p : pdao.readForFuncionario(desc, "vendas")) {

           modelo.addRow(new Object[]{
                 id,
                p.getFunc(),
                p.getAdmicao(),
                p.getSetor(),
                p.getCargo(),
                p.getSalario(),
                p.getSalariomensal(),
                p.getEncargos(),
                p.getConvmed(),
                p.getSeis(),
                p.getValetrans(),
                p.getCestaBasica(),
                p.getBeneficio(),
                p.getCustot(),});
 p.total(p.getSalario(),p.getSalariomensal(), p.getEncargos(),p.getConvmed(), p.getSeis(),  p.getValetrans(), p.getCestaBasica(), p.getBeneficio(), p.getCustot());
       id=id+1;
        }
print();
    }

    public void readJTableForcar(String desc) {

        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        BdPermissoes pdao = new BdPermissoes();

        totS=0; totSM=0; totE=0; totCon=0; tot6=0; totVal=0; totCes=0; totBen=0; totCus=0;
        int id=1;
        
        for (Funcionario p : pdao.readForcargo(desc, "vendas")) {

           modelo.addRow(new Object[]{
                 id,
                p.getFunc(),
                p.getAdmicao(),
                p.getSetor(),
                p.getCargo(),
                p.getSalario(),
                p.getSalariomensal(),
                p.getEncargos(),
                p.getConvmed(),
                p.getSeis(),
                p.getValetrans(),
                p.getCestaBasica(),
                p.getBeneficio(),
                p.getCustot(),});
 p.total(p.getSalario(),p.getSalariomensal(), p.getEncargos(),p.getConvmed(), p.getSeis(),  p.getValetrans(), p.getCestaBasica(), p.getBeneficio(), p.getCustot());
       id=id+1;
        }
print();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();
        Busca = new java.awt.Choice();
        txtBuscaDesc = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        Sal = new javax.swing.JTextField();
        SalMensal = new javax.swing.JTextField();
        Encargos = new javax.swing.JTextField();
        ConvMedico = new javax.swing.JTextField();
        seis = new javax.swing.JTextField();
        ValTran = new javax.swing.JTextField();
        CestaB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Beneficio = new javax.swing.JTextField();
        cusTot = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ValeTrans = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eeee = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        imprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1367, 574));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Funcionario", "Admissão", "Setor", "Cargo", "Salario", "Salario Mensal", "Encargos", "Convênio medico", "6%", "Vale Transporte", "Cesta Basica", "Beneficios", "Custo Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1348, 460));

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        jPanel3.add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 100, 20));

        Busca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Busca.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                BuscaComponentHidden(evt);
            }
        });
        jPanel3.add(Busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 20));
        jPanel3.add(txtBuscaDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 253, 20));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, 20));

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel3.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 110, 20));

        Sal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalActionPerformed(evt);
            }
        });
        jPanel3.add(Sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 90, 20));

        SalMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalMensalActionPerformed(evt);
            }
        });
        jPanel3.add(SalMensal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 90, 20));

        Encargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncargosActionPerformed(evt);
            }
        });
        jPanel3.add(Encargos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 90, 20));

        ConvMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvMedicoActionPerformed(evt);
            }
        });
        jPanel3.add(ConvMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 110, 20));

        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel3.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 90, 20));

        ValTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValTranActionPerformed(evt);
            }
        });
        jPanel3.add(ValTran, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 90, 20));

        CestaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CestaBActionPerformed(evt);
            }
        });
        jPanel3.add(CestaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 530, 90, 20));

        jLabel3.setText("Salario");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, -1, 20));

        Beneficio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeneficioActionPerformed(evt);
            }
        });
        jPanel3.add(Beneficio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 530, 90, 20));

        cusTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusTotActionPerformed(evt);
            }
        });
        jPanel3.add(cusTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 530, 90, 20));

        jLabel9.setText("Custo Total");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 510, -1, 20));

        jLabel12.setText("Beneficios");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 510, -1, 20));

        jLabel8.setText("Cesta Basica");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, -1, 20));

        ValeTrans.setText("Vale Transporte");
        jPanel3.add(ValeTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, -1, 20));

        jLabel6.setText("6%");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, -1, 20));

        eeee.setText("Convênio Medico");
        jPanel3.add(eeee, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, -1, 20));

        jLabel4.setText("Encargos");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, 20));

        jLabel10.setText("Salario Mensal");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, 20));

        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        jPanel3.add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 110, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO Tablea.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -10, 2160, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO Tablea.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 420, 1690, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -13, 1368, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jTProdutosMouseClicked

    private void jTProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdutosKeyReleased
        // TODO add your handling code here:


    }//GEN-LAST:event_jTProdutosKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String op;
        op = Busca.getSelectedItem().toString();
        if (op.equals("Cargo")) {
            readJTableForcar(txtBuscaDesc.getText());

        } else if (op.equals("Funcionario")) {

            readJTableForfenc(txtBuscaDesc.getText());
        }

    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void BuscaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BuscaComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscaComponentHidden

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        MenuUser tl = new MenuUser();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(jTProdutos.getPrintable(JTable.PrintMode.FIT_WIDTH, null, null));
        job.setJobName("jTProdutos");
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Planilha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_imprimirActionPerformed

    private void SalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalActionPerformed

    }//GEN-LAST:event_SalActionPerformed

    private void SalMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalMensalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalMensalActionPerformed

    private void EncargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncargosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EncargosActionPerformed

    private void ConvMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConvMedicoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seisActionPerformed

    private void ValTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValTranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValTranActionPerformed

    private void CestaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CestaBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CestaBActionPerformed

    private void BeneficioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeneficioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeneficioActionPerformed

    private void cusTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusTotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusTotActionPerformed

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
            java.util.logging.Logger.getLogger(PlanilhaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanilhaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanilhaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanilhaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanilhaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Beneficio;
    private java.awt.Choice Busca;
    private javax.swing.JTextField CestaB;
    private javax.swing.JTextField ConvMedico;
    private javax.swing.JTextField Encargos;
    private javax.swing.JTextField Sal;
    private javax.swing.JTextField SalMensal;
    private javax.swing.JTextField ValTran;
    private javax.swing.JLabel ValeTrans;
    private javax.swing.JButton Voltar;
    private javax.swing.JTextField cusTot;
    private javax.swing.JLabel eeee;
    private javax.swing.JButton imprimir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JButton sair;
    private javax.swing.JTextField seis;
    private javax.swing.JTextField txtBuscaDesc;
    // End of variables declaration//GEN-END:variables
}
