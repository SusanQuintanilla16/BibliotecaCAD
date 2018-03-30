
package sv.edu.cad.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sv.edu.cad.model.Conexion;



public class Usuario 
{
    public void CargaUsuario(JComboBox categoria)
    {
        try {
            Conexion conexion = new Conexion();
            String sql = "select * from categoriausuario";
            categoria.removeAllItems();
            conexion.setRs(sql);
            ResultSet c_usuarios = conexion.getRs();
            while(c_usuarios.next())
            {
                categoria.addItem(c_usuarios.getString(2));
            }
            c_usuarios.close();
            conexion.cerrarConexion();
        } catch (SQLException ex)
        {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void IngresarUsuario(String nombre, String apellido, String carnet, String pass, int categoria)
    {
        try
        {
            Conexion conexion = new Conexion();
            conexion.setQuery("INSERT INTO usuario (idCategoria, Nombre, Apellido, Carnet, Password) VALUES ("+ 
                    categoria+",'"+ nombre+"','"+apellido +"','"+carnet+"','"+pass+"')");
            
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null,"Usuario Ingresado Exitosamente");
            
        
        }
        catch(SQLException ex)
        {
        Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    public void EditarInfo(String ID, String nombre, String apellido, String carnet, String pass1, String categoria) throws SQLException
    {      
        
        try
        {
              Conexion con = new Conexion();      
              int id =  Integer.parseInt(ID); 
              int id_c = 0;
              if(categoria.equals("administrador"))
              {
               id_c = 1;
              }
              else if(categoria.equals("docente"))
              {
               id_c = 2;
              }
              else if(categoria.equals("estudiante"))
              {
               id_c = 3;
              }
              
              con.setQuery("UPDATE usuario SET Nombre = '"+ nombre + "' , Apellido = '" + apellido + "' , Carnet ='" + carnet + 
                      "' , Password = '" + pass1 + "' , idCategoria = " + id_c  + " WHERE idUsuario = " + id);
              con.cerrarConexion();
              JOptionPane.showMessageDialog(null,"Usuario Actualizado Exitosamente");
              
             
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
}
