/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N_GUI;

import Clases.Cuenta;
import Logica.LogicaCuenta;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author UTPL
 */
public class RealizarDeposito extends javax.swing.JFrame {

    LogicaCuenta ObjLogCue = new LogicaCuenta();
    Cuenta ObjCue = new Cuenta();

    /**
     * Creates new form RealizarDeposito
     */
    public RealizarDeposito() {
        setLocationRelativeTo(null);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTNCuenta = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextAutorizado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTSaldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTdepositar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBDepositar = new javax.swing.JButton();
        jBRetirar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        jPanel1.add(jTNCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 60, -1));

        jButton3.setText("Find");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel2.setText("Cliente Autorizado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel1.add(jTextAutorizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 220, 20));

        jLabel3.setText("Saldo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));
        jPanel1.add(jTSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 70, -1));

        jLabel4.setText("Valor a Depositar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(jTdepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 440, 220));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBDepositar.setText("Depositar");
        jBDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDepositarActionPerformed(evt);
            }
        });
        jPanel2.add(jBDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jBRetirar.setText("Retirar");
        jBRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRetirarActionPerformed(evt);
            }
        });
        jPanel2.add(jBRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 440, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (this.BuscarCuenta()) {
            this.jTextAutorizado.setText(ObjCue.Autorizado.getApellidos() + ObjCue.Autorizado.getNombres());
            double saldo = ObjCue.getSaldo();
            this.jTSaldo.setText(String.valueOf(saldo));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDepositarActionPerformed
        // TODO add your handling code here:
        int resultado = 0;
        Double depositar = Double.parseDouble(this.jTdepositar.getText());
        String NCuenta = this.jTNCuenta.getText();
        Double saldo = Double.parseDouble(this.jTSaldo.getText());
        String nuevoSaldo="";
        Double NSaldo = 0.0;
        NSaldo = saldo + depositar;
        System.out.println("cuanto "+NSaldo);
        nuevoSaldo = String.valueOf(NSaldo);

        try {
            System.out.println("empieza el try");

            resultado = ObjLogCue.Modificar(nuevoSaldo, NCuenta);

            System.out.println(resultado);
            System.out.println("resultado " + resultado);
            if (resultado == 1) {
                JOptionPane.showMessageDialog(this, "DATOS MODICADOS CON EXITO");

            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_jBDepositarActionPerformed

    private void jBRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRetirarActionPerformed
        // TODO add your handling code here:

        int resultado = 0;
        Double depositar = Double.parseDouble(this.jTdepositar.getText());
        String NCuenta = this.jTNCuenta.getText();
        Double saldo = Double.parseDouble(this.jTSaldo.getText());
        String nuevoSaldo="";
        Double NSaldo = 0.0;
        NSaldo = saldo - depositar;
        System.out.println("cuanto "+NSaldo);
        nuevoSaldo = String.valueOf(NSaldo);

        try {
            System.out.println("empieza el try");

            resultado = ObjLogCue.Modificar(nuevoSaldo, NCuenta);

            System.out.println(resultado);
            System.out.println("resultado " + resultado);
            if (resultado == 1) {
                JOptionPane.showMessageDialog(this, "DATOS MODICADOS CON EXITO");

            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jBRetirarActionPerformed

    public boolean BuscarCuenta() {
        ObjCue = ObjLogCue.BuscarCuenta(this.jTNCuenta.getText());
        System.out.println(ObjCue.getTipo());
        if (ObjCue.getTipo() == 0) //0 se crea con el objeto vacio
        {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(RealizarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDepositar;
    private javax.swing.JButton jBRetirar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTNCuenta;
    private javax.swing.JTextField jTSaldo;
    private javax.swing.JTextField jTdepositar;
    private javax.swing.JTextField jTextAutorizado;
    // End of variables declaration//GEN-END:variables
}