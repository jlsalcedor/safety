/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Mgestion_integral;
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
public class Cgestion_integral extends Conexion {
    
        private Conexion conexion =new Conexion();
   private Connection cn= conexion.getConexion();
    Statement st;
    private String prueba;
   private String Archivo;
  // Variables de consulta de los items
   private String Item12;
   private String Ver19;
   private String Ver20;
   private String Ver21;
    
    private String Item13;
    private String Ver22;
   
    private String Item14;
    private String Ver23;
   
    private String Item15;
    private String Ver24;
 
    private String Item16;
    private String Ver25;
    private String Ver26;
   
    private String Item17;
    private String Ver27;
    private String Ver28;
    private String Ver29;
   
    private String Item18;
    private String Ver30;
   
    private String Item19;
     private String Ver31;
    
    private String Item20;
    private String Ver32;
    private String Ver33;
   
    private String Item21;
    private String Ver34;
   
    private String Item22;
    private String Ver35;
    
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
    public boolean insertarItem12(Mgestion_integral dts) {
        
        Item12 = "update item set cumple=?, justifi=?, aplica=? where idItem=12";
        
         Ver19 = "update verificacion set cumplimiento=? where idverificacion=19";
        Ver20 = "update verificacion set cumplimiento=? where idverificacion=20";
        Ver21 = "update verificacion set cumplimiento=? where idverificacion=21";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item12);
            
             PreparedStatement pst2 = cn.prepareStatement(Ver19);
            PreparedStatement pst3 = cn.prepareStatement(Ver20);
            PreparedStatement pst4 = cn.prepareStatement(Ver21);
                        
            

            pst.setString(1, dts.getI121());
            pst.setString(2, dts.getJ121());
            pst.setString(3, dts.getA121());
            
                      
            
            pst2.setString(1, dts.getV121());
            
            pst3.setString(1, dts.getV122());
             
            pst4.setString(1, dts.getV123());
              
            
            
           
            
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
    
       
     public boolean insertarItem13(Mgestion_integral dts) {
        
        Item13 = "update item set cumple=?, justifi=?, aplica=? where idItem=13";
        Ver22 = "update verificacion set cumplimiento=? where idverificacion=22";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item13);
            PreparedStatement pst2 = cn.prepareStatement(Ver22);
            
            

            pst.setString(1, dts.getI131());
            pst.setString(2, dts.getJ131());
            pst.setString(3, dts.getA131());
            
            pst2.setString(1, dts.getV131());
            
                       
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
     
 public boolean insertarItem14(Mgestion_integral dts) {
        
        Item14 = "update item set cumple=?, justifi=?, aplica=? where idItem=14";
        
        Ver23 = "update verificacion set cumplimiento=? where idverificacion=23";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item14);
            PreparedStatement pst2 = cn.prepareStatement(Ver23);
            
            

            pst.setString(1, dts.getI141());
            pst.setString(2, dts.getJ141());
            pst.setString(3, dts.getA141());
            
            pst2.setString(1, dts.getV141());
            
          
            
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

public boolean insertarItem15(Mgestion_integral dts) {
        
        Item15 = "update item set cumple=?, justifi=?, aplica=? where idItem=15";
        
        Ver24 = "update verificacion set cumplimiento=? where idverificacion=24";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item15);
            PreparedStatement pst2 = cn.prepareStatement(Ver24);
            
            

            pst.setString(1, dts.getI151());
            pst.setString(2, dts.getJ151());
            pst.setString(3, dts.getA151());
            
            pst2.setString(1, dts.getV151());
            
          
            
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

 public boolean insertarItem16(Mgestion_integral dts) {
        
        Item16 = "update item set cumple=?, justifi=?, aplica=? where idItem=16";
        
        Ver25 = "update verificacion set cumplimiento=? where idverificacion=25";
        Ver26 = "update verificacion set cumplimiento=? where idverificacion=26";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item16);
            PreparedStatement pst2 = cn.prepareStatement(Ver25);
            PreparedStatement pst3 = cn.prepareStatement(Ver26);
            

            pst.setString(1, dts.getI161());
            pst.setString(2, dts.getJ161());
            pst.setString(3, dts.getA161());
            
            pst2.setString(1, dts.getV161());
            
            pst3.setString(1, dts.getV162());  
          
            
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
  
   public boolean insertarItem17(Mgestion_integral dts) {
        
        Item17 = "update item set cumple=?, justifi=?, aplica=? where idItem=17";
        
         Ver27 = "update verificacion set cumplimiento=? where idverificacion=27";
        Ver28 = "update verificacion set cumplimiento=? where idverificacion=28";
        Ver29 = "update verificacion set cumplimiento=? where idverificacion=29";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item17);
            
             PreparedStatement pst2 = cn.prepareStatement(Ver27);
            PreparedStatement pst3 = cn.prepareStatement(Ver28);
            PreparedStatement pst4 = cn.prepareStatement(Ver29);
                        
            

            pst.setString(1, dts.getI171());
            pst.setString(2, dts.getJ171());
            pst.setString(3, dts.getA171());
            
                      
            
            pst2.setString(1, dts.getV171());
            
            pst3.setString(1, dts.getV172());
             
            pst4.setString(1, dts.getV173());
              
            
            
           
            
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
  
 public boolean insertarItem18 (Mgestion_integral dts) {
        
        Item18 = "update item set cumple=?, justifi=?, aplica=? where idItem=18";
        Ver30 = "update verificacion set cumplimiento=? where idverificacion=30";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item18);
            PreparedStatement pst2 = cn.prepareStatement(Ver30);
            
            

            pst.setString(1, dts.getI181());
            pst.setString(2, dts.getJ181());
            pst.setString(3, dts.getA181());
            
            pst2.setString(1, dts.getV181());
            
                       
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
 
  public boolean insertarItem19 (Mgestion_integral dts) {
        
        Item19 = "update item set cumple=?, justifi=?, aplica=? where idItem=19";
        Ver31 = "update verificacion set cumplimiento=? where idverificacion=31";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item19);
            PreparedStatement pst2 = cn.prepareStatement(Ver31);
            
            

            pst.setString(1, dts.getI191());
            pst.setString(2, dts.getJ191());
            pst.setString(3, dts.getA191());
            
            pst2.setString(1, dts.getV191());
            
                       
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

  public boolean insertarItem20(Mgestion_integral dts) {
        
        Item20 = "update item set cumple=?, justifi=?, aplica=? where idItem=20";
        
        Ver32 = "update verificacion set cumplimiento=? where idverificacion=32";
        Ver33 = "update verificacion set cumplimiento=? where idverificacion=33";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item20);
            PreparedStatement pst2 = cn.prepareStatement(Ver32);
            PreparedStatement pst3 = cn.prepareStatement(Ver33);
            

            pst.setString(1, dts.getI201());
            pst.setString(2, dts.getJ201());
            pst.setString(3, dts.getA201());
            
            pst2.setString(1, dts.getV201());
            
            pst3.setString(1, dts.getV202());  
          
            
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
  
    public boolean insertarItem21 (Mgestion_integral dts) {
        
        Item21 = "update item set cumple=?, justifi=?, aplica=? where idItem=21";
        Ver34 = "update verificacion set cumplimiento=? where idverificacion=34";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item21);
            PreparedStatement pst2 = cn.prepareStatement(Ver34);
            
            

            pst.setString(1, dts.getI211());
            pst.setString(2, dts.getJ211());
            pst.setString(3, dts.getA211());
            
            pst2.setString(1, dts.getV211());
            
                       
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
    
      public boolean insertarItem22 (Mgestion_integral dts) {
        
        Item22 = "update item set cumple=?, justifi=?, aplica=? where idItem=22";
        Ver35 = "update verificacion set cumplimiento=? where idverificacion=35";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item22);
            PreparedStatement pst2 = cn.prepareStatement(Ver35);
            
            

            pst.setString(1, dts.getI221());
            pst.setString(2, dts.getJ221());
            pst.setString(3, dts.getA221());
            
            pst2.setString(1, dts.getV221());
            
                       
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
