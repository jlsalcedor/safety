/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ArchivoEncuesta;
import Vista.Subir_Archivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author USUARIO
 */

public class C_ArchivoEncuesta implements ActionListener, KeyListener {
    Subir_Archivo vista_subirArchivo=new Subir_Archivo();
    ArchivoEncuesta modelo_ArchivoEncuesta=new ArchivoEncuesta();

    //Variables
    
    private static int longitud;
    
    private FileInputStream file;
    
    private FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivos Excel","xlsx");

    public C_ArchivoEncuesta(Subir_Archivo vista_subirArchivo, ArchivoEncuesta modelo_ArchivoEncuesta) {
        //Paso de parametros declarados a nivel de clase para cada clase (vista y modelo)
        this.modelo_ArchivoEncuesta=modelo_ArchivoEncuesta;
        this.vista_subirArchivo=vista_subirArchivo;
        //Agrego a cada boton y txt de mi Vista el ActionListener o KeyListener segun corresponda para poder trabajar en sus eventos//
       //Tener en cuenta que estas variables en mi JFrame deben estar Public//
        this.vista_subirArchivo.txt_codigoEncuesta.addKeyListener(this);
        this.vista_subirArchivo.txt_versionEncuesta.addKeyListener(this);
        this.vista_subirArchivo.txt_nombreArchivo.addKeyListener(this);
        this.vista_subirArchivo.btn_buscarArchivo.addActionListener(this);
        this.vista_subirArchivo.btn_GuardarArchivo.addActionListener(this);
        this.vista_subirArchivo.btn_CancelarArchivo.addActionListener(this);
        this.vista_subirArchivo.btn_SalirArchivo.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      
     
        
        if(ae.getSource()==vista_subirArchivo.btn_buscarArchivo){
          JFileChooser se=new JFileChooser();
           se.setFileFilter(filtro);
          int archivo= se.showOpenDialog(se);
          if(archivo==JFileChooser.APPROVE_OPTION){
              
          vista_subirArchivo.txt_nombreArchivo.setText(se.getSelectedFile().getName());
          
              try {
                  file=new FileInputStream(se.getSelectedFile());
                 
                  longitud=(int)se.getSelectedFile().length();
                  
              } catch (FileNotFoundException ex){
               
              }
          
          }
        }
        
        if(ae.getSource()==vista_subirArchivo.btn_GuardarArchivo){
           
           String version=vista_subirArchivo.txt_versionEncuesta.getText();
           int codigo=Integer.parseInt(vista_subirArchivo.txt_codigoEncuesta.getText());
           String estado="Activo";
           int idSucursal=1;
          JOptionPane.showMessageDialog(null, modelo_ArchivoEncuesta.insertarDatos(file, longitud, version, codigo, estado, idSucursal));
        
        }
        
        if(ae.getSource()==vista_subirArchivo.btn_CancelarArchivo){
        vista_subirArchivo.txt_codigoEncuesta.setText("");
        vista_subirArchivo.txt_nombreArchivo.setText("");
        vista_subirArchivo.txt_versionEncuesta.setText("");
        }
        
        if(ae.getSource()==vista_subirArchivo.btn_SalirArchivo){
        this.vista_subirArchivo.dispose();
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
         //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
