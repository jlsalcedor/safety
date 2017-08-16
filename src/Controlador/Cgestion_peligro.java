/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Mgestion_integral;
import Modelo.Mgestion_peligro;
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
public class Cgestion_peligro extends Conexion {
    
         private Conexion conexion =new Conexion();
   private Connection cn= conexion.getConexion();
    Statement st;
      private String Archivo;
  // Variables de consulta de los items
   private String Item41;
   private String Ver60;
   private String Ver61;
   
    
    private String Item42;
    private String Ver62;
    private String Ver63;
   
    private String Item43;
    private String Ver64;
    private String Ver65;
    private String Ver66;
   
    private String Item44;
    private String Ver67;
 
    private String Item45;
    private String Ver68;
    private String Ver69;
    private String Ver70; 
   
    private String Item46;
    private String Ver71;
    private String Ver72;
    
   
    private String Item47;
    private String Ver73;
   
    private String Item48;
     private String Ver74;
    
    private String Item49;
    private String Ver75;
    
   
    private String Item50;
    private String Ver76;
    private String Ver77;
    private String Ver78;
    private String Ver79;
   
       
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
   
      // Metodos para poner los resultados de la Evaluacion Inicial (10 items)
      
      
      public boolean insertarItem41(Mgestion_peligro dts) {
        
        Item41 = "update item set cumple=?, justifi=?, aplica=? where idItem=41";
        
        Ver60 = "update verificacion set cumplimiento=? where idverificacion=60";
        Ver61 = "update verificacion set cumplimiento=? where idverificacion=61";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item41);
            PreparedStatement pst2 = cn.prepareStatement(Ver60);
            PreparedStatement pst3 = cn.prepareStatement(Ver61);
            

            pst.setString(1, dts.getI411());
            pst.setString(2, dts.getJ411());
            pst.setString(3, dts.getA411());
            
            pst2.setString(1, dts.getV411());
            
            pst3.setString(1, dts.getV412());  
          
            
           int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                  int n3 = pst3.executeUpdate();

                if(n3 != 0) {
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

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    
}
      
      public boolean insertarItem42(Mgestion_peligro dts) {
        
        Item42 = "update item set cumple=?, justifi=?, aplica=? where idItem=42";
        
        Ver62 = "update verificacion set cumplimiento=? where idverificacion=62";
        Ver63 = "update verificacion set cumplimiento=? where idverificacion=63";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item42);
            PreparedStatement pst2 = cn.prepareStatement(Ver62);
            PreparedStatement pst3 = cn.prepareStatement(Ver63);
            

            pst.setString(1, dts.getI421());
            pst.setString(2, dts.getJ421());
            pst.setString(3, dts.getA421());
            
            pst2.setString(1, dts.getV421());
            
            pst3.setString(1, dts.getV422());  
          
            
           int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                  int n3 = pst3.executeUpdate();

                if(n3 != 0) {
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

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    
}
      
      
    public boolean insertarItem43(Mgestion_peligro dts) {
        
        Item43 = "update item set cumple=?, justifi=?, aplica=? where idItem=43";
        
         Ver64 = "update verificacion set cumplimiento=? where idverificacion=64";
        Ver65 = "update verificacion set cumplimiento=? where idverificacion=65";
        Ver66 = "update verificacion set cumplimiento=? where idverificacion=66";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item43);
            
             PreparedStatement pst2 = cn.prepareStatement(Ver64);
            PreparedStatement pst3 = cn.prepareStatement(Ver65);
            PreparedStatement pst4 = cn.prepareStatement(Ver66);
                        
            

            pst.setString(1, dts.getI431());
            pst.setString(2, dts.getJ431());
            pst.setString(3, dts.getA431());
            
                      
            
            pst2.setString(1, dts.getV431());
            
            pst3.setString(1, dts.getV432());
             
            pst4.setString(1, dts.getV433());
              
            
            
           
            
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
    
       
     public boolean insertarItem44(Mgestion_peligro dts) {
        
        Item44 = "update item set cumple=?, justifi=?, aplica=? where idItem=44";
        Ver67 = "update verificacion set cumplimiento=? where idverificacion=67";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item44);
            PreparedStatement pst2 = cn.prepareStatement(Ver67);
            
            

            pst.setString(1, dts.getI441());
            pst.setString(2, dts.getJ441());
            pst.setString(3, dts.getA441());
            
            pst2.setString(1, dts.getV441());
            
                       
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
     
  public boolean insertarItem45(Mgestion_peligro dts) {
        
        Item45 = "update item set cumple=?, justifi=?, aplica=? where idItem=45";
        
         Ver68 = "update verificacion set cumplimiento=? where idverificacion=68";
        Ver69 = "update verificacion set cumplimiento=? where idverificacion=69";
        Ver70 = "update verificacion set cumplimiento=? where idverificacion=70";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item45);
            
             PreparedStatement pst2 = cn.prepareStatement(Ver68);
            PreparedStatement pst3 = cn.prepareStatement(Ver69);
            PreparedStatement pst4 = cn.prepareStatement(Ver70);
                        
            

            pst.setString(1, dts.getI451());
            pst.setString(2, dts.getJ451());
            pst.setString(3, dts.getA451());
            
                      
            
            pst2.setString(1, dts.getV451());
            
            pst3.setString(1, dts.getV452());
             
            pst4.setString(1, dts.getV453());
              
            
            
           
            
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
  
   public boolean insertarItem46(Mgestion_peligro dts) {
        
        Item46 = "update item set cumple=?, justifi=?, aplica=? where idItem=46";
        
        Ver71 = "update verificacion set cumplimiento=? where idverificacion=71";
        Ver72 = "update verificacion set cumplimiento=? where idverificacion=72";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item46);
            PreparedStatement pst2 = cn.prepareStatement(Ver71);
            PreparedStatement pst3 = cn.prepareStatement(Ver72);
            

            pst.setString(1, dts.getI461());
            pst.setString(2, dts.getJ461());
            pst.setString(3, dts.getA461());
            
            pst2.setString(1, dts.getV461());
            
            pst3.setString(1, dts.getV462());  
          
            
           int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                  int n3 = pst3.executeUpdate();

                if(n3 != 0) {
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

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    
}

public boolean insertarItem47(Mgestion_peligro dts) {
        
        Item47 = "update item set cumple=?, justifi=?, aplica=? where idItem=47";
        
        Ver73 = "update verificacion set cumplimiento=? where idverificacion=73";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item47);
            PreparedStatement pst2 = cn.prepareStatement(Ver73);
            
            

            pst.setString(1, dts.getI471());
            pst.setString(2, dts.getJ471());
            pst.setString(3, dts.getA471());
            
            pst2.setString(1, dts.getV471());
            
          
            
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

public boolean insertarItem48(Mgestion_peligro dts) {
        
        Item48 = "update item set cumple=?, justifi=?, aplica=? where idItem=48";
        
        Ver74 = "update verificacion set cumplimiento=? where idverificacion=74";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item48);
            PreparedStatement pst2 = cn.prepareStatement(Ver74);
            
            

            pst.setString(1, dts.getI481());
            pst.setString(2, dts.getJ481());
            pst.setString(3, dts.getA481());
            
            pst2.setString(1, dts.getV481());
            
          
            
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

public boolean insertarItem49(Mgestion_peligro dts) {
        
        Item49 = "update item set cumple=?, justifi=?, aplica=? where idItem=49";
        
        Ver75 = "update verificacion set cumplimiento=? where idverificacion=75";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item49);
            PreparedStatement pst2 = cn.prepareStatement(Ver75);
            
            

            pst.setString(1, dts.getI491());
            pst.setString(2, dts.getJ491());
            pst.setString(3, dts.getA491());
            
            pst2.setString(1, dts.getV491());
            
          
            
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

 
  
  public boolean insertarItem50(Mgestion_peligro dts) {
        
        Item50 = "update item set cumple=?, justifi=?, aplica=? where idItem=50";
                
        Ver76 = "update verificacion set cumplimiento=? where idverificacion=76";
        Ver77 = "update verificacion set cumplimiento=? where idverificacion=77";
        Ver78 = "update verificacion set cumplimiento=? where idverificacion=78";
        Ver79 = "update verificacion set cumplimiento=? where idverificacion=79";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item50);
            PreparedStatement pst2 = cn.prepareStatement(Ver76);
            PreparedStatement pst3 = cn.prepareStatement(Ver77);
            PreparedStatement pst4 = cn.prepareStatement(Ver78);
            PreparedStatement pst5 = cn.prepareStatement(Ver79);
            

            pst.setString(1, dts.getI501());
            pst.setString(2, dts.getJ501());
            pst.setString(3, dts.getA501());
            
            pst2.setString(1, dts.getV501());
            
            pst3.setString(1, dts.getV502());
             
            pst4.setString(1, dts.getV503());
              
            pst5.setString(1, dts.getV504());
            
           
            
           int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    int n3 = pst3.executeUpdate();

                if (n3 != 0) {
                    int n4 = pst4.executeUpdate();

                if (n4 != 0) {
                   int n5 = pst5.executeUpdate();

                if(n5 != 0) {
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

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    
}
    
}
