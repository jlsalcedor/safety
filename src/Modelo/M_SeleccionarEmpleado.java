/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
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
    private String estadoEncuesta;

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

    public String getEstadoEncuesta() {
        return estadoEncuesta;
    }

    public void setEstadoEncuesta(String estadoEncuesta) {
        this.estadoEncuesta = estadoEncuesta;
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
           listarEmpleados.add(empleados);
             
           }
       } catch (SQLException e) {
       }
   return listarEmpleados;
   }
   
      public ArrayList<M_SeleccionarEmpleado> JefeArea(){
   ArrayList<M_SeleccionarEmpleado> listarJefe=new ArrayList();
   M_SeleccionarEmpleado jefe;
   
       try {
           Connection accesoBD=conexion.getConexion();
           CallableStatement cs=accesoBD.prepareCall("{call sp_listaJefeArea()}");
           ResultSet rs=cs.executeQuery();
           while(rs.next()){
           jefe= new M_SeleccionarEmpleado();
           jefe.setIdEmpleado(rs.getInt(1));
           jefe.setNombre(rs.getString(2));
           jefe.setApellido_pa(rs.getString(3));
           jefe.setApellido_ma(rs.getString(4));
           jefe.setTipoDoc(rs.getString(5));
           jefe.setNumDoc(rs.getInt(6));
           jefe.setNombreProceso(rs.getString(7));
           jefe.setCargo("Jefe de Area");
           listarJefe.add(jefe);
           
           }
       } catch (SQLException e) {
       }
   return listarJefe;
   }
      
      
      public ArrayList<M_SeleccionarEmpleado> Gerente(){
   ArrayList<M_SeleccionarEmpleado> listarGerente=new ArrayList();
   M_SeleccionarEmpleado gerente;
   
       try {
           Connection accesoBD=conexion.getConexion();
           CallableStatement cs=accesoBD.prepareCall("{call sp_listaGerente()}");
           ResultSet rs=cs.executeQuery();
           while(rs.next()){
           gerente= new M_SeleccionarEmpleado();
           gerente.setIdEmpleado(rs.getInt(1));
           gerente.setNombre(rs.getString(2));
           gerente.setApellido_pa(rs.getString(3));
           gerente.setApellido_ma(rs.getString(4));
           gerente.setTipoDoc(rs.getString(5));
           gerente.setNumDoc(rs.getInt(6));
           gerente.setNombreProceso(rs.getString(7));
           gerente.setCargo("Gerente");
           listarGerente.add(gerente);
           
           }
       } catch (SQLException e) {
       }
   return listarGerente;
   }
   
   
   
     public ArrayList<M_SeleccionarEmpleado> AdminSGSST(){
   ArrayList<M_SeleccionarEmpleado> listarAdminSGSST=new ArrayList();
   M_SeleccionarEmpleado adminsgsst;
   
       try {
           Connection accesoBD=conexion.getConexion();
           CallableStatement cs=accesoBD.prepareCall("{call sp_listaAdminSGSST()}");
            JOptionPane.showMessageDialog(null, "Prueba");
           ResultSet rs=cs.executeQuery();
          
           while(rs.next()){
           adminsgsst= new M_SeleccionarEmpleado();
           adminsgsst.setIdEmpleado(rs.getInt(1));
           adminsgsst.setNombre(rs.getString(2));
           adminsgsst.setApellido_pa(rs.getString(3));
           adminsgsst.setApellido_ma(rs.getString(4));
           adminsgsst.setTipoDoc(rs.getString(5));
           adminsgsst.setNumDoc(rs.getInt(6));
           adminsgsst.setNombreProceso(rs.getString(7));
           adminsgsst.setCargo("Admin SGSST");
           listarAdminSGSST.add(adminsgsst);           
           }
          
       } catch (SQLException e) {
       }
   return listarAdminSGSST;
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
    
    public int habiEncuesta(String fecha, int Codigo, String estado,int idPersona){
        int filAfec = 0;

        try {
          Connection accesobd=conexion.getConexion();
          CallableStatement cs=accesobd.prepareCall("{call sp_habEncu(?,?,?,?)}");
          cs.setString(1, fecha);
          cs.setInt(2, Codigo);
          cs.setString(3, estado);
          cs.setInt(4, idPersona);
           
          filAfec=cs.executeUpdate();
         
                 
        } catch (Exception e) {
        }
        return filAfec;
    }
    
    
    public ArrayList<M_SeleccionarEmpleado> encuActivas(int idPersona){
       ArrayList<M_SeleccionarEmpleado> array=new ArrayList();
          M_SeleccionarEmpleado empleados=new M_SeleccionarEmpleado();;
        try {
            Connection acceso=conexion.getConexion();
            CallableStatement cs=acceso.prepareCall("{call sp_encuActiva(?)}");
            
            cs.setInt(1,idPersona);
            ResultSet rs=cs.executeQuery();
            while(rs.next()){
          empleados.setEstadoEncuesta(rs.getString(1));
            
            array.add(empleados);
            }
        } catch (Exception e) {
        }
         
    return array;
    }
  
   
}