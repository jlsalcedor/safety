/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.C_RealizarEncuesta;
import Vista.Encuesta_SocioDemografica;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class M_EncuestaSocioDemografica {
    private int idEncuesta;
    private Date fechaEncuesta;
    private Blob encuestaExcel;
    private int idPersona;
    private String estadoEncuesta;
    
    //Variable publicas que llaman datos para mostrar en el JFrame de la encuesta
    String nombre;
    static String sucursal;
    String version;
    int codigo;
Conexion conexion=new Conexion();
    public M_EncuestaSocioDemografica() {
    }

    public M_EncuestaSocioDemografica(int idEncuesta, Date fechaEncuesta, Blob encuestaExcel, int idPersona, String estadoEncuesta) {
        this.idEncuesta = idEncuesta;
        this.fechaEncuesta = fechaEncuesta;
        this.encuestaExcel = encuestaExcel;
        this.idPersona = idPersona;
        this.estadoEncuesta = estadoEncuesta;
    }

    //Get y Set para Ingresar datos traidos de diferentes tablas y mostrarla en la Vista de Encuesta//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        M_EncuestaSocioDemografica.sucursal = sucursal;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //Fin de Get y Set de Varias Tablas 
    
    //Get y Set propias del tabla Encuesta SocioDemografica

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public Date getFechaEncuesta() {
        return fechaEncuesta;
    }

    public void setFechaEncuesta(Date fechaEncuesta) {
        this.fechaEncuesta = fechaEncuesta;
    }

    public Blob getEncuestaExcel() {
        return encuestaExcel;
    }

    public void setEncuestaExcel(Blob encuestaExcel) {
        this.encuestaExcel = encuestaExcel;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getEstadoEncuesta() {
        return estadoEncuesta;
    }

    public void setEstadoEncuesta(String estadoEncuesta) {
        this.estadoEncuesta = estadoEncuesta;
    }
    
    public ArrayList empresa(){
    M_EncuestaSocioDemografica datosEncuesta;
    ArrayList array=new ArrayList();
        try {
            Connection acceso=conexion.getConexion();
            CallableStatement cs=acceso.prepareCall("{call sp_datosEmpresa()}");
            ResultSet rs=cs.executeQuery();
            while(rs.next()){
            datosEncuesta=new M_EncuestaSocioDemografica();
           datosEncuesta.setNombre(rs.getString(1));
            datosEncuesta.setSucursal(rs.getString(2));
            array.add(datosEncuesta);
            }
        } catch (Exception e) {
        }
       return array;
    }
    

   /* 
    public ArrayList llamarDatos(){
        ArrayList datosEncuestaEmpresa=new ArrayList();
   
        
        ArchivoEncuesta modelo_archivo;
        try {
            Connection accederBD=conexion.getConexion();
             CallableStatement cs=accederBD.prepareCall("{call sp_datosEmpresaEncuesta()}");
             ResultSet st=cs.executeQuery();
           //  ArrayList datos=new ArrayList();
             while(st.next()){
            
                 
                 modelo_archivo=new ArchivoEncuesta();
            modelo_archivo.setNombreEmpresa(st.getString(1));
            modelo_archivo.setNombreSucursal(st.getString(2));
            
             modelo_archivo.setVersion(st.getString(3));
             modelo_archivo.setCodigo(st.getInt(4));
             
            nombre=modelo_archivo.getNombreEmpresa();
             sucursal=modelo_archivo.getNombreSucursal();
             version=modelo_archivo.getVersion();
             codigo=modelo_archivo.getCodigo();
             
             }
             
        } catch (Exception e) {
        }
    return datosEncuestaEmpresa;
    
    }
*/
}
    
    
