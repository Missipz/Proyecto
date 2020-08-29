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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author EstebanDC
 */
public class Trabajos extends javax.swing.JFrame {

    int contadorCliente = 0;
    int contadorCliente1 = 0;
    int longitud = 10;
    String Tabla;
    String fecha;
    String nomArchivo = "";

    /**
     * Creates new form Registrar
     */
    public Trabajos() {
        initComponents();

        CargarTable();
        //CargarFecha();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogEmpleado = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTemporalEmpleados = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        BtnAgregaEmpleado = new javax.swing.JButton();
        popupMenu1 = new java.awt.PopupMenu();
        ImpuTituloTrabajo = new javax.swing.JTextField();
        ImputDescripcionTrabajo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarTrabajo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        btnEliminartrabajo = new javax.swing.JButton();
        btnEditarEmpleado = new javax.swing.JButton();
        imputBuscarEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        imputClienteTrabajo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        imputEmpleadoTrabajo = new javax.swing.JTextField();
        ImputDuracionTrabajo = new javax.swing.JComboBox<>();
        datafecha1 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableBuscarCliente = new javax.swing.JTable();
        ImputFechaTrabajo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        DialogEmpleado.getContentPane().setLayout(new java.awt.GridBagLayout());

        TablaTemporalEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaTemporalEmpleados);

        DialogEmpleado.getContentPane().add(jScrollPane2, new java.awt.GridBagConstraints());

        jButton2.setText("jButton2");
        DialogEmpleado.getContentPane().add(jButton2, new java.awt.GridBagConstraints());

        BtnAgregaEmpleado.setText("Agregar");
        BtnAgregaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregaEmpleadoActionPerformed(evt);
            }
        });
        DialogEmpleado.getContentPane().add(BtnAgregaEmpleado, new java.awt.GridBagConstraints());

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(230, 80));
        setName("JframeEmpleado"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImpuTituloTrabajo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ImpuTituloTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpuTituloTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(ImpuTituloTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 115, 180, 35));

        ImputDescripcionTrabajo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ImputDescripcionTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputDescripcionTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(ImputDescripcionTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 115, 180, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Titulo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 180, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripcion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 180, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de inicio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 180, 50));

        btnGuardarTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/save_32.png"))); // NOI18N
        btnGuardarTrabajo.setText("Guardar Trabajo");
        btnGuardarTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 180, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 180, 50));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 720, 142));

        btnEliminartrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/delete.png"))); // NOI18N
        btnEliminartrabajo.setText("Eliminar Trabajo");
        btnEliminartrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminartrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminartrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 180, 50));

        btnEditarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-edit-48.png"))); // NOI18N
        btnEditarEmpleado.setText("Editar Trabajo");
        btnEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 180, 50));

        imputBuscarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        imputBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputBuscarEmpleadoActionPerformed(evt);
            }
        });
        imputBuscarEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                imputBuscarEmpleadoKeyTyped(evt);
            }
        });
        getContentPane().add(imputBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 180, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modulo de Trabajos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 510, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/close.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 180, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Días");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 180, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cliente:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 180, 50));

        imputClienteTrabajo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        imputClienteTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imputClienteTrabajoMouseClicked(evt);
            }
        });
        imputClienteTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputClienteTrabajoActionPerformed(evt);
            }
        });
        imputClienteTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                imputClienteTrabajoKeyTyped(evt);
            }
        });
        getContentPane().add(imputClienteTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 180, 35));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Empleado a Cargo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 180, 50));

        imputEmpleadoTrabajo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        imputEmpleadoTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imputEmpleadoTrabajoMouseClicked(evt);
            }
        });
        imputEmpleadoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputEmpleadoTrabajoActionPerformed(evt);
            }
        });
        imputEmpleadoTrabajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imputEmpleadoTrabajoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                imputEmpleadoTrabajoKeyTyped(evt);
            }
        });
        getContentPane().add(imputEmpleadoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 180, 35));

        ImputDuracionTrabajo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ImputDuracionTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4\t", "5\t", "6\t", "7\t", "8\t", "9\t", "10", "11\t", "12\t", "13\t", "14\t", "15\t", "16\t", "17\t", "18\t", "19\t", "20", "21\t", "22\t", "23\t", "24\t", "25\t", "26\t", "27\t", "28\t", "29\t", "30", "31\t", "32\t", "33\t", "34\t", "35\t", "36\t", "37\t", "38\t", "39\t", "40", "41\t", "42\t", "43\t", "44\t", "45\t", "46\t", "47\t", "48\t", "49\t", "50", "51\t", "52\t", "53\t", "54\t", "55\t", "56\t", "57\t", "58\t", "59\t", "60", "61\t", "62\t", "63\t", "64\t", "65\t", "66\t", "67\t", "68\t", "69\t", "70", "71\t", "72\t", "73\t", "74\t", "75\t", "76\t", "77\t", "78\t", "79\t", "80", "81\t", "82\t", "83\t", "84", "85\t", "86\t", "87\t", "88\t", "89", "90", " " }));
        ImputDuracionTrabajo.setName("ImputDuracionTrabajo"); // NOI18N
        getContentPane().add(ImputDuracionTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 80, 35));
        getContentPane().add(datafecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 115, 140, -1));

        TableBuscarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBuscarClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableBuscarCliente);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 480, 60));

        ImputFechaTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputFechaTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(ImputFechaTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 122, 100, 10));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Duracion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 180, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/fondo 1.jpg"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(790, 550));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 700));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Duracion:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 132, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void LimpiarCampos(){
       ImpuTituloTrabajo.setText("");
            ImputDescripcionTrabajo.setText("");
            ImputDuracionTrabajo.setSelectedItem("1");
            imputClienteTrabajo.setText("");
            imputEmpleadoTrabajo.setText("");
   }
    public void LimpiarTablas(){
       String[] encabezado = {""};
         DefaultTableModel model = new DefaultTableModel(null, encabezado);
        TableBuscarCliente.setModel(model);
   } 
    public void CargarClientes() {
        contadorCliente1 = 0;
        int num = 0;
        String barra = File.separator;
        String ubicacion = System.getProperty("user.dir") + barra + Tabla + barra;
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

        TableBuscarCliente.setModel(model);
        TableBuscarCliente.removeColumn(TableBuscarCliente.getColumnModel().getColumn(0));
        TableBuscarCliente.removeColumn(TableBuscarCliente.getColumnModel().getColumn(2));

    }

//    public Date CargarFecha() {
//        Date objDate = new Date();
//        String strDateFormat = "dd-MMM-yyyy  hh: mm: ss a";
//        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
//        ImputFechaTrabajo.setText(objSDF.format(objDate).toString());
//        /*Inicio cambio kris*/
//        //jDPFecha.setDate(objDate);
//        /*Fin cambio kris*/
//        return objDate;
//    }
    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model1 = (DefaultTableModel) jtClientes.getModel();
        nomArchivo = (String) model1.getValueAt(jtClientes.getSelectedRow(), 0);
        ImpuTituloTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 1));
        ImputDescripcionTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 2));
        ImputFechaTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 3));
        /*Inicio cambio kris*/
        //jDPFecha.setDate((Date) model1.getValueAt(jtClientes.getSelectedRow(), 3));
        /*Fin cambio kris*/
        ImputDuracionTrabajo.setSelectedItem((String) model1.getValueAt(jtClientes.getSelectedRow(), 4));
        imputClienteTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 5));
        imputEmpleadoTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 6));
         try {
      String fecha =ImputFechaTrabajo.getText();
      SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy hh: mm");
      Date fechaDate = formato.parse(fecha);
      datafecha1.setDate(fechaDate);
      } catch (Exception ex) {
       
      }  
    }//GEN-LAST:event_jtClientesMouseClicked

    private void btnGuardarTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTrabajoActionPerformed
        // TODO add your handling code here:
        GuardarCliente();
        LimpiarTablas();
    }//GEN-LAST:event_btnGuardarTrabajoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imputBuscarEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imputBuscarEmpleadoKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_imputBuscarEmpleadoKeyTyped

    private void imputBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputBuscarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputBuscarEmpleadoActionPerformed

    private void ImputDescripcionTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputDescripcionTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputDescripcionTrabajoActionPerformed

    private void btnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoActionPerformed
        // TODO add your handling code here:
        contadorCliente = Integer.parseInt(nomArchivo);
        GuardarCliente();
         LimpiarTablas();
    }//GEN-LAST:event_btnEditarEmpleadoActionPerformed

    private void ImpuTituloTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpuTituloTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImpuTituloTrabajoActionPerformed

    private void btnEliminartrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminartrabajoActionPerformed
        // TODO add your handling code here:
        int codigo = JOptionPane.showConfirmDialog(null, "Deseas eliminar el Empleado: " + ImpuTituloTrabajo.getText(), "Atencion", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (codigo == JOptionPane.YES_OPTION) {
            Eliminar(nomArchivo);
            LimpiarCampos();
            //btnEliminarUsuario.setVisible(false);
        }
    }//GEN-LAST:event_btnEliminartrabajoActionPerformed

    private void imputClienteTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputClienteTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputClienteTrabajoActionPerformed

    private void imputEmpleadoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputEmpleadoTrabajoActionPerformed

    }//GEN-LAST:event_imputEmpleadoTrabajoActionPerformed

    private void BtnAgregaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregaEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregaEmpleadoActionPerformed

    private void ImputFechaTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputFechaTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputFechaTrabajoActionPerformed

    private void imputClienteTrabajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imputClienteTrabajoKeyTyped


    }//GEN-LAST:event_imputClienteTrabajoKeyTyped

    private void TableBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBuscarClienteMouseClicked
        DefaultTableModel model1 = (DefaultTableModel) TableBuscarCliente.getModel();
        if (Tabla == "Clientes") {

            imputClienteTrabajo.setText((String) model1.getValueAt(TableBuscarCliente.getSelectedRow(), 1));

        } else {

            imputEmpleadoTrabajo.setText((String) model1.getValueAt(TableBuscarCliente.getSelectedRow(), 1));

        }

        // TODO add your handling code here:

    }//GEN-LAST:event_TableBuscarClienteMouseClicked

    private void imputEmpleadoTrabajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imputEmpleadoTrabajoKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_imputEmpleadoTrabajoKeyTyped

    private void imputEmpleadoTrabajoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imputEmpleadoTrabajoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputEmpleadoTrabajoKeyPressed

    private void imputEmpleadoTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imputEmpleadoTrabajoMouseClicked
        Tabla = "Empleados";
        CargarClientes();
        
        
    }//GEN-LAST:event_imputEmpleadoTrabajoMouseClicked

    private void imputClienteTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imputClienteTrabajoMouseClicked
        Tabla = "Clientes";
        CargarClientes();        // TODO add your handling code here:
    }//GEN-LAST:event_imputClienteTrabajoMouseClicked

    public void GuardarCliente() {
            //Cambios Esteban Poner fechas 
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy hh: mm");
        String date = dFormat.format(datafecha1.getDate());
        ImputFechaTrabajo.setText(date);
        // FIN Cambios Esteban Poner fechas 
// TODO add your handling code here:
        ClassTrabajos nuevotrabajo = new ClassTrabajos();
        nuevotrabajo.setTitulo(ImpuTituloTrabajo.getText());
        nuevotrabajo.setDescripcion(ImputDescripcionTrabajo.getText());
        nuevotrabajo.setFecha(ImputFechaTrabajo.getText());
        /* Inicio cambio kris*/
        //nuevotrabajo.setFecha(jDPFecha.getDate().toString());
        /* Fin cambio kris */
        nuevotrabajo.setDuracion(String.valueOf(ImputDuracionTrabajo.getSelectedItem()));
        nuevotrabajo.setCliente(imputClienteTrabajo.getText());
        nuevotrabajo.setEmpleado(imputEmpleadoTrabajo.getText());
        nuevotrabajo.setIndice(contadorCliente);

        if ((ImpuTituloTrabajo.getText().length() == 0) || (ImputDescripcionTrabajo.getText().length() == 0) || (ImputFechaTrabajo.getText().length() == 0)
                || (imputClienteTrabajo.getText().length() == 0) || (imputEmpleadoTrabajo.getText().length() == 0)) {
            JOptionPane.showMessageDialog(null, "ERROR: EXISTEN CAMPOS VACIDOS", "ALERTA", JOptionPane.WARNING_MESSAGE);
        } else {
            
            LimpiarCampos();
            nuevotrabajo.CargarTrabajos(jtClientes);
            CargarTable();
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
        String ubicacion = System.getProperty("user.dir") + barra + "Trabajos" + barra;
        File archivo = new File(ubicacion);
        FileReader leerArchivo = null;
        File[] registro = archivo.listFiles();
        String[] encabezado = {"ID", "TITULO", "DESCRPCION", "FECHA", "DURACION", "CLIENTE", "EMPLEADO"};
        DefaultTableModel model = new DefaultTableModel(null, encabezado);
        for (int i = 0; i < registro.length; i++) {
            File url = new File(ubicacion + registro[i].getName());

            try {
                FileInputStream fis = new FileInputStream(url);
                Properties mostrar = new Properties();
                mostrar.load(fis);

                String filas[] = {registro[i].getName().replace(".txt", ""),
                    mostrar.getProperty("titulo"), mostrar.getProperty("descripcion"),
                    mostrar.getProperty("fecha"), mostrar.getProperty("duracion"),
                    mostrar.getProperty("cliente"), mostrar.getProperty("empleado")};
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
        String ubicacion = System.getProperty("user.dir") + barra + "Trabajos" + barra;
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
    TableRowSorter trs;

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
            java.util.logging.Logger.getLogger(Trabajos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trabajos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trabajos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trabajos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trabajos().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregaEmpleado;
    private javax.swing.JDialog DialogEmpleado;
    private javax.swing.JTextField ImpuTituloTrabajo;
    private javax.swing.JTextField ImputDescripcionTrabajo;
    private javax.swing.JComboBox<String> ImputDuracionTrabajo;
    private javax.swing.JTextField ImputFechaTrabajo;
    private javax.swing.JTable TablaTemporalEmpleados;
    private javax.swing.JTable TableBuscarCliente;
    private javax.swing.JButton btnEditarEmpleado;
    private javax.swing.JButton btnEliminartrabajo;
    private javax.swing.JButton btnGuardarTrabajo;
    private com.toedter.calendar.JDateChooser datafecha1;
    private javax.swing.JTextField imputBuscarEmpleado;
    private javax.swing.JTextField imputClienteTrabajo;
    private javax.swing.JTextField imputEmpleadoTrabajo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtClientes;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
