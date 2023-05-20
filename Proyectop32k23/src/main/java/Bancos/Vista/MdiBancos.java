/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bancos.Vista;


import Seguridad.Vista.frmMantenimientoBitacora;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class MdiBancos extends javax.swing.JFrame {

    /**
     * Creates new form MdiGeneral
     */
    public MdiBancos() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MdiBancos.MAXIMIZED_BOTH);
        this.setTitle("MDI Bancos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        mnuGeneral = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuSalirSistema = new javax.swing.JCheckBoxMenuItem();
        mnuCatalogos = new javax.swing.JMenu();
        mnuCatalogosMantenimientos = new javax.swing.JMenu();
        mantenimientoConceptosBancos = new javax.swing.JCheckBoxMenuItem();
        MantenimientoTipoMoneda = new javax.swing.JCheckBoxMenuItem();
        mantenimientoTipoPersonaBancos = new javax.swing.JCheckBoxMenuItem();
        mantenimientoTipoMovimientoBancos = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        mantenimientoBancoExterno = new javax.swing.JCheckBoxMenuItem();
        mantenimientoTipoCuenta = new javax.swing.JCheckBoxMenuItem();
        mnuProcesos = new javax.swing.JMenu();
        cuentaEmpresa = new javax.swing.JCheckBoxMenuItem();
        MovDetallesBancos = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        consultaBitacora = new javax.swing.JCheckBoxMenuItem();
        mnuReportes = new javax.swing.JMenu();
        mnuAyudas = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnuArchivo.setText("Archivo");
        mnuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoActionPerformed(evt);
            }
        });

        mnuSalirSistema.setSelected(true);
        mnuSalirSistema.setText("Salir del Sistema");
        mnuSalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirSistemaActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuSalirSistema);

        mnuGeneral.add(mnuArchivo);

        mnuCatalogos.setText("Catalogos");

        mnuCatalogosMantenimientos.setText("Mantenimientos");
        mnuCatalogosMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientosActionPerformed(evt);
            }
        });

        mantenimientoConceptosBancos.setSelected(true);
        mantenimientoConceptosBancos.setText("Mantenimiento Conceptos Bancos");
        mantenimientoConceptosBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoConceptosBancosActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientos.add(mantenimientoConceptosBancos);

        MantenimientoTipoMoneda.setSelected(true);
        MantenimientoTipoMoneda.setText("Mantenimiento Tipo Moneda");
        MantenimientoTipoMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoTipoMonedaActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientos.add(MantenimientoTipoMoneda);

        mantenimientoTipoPersonaBancos.setSelected(true);
        mantenimientoTipoPersonaBancos.setText("Mantenimiento Tipo Persona Bancos");
        mantenimientoTipoPersonaBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoTipoPersonaBancosActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientos.add(mantenimientoTipoPersonaBancos);

        mantenimientoTipoMovimientoBancos.setSelected(true);
        mantenimientoTipoMovimientoBancos.setText("Mantenimiento Tipo Movimiento Bancos");
        mantenimientoTipoMovimientoBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoTipoMovimientoBancosActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientos.add(mantenimientoTipoMovimientoBancos);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Mantenimiento Cuentas Bancos");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientos.add(jCheckBoxMenuItem2);

        mantenimientoBancoExterno.setSelected(true);
        mantenimientoBancoExterno.setText("Mantenimiento Banco Externo");
        mantenimientoBancoExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoBancoExternoActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientos.add(mantenimientoBancoExterno);

        mantenimientoTipoCuenta.setSelected(true);
        mantenimientoTipoCuenta.setText("Mantenimiento Tipo Cuenta");
        mantenimientoTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoTipoCuentaActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientos.add(mantenimientoTipoCuenta);

        mnuCatalogos.add(mnuCatalogosMantenimientos);

        mnuGeneral.add(mnuCatalogos);

        mnuProcesos.setText("Procesos");

        cuentaEmpresa.setSelected(true);
        cuentaEmpresa.setText("Cuenta Empresa");
        cuentaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaEmpresaActionPerformed(evt);
            }
        });
        mnuProcesos.add(cuentaEmpresa);

        MovDetallesBancos.setText("Movimientos");
        MovDetallesBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovDetallesBancosActionPerformed(evt);
            }
        });
        mnuProcesos.add(MovDetallesBancos);

        mnuGeneral.add(mnuProcesos);

        mnuConsultas.setText("Consultas");
        mnuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultasActionPerformed(evt);
            }
        });

        consultaBitacora.setSelected(true);
        consultaBitacora.setText("Consulta de Bitacora");
        consultaBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaBitacoraActionPerformed(evt);
            }
        });
        mnuConsultas.add(consultaBitacora);

        mnuGeneral.add(mnuConsultas);

        mnuReportes.setText("Reportes");
        mnuGeneral.add(mnuReportes);

        mnuAyudas.setText("Ayudas");
        mnuGeneral.add(mnuAyudas);

        setJMenuBar(mnuGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCatalogosMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuCatalogosMantenimientosActionPerformed

    private void mnuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuArchivoActionPerformed

    private void mnuSalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirSistemaActionPerformed
        // TODO add your handling code here:
                /*===== OPERACIÓN CERRAR SESIÓN ====
          Variable entera respuesta_cs*/

        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión",            JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }        
    }//GEN-LAST:event_mnuSalirSistemaActionPerformed

    private void mnuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultasActionPerformed

    private void consultaBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaBitacoraActionPerformed
        // TODO add your handling code here:
        frmMantenimientoBitacora ventana = new frmMantenimientoBitacora();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_consultaBitacoraActionPerformed

    private void mantenimientoConceptosBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoConceptosBancosActionPerformed
        // TODO add your handling code here:
        frmMantenimientoConceptosBancos ventana = new frmMantenimientoConceptosBancos();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_mantenimientoConceptosBancosActionPerformed

    private void MantenimientoTipoMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoTipoMonedaActionPerformed
        // TODO add your handling code here:
            //Hecho por: Karla Sofia Góomez Tobar 9959-21-1896
        frmMantenimientoTipoMoneda ventana = new frmMantenimientoTipoMoneda();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_MantenimientoTipoMonedaActionPerformed

    private void mantenimientoTipoPersonaBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoTipoPersonaBancosActionPerformed
        // TODO add your handling code here:
        frmMantenimientoTipoPersonaBancos ventana = new frmMantenimientoTipoPersonaBancos();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_mantenimientoTipoPersonaBancosActionPerformed

    private void mantenimientoTipoMovimientoBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoTipoMovimientoBancosActionPerformed
        // TODO add your handling code here:
        frmMantenimientoTipoMovimientoBancos ventana = new frmMantenimientoTipoMovimientoBancos();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_mantenimientoTipoMovimientoBancosActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        frmMantenimientoCuentasBancos ventana = new frmMantenimientoCuentasBancos();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void cuentaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaEmpresaActionPerformed
        // TODO add your handling code here:
        frmCuentaEmpresa ventana = new frmCuentaEmpresa();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_cuentaEmpresaActionPerformed

    private void MovDetallesBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovDetallesBancosActionPerformed
        // TODO add your handling code here:
          frmMovimientoBancos ventana = new frmMovimientoBancos();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_MovDetallesBancosActionPerformed

    private void mantenimientoBancoExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoBancoExternoActionPerformed
        // TODO add your handling code here:
        frmBancoExterno ventana = new frmBancoExterno();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_mantenimientoBancoExternoActionPerformed

    private void mantenimientoTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoTipoCuentaActionPerformed
        // TODO add your handling code here:
        frmMantenimientoTipoCeuntas ventana = new frmMantenimientoTipoCeuntas();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_mantenimientoTipoCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(MdiBancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiBancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiBancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiBancos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MdiBancos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem MantenimientoTipoMoneda;
    private javax.swing.JMenuItem MovDetallesBancos;
    private javax.swing.JCheckBoxMenuItem consultaBitacora;
    private javax.swing.JCheckBoxMenuItem cuentaEmpresa;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JCheckBoxMenuItem mantenimientoBancoExterno;
    private javax.swing.JCheckBoxMenuItem mantenimientoConceptosBancos;
    private javax.swing.JCheckBoxMenuItem mantenimientoTipoCuenta;
    private javax.swing.JCheckBoxMenuItem mantenimientoTipoMovimientoBancos;
    private javax.swing.JCheckBoxMenuItem mantenimientoTipoPersonaBancos;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyudas;
    private javax.swing.JMenu mnuCatalogos;
    private javax.swing.JMenu mnuCatalogosMantenimientos;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenuBar mnuGeneral;
    private javax.swing.JMenu mnuProcesos;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JCheckBoxMenuItem mnuSalirSistema;
    // End of variables declaration//GEN-END:variables
}
