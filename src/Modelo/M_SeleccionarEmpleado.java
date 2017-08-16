/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class M_SeleccionarEmpleado {
    private int idEmpleado;
    private String nombre;
    private String apellido_ma;
    private String apellido_pa;
    private String tipoDoc;
    private int numDoc;
    private String nombreProceso;
    private String cargo;
    private int encuesta;

    Conexion conexion=new Conexion();
    public M_SeleccionarEmpleado() {
    }

    public  int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_ma() {
        return apellido_ma;
    }

    public void setApellido_ma(String apellido_ma) {
        this.apellido_ma = apellido_ma;
    }

    public String getApellido_pa() {
        return apellido_pa;
    }

    public void setApellido_pa(String apellido_pa) {
        this.apellido_pa = apellido_pa;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(int encuesta) {
        this.encuesta = encuesta;
    }
    
    
   public ArrayList<M_SeleccionarEmpleado> empleados(){
   ArrayList<M_SeleccionarEmpleado> listarEmpleados=new ArrayList();
   M_SeleccionarEmpleado empleados;
   
       try {
           Connection accesoBD=conexion.getConexion();
           CallableStatement cs=accesoBD.prepareCall("{call sp_listaEmpleEncu()}");
           ResultSet rs=cs.executeQuery();
           while(rs.next()){
           empleados= new M_SeleccionarEmpleado();
           empleados.setIdEmpleado(rs.getInt(1));
           empleados.setNombre(rs.getString(2));
           empleados.setApellido_pa(rs.getString(3));
           empleados.setApellido_ma(rs.getString(4));
           empleados.setTipoDoc(rs.getString(5));
           empleados.setNumDoc(rs.getInt(6));
           empleados.setNombreProceso(rs.getString(7));
           empleados.setCargo(rs.getString(8));
           empleados.setEncuesta(rs.getInt(9));
           listarEmpleados.add(empleados);
           
           }
       } catch (SQLException e) {
       }
   return listarEmpleados;
   }
   
   
    public ArrayList<M_SeleccionarEmpleado> listEmpleEncuInactiva(){
   ArrayList<M_SeleccionarEmpleado> listarEmpleados=new ArrayList();
   M_SeleccionarEmpleado empleados;
   
       try {
           Connection accesoBD=conexion.getConexion();
           CallableStatement cs=accesoBD.prepareCall("{call sp_listaEmpleEncuInactiva()}");
           ResultSet rs=cs.executeQuery();
           while(rs.next()){
           empleados= new M_SeleccionarEmpleado();
           empleados.setIdEmpleado(rs.getInt(1));
           empleados.setNombre(rs.getString(2));
           empleados.setApellido_pa(rs.getString(3));
           empleados.setApellido_ma(rs.getString(4));
           empleados.setTipoDoc(rs.getString(5));
           empleados.setNumDoc(rs.getInt(6));
           empleados.setNombreProceso(rs.getString(7));
           empleados.setCargo(rs.getString(8));
           empleados.setEncuesta(rs.getInt(9));
           listarEmpleados.add(empleados);
           
           }
       } catch (SQLException e) {
       }
   return listarEmpleados;
   }
  
   
}
