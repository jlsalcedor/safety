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
    private static int codigo;
    private static String area;
    private static int idEncuesta;
    
    
    Conexion conexion=new Conexion();
    Encuesta_SocioDemografica vista_encuesta=new Encuesta_SocioDemografica();
    public infoEmpEncuesta() {
    }

    public infoEmpEncuesta(String nombre, String apellido_materno, String apellido_paterno, int codigo, String area, int idEncuesta) {
        infoEmpEncuesta.nombre = nombre;
        infoEmpEncuesta.apellido_materno = apellido_materno;
        infoEmpEncuesta.apellido_paterno = apellido_paterno;
        infoEmpEncuesta.codigo = codigo;
        infoEmpEncuesta.area = area;
        infoEmpEncuesta.idEncuesta=idEncuesta;
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

    public static int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        infoEmpEncuesta.codigo = codigo;
    }

    public static String getArea() {
        return area;
    }

    public void setArea(String area) {
        infoEmpEncuesta.area = area;
    }

    public static int getIdEncuesta() {
        return idEncuesta;
    }

    public  void setIdEncuesta(int idEncuesta) {
        infoEmpEncuesta.idEncuesta = idEncuesta;
    }
    
 
            
             
      
    
    public ArrayList datosRealizarEncuesta(int idPersona){
ArrayList datos=new ArrayList();
 infoEmpEncuesta datosEncuesta;
    try {
        Connection acceso=conexion.getConexion();
        CallableStatement cs=acceso.prepareCall("{call sp_datosPersonaEncu(?)}");
        cs.setInt(1, idPersona);
        ResultSet rs=cs.executeQuery();
        while(rs.next()){
         datosEncuesta=new infoEmpEncuesta();
           datosEncuesta.setNombre(rs.getString(1));
           datosEncuesta.setApellido_paterno(rs.getString(2));
           datosEncuesta.setApellido_materno(rs.getString(3));
           datosEncuesta.setArea(rs.getString(4));
           datosEncuesta.setCodigo(rs.getInt(5));
           datosEncuesta.setIdEncuesta(rs.getInt(6));
           datos.add(datosEncuesta);
        }
    } catch (Exception e) {
    }
return datos;
}
  
    
    
}
