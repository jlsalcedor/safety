/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.M_EncDatosPer;
import Modelo.M_EncuestaSocioDemografica;
import Modelo.M_IngresoSistema;
import Modelo.infoEmpEncuesta;
import Vista.Encuesta_SocioDemografica;
import Vista.IngresoUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class C_RealizarEncuesta implements ActionListener, KeyListener{
    Encuesta_SocioDemografica vista_realizarEncuesta=new Encuesta_SocioDemografica();
    M_EncuestaSocioDemografica modelo_encuesta=new M_EncuestaSocioDemografica();
    M_IngresoSistema datosEmpleado=new M_IngresoSistema();
ArrayList array=new ArrayList();
ArrayList<M_EncuestaSocioDemografica> arrayDatosEmpresa=new ArrayList();
IngresoUsuario vista_ingreso = new IngresoUsuario();
infoEmpEncuesta datosEmpEncuesta=new infoEmpEncuesta();

    public C_RealizarEncuesta(Encuesta_SocioDemografica vista_realizarEncuesta, M_EncuestaSocioDemografica modelo_encuesta) {
        
        this.modelo_encuesta=modelo_encuesta;
        this.vista_realizarEncuesta=vista_realizarEncuesta;
        
        vista_realizarEncuesta.txt_empresa.addKeyListener(this);
  
     
        arrayDatosEmpresa=modelo_encuesta.empresa();
        for(int i=0;i<arrayDatosEmpresa.size(); i++){
         vista_realizarEncuesta.txt_empresa.setText(String.valueOf(arrayDatosEmpresa.get(i).getNombre())); 
        }
       vista_realizarEncuesta.txt_sucursalEmpresa.setText(M_EncuestaSocioDemografica.getSucursal());
   
        vista_realizarEncuesta.txt_sucursalEmpresa.setText(M_EncuestaSocioDemografica.getSucursal());
    vista_realizarEncuesta.txt_nombreEncuesta.setText(C_IngresoSistema.nombrecompleto);
        vista_realizarEncuesta.txt_codigoEncuesta.setText(String.valueOf(modelo_encuesta.getCodigo()));
     //    arrayDatosEmpleado=datosEmpEncuesta.datosEmpEncuesta(C_IngresoSistema.user, C_IngresoSistema.contraseñatxt);
         vista_realizarEncuesta.txt_nombreEncuesta.setText(infoEmpEncuesta.getNombre() +" "+infoEmpEncuesta.getApellido_paterno() +" "+ infoEmpEncuesta.getApellido_materno());
         vista_realizarEncuesta.txt_CargoEncuesta.setText(infoEmpEncuesta.getCargo());
         vista_realizarEncuesta.txt_procesoEncuesta.setText(infoEmpEncuesta.getArea());
         vista_realizarEncuesta.txtFecha.setText(fechaActual());
    }
    //Metodo que me retorna la Fecha Actual
    public static String fechaActual(){
    Date fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("yyyy-MM-dd");
    
    return formatoFecha.format(fecha);
    
    }
    
    public void AlmacenarEncuesta(){
        M_EncDatosPer datosPer=new M_EncDatosPer();
        ArrayList<String> datosPersonales=new ArrayList();
        datosPersonales.add(vista_realizarEncuesta.cb_edad.getSelectedItem().toString());
        datosPersonales.add(vista_realizarEncuesta.cb_estadoCivil.getSelectedItem().toString());
        for(int i=0;i<datosPersonales.size();i++){
        int id=1;
        datosPer.Insertardatos(id, datosPersonales.get(i));
        id++;
        }
       /*
    String edad=vista_realizarEncuesta.cb_edad.getSelectedItem().toString();
    String estadoCivil=vista_realizarEncuesta.cb_estadoCivil.getSelectedItem().toString();
    
    String genero=vista_realizarEncuesta.cb_genero.getSelectedItem().toString();
    String perCargo=vista_realizarEncuesta.cb_perCargo.getSelectedItem().toString();
    String escolaridad=vista_realizarEncuesta.cb_escolaridad.getSelectedItem().toString();
    String residencia=vista_realizarEncuesta.cb_residencia.getSelectedItem().toString();
    String tipoLibre=vista_realizarEncuesta.cb_tiempoLibre.getSelectedItem().toString();
    String ingreso=vista_realizarEncuesta.cb_ingresos.getSelectedItem().toString();
    String tiempoEmpresa=vista_realizarEncuesta.cb_tiempoEmpresa.getSelectedItem().toString();
    String tiempoCargo=vista_realizarEncuesta.cb_tiempoCargo.getSelectedItem().toString();
   // String consBebida=vista_realizarEncuesta.cb_bebidas.getSelectedItem().toString();
    */
    
    
    }
    public void InsertarEncuesta(){
    
    }

  
   

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==vista_realizarEncuesta.btn_GuardarEncuesta){
        
        
        }
        //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
