/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ArchivoEncuesta;
import Vista.Descargar_Archivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class C_DescargarEncuesta implements ActionListener, KeyListener {
    Descargar_Archivo vista_descargarArchivo=new Descargar_Archivo();
    ArchivoEncuesta modelo_ArchivoEncuesta=new ArchivoEncuesta();
    
    //Variables
    
    public static String path;
public static int idArchivo=1;
    public C_DescargarEncuesta(Descargar_Archivo vista_descargarArchivo, ArchivoEncuesta modelo_ArchivoEncuesta) {
        this.modelo_ArchivoEncuesta=modelo_ArchivoEncuesta;
        this.vista_descargarArchivo=vista_descargarArchivo;
        
        this.vista_descargarArchivo.btn_descargarArchivo.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==vista_descargarArchivo.btn_descargarArchivo){
             JFileChooser elegirCarpeta = new JFileChooser();
             
             elegirCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
             
             int estado=elegirCarpeta.showSaveDialog(null);
             if(estado==JFileChooser.APPROVE_OPTION){
             
                 try {
                     
                   path=elegirCarpeta.getSelectedFile().getAbsolutePath();
                   modelo_ArchivoEncuesta.descargarEncuesta(idArchivo);
                   
                 } catch (Exception e) {
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
      //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
