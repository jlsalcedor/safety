/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.M_HabEncuTodos;
import Modelo.M_SeleccionarEmpleado;
import Vista.HabEncuestaTodos;
import Vista.SeleccionarEmpleados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public final class C_HabEncuTodos implements ActionListener, KeyListener {
    HabEncuestaTodos vista_habEncuTodos=new HabEncuestaTodos();
    M_HabEncuTodos modelo_habEncuTodos=new M_HabEncuTodos();
    boolean opcion;

    public C_HabEncuTodos(HabEncuestaTodos vista_habEncuTodos, M_HabEncuTodos modelo_habEncuTodos) {
        
        this.modelo_habEncuTodos=modelo_habEncuTodos;
        this.vista_habEncuTodos=vista_habEncuTodos;
     
       // vista_habEncuTodos.txt_fecha.setText(fecha());
        
        vista_habEncuTodos.btn_habilitar.addActionListener(this);
       
        vista_habEncuTodos.rb_algunosEm.addActionListener(this);
        vista_habEncuTodos.rb_todosEm.addActionListener(this);
        vista_habEncuTodos.btn_seleccionarEmpleados.addActionListener(this);
        
        vista_habEncuTodos.lbl_textoSeleccione.setVisible(false);
        vista_habEncuTodos.btn_seleccionarEmpleados.setVisible(false);
        vista_habEncuTodos.txt_fecha.setText(fecha());
    }
    public String fecha(){
        String fechaA;
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("yyyy-MM-dd");
    fechaA=formatoFecha.format(fecha);
    return fechaA;
    }
    
   public void guardarEncuestaCodigoNuevo(){
   
   Date fechaEn = null;
        java.sql.Date fechaDate = null;
           SimpleDateFormat formatoFecha=new SimpleDateFormat("yyyy-MM-dd");
          String fecha=vista_habEncuTodos.txt_fecha.getText();
               try {
                java.util.Date fechaUtil=new java.util.Date();
                 fechaUtil=formatoFecha.parse(fecha);
                 fechaDate=new java.sql.Date(fechaUtil.getTime());
                 
                     
                                  // fechaEn=formatoFecha.parse(fecha);
                    
               } catch (ParseException ex) {
                   Logger.getLogger(C_HabEncuTodos.class.getName()).log(Level.SEVERE, null, ex);
               }  
      JOptionPane.showMessageDialog(null, modelo_habEncuTodos.habilitarEncuesta(Integer.parseInt(vista_habEncuTodos.txt_nuevoCodigo.getText()), fechaDate, "Activa",4));
   }
  
  
    @Override
    public void actionPerformed(ActionEvent ae) {
  
        
         if(ae.getSource()==vista_habEncuTodos.rb_algunosEm){
             vista_habEncuTodos.lbl_textoSeleccione.setVisible(false);
             vista_habEncuTodos.btn_seleccionarEmpleados.setVisible(true);
             vista_habEncuTodos.btn_habilitar.setEnabled(false);
        }
         if(ae.getSource()==vista_habEncuTodos.rb_todosEm){
         vista_habEncuTodos.lbl_textoSeleccione.setVisible(false);
             vista_habEncuTodos.btn_seleccionarEmpleados.setVisible(false);
             vista_habEncuTodos.btn_habilitar.setEnabled(true);
         }
         
         if(ae.getSource()==vista_habEncuTodos.btn_seleccionarEmpleados){  
              if(vista_habEncuTodos.txt_nuevoCodigo.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Codigo","ERROR",JOptionPane.ERROR_MESSAGE);
            
            }else{
             int codigo=Integer.parseInt(vista_habEncuTodos.txt_nuevoCodigo.getText());
           
             String fechatxt=vista_habEncuTodos.txt_fecha.getText();
             
                SeleccionarEmpleados vista=new SeleccionarEmpleados();
               M_SeleccionarEmpleado modelo=new M_SeleccionarEmpleado();
               C_SelecEmple controlador=new C_SelecEmple(vista, modelo, codigo, fechatxt);
                vista.setVisible(true);
              }
         }
      
        if(ae.getSource()==vista_habEncuTodos.btn_habilitar){
            if(vista_habEncuTodos.txt_nuevoCodigo.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Codigo","ERROR",JOptionPane.ERROR_MESSAGE);
            
            }else{
              ArrayList id=new ArrayList();
              M_SeleccionarEmpleado modelo=new M_SeleccionarEmpleado();
              id=modelo_habEncuTodos.listaId();
              String estado="Activa";
              for(int i=0; i<id.size();i++){
                 int idPersona=Integer.parseInt(String.valueOf(id.get(i)));
                 modelo.habiEncuesta(vista_habEncuTodos.txt_fecha.getText(), Integer.parseInt(vista_habEncuTodos.txt_nuevoCodigo.getText()), estado, idPersona);
              }
              JOptionPane.showMessageDialog(null, "Se Habilito Correctamente la Encuesta para "+id.size()+" Personas");
              vista_habEncuTodos.dispose();
              }
              
        }
        }
        //To change body of generated methods, choose Tools | Templates.
    

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
