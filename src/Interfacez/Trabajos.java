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
public class Trabajos extends javax.swing.JFrame {
int contadorCliente=0;
int longitud =10;
String nomArchivo="";

    /**
     * Creates new form Registrar
     */
    public Trabajos() {
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

        ImpuTituloTrabajo = new javax.swing.JTextField();
        ImputDescripcionTrabajo = new javax.swing.JTextField();
        ImputFechaTrabajo = new javax.swing.JTextField();
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
        imputDuracionTrabajo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        imputClienteTrabajo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        imputEmpleadoTrabajo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(400, 200));
        setName("JframeEmpleado"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImpuTituloTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpuTituloTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(ImpuTituloTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 151, -1));

        ImputDescripcionTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputDescripcionTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(ImputDescripcionTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 225, -1));

        ImputFechaTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImputFechaTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(ImputFechaTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 121, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Titulo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripcion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        btnGuardarTrabajo.setIcon(new javax.swing.ImageIcon("C:\\Users\\EstebanDC\\Documents\\NetBeansProjects\\Proyecto\\img\\save_32.png")); // NOI18N
        btnGuardarTrabajo.setText("Guardar Trabajo");
        btnGuardarTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 707, 142));

        btnEliminartrabajo.setIcon(new javax.swing.ImageIcon("C:\\Users\\EstebanDC\\Documents\\NetBeansProjects\\Proyecto\\img\\eliminar.png")); // NOI18N
        btnEliminartrabajo.setText("Eliminar Trabajo");
        btnEliminartrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminartrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminartrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 170, 50));

        btnEditarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icons8-edit-48.png"))); // NOI18N
        btnEditarEmpleado.setText("Editar Trabajo");
        btnEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 190, 50));

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
        getContentPane().add(imputBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 132, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modulo de Trabajos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 260, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/close.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 140, 50));

        jLabel2.setText("Duracion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 132, -1));
        getContentPane().add(imputDuracionTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 105, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cliente:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        imputClienteTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputClienteTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(imputClienteTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 151, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Empleado a Cargo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        imputEmpleadoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imputEmpleadoTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(imputEmpleadoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 225, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/fondo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 740, 400));

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model1 = (DefaultTableModel) jtClientes.getModel();
        nomArchivo = (String) model1.getValueAt(jtClientes.getSelectedRow(), 0);
        ImpuTituloTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 1));
        ImputDescripcionTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 2));
        ImputFechaTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 3));
        imputDuracionTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 4));
        imputClienteTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 5));
        imputEmpleadoTrabajo.setText((String) model1.getValueAt(jtClientes.getSelectedRow(), 6));

    }//GEN-LAST:event_jtClientesMouseClicked

    private void btnGuardarTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTrabajoActionPerformed
        // TODO add your handling code here:
        GuardarCliente();
    }//GEN-LAST:event_btnGuardarTrabajoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ImputFechaTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputFechaTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputFechaTrabajoActionPerformed

    private void imputBuscarEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imputBuscarEmpleadoKeyTyped
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jtClientes.getModel();
        imputBuscarEmpleado.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke) {
                super.keyReleased(ke); //To change body of generated methods, choose Tools | Templates.
                trs.setRowFilter(RowFilter.regexFilter(imputBuscarEmpleado.getText(), 0));
            }

        });
        trs= new TableRowSorter(model);
        jtClientes.setRowSorter(trs);
    }//GEN-LAST:event_imputBuscarEmpleadoKeyTyped

    private void imputBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputBuscarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputBuscarEmpleadoActionPerformed

    private void ImputDescripcionTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImputDescripcionTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImputDescripcionTrabajoActionPerformed

    private void btnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoActionPerformed
        // TODO add your handling code here:
        contadorCliente=Integer.parseInt(nomArchivo);
        GuardarCliente();
    }//GEN-LAST:event_btnEditarEmpleadoActionPerformed

    private void ImpuTituloTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpuTituloTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImpuTituloTrabajoActionPerformed

    private void btnEliminartrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminartrabajoActionPerformed
        // TODO add your handling code here:
        int codigo=JOptionPane.showConfirmDialog(null,"Deseas eliminar el Empleado: "+ImpuTituloTrabajo.getText(), "Atencion", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (codigo==JOptionPane.YES_OPTION){
            Eliminar(nomArchivo);
            //btnEliminarUsuario.setVisible(false);
        }
    }//GEN-LAST:event_btnEliminartrabajoActionPerformed

    private void imputClienteTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputClienteTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputClienteTrabajoActionPerformed

    private void imputEmpleadoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imputEmpleadoTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imputEmpleadoTrabajoActionPerformed

    public void GuardarCliente(){
    
          ClassTrabajos nuevotrabajo =new ClassTrabajos();
          nuevotrabajo.setTitulo(ImpuTituloTrabajo.getText());
        nuevotrabajo.setDescripcion(ImputDescripcionTrabajo.getText());
        nuevotrabajo.setFecha(ImputFechaTrabajo.getText());
        nuevotrabajo.setDuracion(imputDuracionTrabajo.getText());
        nuevotrabajo.setCliente(imputClienteTrabajo.getText());
        nuevotrabajo.setEmpleado(imputEmpleadoTrabajo.getText());
        nuevotrabajo.setIndice(contadorCliente);
        if ((ImpuTituloTrabajo.getText().length()==0)||(ImputDescripcionTrabajo.getText().length()==0)||(ImputFechaTrabajo.getText().length()==0)
                ||(imputDuracionTrabajo.getText().length()==0)||(imputClienteTrabajo.getText().length()==0)||(imputEmpleadoTrabajo.getText().length()==0)){
            JOptionPane.showMessageDialog(null, "ERROR: EXISTEN CAMPOS VACIDOS", "ALERTA", JOptionPane.WARNING_MESSAGE);
        }else{
            ImpuTituloTrabajo.setText("");
            ImputDescripcionTrabajo.setText("");
            ImputFechaTrabajo.setText("");
            imputDuracionTrabajo.setText("");
            imputClienteTrabajo.setText("");
            imputEmpleadoTrabajo.setText("");
            nuevotrabajo.CargarTrabajos(jtClientes);
            CargarTable();
        }
        
      
            if (contadorCliente<10) {
                longitud=contadorCliente;  
        }
      contadorCliente++;
     // OcultaObjetos();
}
    
public void CargarTable(){
        contadorCliente=0;
        int num=0;
        String barra=File.separator;
         String ubicacion=System.getProperty("user.dir")+barra+"Trabajos"+barra;
        File archivo=new File(ubicacion);
        FileReader leerArchivo=null;
        File[]registro=archivo.listFiles();
        String[]encabezado={"ID","TITULO","DESCRPCION","FECHA","DURACION","CLIENTE","EMPLEADO"};
            DefaultTableModel  model= new DefaultTableModel(null,encabezado);
        for (int i=0;i<registro.length;i++){
            File url=new File(ubicacion+registro[i].getName());
    
        try {
            FileInputStream fis=new FileInputStream(url);
            Properties mostrar =new Properties();
            mostrar.load(fis);
            
            String filas[]={registro[i].getName().replace(".txt",""),
            mostrar.getProperty("titulo"),mostrar.getProperty("descripcion"),
            mostrar.getProperty("fecha"),mostrar.getProperty("duracion"),
            mostrar.getProperty("cliente"),mostrar.getProperty("empleado")};
            model.addRow(filas);
            num=Integer.parseInt (registro[i].getName().replace(".txt",""));
            fis.close();
           
            if(num>contadorCliente){
             
            contadorCliente=num;
        }
        } catch (Exception e) {
            
        }
             
           
        }
        contadorCliente=contadorCliente+1;
        jtClientes.setModel(model);
        jtClientes.removeColumn(jtClientes.getColumnModel().getColumn(0));
         
          
          
        
      
    }
public  void Eliminar(String nomArchivo){
         
        String barra=File.separator;
        String ubicacion=System.getProperty("user.dir")+barra+"Trabajos"+barra;
        File archivo2=new File(ubicacion+nomArchivo+".txt");
        System.out.println(archivo2);
        if (archivo2.delete()) {
            JOptionPane.showMessageDialog(null, "El archivo se borro correctamente");
        }else{
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
    private javax.swing.JTextField ImpuTituloTrabajo;
    private javax.swing.JTextField ImputDescripcionTrabajo;
    private javax.swing.JTextField ImputFechaTrabajo;
    private javax.swing.JButton btnEditarEmpleado;
    private javax.swing.JButton btnEliminartrabajo;
    private javax.swing.JButton btnGuardarTrabajo;
    private javax.swing.JTextField imputBuscarEmpleado;
    private javax.swing.JTextField imputClienteTrabajo;
    private javax.swing.JTextField imputDuracionTrabajo;
    private javax.swing.JTextField imputEmpleadoTrabajo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtClientes;
    // End of variables declaration//GEN-END:variables
}
