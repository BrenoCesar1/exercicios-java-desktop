/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aumento;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Calculadora_Dessidio extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora_Decide
     */
    public Calculadora_Dessidio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jBSair = new javax.swing.JButton();
        jBCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTDissidio = new javax.swing.JTextField();
        jTSalario = new javax.swing.JTextField();
        jBLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBSair.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBCalcular.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jLabel1.setText(" Diss??dio");

        jLabel2.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jLabel2.setText("Seu sal??rio:");

        jTDissidio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDissidioActionPerformed(evt);
            }
        });

        jTSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSalarioActionPerformed(evt);
            }
        });

        jBLimpar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(9, 12, 80));
        jLabel3.setText("Calculadora Diss??dio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jBSair)
                        .addGap(71, 71, 71)
                        .addComponent(jBLimpar)
                        .addGap(58, 58, 58)
                        .addComponent(jBCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTDissidio, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDissidio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair)
                    .addComponent(jBLimpar)
                    .addComponent(jBCalcular))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTDissidioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDissidioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDissidioActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jTSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSalarioActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        // TODO add your handling code here:
        jTSalario.setText(null);
        jTDissidio.setText(null);
        jTDissidio.requestFocus();
        
        
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        // TODO add your handling code here:
        double decidio = Double.parseDouble(jTDissidio.getText());
        double salario = Double.parseDouble(jTSalario.getText());
        double resultado = ((decidio /100) * salario);
        double fim = resultado + salario;
        JOptionPane.showMessageDialog(null,"Voc?? recebeu o aumento de: " + resultado + " Seu salario atual passa a ser: " + fim );
        
    }//GEN-LAST:event_jBCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora_Dessidio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Dessidio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Dessidio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Dessidio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_Dessidio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalcular;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSair;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTDissidio;
    private javax.swing.JTextField jTSalario;
    // End of variables declaration//GEN-END:variables
}
