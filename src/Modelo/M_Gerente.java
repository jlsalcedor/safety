/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class M_Gerente extends M_Persona {
    
    private Date fechaIngreso;
    private String estado;
    private String userGerente;
    private String contraGerente;

    public M_Gerente() {
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUserGerente() {
        return userGerente;
    }

    public void setUserGerente(String userGerente) {
        this.userGerente = userGerente;
    }

    public String getContraGerente() {
        return contraGerente;
    }

    public void setContraGerente(String contraGerente) {
        this.contraGerente = contraGerente;
    }
    
    
    
}
