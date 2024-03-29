/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import control.Controler;
import model.Models;

/**
 *
 * @author saulo.cabral
 */
public class FrameApp extends javax.swing.JFrame {
        List<Models> listaModels = new ArrayList<Models>();
    /**
     * Creates new form FrameApp
     */
    public FrameApp() {

        initComponents();
        populaTabela();
    }

    public void populaTabela() {

        listaModels = Controler.buscaModel();
        Double gasto = 0.0;
        Double ganho = 0.0;
        Double diferenca = 0.0;

        DefaultTableModel tableModel = (DefaultTableModel) entradasTabela.getModel();
        tableModel.setRowCount(0);

        for (Models models : listaModels) {

            Object[] objModel = {models.getCont_nome(), models.getCont_classificacao(), models.getCont_valor(),
                    models.getCont_data(), models.getCont_data() };
            tableModel.addRow(objModel);

        }
        for (int i = 0; i < listaModels.size(); i++) {
            if (listaModels.get(i).isCont_ganho()) {
                ganho += listaModels.get(i).getCont_valor();
            } else {
                gasto += listaModels.get(i).getCont_valor();
            }
        }
        
        diferenca = ganho - gasto;
        gastoTxt.setText(gasto.toString());
        recebidoTxt.setText(ganho.toString());
        diferencaTxt.setText(diferenca.toString());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        classificacaoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valorTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dataTxt = new javax.swing.JFormattedTextField();
        cadastrarBtn = new javax.swing.JButton();
        ganhoBtn = new javax.swing.JRadioButton();
        gastoBtn = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        entradasTabela = new javax.swing.JTable();
        deletarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        recebidoTxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gastoTxt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        diferencaTxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        nomeTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Classificação");

        classificacaoTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Valor");

        valorTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Data");

        try {
            dataTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cadastrarBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cadastrarBtn.setText("CADASTRAR");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        ganhoBtn.setBackground(new java.awt.Color(204, 204, 255));
        ganhoBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ganhoBtn.setText("Ganho (+)");
        ganhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganhoBtnActionPerformed(evt);
            }
        });

        gastoBtn.setBackground(new java.awt.Color(204, 204, 255));
        gastoBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        gastoBtn.setText("Gasto (-)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeTxt)
                    .addComponent(classificacaoTxt)
                    .addComponent(valorTxt)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ganhoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gastoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(classificacaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(valorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ganhoBtn)
                    .addComponent(gastoBtn))
                .addGap(39, 39, 39)
                .addComponent(cadastrarBtn)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        entradasTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        entradasTabela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        entradasTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Classificação", "Valor", "Data Entrada", "Data Cadastro"
            }
        ));
        jScrollPane1.setViewportView(entradasTabela);

        deletarBtn.setText("DEL");
        deletarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Recebido (R$):");

        recebidoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recebidoTxt.setText("0.00");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Gastos (R$):");

        gastoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gastoTxt.setText("0.00");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Diferença (R$):");

        diferencaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        diferencaTxt.setText("0.00");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Finanças Anual Seu José");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recebidoTxt)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gastoTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diferencaTxt)
                                .addGap(47, 47, 47)
                                .addComponent(deletarBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel6)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletarBtn)
                    .addComponent(jLabel5)
                    .addComponent(recebidoTxt)
                    .addComponent(jLabel7)
                    .addComponent(gastoTxt)
                    .addComponent(jLabel9)
                    .addComponent(diferencaTxt))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ganhoBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void gastoBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ganhoBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ganhoBtnActionPerformed

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cadastrarBtnActionPerformed
        // Verifica se as informações escritas nos campos são nulas
        if (nomeTxt != null && classificacaoTxt != null && valorTxt != null && dataTxt != null) {
            System.out.println("teste1");
            double val = Double.parseDouble(valorTxt.getText());
            control.Controler.cadastrar(nomeTxt, classificacaoTxt, val, dataTxt, ganhoBtn.isSelected(),
                    gastoBtn.isSelected());

        }
    }// GEN-LAST:event_cadastrarBtnActionPerformed

    private void deletarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deletarBtnActionPerformed
        
        int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar?", "Deletar", JOptionPane.YES_NO_OPTION);
        if (opc == 0) {
            
        
        // Verifica se tem algum item selecionado na tabela

        if (entradasTabela.getSelectedRow() != -1) {
                // Chama o metodo deletar da classe controler
                System.out.println(listaModels.get(entradasTabela.getSelectedRow()).getPk_cont_id());
                control.Controler.deletar(listaModels.get(entradasTabela.getSelectedRow()).getPk_cont_id());
                populaTabela();
        }

        }

    }// GEN-LAST:event_deletarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JTextField classificacaoTxt;
    private javax.swing.JFormattedTextField dataTxt;
    private javax.swing.JButton deletarBtn;
    private javax.swing.JLabel diferencaTxt;
    private javax.swing.JTable entradasTabela;
    private javax.swing.JRadioButton ganhoBtn;
    private javax.swing.JRadioButton gastoBtn;
    private javax.swing.JLabel gastoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JLabel recebidoTxt;
    private javax.swing.JTextField valorTxt;
    // End of variables declaration//GEN-END:variables
}
