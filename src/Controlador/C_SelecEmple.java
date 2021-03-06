/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.M_DesHabEncuesta;
import Modelo.M_SeleccionarEmpleado;
import Vista.SeleccionarEmpleados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class C_SelecEmple implements ActionListener, KeyListener {
    SeleccionarEmpleados vista_seleccionEmple=new SeleccionarEmpleados();
    M_SeleccionarEmpleado modelo_seleccionEmple=new M_SeleccionarEmpleado();
    M_DesHabEncuesta modelo_desHabEncuesta=new M_DesHabEncuesta();
 DefaultTableModel modelo=new DefaultTableModel();
    String tipoEncuesta;
     int codigo;
     String fechatxt;
    public C_SelecEmple(SeleccionarEmpleados vista_seleccionEmple, M_SeleccionarEmpleado modelo_seleccionEmple, int codigo, String fecha) {
        this.vista_seleccionEmple=vista_seleccionEmple;
        this.modelo_seleccionEmple= modelo_seleccionEmple;
    //  this.tipoEncuesta=tipoEncuesta;
    this.codigo=codigo;
    this.fechatxt=fecha;
        this.vista_seleccionEmple.btn_buscar.addActionListener(this);
        this.vista_seleccionEmple.btn_deshabilitar.addActionListener(this);
        this.vista_seleccionEmple.btn_habilitar.addActionListener(this);
       modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido 1");
    modelo.addColumn("Apellido 2");
    modelo.addColumn("Tipo Doc");
    modelo.addColumn("Numero Doc");
    modelo.addColumn("Area");
    modelo.addColumn("Cargo");
    this.vista_seleccionEmple.tb_empleados.setModel(modelo);
   
    
   
       
        
       // if("Activa".equals(this.tipoEncuesta)){
          //  vista_seleccionEmple.btn_habilitar.setVisible(false);
          ArrayList<M_SeleccionarEmpleado> arraySeleccion=modelo_seleccionEmple.empleados();
    
        Object[] fila =new Object[modelo.getColumnCount()];
    
         for(int i=0; i <arraySeleccion.size(); i++){
      
    fila[0]=arraySeleccion.get(i).getIdEmpleado();
      
    fila[1]=arraySeleccion.get(i).getNombre();
    fila[2]=arraySeleccion.get(i).getApellido_pa();
    fila[3]=arraySeleccion.get(i).getApellido_ma();
    fila[4]=arraySeleccion.get(i).getTipoDoc();
    fila[5]=arraySeleccion.get(i).getNumDoc();
    fila[6]=arraySeleccion.get(i).getNombreProceso();
    fila[7]=arraySeleccion.get(i).getCargo();
  
     modelo.addRow(fila);
        
  
         }  
  
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String buscarPor=vista_seleccionEmple.cb_buscarPor.getSelectedItem().toString();
        if(ae.getSource()==vista_seleccionEmple.btn_buscar){
             if(buscarPor.equals("Empleado")){
               
               //  int filaSele=vista_seleccionEmple.tb_empleados.getSelectedRow();
            
                // int idPersona=Integer.parseInt(vista_seleccionEmple.tb_empleados.getValueAt(filaSele, 0).toString());
                // ArrayList array=modelo_seleccionEmple.encuActivas(idPersona);
                // String estado=array.get(0).toString();
                // JOptionPane.showMessageDialog(null,"estado"+ estado);
                // if(!estado.equals("Activa")){
                 
                     
                     modelo.setRowCount(0);
          ArrayList<M_SeleccionarEmpleado> arraySeleccion=modelo_seleccionEmple.empleados();
    
        Object[] fila =new Object[modelo.getColumnCount()];
    
         for(int i=0; i <arraySeleccion.size(); i++){
      
    fila[0]=arraySeleccion.get(i).getIdEmpleado();
      
    fila[1]=arraySeleccion.get(i).getNombre();
    fila[2]=arraySeleccion.get(i).getApellido_pa();
    fila[3]=arraySeleccion.get(i).getApellido_ma();
    fila[4]=arraySeleccion.get(i).getTipoDoc();
    fila[5]=arraySeleccion.get(i).getNumDoc();
    fila[6]=arraySeleccion.get(i).getNombreProceso();
    fila[7]=arraySeleccion.get(i).getCargo();
  
     modelo.addRow(fila);
         }
            }
             
        else
             if(buscarPor.equals("Administrador SGSST")){
                 JOptionPane.showMessageDialog(null, "Admin SGSST");
           modelo.setRowCount(0); 
            ArrayList<M_SeleccionarEmpleado> arraySeleccion=modelo_seleccionEmple.AdminSGSST();
            Object[] fila =new Object[modelo.getColumnCount()];
            
            for(int i=0; i <arraySeleccion.size(); i++){
       
    fila[0]=arraySeleccion.get(i).getIdEmpleado();
      
    fila[1]=arraySeleccion.get(i).getNombre();
    fila[2]=arraySeleccion.get(i).getApellido_pa();
    fila[3]=arraySeleccion.get(i).getApellido_ma();
    fila[4]=arraySeleccion.get(i).getTipoDoc();
    fila[5]=arraySeleccion.get(i).getNumDoc();
    fila[6]=arraySeleccion.get(i).getNombreProceso();
    fila[7]=arraySeleccion.get(i).getCargo();
  
     modelo.addRow(fila);
            }  
             }else
                 if(buscarPor.equals("Jefe de Area")){
                 
                  modelo.setRowCount(0); 
            ArrayList<M_SeleccionarEmpleado> arraySeleccion=modelo_seleccionEmple.JefeArea();
            Object[] fila =new Object[modelo.getColumnCount()];
            
            for(int i=0; i <arraySeleccion.size(); i++){
      
    fila[0]=arraySeleccion.get(i).getIdEmpleado();
      
    fila[1]=arraySeleccion.get(i).getNombre();
    fila[2]=arraySeleccion.get(i).getApellido_pa();
    fila[3]=arraySeleccion.get(i).getApellido_ma();
    fila[4]=arraySeleccion.get(i).getTipoDoc();
    fila[5]=arraySeleccion.get(i).getNumDoc();
    fila[6]=arraySeleccion.get(i).getNombreProceso();
    fila[7]=arraySeleccion.get(i).getCargo();
  
     modelo.addRow(fila);
            }  
                 
                 }else
                     if(buscarPor.equals("Gerente")){
                      modelo.setRowCount(0); 
            ArrayList<M_SeleccionarEmpleado> arraySeleccion=modelo_seleccionEmple.Gerente();
            Object[] fila =new Object[modelo.getColumnCount()];
            
            for(int i=0; i <arraySeleccion.size(); i++){
      
    fila[0]=arraySeleccion.get(i).getIdEmpleado();
      
    fila[1]=arraySeleccion.get(i).getNombre();
    fila[2]=arraySeleccion.get(i).getApellido_pa();
    fila[3]=arraySeleccion.get(i).getApellido_ma();
    fila[4]=arraySeleccion.get(i).getTipoDoc();
    fila[5]=arraySeleccion.get(i).getNumDoc();
    fila[6]=arraySeleccion.get(i).getNombreProceso();
    fila[7]=arraySeleccion.get(i).getCargo();
  
     modelo.addRow(fila);
            }        
           }
        
            }
    
        
        if(ae.getSource()==vista_seleccionEmple.btn_habilitar){
            
            String estado="Activa";
        int fil=vista_seleccionEmple.tb_empleados.getSelectedRow();
           int id=Integer.parseInt(vista_seleccionEmple.tb_empleados.getValueAt(fil, 0).toString());
        
      

           
           // fechaEn=formatoFecha.parse(fecha);
      int resp= modelo_seleccionEmple.habiEncuesta(fechatxt, codigo, estado, id);
      
      if(resp!=0){
      JOptionPane.showMessageDialog(null, "Se Habilito correctamente la Encuesta");
      }else{
      JOptionPane.showMessageDialog(null, "No se pudo ralizar la habilitacion","ERROR",JOptionPane.ERROR_MESSAGE);
      }
        
        
        
        
        if(ae.getSource()==vista_seleccionEmple.btn_deshabilitar){
        
            if(vista_seleccionEmple.tb_empleados.getSelectedRow()>=0){
            int filaSeleccionada=vista_seleccionEmple.tb_empleados.getSelectedRow();
            String codigo=vista_seleccionEmple.tb_empleados.getValueAt(filaSeleccionada, 8).toString();
            
           String resultado=modelo_desHabEncuesta.DeshabilitarEncuesta(Integer.parseInt(codigo));
            JOptionPane.showMessageDialog(null, resultado);
            
            }
        }
        } 
        }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    
    

