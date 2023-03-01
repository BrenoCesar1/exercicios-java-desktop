/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aula_04;
/**
 *
 * @author Administrador
 */
public class Calculadora_Simples extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora_Simples
     */
    public Calculadora_Simples() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTValor1 = new javax.swing.JTextField();
        jTResultado = new javax.swing.JTextField();
        jTValor2 = new javax.swing.JTextField();
        jBAdicao = new javax.swing.JButton();
        jBSubtracao = new javax.swing.JButton();
        jBDivisao = new javax.swing.JButton();
        jBMultiplicacao = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBNovoCalculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Simples");

        jLabel1.setText("Digite o 1º Valor:");

        jLabel2.setText("Digite o 2º Valor:");

        jLabel3.setText("Resultado");

        jTValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTValor1ActionPerformed(evt);
            }
        });

        jTResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTResultadoActionPerformed(evt);
            }
        });

        jTValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTValor2ActionPerformed(evt);
            }
        });

        jBAdicao.setText("Adição (+)");
        jBAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicaoActionPerformed(evt);
            }
        });

        jBSubtracao.setText("Subtração (-)");
        jBSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubtracaoActionPerformed(evt);
            }
        });

        jBDivisao.setText("Divisão (/)");
        jBDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDivisaoActionPerformed(evt);
            }
        });

        jBMultiplicacao.setText("Multiplicação (*)");
        jBMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultiplicacaoActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBNovoCalculo.setText("Novo cálculo");
        jBNovoCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoCalculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(jTResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSubtracao)
                            .addComponent(jBSair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBDivisao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBMultiplicacao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBNovoCalculo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jTValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAdicao)
                    .addComponent(jBMultiplicacao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSubtracao)
                    .addComponent(jBDivisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair)
                    .addComponent(jBNovoCalculo))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTValor1ActionPerformed

    private void jTResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTResultadoActionPerformed

    private void jTValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTValor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTValor2ActionPerformed

    private void jBAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicaoActionPerformed
        // TODO add your handling code here:
        //Cria as variáveis que vão receber os valores digitados pelo usuário
        String vlr1;
        String vlr2;
        // atribui os valores digitados as variáveis criadas
        vlr1 = jTValor1.getText();
        vlr2 = jTValor2.getText();
        // atribui os valores digitados ás variáveis criadas
        // e converte os valores que chegam em strings para double.
        double valor1 = Double.parseDouble(vlr1);
        double valor2 = Double.parseDouble(vlr2);
        // cria a variável que vai receber a operação aritimética.
        double total = valor1 + valor2;
        //conver o resultado da operação de double para string
        String totalExibir = "";
        totalExibir = "" + total;
        //Exibe a string criada na caixa de texto
        jTResultado.setText(totalExibir);
    }//GEN-LAST:event_jBAdicaoActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMultiplicacaoActionPerformed
        // TODO add your handling code here:
        //Cria as variáveis que vão receber os valores digitados pelo usuário
        String vlr1;
        String vlr2;
        // atribui os valores digitados as variáveis criadas
        vlr1 = jTValor1.getText();
        vlr2 = jTValor2.getText();
        // atribui os valores digitados ás variáveis criadas
        // e converte os valores que chegam em strings para double.
        double valor1 = Double.parseDouble(vlr1);
        double valor2 = Double.parseDouble(vlr2);
        // cria a variável que vai receber a operação aritimética.
        double total = valor1 * valor2;
        //conver o resultado da operação de double para string
        String totalExibir = "";
        totalExibir = "" + total;
        //Exibe a string criada na caixa de texto
        jTResultado.setText(totalExibir);
    }//GEN-LAST:event_jBMultiplicacaoActionPerformed

    private void jBSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubtracaoActionPerformed
        // TODO add your handling code here:
        //Cria as variáveis que vão receber os valores digitados pelo usuário
        String vlr1;
        String vlr2;
        // atribui os valores digitados as variáveis criadas
        vlr1 = jTValor1.getText();
        vlr2 = jTValor2.getText();
        // atribui os valores digitados ás variáveis criadas
        // e converte os valores que chegam em strings para double.
        double valor1 = Double.parseDouble(vlr1);
        double valor2 = Double.parseDouble(vlr2);
        // cria a variável que vai receber a operação aritimética.
        double total = valor1 - valor2;
        //conver o resultado da operação de double para string
        String totalExibir = "";
        totalExibir = "" + total;
        //Exibe a string criada na caixa de texto
        jTResultado.setText(totalExibir);
    }//GEN-LAST:event_jBSubtracaoActionPerformed

    private void jBDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDivisaoActionPerformed
        // TODO add your handling code here:
        //Cria as variáveis que vão receber os valores digitados pelo usuário
        String vlr1;
        String vlr2;
        // atribui os valores digitados as variáveis criadas
        vlr1 = jTValor1.getText();
        vlr2 = jTValor2.getText();
        // atribui os valores digitados ás variáveis criadas
        // e converte os valores que chegam em strings para double.
        double valor1 = Double.parseDouble(vlr1);
        double valor2 = Double.parseDouble(vlr2);
        // cria a variável que vai receber a operação aritimética.
        double total = valor1 / valor2;
        //conver o resultado da operação de double para string
        String totalExibir = "";
        totalExibir = "" + total;
        //Exibe a string criada na caixa de texto
        jTResultado.setText(totalExibir);
    }//GEN-LAST:event_jBDivisaoActionPerformed

    private void jBNovoCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoCalculoActionPerformed
        // TODO add your handling code here:
        jTValor1.setText(null);
        jTValor2.setText(null);
        jTResultado.setText(null);
        
    }//GEN-LAST:event_jBNovoCalculoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora_Simples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Simples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Simples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora_Simples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora_Simples().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicao;
    private javax.swing.JButton jBDivisao;
    private javax.swing.JButton jBMultiplicacao;
    private javax.swing.JButton jBNovoCalculo;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSubtracao;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTResultado;
    private javax.swing.JTextField jTValor1;
    private javax.swing.JTextField jTValor2;
    // End of variables declaration//GEN-END:variables
}
