/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class M_EncDatosSalud {
    private String nombreDato;
    private String respuesta;
    private String observaciones;
    private int idEncuesta;
    
    Conexion conexion=new Conexion();

    public M_EncDatosSalud() {
    }

    public String getNombreDato() {
        return nombreDato;
    }

    public void setNombreDato(String nombreDato) {
        this.nombreDato = nombreDato;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    
     public int InsertardatosSalud(int idDato, String respuesta, String observacion, int encuestaId){
        int resp = 0;
        try {
             Connection accesoBD=conexion.getConexion();
            CallableStatement cs=accesoBD.prepareCall("{call sp_encuDatosSalud(?,?,?,?)}"); 
            cs.setInt(1, idDato);
            cs.setString(2, respuesta);
            cs.setString(3, observacion);
            cs.setInt(4, encuestaId);
          
            resp=cs.executeUpdate();
            
        } catch (SQLException e) {
        }
  
    return resp;
    }
}
