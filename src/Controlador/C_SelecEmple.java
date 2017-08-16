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
import java.util.ArrayList;
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
    public C_SelecEmple(SeleccionarEmpleados vista_seleccionEmple, M_SeleccionarEmpleado modelo_seleccionEmple, String tipoEncuesta) {
        this.vista_seleccionEmple=vista_seleccionEmple;
        this.modelo_seleccionEmple= modelo_seleccionEmple;
      this.tipoEncuesta=tipoEncuesta;
        this.vista_seleccionEmple.btn_buscar.addActionListener(this);
        this.vista_seleccionEmple.btn_deshabilitar.addActionListener(this);
       modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido 1");
    modelo.addColumn("Apellido 2");
    modelo.addColumn("Tipo Doc");
    modelo.addColumn("Numero Doc");
    modelo.addColumn("Area");
    modelo.addColumn("Cargo");
    modelo.addColumn("Encuesta");
    this.vista_seleccionEmple.tb_empleados.setModel(modelo);
    
        
        
        if("Activa".equals(this.tipoEncuesta)){
            vista_seleccionEmple.btn_habilitar.setVisible(false);
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
    fila[8]=arraySeleccion.get(i).getEncuesta();
     modelo.addRow(fila);
        
  
         }  
    }else
        if(this.tipoEncuesta == null){
         vista_seleccionEmple.btn_deshabilitar.setVisible(false);
         vista_seleccionEmple.btn_habilitar.setVisible(true);
          ArrayList<M_SeleccionarEmpleado> arraySeleccion=modelo_seleccionEmple.listEmpleEncuInactiva();
    
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
    fila[8]=arraySeleccion.get(i).getEncuesta();
     modelo.addRow(fila);
        
  
         } 
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==vista_seleccionEmple.btn_buscar){
        JOptionPane.showMessageDialog(null, "Hola");
        
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
    
    
    

