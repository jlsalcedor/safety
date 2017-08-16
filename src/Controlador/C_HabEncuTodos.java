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
        vista_habEncuTodos.txt_UltimoCodigo.setText(String.valueOf(modelo_habEncuTodos.ultimoCodigoEnc()));
        vista_habEncuTodos.lbl_textoSeleccione.setVisible(false);
        vista_habEncuTodos.btn_seleccionarEmpleados.setVisible(false);
       // vista_habEncuTodos.txt_fecha.setText(fecha());
        
        vista_habEncuTodos.btn_habilitarTodos.addActionListener(this);
        vista_habEncuTodos.rb_si.addActionListener(this);
        vista_habEncuTodos.rb_no.addActionListener(this);
        vista_habEncuTodos.rb_algunosEm.addActionListener(this);
        vista_habEncuTodos.rb_todosEm.addActionListener(this);
        vista_habEncuTodos.btn_seleccionarEmpleados.addActionListener(this);
        
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
   
   public void guardarEncuestaMismoCodigo(){
   String estado="Activa";
   int codigo=Integer.parseInt(vista_habEncuTodos.txt_UltimoCodigo.getText());
         JOptionPane.showMessageDialog(null, modelo_habEncuTodos.cambiarEstadoEncuesta(estado, codigo));
   }
  
  
    @Override
    public void actionPerformed(ActionEvent ae) {
       
        if(ae.getSource()==vista_habEncuTodos.rb_si){
         vista_habEncuTodos.txt_fecha.setText(M_HabEncuTodos.getFechaEncUlt().toString());
        }
        if(ae.getSource()==vista_habEncuTodos.rb_no){
        vista_habEncuTodos.txt_fecha.setText(fecha());
        }
        
         if(ae.getSource()==vista_habEncuTodos.rb_algunosEm){
             vista_habEncuTodos.lbl_textoSeleccione.setVisible(true);
             vista_habEncuTodos.btn_seleccionarEmpleados.setVisible(true);
        }
         if(ae.getSource()==vista_habEncuTodos.rb_todosEm){
         vista_habEncuTodos.lbl_textoSeleccione.setVisible(false);
             vista_habEncuTodos.btn_seleccionarEmpleados.setVisible(false);
         }
         
         if(ae.getSource()==vista_habEncuTodos.btn_seleccionarEmpleados){
             JOptionPane.showMessageDialog(null, "Boton");
       String tipoEncuesta="Inactiva";
    
  
                SeleccionarEmpleados vista=new SeleccionarEmpleados();
               M_SeleccionarEmpleado modelo=new M_SeleccionarEmpleado();
               C_SelecEmple controlador=new C_SelecEmple(vista, modelo, tipoEncuesta);
                vista.setVisible(true);
         
         }
      
        if(ae.getSource()==vista_habEncuTodos.btn_habilitarTodos){
            if(vista_habEncuTodos.txt_fecha.getText().length()==0){
            JOptionPane.showMessageDialog(null, "No ha seleccionado una opcion valida, Fecha vacia","ERROR",JOptionPane.ERROR_MESSAGE);
            
            }else{
            if(vista_habEncuTodos.rb_no.isSelected()){
              if(vista_habEncuTodos.txt_nuevoCodigo.getText().length()==0){
              JOptionPane.showMessageDialog(null, "Debe Ingresar un Nuevo Codigo");
              }else{
                  int cantidadActivas=modelo_habEncuTodos.encuestaActiva();
                  
                   if(cantidadActivas == -1 || cantidadActivas>0){
                    JOptionPane.showMessageDialog(null, " Se Ha Encontrado que existe  una Encuesta Activa actualmente \n   Para Realizar una nueva Encuesta DesHabilite la Encuesta Actual","ADvertencia",JOptionPane.WARNING_MESSAGE);
                       
                        }else
                          if(cantidadActivas<=0){
                            int res=JOptionPane.showConfirmDialog(null, "La Encuesta con codigo "+vista_habEncuTodos.txt_nuevoCodigo.getText()+" Se Habilitara Para Todos Los Empleados");
                              if(JOptionPane.YES_OPTION==res){
                          guardarEncuestaCodigoNuevo();
                          }
                          }
                        }
                   
                  
              }else{
               
                int cantidadActivas=modelo_habEncuTodos.encuestaActiva();
                   if(cantidadActivas == -1 || cantidadActivas>0){
                    JOptionPane.showMessageDialog(null, " Se Ha Encontrado que existe una Encuesta Activa actualmente\n Para Realizar una nueva Encuesta DesHabilite la Encuesta Actual","ADvertencia",JOptionPane.WARNING_MESSAGE);
                   }else
                       if(cantidadActivas<=0){
                             int res= JOptionPane.showConfirmDialog(null, "La Encuesta se guardara con el mismo Codigo de la ultima ves que se habilito");
                    if(JOptionPane.YES_OPTION==res){
                    guardarEncuestaMismoCodigo();
                  } 
                }
            }
        }
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
         
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
