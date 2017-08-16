/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class M_DesHabEncuesta {
    private int idEmpleado;
    private String estado;
    private int codigoEncuesta;

    Conexion conexion=new Conexion();
    public M_DesHabEncuesta() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoEncuesta() {
        return codigoEncuesta;
    }

    public void setCodigoEncuesta(int codigoEncuesta) {
        this.codigoEncuesta = codigoEncuesta;
    }
    


public int EncuestaActiva(){
    M_DesHabEncuesta modelo_desHabEncu;
    int codigo=0;
    try {
        Connection accesoBD=conexion.getConexion();
        CallableStatement cs=accesoBD.prepareCall("{call sp_EncuestaActiva()}");
        
        ResultSet rs=cs.executeQuery();
        while(rs.next()){
        modelo_desHabEncu=new M_DesHabEncuesta();
        modelo_desHabEncu.setCodigoEncuesta(rs.getInt(1));
        codigo=modelo_desHabEncu.getCodigoEncuesta();
        }
    } catch (SQLException e) {
    }

return codigo;

}

public String DeshabilitarEncuesta(int codigo){
String resultado = null;
    try {
         Connection accesoBD=conexion.getConexion();
         
         CallableStatement cs=accesoBD.prepareCall("{call sp_deshabilitarEncuesta(?)}");
         cs.setInt(1, codigo);
      int res=cs.executeUpdate();
      JOptionPane.showMessageDialog(null, "Prueba");
      if(res>0){
      resultado="Se Deshabilito Correctamente";
      }else{
      resultado="Error no se pudo realizar la operacion";
      }
    } catch (Exception e) {
    }
   
return resultado;
}

}