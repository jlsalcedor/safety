/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.C_DescargarEncuesta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class M_ArchivoEncuesta {
    Blob Anexo_Encuesta;
    String Version;
    int Codigo;
    String Estado;
    int idSucursal;
    
   Conexion conexion=new Conexion();

    public M_ArchivoEncuesta() {
    }
    

    public M_ArchivoEncuesta(Blob Anexo_Encuesta, String Version, int Codigo, String Estado, int idSucursal) {
        this.Anexo_Encuesta = Anexo_Encuesta;
        this.Version = Version;
        this.Codigo = Codigo;
        this.Estado = Estado;
        this.idSucursal = idSucursal;
    }

    public Blob getAnexo_Encuesta() {
        return Anexo_Encuesta;
    }

    public void setAnexo_Encuesta(Blob Anexo_Encuesta) {
        this.Anexo_Encuesta = Anexo_Encuesta;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    public String insertarDatos(FileInputStream file, int longitud, String version, int codigo, String estado, int idSucursal){
       
   // conexion.getConexion();
    String respRegistro=null;
    
        try {
            Connection accederBD=conexion.getConexion();
     
            CallableStatement cs=accederBD.prepareCall("{call sp_insertArchivo(?,?,?,?,?)}");
        
            
            cs.setBlob(1,file,longitud);
            cs.setString(2, version);
            cs.setInt(3, codigo);
            cs.setString(4, estado);
            cs.setInt(5, idSucursal);
            
            int numfilas=cs.executeUpdate();
            if(numfilas>0){
            respRegistro="Registro Exitoso";
            }else{
            respRegistro="No se Pudo Realizar el Registro";
            }
            
        } catch (Exception e) {
        }
        return respRegistro;
    }
    
    
    public void descargarEncuesta(int idArchivo)throws SQLException, IOException{
       
        String nombre;
        
        Connection accederBD=conexion.getConexion();
        Statement st;
        st = accederBD.createStatement();
        
        ResultSet rs=st.executeQuery("Select Anexo_Encuesta from archivo_encuesta where pidArchivo=1");
        JOptionPane.showMessageDialog(null, "Hola desde el Objeto Descargar Modelo");
       // CallableStatement cs=accederBD.prepareCall("{call sp_descargarArchivo (?)}");
        
        //cs.setInt(1, idArchivo);
       
        //rs=cs.executeQuery();
        
        try{
        rs.next();
        nombre=rs.getString(Codigo);
        File file= new File(C_DescargarEncuesta.path+nombre);
        //salida del Archivo de Flujo
        
        FileOutputStream output=new FileOutputStream(file);
        Blob archivo=rs.getBlob(1);
        InputStream inStream=archivo.getBinaryStream();
        //almacenamiento del tamaño
        int length=-1;
        int size=(int) archivo.length();
        byte[] buffer=new byte[size];
        while((length=inStream.read(buffer)) != -1){
        output.write(buffer,0,length);
        JOptionPane.showMessageDialog(null, "El Archivo se descargo correctamente");
        //output.flush();
        }
        output.close();
        }catch(Exception ioe){
        throw new IOException(ioe.getMessage());
        }
    }
    
}
