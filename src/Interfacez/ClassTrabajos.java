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
public class ClassTrabajos {
     private String titulo;
     private String  descripcion;
     private String fecha;
     private String duracion;
     private String cliente;
     private String empleado;
     private int indice;
     private String barra=File.separator;
     private String ubicacion=System.getProperty("user.dir")+barra+"Trabajos"+barra;
    
     public  void CargarTrabajos (JTable tabla){
          
         String archivo=getIndice()+".txt";
         File crea_ubicacion =new File(getUbicacion());
         File crea_archivo =new File(getUbicacion()+archivo); 
         try {
         crea_ubicacion.mkdirs();
         Formatter crea =new Formatter(getUbicacion()+archivo); 
         System.out.println(crea);
         crea.format("%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n%s\r\n","titulo="+this.getTitulo(),"descripcion="+this.getDescripcion(),"fecha="+this.getFecha()
                                                           ,"duracion="+this.getDuracion(),"cliente="+this.getCliente(),"fecha="+this.getEmpleado());
         crea.close();
         } catch (Exception e) {
         }
}

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the empleado
     */
    public String getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(String empleado) {
        this.empleado = empleado;
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

    /**
     * @return the nombre
     */
    
     
     
}
