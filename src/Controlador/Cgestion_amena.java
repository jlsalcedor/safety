/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Mgestion_amena;
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
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Cgestion_amena extends Conexion {
   private Conexion conexion =new Conexion();
   private Connection cn= conexion.getConexion();
    Statement st;
    private String prueba;
   private String Archivo;
  // Variables de consulta de los items
   private String Item51;
   private String Ver80;
   private String Ver81;
   private String Ver82;
    
    private String Item52;
    private String Ver83;
   
    
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
    public boolean insertarItem51(Mgestion_amena dts) {
        
        Item51 = "update item set cumple=?, justifi=?, aplica=? where idItem=51";
        
         Ver80 = "update verificacion set cumplimiento=? where idverificacion=80";
        Ver81 = "update verificacion set cumplimiento=? where idverificacion=81";
        Ver82 = "update verificacion set cumplimiento=? where idverificacion=82";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item51);
            
             PreparedStatement pst2 = cn.prepareStatement(Ver80);
            PreparedStatement pst3 = cn.prepareStatement(Ver81);
            PreparedStatement pst4 = cn.prepareStatement(Ver82);
                        
            

            pst.setString(1, dts.getI511());
            pst.setString(2, dts.getJ511());
            pst.setString(3, dts.getA511());
            
                      
            
            pst2.setString(1, dts.getV511());
            
            pst3.setString(1, dts.getV512());
             
            pst4.setString(1, dts.getV513());
              
            
            
           
            
          int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    int n3 = pst3.executeUpdate();

                if (n3 != 0) {
                    int n4 = pst4.executeUpdate();

                if (n4 != 0) {
              return true;
              
                } else {
                    return false;
                }
            
                } else {
                    return false;
                }

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
    
       
     public boolean insertarItem52(Mgestion_amena dts) {
        
        Item52 = "update item set cumple=?, justifi=?, aplica=? where idItem=52";
        Ver83 = "update verificacion set cumplimiento=? where idverificacion=83";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item52);
            PreparedStatement pst2 = cn.prepareStatement(Ver83);
            
            

            pst.setString(1, dts.getI521());
            pst.setString(2, dts.getJ521());
            pst.setString(3, dts.getA521());
            
            pst2.setString(1, dts.getV521());
            
                       
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
