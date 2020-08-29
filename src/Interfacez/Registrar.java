/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacez;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author EstebanDC
 */
public class Registrar extends javax.swing.JFrame {

    int contadorCliente = 0;
    int longitud = 10;
    String nomArchivo = "";

    /**
     * Creates new form Registrar
     */
    public Registrar() {
        initComponents();
        CargarTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        ImputNombreCliente = new javax.swing.JTextField();
        ImputCorreoCliente = new javax.swing.JTextField();
        ImputTelefonoCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        btnEliminaCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        imputBuscarCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setLocation(new java.awt.Point(290, 80));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImputNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ImputNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputNombreClienteActionPerformed(evt);
            }
        });
        getContentPane().add(ImputNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 230, 35));

        ImputCorreoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ImputCorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputCorreoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(ImputCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 230, 35));

        ImputTelefonoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ImputTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputTelefonoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(ImputTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 180, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 180, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 180, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 180, 50));

        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/save_32.png"))); // NOI18N
        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 150, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 195, 180, 50));

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 600, 170));

        btnEliminaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/delete.png"))); // NOI18N
        btnEliminaCliente.setText("Eliminar");
        btnEliminaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 150, 50));

        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-edit-48.png"))); // NOI18N
        btnEditarCliente.setText("Editar ");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 150, 50));

        imputBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        imputBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputBuscarClienteActionPerformed(evt);
            }
        });
        imputBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                imputBuscarClienteKeyTyped(evt);
            }
        });
        getContentPane().add(imputBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 195, 180, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REGISTRO DE CLIENTES ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 500, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/close.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 150, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 790, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void LimpiarCampos(){
        ImputNombreCliente.setText("");
            ImputCorreoCliente.setText("");
            ImputTelefonoCliente.setText("");
   }
    public void GuardarCliente() {

        ClassGuardarEmpleadosClientes cliente = new ClassGuardarEmpleadosClientes("", "", "", "", "", "", "Clientes",
                ImputNombreCliente.getText(),
                ImputTelefonoCliente.getText(),
                ImputCorreoCliente.getText(),
                contadorCliente);
        if ((ImputNombreCliente.getText().length() == 0) || (ImputCorreoCliente.getText().length() == 0) || (ImputTelefonoCliente.getText().length() == 0)) {
            JOptionPane.showMessageDialog(null, "ERROR: EXISTEN CAMPOS VACIDOS", "ALERTA", JOptionPane.WARNING_MESSAGE);
        
        } else {
            String correo=ImputCorreoCliente.getText();
            String telefono=ImputTelefonoCliente.getText();
        int arroba = 0;
        boolean punto = false;
        for (int i = 0; i < correo.length(); i++) {
                    if (correo.charAt(i) == '@') {

                        arroba++;

                    }
                    if (correo.charAt(i) == '.') {
                        punto = true;
                    }
                    if (arroba == 1 && punto == true) {
                        System.out.println("Bingo ");
                    }
                    
                }
        try{
            
           
        if (correo.length() > 6&&arroba == 1 && punto == true) {

              //sdfdfd 
              if (telefono.matches("[0-9]+") && telefono.length() == 8) {
                   LimpiarCampos();
            cliente.CargarEmpleados(jtClientes);
            CargarTable(); 
              }else{
                 throw new CorreoExcepcion("ERROR: FORMATO DE TELEFONO INVALIDO "); 
              }
             
            }else{
            throw new CorreoExcepcion("ERROR: FORMATO DE CORREO INVALIDO ");
        }
        }catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,ex.getMessage());

        }
            
        }

        if (contadorCliente < 10) {
            longitud = contadorCliente;
        }
        contadorCliente++;
        // OcultaObjetos();
    }

    public void CargarTable() {
        contadorCliente = 0;
        int num = 0;
        String barra = File.separator;
        String ubicacion = System.getProperty("user.dir") + barra + "Clientes" + barra;
        File archivo = new File(ubicacion);
        FileReader leerArchivo = null;
        File[] registro = archivo.listFiles();
        String[] encabezado = {"ID", "NOMBRE", "CORREO", "TELEFONO"};
        DefaultTableModel model = new DefaultTableModel(null, encabezado);
        for (int i = 0; i < registro.length; i++) {
            File url = new File(ubicacion + registro[i].getName());

            try {
                FileInputStream fis = new FileInputStream(url);
                Properties mostrar = new Properties();
                mostrar.load(fis);

                String filas[] = {registro[i].getName().replace(".txt", ""),
                    mostrar.getProperty("nombre"), mostrar.getProperty("correo"),
                    mostrar.getProperty("telefono")};
                model.addRow(filas);
                num = Integer.parseInt(registro[i].getName().replace(".txt", ""));
                fis.close();

                if (num > contadorCliente) {

                    contadorCliente = num;
                }
            } catch (Exception e) {

            }

        }
        contadorCliente = contadorCliente + 1;
        jtClientes.setModel(model);
        jtClientes.removeColumn(jtClientes.getColumnModel().getColumn(0));

    }

    public void Eliminar(String nomArchivo) {

        String barra = File.separator;
        String ubicacion = System.getProperty("user.dir") + barra + "Clientes" + barra;
        File archivo2 = new File(ubicacion + nomArchivo + ".txt");
        System.out.println(archivo2);
        if (archivo2.delete()) {
            JOptionPane.showMessageDialog(null, "El archivo se borro correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "El archivo no se a eliminado");
        }
        CargarTable();
        //LimpiarEntradas();

    }

    private void ImputCorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputCorreoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputCorreoClienteActionPerformed

    private void ImputTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputTelefonoClienteActionPerformed

    private void ImputNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputNombreClienteActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        // TODO add your handling code here:
        GuardarCliente(); 
        
        
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnEliminaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaClienteActionPerformed
        // TODO add your handling code here:
        int codigo = JOptionPane.showConfirmDialog(null, "Deseas eliminar el Usuario: " + ImputNombreCliente.getText(), "Atencion", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (codigo == JOptionPane.YES_OPTION) {
            Eliminar(nomArchivo);
            LimpiarCampos();
            //btnEliminarUsuario.setVisible(false);
        }
    }//GEN-LAST:event_btnEliminaClienteActionPerformed

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model1 = (DefaultTableModel) jtClientes.getModel();
        nomArchivo = (String) model1.getValueAt(jtClientes.getSelectedRow(), 0);
        ImputNombreCliente.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 1));
        ImputCorreoCliente.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 2));
        ImputTelefonoCliente.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 3));


    }//GEN-LAST:event_jtClientesMouseClicked

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        // TODO add your handling code here:
        contadorCliente = Integer.parseInt(nomArchivo);
        GuardarCliente();
    }//GEN-LAST:event_btnEditarClienteActionPerformed
    TableRowSorter trs;
    private void imputBuscarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imputBuscarClienteKeyTyped
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jtClientes.getModel();
        imputBuscarCliente.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                super.keyReleased(ke); //To change body of generated methods, choose Tools | Templates.
                trs.setRowFilter(RowFilter.regexFilter(imputBuscarCliente.getText(), 0));
            }

        });
        trs = new TableRowSorter(model);
        jtClientes.setRowSorter(trs);
    }//GEN-LAST:event_imputBuscarClienteKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imputBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputBuscarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ImputCorreoCliente;
    private javax.swing.JTextField ImputNombreCliente;
    private javax.swing.JTextField ImputTelefonoCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminaCliente;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JTextField imputBuscarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtClientes;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
