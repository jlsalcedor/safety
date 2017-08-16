/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Conexion;
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
import javax.swing.JOptionPane;

/**
 *
 * @author leandro
 */
public class Cgestion_resul {
    
     
    private Conexion mysql=new Conexion();
   private Connection cn=mysql.getConexion();
    Statement st;
   private String Archivo;
  // Variables de consulta de los items
   private String Item53;
   private String Ver84;
   
   
    private String Item54;
    private String Ver85;
   
    private String Item55;
    private String Ver86;
   
    private String Item56;
    private String Ver87;
   
   
     
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
   
    
     public boolean insertarItem53(Mgestion_resul dts) {
        
        Item53 = "update item set cumple=?, justifi=?, aplica=? where idItem=53";
        Ver84 = "update verificacion set cumplimiento=? where idverificacion=84";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item53);
            PreparedStatement pst2 = cn.prepareStatement(Ver84);
            
            

            pst.setString(1, dts.getI531());
            pst.setString(2, dts.getJ531());
            pst.setString(3, dts.getA531());
            
            pst2.setString(1, dts.getV531());
            
                       
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
     
 public boolean insertarItem54(Mgestion_resul dts) {
        
        Item54 = "update item set cumple=?, justifi=?, aplica=? where idItem=54";
        
        Ver85 = "update verificacion set cumplimiento=? where idverificacion=85";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item54);
            PreparedStatement pst2 = cn.prepareStatement(Ver85);
            
            

            pst.setString(1, dts.getI541());
            pst.setString(2, dts.getJ541());
            pst.setString(3, dts.getA541());
            
            pst2.setString(1, dts.getV541());
            
          
            
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
 
 public boolean insertarItem55(Mgestion_resul dts) {
        
        Item55 = "update item set cumple=?, justifi=?, aplica=? where idItem=55";
        
        Ver86 = "update verificacion set cumplimiento=? where idverificacion=86";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item55);
            PreparedStatement pst2 = cn.prepareStatement(Ver86);
            
            

            pst.setString(1, dts.getI551());
            pst.setString(2, dts.getJ551());
            pst.setString(3, dts.getA551());
            
            pst2.setString(1, dts.getV551());
            
          
            
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
 
 public boolean insertarItem56(Mgestion_resul dts) {
        
        Item56 = "update item set cumple=?, justifi=?, aplica=? where idItem=56";
        
        Ver87 = "update verificacion set cumplimiento=? where idverificacion=87";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item56);
            PreparedStatement pst2 = cn.prepareStatement(Ver87);
            
            

            pst.setString(1, dts.getI561());
            pst.setString(2, dts.getJ561());
            pst.setString(3, dts.getA561());
            
            pst2.setString(1, dts.getV561());
            
          
            
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
