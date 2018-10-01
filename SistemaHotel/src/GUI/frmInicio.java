/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author STALIN
 */
public class frmInicio extends javax.swing.JFrame {

    /**
     * Creates new form frmInicio
     */
    public frmInicio() {
        initComponents();
        this.setExtendedState(frmInicio.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Reserva de Habitacion y Gestion de Ventas - HOTEL CATAMAYO");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblIdPersona = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApaterno = new javax.swing.JLabel();
        lblAmaterno = new javax.swing.JLabel();
        lblAcceso = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuSisReserva = new javax.swing.JMenu();
        mnuArchivo = new javax.swing.JMenu();
        copyMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        mnuReservas = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        mnuConfiguraciones = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuHerramientas = new javax.swing.JMenu();
        mnuAyuda = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(0, 204, 204));

        lblIdPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIdPersona.setText("jLabel1");
        escritorio.add(lblIdPersona);
        lblIdPersona.setBounds(20, 40, 110, 14);

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setText("jLabel2");
        escritorio.add(lblNombre);
        lblNombre.setBounds(20, 70, 110, 14);

        lblApaterno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApaterno.setText("jLabel3");
        escritorio.add(lblApaterno);
        lblApaterno.setBounds(20, 100, 110, 14);

        lblAmaterno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAmaterno.setText("jLabel4");
        escritorio.add(lblAmaterno);
        lblAmaterno.setBounds(20, 140, 110, 14);

        lblAcceso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAcceso.setText("jLabel5");
        escritorio.add(lblAcceso);
        lblAcceso.setBounds(20, 180, 110, 14);

        mnuSisReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Inicio.png"))); // NOI18N
        mnuSisReserva.setMnemonic('f');
        mnuSisReserva.setText("SisReserva");
        menuBar.add(mnuSisReserva);

        mnuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Archivo.png"))); // NOI18N
        mnuArchivo.setMnemonic('e');
        mnuArchivo.setText("Archivo");

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/habitaciones.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Habitaciones");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        mnuArchivo.add(copyMenuItem);

        deleteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        deleteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/productos.png"))); // NOI18N
        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Productos");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        mnuArchivo.add(deleteMenuItem);

        menuBar.add(mnuArchivo);

        mnuReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Reservas.png"))); // NOI18N
        mnuReservas.setMnemonic('h');
        mnuReservas.setText("Reservas");

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/reservas-consumos.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Reservas y Consumos");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        mnuReservas.add(contentMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clientes.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Clientes");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        mnuReservas.add(aboutMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/pagos.png"))); // NOI18N
        jMenuItem1.setText("Pagos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuReservas.add(jMenuItem1);

        menuBar.add(mnuReservas);

        mnuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Consultas.png"))); // NOI18N
        mnuConsultas.setText("Consultas");
        menuBar.add(mnuConsultas);

        mnuConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Configuraciones.png"))); // NOI18N
        mnuConfiguraciones.setText("Configuraciones");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/trabajadores.png"))); // NOI18N
        jMenuItem2.setText("Usuarios y Accesos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuConfiguraciones.add(jMenuItem2);

        menuBar.add(mnuConfiguraciones);

        mnuHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Herramientas.png"))); // NOI18N
        mnuHerramientas.setText("Herramientas");
        menuBar.add(mnuHerramientas);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Ayuda.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Acerca de..");
        mnuAyuda.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Ayuda");
        mnuAyuda.add(jMenuItem4);

        menuBar.add(mnuAyuda);

        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Salir.png"))); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        menuBar.add(mnuSalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
        frmHabitacion form = new frmHabitacion();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        // TODO add your handling code here:
        frmProducto form = new frmProducto();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        frmCliente form = new frmCliente();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmTrabajador form = new frmTrabajador();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mnuSalirMouseClicked

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
        frmReserva form = new frmReserva();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        frmReserva.txtIdTrabajador.setText(lblIdPersona.getText());
        frmReserva.txtTrabajador.setText(lblNombre.getText()+" "+lblApaterno.getText());
        frmReserva.intIdUsuario = Integer.parseInt(lblIdPersona.getText());
    }//GEN-LAST:event_contentMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JLabel lblAcceso;
    public static javax.swing.JLabel lblAmaterno;
    public static javax.swing.JLabel lblApaterno;
    public static javax.swing.JLabel lblIdPersona;
    public static javax.swing.JLabel lblNombre;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    public static javax.swing.JMenu mnuConfiguraciones;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenu mnuHerramientas;
    private javax.swing.JMenu mnuReservas;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JMenu mnuSisReserva;
    // End of variables declaration//GEN-END:variables

}
