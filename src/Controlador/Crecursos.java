/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
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
public class Crecursos extends Conexion {
    
    
    private Conexion conexion =new Conexion();
   private Connection cn= conexion.getConexion();
    Statement st;
   private String Archivo;
  // Variables de consulta de los items
   private String Item1;
   private String Ver1;
   private String Ver2;
   private String Ver3;
   private String Ver4;
   
    private String Item2;
    private String Ver5;
   
    private String Item3;
    private String Ver6;
   
    private String Item4;
    private String Ver7;
     private String Ver8;
   
    private String Item5;
    private String Ver9;
   
    private String Item6;
    private String Ver10;
    private String Ver11;
   
    private String Item7;
    private String Ver12;
   
    private String Item8;
     private String Ver13;
     private String Ver14;
   
    private String Item9;
    private String Ver15;
    private String Ver16;
   
    private String Item10;
    private String Ver17;
   
    private String Item11;
    private String Ver18;
    
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
    public boolean insertarItem1(Mrecursos dts) {
        
        Item1 = "update item set cumple=?, justifi=?, aplica=? where idItem=1";
                
        Ver1 = "update verificacion set cumplimiento=? where idverificacion=1";
        Ver2 = "update verificacion set cumplimiento=? where idverificacion=2";
        Ver3 = "update verificacion set cumplimiento=? where idverificacion=3";
        Ver4 = "update verificacion set cumplimiento=? where idverificacion=4";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item1);
            PreparedStatement pst2 = cn.prepareStatement(Ver1);
            PreparedStatement pst3 = cn.prepareStatement(Ver2);
            PreparedStatement pst4 = cn.prepareStatement(Ver3);
            PreparedStatement pst5 = cn.prepareStatement(Ver4);
            

            pst.setString(1, dts.getI1111());
            pst.setString(2, dts.getJ1111());
            pst.setString(3, dts.getA1111());
            
            pst2.setString(1, dts.getV1111());
            
            pst3.setString(1, dts.getV1112());
             
            pst4.setString(1, dts.getV1113());
              
            pst5.setString(1, dts.getV1114());
            
           
            
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
    
     public boolean insertarItem2(Mrecursos dts) {
        
        Item2 = "update item set cumple=?, justifi=?, aplica=? where idItem=2";
        Ver5 = "update verificacion set cumplimiento=? where idverificacion=5";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item2);
            PreparedStatement pst2 = cn.prepareStatement(Ver5);
            
            

            pst.setString(1, dts.getI1121());
            pst.setString(2, dts.getJ1121());
            pst.setString(3, dts.getA1121());
            
            pst2.setString(1, dts.getV1121());
            
                       
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
     
 public boolean insertarItem3(Mrecursos dts) {
        
        Item3 = "update item set cumple=?, justifi=?, aplica=? where idItem=3";
        
        Ver6 = "update verificacion set cumplimiento=? where idverificacion=6";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item3);
            PreparedStatement pst2 = cn.prepareStatement(Ver6);
            
            

            pst.setString(1, dts.getI1131());
            pst.setString(2, dts.getJ1131());
            pst.setString(3, dts.getA1131());
            
            pst2.setString(1, dts.getV1131());
            
          
            
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

public boolean insertarItem4(Mrecursos dts) {
        
        Item4 = "update item set cumple=?, justifi=?, aplica=? where idItem=4";
        
        Ver7 = "update verificacion set cumplimiento=? where idverificacion=7";
        Ver8 = "update verificacion set cumplimiento=? where idverificacion=8";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item4);
            PreparedStatement pst2 = cn.prepareStatement(Ver7);
            PreparedStatement pst3 = cn.prepareStatement(Ver8);
            

            pst.setString(1, dts.getI1141());
            pst.setString(2, dts.getJ1141());
            pst.setString(3, dts.getA1141());
            
            pst2.setString(1, dts.getV1141());
            
            pst3.setString(1, dts.getV1142());  
          
            
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

  public boolean insertarItem5 (Mrecursos dts) {
        
        Item5 = "update item set cumple=?, justifi=?, aplica=? where idItem=5";
        Ver9 = "update verificacion set cumplimiento=? where idverificacion=9";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item5);
            PreparedStatement pst2 = cn.prepareStatement(Ver9);
            
            

            pst.setString(1, dts.getI1151());
            pst.setString(2, dts.getJ1151());
            pst.setString(3, dts.getA1151());
            
            pst2.setString(1, dts.getV1151());
            
                       
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
  
  public boolean insertarItem6(Mrecursos dts) {
        
        Item6 = "update item set cumple=?, justifi=?, aplica=? where idItem=6";
        
        Ver10 = "update verificacion set cumplimiento=? where idverificacion=10";
        Ver11 = "update verificacion set cumplimiento=? where idverificacion=11";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item6);
            PreparedStatement pst2 = cn.prepareStatement(Ver10);
            PreparedStatement pst3 = cn.prepareStatement(Ver11);
            

            pst.setString(1, dts.getI1161());
            pst.setString(2, dts.getJ1161());
            pst.setString(3, dts.getA1161());
            
            pst2.setString(1, dts.getV1161());
            
            pst3.setString(1, dts.getV1162());  
          
            
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
  
 public boolean insertarItem7 (Mrecursos dts) {
        
        Item7 = "update item set cumple=?, justifi=?, aplica=? where idItem=7";
        Ver12 = "update verificacion set cumplimiento=? where idverificacion=12";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item7);
            PreparedStatement pst2 = cn.prepareStatement(Ver12);
            
            

            pst.setString(1, dts.getI1171());
            pst.setString(2, dts.getJ1171());
            pst.setString(3, dts.getA1171());
            
            pst2.setString(1, dts.getV1171());
            
                       
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

  public boolean insertarItem8(Mrecursos dts) {
        
        Item8 = "update item set cumple=?, justifi=?, aplica=? where idItem=8";
        
        Ver13 = "update verificacion set cumplimiento=? where idverificacion=13";
        Ver14 = "update verificacion set cumplimiento=? where idverificacion=14";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item8);
            PreparedStatement pst2 = cn.prepareStatement(Ver13);
            PreparedStatement pst3 = cn.prepareStatement(Ver14);
            

            pst.setString(1, dts.getI1181());
            pst.setString(2, dts.getJ1181());
            pst.setString(3, dts.getA1181());
            
            pst2.setString(1, dts.getV1181());
            
            pst3.setString(1, dts.getV1182());  
          
            
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
  
   public boolean insertarItem9(Mrecursos dts) {
        
        Item9 = "update item set cumple=?, justifi=?, aplica=? where idItem=9";
        
        Ver15 = "update verificacion set cumplimiento=? where idverificacion=15";
        Ver16 = "update verificacion set cumplimiento=? where idverificacion=16";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item9);
            PreparedStatement pst2 = cn.prepareStatement(Ver15);
            PreparedStatement pst3 = cn.prepareStatement(Ver16);
            

            pst.setString(1, dts.getI1191());
            pst.setString(2, dts.getJ1191());
            pst.setString(3, dts.getA1191());
            
            pst2.setString(1, dts.getV1191());
            
            pst3.setString(1, dts.getV1192());  
          
            
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
   
   public boolean insertarItem10(Mrecursos dts) {
        
        Item10 = "update item set cumple=?, justifi=?, aplica=? where idItem=10";
        Ver17 = "update verificacion set cumplimiento=? where idverificacion=17";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item10);
            PreparedStatement pst2 = cn.prepareStatement(Ver17);
            
            

            pst.setString(1, dts.getI11101());
            pst.setString(2, dts.getJ11101());
            pst.setString(3, dts.getA11101());
            
            pst2.setString(1, dts.getV11101());
            
                       
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
   
   public boolean insertarItem11(Mrecursos dts) {
        
        Item11 = "update item set cumple=?, justifi=?, aplica=? where idItem=11";
        Ver18 = "update verificacion set cumplimiento=? where idverificacion=18";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item11);
            PreparedStatement pst2 = cn.prepareStatement(Ver18);
            
            

            pst.setString(1, dts.getI11111());
            pst.setString(2, dts.getJ11111());
            pst.setString(3, dts.getA11111());
            
            pst2.setString(1, dts.getV11111());
            
                       
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