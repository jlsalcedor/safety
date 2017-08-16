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
public class M_Sucursal extends M_Empresa {
    
    private int idSucursal;
    private String nombreSucursal;
    private String direccionSucursal;
    private String telefonoSucursal;
    private String nitEmpresa;
    private String estadoSucursal;
    private int idMunicipio;

    public M_Sucursal() {
    }

    public M_Sucursal(int idSucursal, String nombreSucursal, String direccionSucursal, String telefonoSucursal, String nitEmpresa, String estadoSucursal, int idMunicipio) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.direccionSucursal = direccionSucursal;
        this.telefonoSucursal = telefonoSucursal;
        this.nitEmpresa = nitEmpresa;
        this.estadoSucursal = estadoSucursal;
        this.idMunicipio = idMunicipio;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccionSucursal() {
        return direccionSucursal;
    }

    public void setDireccionSucursal(String direccionSucursal) {
        this.direccionSucursal = direccionSucursal;
    }

    public String getTelefonoSucursal() {
        return telefonoSucursal;
    }

    public void setTelefonoSucursal(String telefonoSucursal) {
        this.telefonoSucursal = telefonoSucursal;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getEstadoSucursal() {
        return estadoSucursal;
    }

    public void setEstadoSucursal(String estadoSucursal) {
        this.estadoSucursal = estadoSucursal;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
    
    
}
