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
public class ClassGuardarEmpleadosClientes extends ClassConexiones {

    private String ubicacion;

    public ClassGuardarEmpleadosClientes(String ubicacion, String titulo, String descripcion, String fecha, String duracion, String cliente, String empleado, String nombre, String telefono, String correo, int indice) {
        super(titulo, descripcion, fecha, duracion, cliente, empleado, nombre, telefono, correo, indice);
        this.ubicacion = ubicacion;
    }

    public void CargarEmpleados(JTable tabla) {
        ubicacion = System.getProperty("user.dir") + getBarra() + getEmpleado() + getBarra();
        String archivo = getIndice() + ".txt";
        File crea_ubicacion = new File(getUbicacion());
        File crea_archivo = new File(getUbicacion() + archivo);
        try {
            crea_ubicacion.mkdirs();
            Formatter crea = new Formatter(getUbicacion() + archivo);
            System.out.println(crea);
            crea.format("%s\r\n%s\r\n%s\r\n", "nombre=" + this.getNombre(), "correo=" + this.getCorreo(), "telefono=" + this.getTelefono());
            crea.close();
        } catch (Exception e) {
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

}
