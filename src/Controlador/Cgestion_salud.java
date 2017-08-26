/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Mgestion_integral;
import Modelo.Mgestion_salud;
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
public class Cgestion_salud extends Conexion {
      
        private Conexion conexion =new Conexion();
   private Connection cn= conexion.getConexion();
    Statement st;

    // Variables de consulta de los items
   private String Item23;
   private String Ver36;
  
    
    private String Item24;
    private String Ver37;
    private String Ver38;
   
    private String Item25;
    private String Ver39;
   
    private String Item26;
    private String Ver40;
    private String Ver41;
    private String Ver42;
 
    private String Item27;
    private String Ver43;
   
   
    private String Item28;
    private String Ver44;
    private String Ver45;
   
   
    private String Item29;
    private String Ver46;
   
    private String Item30;
     private String Ver47;
    
    private String Item31;
    private String Ver48;
   
    private String Item32;
    private String Ver49;
   
    private String Item33;
    private String Ver50;
    private String Ver51;
    private String Ver52;
    
     private String Item34;
     private String Ver53;
    
    private String Item35;
    private String Ver54;
   
    private String Item36;
    private String Ver55;
    
     private String Item37;
     private String Ver56;
    
    private String Item38;
    private String Ver57;
   
    private String Item39;
    private String Ver58;
    
     private String Item40;
     private String Ver59;
    
   
    
     
      // Metodos para poner los resultados de la Evaluacion Inicial (11 items)
   public boolean insertarItem23(Mgestion_salud dts) {
        
        Item23 = "update item set cumple=?, justifi=?, aplica=? where idItem=23";
        Ver36 = "update verificacion set cumplimiento=? where idverificacion=36";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item23);
            PreparedStatement pst2 = cn.prepareStatement(Ver36);
            
            

            pst.setString(1, dts.getI231());
            pst.setString(2, dts.getJ231());
            pst.setString(3, dts.getA231());
            
            pst2.setString(1, dts.getV231());
            
                       
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
    
       
  public boolean insertarItem24(Mgestion_salud dts) {
        
        Item24 = "update item set cumple=?, justifi=?, aplica=? where idItem=24";
        
        Ver37 = "update verificacion set cumplimiento=? where idverificacion=37";
        Ver38 = "update verificacion set cumplimiento=? where idverificacion=38";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item24);
            PreparedStatement pst2 = cn.prepareStatement(Ver37);
            PreparedStatement pst3 = cn.prepareStatement(Ver38);
            

            pst.setString(1, dts.getI241());
            pst.setString(2, dts.getJ241());
            pst.setString(3, dts.getA241());
            
            pst2.setString(1, dts.getV241());
            
            pst3.setString(1, dts.getV242());  
          
            
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
  
  public boolean insertarItem25(Mgestion_salud dts) {
        
        Item25 = "update item set cumple=?, justifi=?, aplica=? where idItem=25";
        Ver39 = "update verificacion set cumplimiento=? where idverificacion=39";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item25);
            PreparedStatement pst2 = cn.prepareStatement(Ver39);
            
            

            pst.setString(1, dts.getI251());
            pst.setString(2, dts.getJ251());
            pst.setString(3, dts.getA251());
            
            pst2.setString(1, dts.getV251());
            
                       
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
    
     
public boolean insertarItem26(Mgestion_salud dts) {
        
        Item26 = "update item set cumple=?, justifi=?, aplica=? where idItem=26";
        
         Ver40 = "update verificacion set cumplimiento=? where idverificacion=40";
        Ver41 = "update verificacion set cumplimiento=? where idverificacion=41";
        Ver42 = "update verificacion set cumplimiento=? where idverificacion=42";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item26);
            
             PreparedStatement pst2 = cn.prepareStatement(Ver40);
            PreparedStatement pst3 = cn.prepareStatement(Ver41);
            PreparedStatement pst4 = cn.prepareStatement(Ver42);
                        
            

            pst.setString(1, dts.getI261());
            pst.setString(2, dts.getJ261());
            pst.setString(3, dts.getA261());
            
                      
            
            pst2.setString(1, dts.getV261());
            
            pst3.setString(1, dts.getV262());
             
            pst4.setString(1, dts.getV263());
              
            
            
           
            
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
  
public boolean insertarItem27(Mgestion_salud dts) {
        
        Item27 = "update item set cumple=?, justifi=?, aplica=? where idItem=27";
        Ver43 = "update verificacion set cumplimiento=? where idverificacion=43";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item27);
            PreparedStatement pst2 = cn.prepareStatement(Ver43);
            
            

            pst.setString(1, dts.getI271());
            pst.setString(2, dts.getJ271());
            pst.setString(3, dts.getA271());
            
            pst2.setString(1, dts.getV271());
            
                       
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
    

 public boolean insertarItem28(Mgestion_salud dts) {
        
        Item28 = "update item set cumple=?, justifi=?, aplica=? where idItem=28";
        
        Ver44 = "update verificacion set cumplimiento=? where idverificacion=44";
        Ver45 = "update verificacion set cumplimiento=? where idverificacion=45";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item28);
            PreparedStatement pst2 = cn.prepareStatement(Ver44);
            PreparedStatement pst3 = cn.prepareStatement(Ver45);
            

            pst.setString(1, dts.getI281());
            pst.setString(2, dts.getJ281());
            pst.setString(3, dts.getA281());
            
            pst2.setString(1, dts.getV281());
            
            pst3.setString(1, dts.getV282());  
          
            
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
  
 public boolean insertarItem29(Mgestion_salud dts) {
        
        Item29 = "update item set cumple=?, justifi=?, aplica=? where idItem=29";
        Ver46 = "update verificacion set cumplimiento=? where idverificacion=46";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item29);
            PreparedStatement pst2 = cn.prepareStatement(Ver46);
            
            

            pst.setString(1, dts.getI291());
            pst.setString(2, dts.getJ291());
            pst.setString(3, dts.getA291());
            
            pst2.setString(1, dts.getV291());
            
                       
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
 
 public boolean insertarItem30(Mgestion_salud dts) {
        
        Item30 = "update item set cumple=?, justifi=?, aplica=? where idItem=30";
        Ver47 = "update verificacion set cumplimiento=? where idverificacion=47";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item30);
            PreparedStatement pst2 = cn.prepareStatement(Ver47);
            
            

            pst.setString(1, dts.getI301());
            pst.setString(2, dts.getJ301());
            pst.setString(3, dts.getA301());
            
            pst2.setString(1, dts.getV301());
            
                       
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
 
 public boolean insertarItem31(Mgestion_salud dts) {
        
        Item31 = "update item set cumple=?, justifi=?, aplica=? where idItem=31";
        Ver48 = "update verificacion set cumplimiento=? where idverificacion=48";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item31);
            PreparedStatement pst2 = cn.prepareStatement(Ver48);
            
            

            pst.setString(1, dts.getI311());
            pst.setString(2, dts.getJ311());
            pst.setString(3, dts.getA311());
            
            pst2.setString(1, dts.getV311());
            
                       
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
 
 public boolean insertarItem32(Mgestion_salud dts) {
        
        Item32 = "update item set cumple=?, justifi=?, aplica=? where idItem=32";
        Ver49 = "update verificacion set cumplimiento=? where idverificacion=49";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item32);
            PreparedStatement pst2 = cn.prepareStatement(Ver49);
            
            

            pst.setString(1, dts.getI321());
            pst.setString(2, dts.getJ321());
            pst.setString(3, dts.getA321());
            
            pst2.setString(1, dts.getV321());
            
                       
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
    
  public boolean insertarItem33(Mgestion_salud dts) {
        
        Item33 = "update item set cumple=?, justifi=?, aplica=? where idItem=33";
        
         Ver50 = "update verificacion set cumplimiento=? where idverificacion=50";
        Ver51 = "update verificacion set cumplimiento=? where idverificacion=51";
        Ver52 = "update verificacion set cumplimiento=? where idverificacion=52";
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item33);
            
             PreparedStatement pst2 = cn.prepareStatement(Ver50);
            PreparedStatement pst3 = cn.prepareStatement(Ver51);
            PreparedStatement pst4 = cn.prepareStatement(Ver52);
                        
            

            pst.setString(1, dts.getI331());
            pst.setString(2, dts.getJ331());
            pst.setString(3, dts.getA331());
            
                      
            
            pst2.setString(1, dts.getV331());
            
            pst3.setString(1, dts.getV332());
             
            pst4.setString(1, dts.getV333());
              
            
            
           
            
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
  
  public boolean insertarItem34(Mgestion_salud dts) {
        
        Item34 = "update item set cumple=?, justifi=?, aplica=? where idItem=34";
        Ver53 = "update verificacion set cumplimiento=? where idverificacion=53";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item34);
            PreparedStatement pst2 = cn.prepareStatement(Ver53);
            
            

            pst.setString(1, dts.getI341());
            pst.setString(2, dts.getJ341());
            pst.setString(3, dts.getA341());
            
            pst2.setString(1, dts.getV341());
            
                       
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
  
  public boolean insertarItem35(Mgestion_salud dts) {
        
        Item35 = "update item set cumple=?, justifi=?, aplica=? where idItem=35";
        Ver54 = "update verificacion set cumplimiento=? where idverificacion=54";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item35);
            PreparedStatement pst2 = cn.prepareStatement(Ver54);
            
            

            pst.setString(1, dts.getI351());
            pst.setString(2, dts.getJ351());
            pst.setString(3, dts.getA351());
            
            pst2.setString(1, dts.getV351());
            
                       
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
  
  public boolean insertarItem36(Mgestion_salud dts) {
        
        Item36 = "update item set cumple=?, justifi=?, aplica=? where idItem=36";
        Ver55 = "update verificacion set cumplimiento=? where idverificacion=55";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item36);
            PreparedStatement pst2 = cn.prepareStatement(Ver55);
            
            

            pst.setString(1, dts.getI361());
            pst.setString(2, dts.getJ361());
            pst.setString(3, dts.getA361());
            
            pst2.setString(1, dts.getV361());
            
                       
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
  
  public boolean insertarItem37(Mgestion_salud dts) {
        
        Item37 = "update item set cumple=?, justifi=?, aplica=? where idItem=37";
        Ver56 = "update verificacion set cumplimiento=? where idverificacion=56";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item37);
            PreparedStatement pst2 = cn.prepareStatement(Ver56);
            
            

            pst.setString(1, dts.getI371());
            pst.setString(2, dts.getJ371());
            pst.setString(3, dts.getA371());
            
            pst2.setString(1, dts.getV371());
            
                       
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
  
  public boolean insertarItem38(Mgestion_salud dts) {
        
        Item38 = "update item set cumple=?, justifi=?, aplica=? where idItem=38";
        Ver57 = "update verificacion set cumplimiento=? where idverificacion=57";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item38);
            PreparedStatement pst2 = cn.prepareStatement(Ver57);
            
            

            pst.setString(1, dts.getI381());
            pst.setString(2, dts.getJ381());
            pst.setString(3, dts.getA381());
            
            pst2.setString(1, dts.getV381());
            
                       
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
  
  public boolean insertarItem39(Mgestion_salud dts) {
        
        Item39 = "update item set cumple=?, justifi=?, aplica=? where idItem=39";
        Ver58 = "update verificacion set cumplimiento=? where idverificacion=58";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item39);
            PreparedStatement pst2 = cn.prepareStatement(Ver58);
            
            

            pst.setString(1, dts.getI391());
            pst.setString(2, dts.getJ391());
            pst.setString(3, dts.getA391());
            
            pst2.setString(1, dts.getV391());
            
                       
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
  
  public boolean insertarItem40(Mgestion_salud dts) {
        
        Item40 = "update item set cumple=?, justifi=?, aplica=? where idItem=40";
        Ver59 = "update verificacion set cumplimiento=? where idverificacion=59";
        
        
        try {

            PreparedStatement pst = cn.prepareStatement(Item40);
            PreparedStatement pst2 = cn.prepareStatement(Ver59);
            
            

            pst.setString(1, dts.getI401());
            pst.setString(2, dts.getJ401());
            pst.setString(3, dts.getA401());
            
            pst2.setString(1, dts.getV401());
            
                       
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
