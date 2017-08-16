/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Mevaluacion;
import Modelo.Mgestion_amena;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Cevaluacion {
    private Conexion conexion =new Conexion();
   private Connection cn= conexion.getConexion();
    Statement st;
    
    
       private String empItem;
        int con=1;
       private String empVeri;
    
    
     public boolean empezarItem(Mevaluacion dts) {
         
     while(con<60){    
                
        empItem = "update item set cumple=?, justifi=?, aplica=? where idItem="+con;
               
               
        try {

            PreparedStatement pst = cn.prepareStatement(empItem);
            
            pst.setString(1, dts.getUno());
            pst.setString(2, dts.getDos());
            pst.setString(3, dts.getTres());
                                
            pst.executeUpdate();
           con++;
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
     }
    return true;
}
  
    
      public boolean empezarVeri(Mevaluacion dts) {
         
     for(int i=1;i<91;i++){    
                
        empVeri = "update verificacion set cumplimiento=? where idverificacion="+i;
               
               
        try {

            PreparedStatement pst = cn.prepareStatement(empVeri);
            
            pst.setString(1, dts.getCuatro());
                                           
            pst.executeUpdate();
      
                                          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
     }
    return true;
}
    
}
