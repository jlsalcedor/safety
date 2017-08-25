/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class M_HabEncuTodos {
    private int UltimoCodigoEncuesta;
    private int nuevoCodigo;
    private static Date fechaEncUlt;

    Conexion conexion=new Conexion();
    M_HabEncuTodos habilitarTodos;
    public M_HabEncuTodos() {
    }

    public static Date getFechaEncUlt() {
        return fechaEncUlt;
    }

    public void setFechaEncUlt(Date fechaEncUlt) {
        M_HabEncuTodos.fechaEncUlt = fechaEncUlt;
    }
    

    public int getUltimoCodigoEncuesta() {
        return UltimoCodigoEncuesta;
    }

    public void setUltimoCodigoEncuesta(int UltimoCodigoEncuesta) {
        this.UltimoCodigoEncuesta = UltimoCodigoEncuesta;
    }

    public int getNuevoCodigo() {
        return nuevoCodigo;
    }

    public void setNuevoCodigo(int nuevoCodigo) {
        this.nuevoCodigo = nuevoCodigo;
    }
    
    public int ultimoCodigoEnc(){
        int ultCodigo=0;
        try {
            Connection accederBD=conexion.getConexion();
            CallableStatement cs=accederBD.prepareCall("{call sp_ultimoCodigoEncuesta()}");
            ResultSet rs=cs.executeQuery();
            while(rs.next()){
                habilitarTodos=new M_HabEncuTodos();
                habilitarTodos.setUltimoCodigoEncuesta(rs.getInt(1));
                habilitarTodos.setFechaEncUlt(rs.getDate(2));
                ultCodigo=habilitarTodos.getUltimoCodigoEncuesta();
            }
        } catch (Exception e) {
        }
    
    
    return ultCodigo;
    }
    
    public String habilitarEncuesta(int codigo, Date fecha, String estado, int idArchivo){
        String respuesta="";
        try {
           Connection accedeBD=conexion.getConexion();
           CallableStatement cs=accedeBD.prepareCall("{call sp_habilitarTodoEncuesta(?,?,?,?)}");
           cs.setInt(1, codigo);
           cs.setDate(2, fecha);
           cs.setString(3, estado);
           cs.setInt(4, idArchivo);
           int filasAfec=cs.executeUpdate();
            if(filasAfec>0){
            respuesta="Se ha Habilitado Exitosamente la Encuesta";
            }else{
            respuesta="Opss ha Ocurrido un Error no se ha podido llevar acabo la acción";
            }
        } catch (Exception e) {
        }
    return respuesta;
    }
    
    public String cambiarEstadoEncuesta(String estado, int codigo){
        String respuesta = null;
        try {
            Connection accedeBD=conexion.getConexion();
            CallableStatement cs=accedeBD.prepareCall("{call sp_cambiarEstadoEncuesta(?,?)}");
            cs.setString(1, estado);
            cs.setInt(2, codigo);
            int filasAfec=cs.executeUpdate();
            if(filasAfec>0){
            respuesta="Se ha Habilitado Exitosamente la Encuesta";
            }else{
            respuesta="Opss ha Ocurrido un Error no se ha podido llevar acabo la acción";
            }
        } catch (Exception e) {
        }
    return respuesta;
    }
    
    public int encuestaActiva(){
        int activas = 0;
        try {
            Connection accedeBD=conexion.getConexion();
            CallableStatement cs=accedeBD.prepareCall("{call sp_verificaEncuActiva()}");
            activas=cs.executeUpdate();
           
        } catch (Exception e) {
        }
    return activas;
    }
    
    public ArrayList listaId(){
        ArrayList lista=new ArrayList();
        try {
            Connection acceso=conexion.getConexion();
            CallableStatement cs=acceso.prepareCall("{call sp_idTodos()}");
            ResultSet rs=cs.executeQuery();
            while(rs.next()){
            lista.add(rs.getInt(1));
            }
        } catch (Exception e) {
        }
    return lista;
    }
    
   
    
    
}
