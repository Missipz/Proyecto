/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfacez;

import java.io.File;

/**
 *
 * @author Missi
 */
public class ClassConexiones {
   private String titulo;
     private String  descripcion;
     private String fecha;
     private String duracion;
     private String cliente;
     private String empleado;
      private String nombre;
     private String  telefono;
     private String correo;
     private int indice;
     private String barra=File.separator; 

    public ClassConexiones(String titulo, String descripcion, String fecha, String duracion, String cliente, String empleado, String nombre, String telefono, String correo, int indice) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.duracion = duracion;
        this.cliente = cliente;
        this.empleado = empleado;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.indice = indice;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getCliente() {
        return cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getIndice() {
        return indice;
    }

    public String getBarra() {
        return barra;
    }
    
    
     
}
