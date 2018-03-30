package sv.edu.cad.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sv.edu.cad.model.Conexion;
import sv.edu.cad.view.Logueo;
import sv.edu.cad.view.PrincipalAdmin;

public class Login 
{
    public void IngresarLogin(String carnet, String pass)
    {
     String idcategoria = "";
        try
        {
           Conexion con1 = new Conexion(); 
            con1.setRs("SELECT idCategoria FROM usuario WHERE Carnet = '" + carnet + "' AND Password = '" + pass + "'");
            ResultSet resultado = (ResultSet) con1.getRs(); //obtenemos los valores devueltos
            resultado.next(); 
            idcategoria = resultado.getString(1); 
            con1.cerrarConexion();
            
            
            System.out.println(idcategoria);
            if(idcategoria.equals("1"))
            {
                //abrir el MDI de administrador
                new PrincipalAdmin().setVisible(true);
            }
            else if(idcategoria.equals("2"))
            {
                //abrir el MDI de docente

            }
            else if(idcategoria.equals("3"))
            {
                //abrir el MDI de estudiante

            }
        }
        catch(SQLException ex)
        {
        Logger.getLogger(Logueo.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
