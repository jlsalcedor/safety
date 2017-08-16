/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class M_Empresa {
    
    private String NITEmpresa;
    private String nombreEmpresa;
    private String razonSocial;
    private String actividadEconomica;
    private String estadoEmpresa;

    public M_Empresa() {
    }

    public M_Empresa(String NITEmpresa, String nombreEmpresa, String razonSocial, String actividadEconomica, String estadoEmpresa) {
        this.NITEmpresa = NITEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.razonSocial = razonSocial;
        this.actividadEconomica = actividadEconomica;
        this.estadoEmpresa = estadoEmpresa;
    }

    public String getNITEmpresa() {
        return NITEmpresa;
    }

    public void setNITEmpresa(String NITEmpresa) {
        this.NITEmpresa = NITEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public String getEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(String estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }
    
    
    
}
