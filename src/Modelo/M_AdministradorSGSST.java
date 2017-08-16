/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class M_AdministradorSGSST extends M_Persona {
    private Date fechaIngreso;
    private String userAdminSGSST;
    private String paswordAdminSGSST;
    private int idGerente;
    private String estado;

    Conexion conexion=new Conexion();
    public M_AdministradorSGSST() {
    }

    public M_AdministradorSGSST(Date fechaIngreso, String userAdminSGSST, String paswordAdminSGSST, int idGerente, String estado) {
        this.fechaIngreso = fechaIngreso;
        this.userAdminSGSST = userAdminSGSST;
        this.paswordAdminSGSST = paswordAdminSGSST;
        this.idGerente = idGerente;
        this.estado = estado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUserAdminSGSST() {
        return userAdminSGSST;
    }

    public void setUserAdminSGSST(String userAdminSGSST) {
        this.userAdminSGSST = userAdminSGSST;
    }

    public String getPaswordAdminSGSST() {
        return paswordAdminSGSST;
    }

    public void setPaswordAdminSGSST(String paswordAdminSGSST) {
        this.paswordAdminSGSST = paswordAdminSGSST;
    }

    public int getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public  ArrayList<M_AdministradorSGSST> Ingreso_AdminSGSST(String userAdmin, String contraseñaAdmin){
        
     ArrayList<M_AdministradorSGSST> listaSGSST =new ArrayList();
     M_AdministradorSGSST adminSGSST;
        try {
            Connection accesoBD=conexion.getConexion();
            
            CallableStatement cs=accesoBD.prepareCall("{call sp_listAdminSGSST(?,?)}");
            
            cs.setString(1, userAdmin);
            cs.setString(2, contraseñaAdmin);
            ResultSet rs=cs.executeQuery();
            
            while(rs.next()){
            adminSGSST =new M_AdministradorSGSST();
            adminSGSST.setIdPersona(rs.getInt(1));
            adminSGSST.setNombre(rs.getString(2));
            adminSGSST.setPrimerApellido(rs.getString(3));
            adminSGSST.setSegundoApellido(rs.getString(4));
            adminSGSST.setTipoDoc(rs.getString(5));
            adminSGSST.setNumeroDoc(rs.getInt(6));
            adminSGSST.setTelefono(rs.getString(7));
            adminSGSST.setIdProceso(rs.getInt(8));
            adminSGSST.setEmail(rs.getString(9));
            adminSGSST.setFechaIngreso(rs.getDate(10));
            adminSGSST.setUserAdminSGSST(rs.getString(11));
            adminSGSST.setPaswordAdminSGSST(rs.getString(12));
            adminSGSST.setIdGerente(rs.getInt(13));
            adminSGSST.setEstado(rs.getString(14));
            
            listaSGSST.add(adminSGSST);
            
            
            
            }
            
        } catch (Exception e) {
        }
     return listaSGSST;
    }
    
}
