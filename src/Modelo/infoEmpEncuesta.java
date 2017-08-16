/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Encuesta_SocioDemografica;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class infoEmpEncuesta {
    private static String nombre;
    private static String apellido_materno;
    private static String apellido_paterno;
    private static String cargo;
    private static String area;
    
    
    Conexion conexion=new Conexion();
    Encuesta_SocioDemografica vista_encuesta=new Encuesta_SocioDemografica();
    public infoEmpEncuesta() {
    }

    public infoEmpEncuesta(String nombre, String apellido_materno, String apellido_paterno, String cargo, String area) {
        infoEmpEncuesta.nombre = nombre;
        infoEmpEncuesta.apellido_materno = apellido_materno;
        infoEmpEncuesta.apellido_paterno = apellido_paterno;
        infoEmpEncuesta.cargo = cargo;
        infoEmpEncuesta.area = area;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        infoEmpEncuesta.nombre = nombre;
    }

    public static String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        infoEmpEncuesta.apellido_materno = apellido_materno;
    }

    public static String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        infoEmpEncuesta.apellido_paterno = apellido_paterno;
    }

    public static String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        infoEmpEncuesta.cargo = cargo;
    }

    public static String getArea() {
        return area;
    }

    public void setArea(String area) {
        infoEmpEncuesta.area = area;
    }
    
    public ArrayList<infoEmpEncuesta> datosEmpEncuesta(String user, String contraseña){
       ArrayList<infoEmpEncuesta> arrayDatos=new ArrayList();
        infoEmpEncuesta empleadoEncuesta;
        try {
            Connection accederBD=conexion.getConexion();
           CallableStatement cs=accederBD.prepareCall("{call sp_datosEmpleadoEncuesta(?,?)}");
           cs.setString(1, user);
           cs.setString(2, contraseña);
           ResultSet rs=cs.executeQuery();
          
             while(rs.next()){
             empleadoEncuesta=new infoEmpEncuesta();
             empleadoEncuesta.setNombre(rs.getString(1));
             empleadoEncuesta.setApellido_paterno(rs.getString(2));
             empleadoEncuesta.setApellido_materno(rs.getString(3));
             empleadoEncuesta.setCargo(rs.getString(4));
             empleadoEncuesta.setArea(rs.getString(5));
             arrayDatos.add(empleadoEncuesta);
             
             }
            
             
        } catch (Exception e) {
        }
    return arrayDatos;
    
    }
    
    
}
