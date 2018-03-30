package sv.edu.cad.model;
import java.sql.*;

public class Conexion 
{
    private Connection conexion = null;
    private Statement s = null;
    private ResultSet rs = null;
    private String query = "";
    
    public Conexion() throws SQLException
    {
     try
     {
         Class.forName("com.mysql.jdbc.Driver");         
         conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","");
         s = conexion.createStatement();
     }catch(ClassNotFoundException e1)
     {
         
         System.out.println("ERROR: No encuentro el driver de BDD"+e1.getMessage());
     }
    }
    
     public ResultSet getRs()
    {
     return rs;
    }
     
    public void setRs(String consulta)
    {
     try
     {
      this.rs = s.executeQuery(consulta);
     }
     catch(SQLException e2)
     {
      System.out.println("ERROR: Fallo en SQL"+e2.getMessage());
     }
    }
    
    public void setQuery(String query) throws SQLException
    {
     this.s.executeUpdate(query);
    }
    
    public void cerrarConexion() throws SQLException
    {
        s.close();
        conexion.close();
    }
    
    //Para hacer uso de los preparedStatement
    public Connection getConnection()
    {
        return this.conexion;
    }
}
