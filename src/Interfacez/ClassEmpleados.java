/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacez;

import java.io.File;
import java.util.Formatter;
import javax.swing.JTable;

/**
 *
 * @author Missi
 */
public class ClassEmpleados {
   private String nombre;
     private String  telefono;
     private String correo;
     private int indice;
     private String barra=File.separator;
     private String ubicacion=System.getProperty("user.dir")+barra+"Empleados"+barra;
    
     public  void CargarEmpleados (JTable tabla){
          
         String archivo=getIndice()+".txt";
         File crea_ubicacion =new File(getUbicacion());
         File crea_archivo =new File(getUbicacion()+archivo); 
         try {
         crea_ubicacion.mkdirs();
         Formatter crea =new Formatter(getUbicacion()+archivo); 
         System.out.println(crea);
         crea.format("%s\r\n%s\r\n%s\r\n","nombre="+this.getNombre(),"correo="+this.getCorreo(),"telefono="+this.getTelefono());
         crea.close();
         } catch (Exception e) {
         }
}

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }

    /**
     * @return the barra
     */
    public String getBarra() {
        return barra;
    }

    /**
     * @param barra the barra to set
     */
    public void setBarra(String barra) {
        this.barra = barra;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
     
     
}
