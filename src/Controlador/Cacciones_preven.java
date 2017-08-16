/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Macciones_preven;
import Modelo.Mgestion_resul;
import Modelo.Mrecursos;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Cacciones_preven {
    
        
    private Conexion mysql=new Conexion();
   private Connection cn=mysql.getConexion();
    Statement st;
   private String Archivo;
  // Variables de consulta de los items
   private String Item57;
   private String Ver88;
   
   
    private String Item58;
    private String Ver89;
   
    private String Item59;
    private String Ver90;
   
    private String Item60;
    private String Ver91;
   
   
     
    // Objeto para pasar los datos a Drecursos
    
    Mrecursos rt= new Mrecursos();
    String nombre;
       // Metodos de guardar y descargar Archivos
    public void descargarArchivoVeri()throws SQLException, IOException {
     //conexion con el resultset
        st = cn.createStatement();

  // consulta de descarga el getId es la variable que utilizo para ubicarme en la base de datos
   ResultSet rs = st.executeQuery("select anexo_veri, nombre FROM anexoverificacion where idverificacion="+rt.getId());
try {
    
rs.next();
// pone en la variable el nombre del archivo de la base de datos
nombre= rs.getString("nombre");
// inserta la ruta completa
File file = new File(rt.getPath()+nombre);
// salida del archivo de flujo
FileOutputStream output = new FileOutputStream(file);
Blob archivo = rs.getBlob(1);
InputStream inStream = archivo.getBinaryStream();
// almacenamiento del tamaño y descarga byte a byte
int length= -1;
int size = (int) archivo.length();
byte[] buffer = new byte[size];
while ((length = inStream.read(buffer)) != -1) {
output.write(buffer, 0, length);
JOptionPane.showMessageDialog(null,"El archivo se descargo correctamente");
// output.flush();

}
// inStream.close();
output.close();
} catch (Exception ioe) {
throw new IOException(ioe.getMessage());
}
}
    
 
    
      public boolean insertarArchivosVeri(Mrecursos dts) {
        
        Archivo = "insert into anexoverificacion (anexo_veri, idverificacion, nombre) values (?,?,?)";
       
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Archivo);
            
            
            pst.setBlob(1, dts.getFi1111(), dts.getLongitud());
            pst.setInt(2, dts.getId());
            pst.setString(3, dts.getNombre());
                  
           
            
                       
           int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    
}
 
    
    
    // Metodos de guardar y descargar Archivos
    public void descargarArchivo()throws SQLException, IOException {
     //conexion con el resultset
        st = cn.createStatement();

  // consulta de descarga el getId es la variable que utilizo para ubicarme en la base de datos
   ResultSet rs = st.executeQuery("select anexo_justi, nombre FROM anexoitem where iditem="+rt.getId());
try {
    
rs.next();
// pone en la variable el nombre del archivo de la base de datos
nombre= rs.getString("nombre");
// inserta la ruta completa
File file = new File(rt.getPath()+nombre);
// salida del archivo de flujo
FileOutputStream output = new FileOutputStream(file);
Blob archivo = rs.getBlob(1);
InputStream inStream = archivo.getBinaryStream();
// almacenamiento del tamaño y descarga byte a byte
int length= -1;
int size = (int) archivo.length();
byte[] buffer = new byte[size];
while ((length = inStream.read(buffer)) != -1) {
output.write(buffer, 0, length);
JOptionPane.showMessageDialog(null,"El archivo se descargo correctamente");
// output.flush();

}
// inStream.close();
output.close();
} catch (Exception ioe) {
throw new IOException(ioe.getMessage());
}
}
    
 
    
      public boolean insertarArchivos(Mrecursos dts) {
        
        Archivo = "insert into anexoitem (anexo_justi, iditem, nombre) values (?,?,?)";
       
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Archivo);
            
            
            pst.setBlob(1, dts.getFi1111(), dts.getLongitud());
            pst.setInt(2, dts.getId());
            pst.setString(3, dts.getNombre());
                  
           
            
                       
           int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    
}
   
      // Metodos para poner los resultados de la Evaluacion Inicial (11 items)
   
    
     public boolean insertarItem57(Macciones_preven dts) {
        
        Item57 = "update item set cumple=?, justifi=?, aplica=? where idItem=57";
        Ver88 = "update verificacion set cumplimiento=? where idverificacion=88";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item57);
            PreparedStatement pst2 = cn.prepareStatement(Ver88);
            
            

            pst.setString(1, dts.getI571());
            pst.setString(2, dts.getJ571());
            pst.setString(3, dts.getA571());
            
            pst2.setString(1, dts.getV571());
            
                       
           int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                  return true;  

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    
}
     
 public boolean insertarItem58(Macciones_preven dts) {
        
        Item58 = "update item set cumple=?, justifi=?, aplica=? where idItem=58";
        
        Ver89 = "update verificacion set cumplimiento=? where idverificacion=89";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item58);
            PreparedStatement pst2 = cn.prepareStatement(Ver89);
            
            

            pst.setString(1, dts.getI581());
            pst.setString(2, dts.getJ581());
            pst.setString(3, dts.getA581());
            
            pst2.setString(1, dts.getV581());
            
          
            
           int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                  return true;  

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    
}   
 
 public boolean insertarItem59(Macciones_preven dts) {
        
        Item59 = "update item set cumple=?, justifi=?, aplica=? where idItem=59";
        
        Ver90 = "update verificacion set cumplimiento=? where idverificacion=90";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item59);
            PreparedStatement pst2 = cn.prepareStatement(Ver90);
            
            

            pst.setString(1, dts.getI591());
            pst.setString(2, dts.getJ591());
            pst.setString(3, dts.getA591());
            
            pst2.setString(1, dts.getV591());
            
          
            
           int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                  return true;  

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    
}   
 
 public boolean insertarItem60(Macciones_preven dts) {
        
        Item60 = "update item set cumple=?, justifi=?, aplica=? where idItem=60";
        
        Ver91 = "update verificacion set cumplimiento=? where idverificacion=91";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item60);
            PreparedStatement pst2 = cn.prepareStatement(Ver91);
            
            

            pst.setString(1, dts.getI601());
            pst.setString(2, dts.getJ601());
            pst.setString(3, dts.getA601());
            
            pst2.setString(1, dts.getV601());
            
          
            
           int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                  return true;  

                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    
}   

    
}
