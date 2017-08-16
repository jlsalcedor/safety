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


/**
 *
 * @author YOREL
 */
public class M_RegistroEmpresa {
    private int nitEmpresa;
    private String nomEmpresa;
    private String ciudad;
    private String departamento;
    private String sucursal;
    private int telefono;
    private String razonSocial;
    private String actEconomica;
    private String nivelRiesgo;
Conexion conexion=new Conexion();
    public M_RegistroEmpresa() {
    }
    
    public M_RegistroEmpresa(int nitEmpresa, String nomEmpresa, String ciudad, String departamento, String sucursal, int telefono, String razonSocial, String actEconomica, String nivelRiesgo) {
        this.nitEmpresa = nitEmpresa;
        this.nomEmpresa = nomEmpresa;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.sucursal = sucursal;
        this.telefono = telefono;
        this.razonSocial = razonSocial;        
        this.actEconomica = actEconomica;
        this.nivelRiesgo = nivelRiesgo;
        
        
    }

    public int getNitempresa() {
        return nitEmpresa;
    }

    public void setNitempresa(int nitem) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombempresa() {
        return nomEmpresa;
    }

    public void setNombempresa(String nombem) {
        this.nomEmpresa = nomEmpresa;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getRazonsocial() {
        return razonSocial;
    }

    public void setRazonsocial(String razonScocial) {
        this.razonSocial = razonSocial;
    }

    public String getActEconomica() {
        return actEconomica;
    }

    public void setActeconomica(String actEconomica) {
        this.actEconomica = actEconomica;
    }


    public String getCiudad(String ciudad) {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento(String departamento) {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSucursal(String departamento) {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    public String getNivelRegistro(String nivelRiesgo) {
    return nivelRiesgo;
    }
    
    public void setNivelriesgo(String nivelRiesgo){
        this.nivelRiesgo = nivelRiesgo;
    }
}


   
    
    

