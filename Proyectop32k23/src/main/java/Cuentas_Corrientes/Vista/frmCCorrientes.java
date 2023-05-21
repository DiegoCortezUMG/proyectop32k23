/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas_Corrientes.Vista;


import Seguridad.Vista.*;
import Cuentas_Corrientes.Controlador.clsCCorrientes;
import Seguridad.Controlador.clsUsuarioConectado;
import Seguridad.Controlador.clsBitacora;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


/**
 *
 * @author visitante
 */
public class frmCCorrientes extends javax.swing.JInternalFrame {
    
//int codigoAplicacion=preguntar;

    public void llenadoDeCombos() {
        /*EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        List<Empleado> empleados = empleadoDAO.select();
        cbox_empleado.addItem("Seleccione una opción");
        for (int i = 0; i < empleados.size(); i++) {
            cbox_empleado.addItem(empleados.get(i).getNombreEmpleado());
        } */
    }

public void llenadoDeTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID CCorrientes");
        modelo.addColumn("Tipo de Cuenta");
        modelo.addColumn("ID Tipo Cuenta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Nombre de Cuenta");
        modelo.addColumn("No. Factura");
        modelo.addColumn("Total Factura");
        modelo.addColumn("Saldo");
        modelo.addColumn("Deuda");
        clsCCorrientes aplicacion = new clsCCorrientes();
        List<clsCCorrientes> listaAplicaciones = aplicacion.getListadoCC();
        tablaUsuarios.setModel(modelo);
        String[] dato = new String[9];
        for (int i = 0; i < listaAplicaciones.size(); i++) {
            dato[0] = Integer.toString(listaAplicaciones.get(i).getIdCCorriente());
            dato[1] = listaAplicaciones.get(i).getTipoCCorriente();
            dato[2] = Integer.toString(listaAplicaciones.get(i).getIdTipoCCorriente());
            dato[3] = listaAplicaciones.get(i).getFechaCCorriente();
            dato[4] = listaAplicaciones.get(i).getNombreCCorriente();
            dato[5] = listaAplicaciones.get(i).getNoFacturaCCorriente();
            dato[6] = listaAplicaciones.get(i).getFacturaCCorriente();
            dato[7] = listaAplicaciones.get(i).getSaldoCCorriente();
            dato[8] = listaAplicaciones.get(i).getDeudaCCorriente();
            modelo.addRow(dato);
        }   
    }
    
    int codigoAplicacion= 12;
    public frmCCorrientes() {
        initComponents();
        llenadoDeTabla();
        llenadoDeCombos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2 = new javax.swing.JLabel();
        lbusu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        txtIdtipoC = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtfecha = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        txtbuscado = new javax.swing.JTextField();
        txtTipoC = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        label8 = new javax.swing.JLabel();
        txtnombreC = new javax.swing.JTextField();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        txttotfac = new javax.swing.JTextField();
        txtsaldo = new javax.swing.JTextField();
        label11 = new javax.swing.JLabel();
        txtdeuda = new javax.swing.JTextField();
        label12 = new javax.swing.JLabel();
        txtnofac = new javax.swing.JTextField();

        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cuentas Corrientes Clientes");
        setToolTipText("");
        setVisible(true);

        tablaUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Vendedor", "ID Empleado", "Correo", "Telefono", "Direccion", "Porcentaje", "Comision"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        txtIdtipoC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtIdtipoC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtIdtipoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdtipoCActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label5.setText("Id Tipo Cuenta");

        lb.setForeground(new java.awt.Color(204, 204, 204));
        lb.setText(".");

        jButton2.setText("Ayuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label4.setText("ID a buscar");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtfecha.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtfecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label1.setText("Cuentas Corrientes Clientes");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label3.setText("Tipo de Cuenta");

        txtTipoC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTipoC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label6.setText("Fecha");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label8.setText("Nombre de Cuenta");

        txtnombreC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtnombreC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label9.setText("Total Factura");

        label10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label10.setText("Saldo");

        txttotfac.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txttotfac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txttotfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotfacActionPerformed(evt);
            }
        });

        txtsaldo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtsaldo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label11.setText("Deuda");

        txtdeuda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtdeuda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        label12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label12.setText("No. Factura");

        txtnofac.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtnofac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtnofac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnofacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbuscado)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label8)
                                .addGap(18, 18, 18)
                                .addComponent(txtnombreC))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6)
                                    .addComponent(label3)
                                    .addComponent(label5))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtfecha)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTipoC)
                                        .addComponent(txtIdtipoC, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label10)
                                    .addComponent(label11)
                                    .addComponent(label9))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsaldo)
                                    .addComponent(txttotfac)
                                    .addComponent(txtdeuda)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label12)
                                .addGap(63, 63, 63)
                                .addComponent(txtnofac)))
                        .addGap(25, 25, 25)
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(294, 411, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(label3)
                                        .addGap(12, 12, 12)
                                        .addComponent(label5)))
                                .addGap(12, 12, 12)
                                .addComponent(label6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(txtTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdtipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label8)
                            .addComponent(txtnombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label12)
                            .addComponent(txtnofac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label9)
                            .addComponent(txttotfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label10)
                                .addGap(7, 7, 7)
                                .addComponent(label11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdeuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try {
            if ((new File("src\\main\\java\\ayudas\\ProcesoMayor.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\ayudas\\ProcesoMayor.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no Fue encontrada");
            }
            System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        llenadoDeTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int registrosBorrados=0;
        clsCCorrientes transaccion = new clsCCorrientes();
        transaccion.setIdCCorriente(Integer.parseInt(txtbuscado.getText()));
        registrosBorrados=transaccion.setBorrarCC(transaccion);
        JOptionPane.showMessageDialog(null, "Registro Borrado\n","Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"DEL");
        llenadoDeTabla();
        limpiarTextos();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        clsCCorrientes transaccion = new clsCCorrientes();
        transaccion.setTipoCCorriente(txtTipoC.getText());
        transaccion.setIdTipoCCorriente(Integer.parseInt(txtIdtipoC.getText()));
        transaccion.setFechaCCorriente(txtfecha.getText());
        transaccion.setNombreCCorriente(txtnombreC.getText());
        transaccion.setNoFacturaCCorriente(txtnofac.getText());
        transaccion.setFacturaCCorriente(txttotfac.getText());
        transaccion.setSaldoCCorriente(txtsaldo.getText());
        transaccion.setDeudaCCorriente(txtdeuda.getText());
        transaccion.setIngresarCC(transaccion);
        JOptionPane.showMessageDialog(null, "Registro Ingresado\n", "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "INS");
        llenadoDeTabla();
        limpiarTextos();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        clsCCorrientes transaccion = new clsCCorrientes();
        //aplicacion.setNombreAplicacion(txtbuscado.getText());
        transaccion.setIdCCorriente(Integer.parseInt(txtbuscado.getText()));
        transaccion = transaccion.getBuscarInformacionCCPorId(transaccion);
        System.out.println("Cuenta Corriente retornada:" + transaccion);
        txtTipoC.setText(transaccion.getTipoCCorriente());
        txtIdtipoC.setText(String.valueOf(transaccion.getIdTipoCCorriente()));
        txtfecha.setText(transaccion.getFechaCCorriente());
        txtnombreC.setText(transaccion.getNombreCCorriente());
        txtnofac.setText(transaccion.getNoFacturaCCorriente());
        txttotfac.setText(transaccion.getFechaCCorriente());
        txtsaldo.setText(transaccion.getSaldoCCorriente());
        txtdeuda.setText(transaccion.getDeudaCCorriente());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //TODO add your handling code here:
        clsCCorrientes transaccion = new clsCCorrientes();
        transaccion.setIdCCorriente(Integer.parseInt(txtbuscado.getText()));
        transaccion.setTipoCCorriente(txtTipoC.getText());
        transaccion.setIdTipoCCorriente(Integer.parseInt(txtIdtipoC.getText()));
        transaccion.setFechaCCorriente(txtfecha.getText());
        transaccion.setNombreCCorriente(txtnombreC.getText());
        transaccion.setNoFacturaCCorriente(txtnofac.getText());
        transaccion.setFacturaCCorriente(txttotfac.getText());
        transaccion.setSaldoCCorriente(txtsaldo.getText());
        transaccion.setDeudaCCorriente(txtdeuda.getText());
        transaccion.setModificarCC(transaccion);
        JOptionPane.showMessageDialog(null, "Registro Modificado\n", "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
        int resultadoBitacora=0;
        clsBitacora bitacoraRegistro = new clsBitacora();
        resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(), codigoAplicacion, "UPD");
        llenadoDeTabla();
        limpiarTextos();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTextos();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txttotfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotfacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotfacActionPerformed

    private void txtnofacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnofacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnofacActionPerformed

    private void txtIdtipoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdtipoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdtipoCActionPerformed
    public void limpiarTextos()
    {
        txtTipoC.setText("");
        txtIdtipoC.setText("");
        txtfecha.setText("");
        txtnombreC.setText("");
        txtnofac.setText("");
        txttotfac.setText("");
        txtsaldo.setText("");
        txtdeuda.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbusu;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtIdtipoC;
    private javax.swing.JTextField txtTipoC;
    private javax.swing.JTextField txtbuscado;
    private javax.swing.JTextField txtdeuda;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtnofac;
    private javax.swing.JTextField txtnombreC;
    private javax.swing.JTextField txtsaldo;
    private javax.swing.JTextField txttotfac;
    // End of variables declaration//GEN-END:variables
}
