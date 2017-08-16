/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.M_DesHabEncuesta;
import Modelo.M_SeleccionarEmpleado;
import Vista.DeshabEncuesta;
import Vista.SeleccionarEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class C_DesHabEncu implements ActionListener, KeyListener {
    DeshabEncuesta vista_deshabilitarEncuesta=new DeshabEncuesta();
    M_DesHabEncuesta modelo_deshabilitarEncuesta=new M_DesHabEncuesta();
    SeleccionarEmpleados vista_selEmpleados;
     M_SeleccionarEmpleado modelo_seleccionEmple=new M_SeleccionarEmpleado();
     SeleccionarEmpleados vista_seleccionEmple=new SeleccionarEmpleados();

     String tipoEncuesta;
    public C_DesHabEncu(DeshabEncuesta vista_deshabilitarEncuesta, M_DesHabEncuesta modelo_deshabilitarEncuesta ) {
        this.vista_deshabilitarEncuesta=vista_deshabilitarEncuesta;
        this.modelo_deshabilitarEncuesta=modelo_deshabilitarEncuesta;
 
        vista_deshabilitarEncuesta.txt_CodigoEncuActiva.setText(String.valueOf(modelo_deshabilitarEncuesta.EncuestaActiva()));
        
        vista_deshabilitarEncuesta.btn_seleccionarEmpleados.addActionListener(this);
        vista_deshabilitarEncuesta.rb_Algunos.addActionListener(this);
        vista_deshabilitarEncuesta.rb_Todos.addActionListener(this);
        vista_deshabilitarEncuesta.lbl_textoSeleccione.setVisible(false);
        vista_deshabilitarEncuesta.btn_seleccionarEmpleados.setVisible(false);
     //  vista_deshabilitarEncuesta.cb_deshaPara.addActionListener(this);
     
      
    }
    
    
  

    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==vista_deshabilitarEncuesta.rb_Algunos){
       vista_deshabilitarEncuesta.lbl_textoSeleccione.setVisible(true);
        vista_deshabilitarEncuesta.btn_seleccionarEmpleados.setVisible(true);
      }
      
      if(ae.getSource()==vista_deshabilitarEncuesta.rb_Todos){

      vista_deshabilitarEncuesta.lbl_textoSeleccione.setVisible(false);
        vista_deshabilitarEncuesta.btn_seleccionarEmpleados.setVisible(false);
      }
      if(ae.getSource()==vista_deshabilitarEncuesta.btn_seleccionarEmpleados){
         
   tipoEncuesta="Activa";
    
  
    SeleccionarEmpleados vista=new SeleccionarEmpleados();
               M_SeleccionarEmpleado modelo=new M_SeleccionarEmpleado();
               C_SelecEmple controlador=new C_SelecEmple(vista, modelo, tipoEncuesta);
                vista.setVisible(true);
     }
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
   //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
