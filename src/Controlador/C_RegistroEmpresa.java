/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador; 

import Modelo.M_RegistroEmpresa;
import Vista.Registro_Empresa;
import Modelo.M_RegistroEmpresa;



import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 *
 * @author YOREL
 */
public class C_RegistroEmpresa implements ActionListener, KeyListener{
    Registro_Empresa vista_registroEmpresa=new Registro_Empresa();
    M_RegistroEmpresa modelo_registro=new M_RegistroEmpresa();

    public C_RegistroEmpresa(Registro_Empresa vista_registroEmpresa, M_RegistroEmpresa modelo_registro) {
        
        this.modelo_registro = modelo_registro;
        this.vista_registroEmpresa = vista_registroEmpresa;
        
        
    }
    
    
    public void llamarDatos(){
    
    
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
