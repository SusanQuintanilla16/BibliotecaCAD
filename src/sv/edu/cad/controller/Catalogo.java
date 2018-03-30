package sv.edu.cad.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sv.edu.cad.model.Conexion;

public class Catalogo {
    
    //Función para el ingreso del tema
    public void ingresoTema(String tema){
        try {
            Conexion conexion = new Conexion();
            String sql = "insert into tema(Tema) values ('"+tema+"')";
            conexion.setQuery(sql);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Ingreso de tema exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Funcion para cargar la nacionalidad de Autor
    public void cargarNacionalidad(JComboBox nacionalidad)
    {
        try {
            Conexion conexion = new Conexion();
            String sql = "select * from nacionalidad";
            nacionalidad.removeAllItems();
            conexion.setRs(sql);
            ResultSet paises = conexion.getRs();
            while(paises.next()){
                nacionalidad.addItem(paises.getString(2));
            }
            paises.close();
            conexion.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Función para el ingreso de Autor
    public void ingresarAutor(String Apellido , String Nombre, int Nacionalidad)
    {
        try {
            Conexion conexion = new Conexion();
            String sql = "insert into autor (idNacionalidad,Nombre,Apellido) values ("+
                    Nacionalidad+",'"+Nombre+"','"+Apellido+"')";
            conexion.setQuery(sql);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Ingreso de autor exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    //Función para el ingreso de Clasificación
    public void ingresoClasificacion(String clasificacion){
        try {
            Conexion conexion = new Conexion();
            String sql = "insert into clasificacion(Clasificacion) values ('"+
                    clasificacion+"')";
            conexion.setQuery(sql);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Ingreso de clasificación exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Función para cargar en un JTable los autores para multiple ingreso
    public void mostrarAutores(JTable tabla)
    {
        try {
            Object[] columnas={"Seleccionar","ID","Apellido","Nombre"};
            //Lista de un arreglo tipo objeto para el ingreso de autores
            ArrayList<Object[]> datos= new ArrayList<Object[]>();
            Conexion conexion = new Conexion();
            conexion.setRs("select * from autor");
            ResultSet autores= conexion.getRs();
            while(autores.next()){
                //Se añaden los registros al arraylist
                datos.add(new Object[] {Boolean.FALSE,autores.getInt(1),
                autores.getString(4),autores.getString(3)});
            }
            autores.close();
            conexion.cerrarConexion();
            
            //Se pasa el arraylist a una matriz multidimensional de tipo objeto
            Object[][] datos_v = new Object[datos.size()][4];
            for (int i = 0; i < datos.size(); i++) {
                Object[] row = datos.get(i);
                datos_v[i] = row;
            }
            
            tabla.setModel(new DefaultTableModel(datos_v, columnas) {
                Class[] types = new Class [] {
                    java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class ,java.lang.Object.class
                };
                
                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Función para cargar en un JTable los temas para multiple ingreso
    public void mostrarTemas(JTable tabla)
    {
        try {
            Object[] columnas={"Seleccionar","ID","Tema"};
            //Lista de un arreglo tipo objeto para el ingreso de temas
            ArrayList<Object[]> datos= new ArrayList<Object[]>();
            Conexion conexion = new Conexion();
            conexion.setRs("select * from tema");
            ResultSet tema= conexion.getRs();
            while(tema.next()){
                //Se añaden los registros al arraylist
                datos.add(new Object[] {Boolean.FALSE,tema.getInt(1),
                tema.getString(2)});
            }
            tema.close();
            conexion.cerrarConexion();
            
            //Se pasa el arraylist a una matriz multidimensional de tipo objeto
            Object[][] datos_v = new Object[datos.size()][3];
            for (int i = 0; i < datos.size(); i++) {
                Object[] row = datos.get(i);
                datos_v[i] = row;
            }
            
            tabla.setModel(new DefaultTableModel(datos_v, columnas) {
                Class[] types = new Class [] {
                    java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
                };
                
                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     //Funcion para cargar los idiomas
    public void cargarIdioma(JComboBox idioma)
    {
        try {
            Conexion conexion = new Conexion();
            String sql = "select * from idioma";
            idioma.removeAllItems();
            conexion.setRs(sql);
            ResultSet idiomas = conexion.getRs();
            while(idiomas.next()){
                idioma.addItem(idiomas.getString(2));
            }
            idiomas.close();
            conexion.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Funcion para cargar las clasificaciones
    public void cargarClasificacion(JComboBox clasificacion)
    {
        try {
            Conexion conexion = new Conexion();
            String sql = "select * from clasificacion";
            clasificacion.removeAllItems();
            conexion.setRs(sql);
            ResultSet clasificaciones = conexion.getRs();
            while(clasificaciones.next()){
                clasificacion.addItem(clasificaciones.getString(2));
            }
            clasificaciones.close();
            conexion.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* FUNCION ingresarCatalogo
       Realiza el ingreso al catalogo y devuelve el ultimo id ingresado a la
       base de datos
    */
    public int ingresarCatalogo(int idClasificacion,int idIdioma,int idMaterial,String Titulo,
            String Edicion,String Descripcion, String Notas,String fechaAdq,
            String Resumen,String fechaPub){
        try {
            /*SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
            Date FechaAdquirido = parser.parse(fechaAdq);
            java.sql.Date sqldate = new java.sql.Date(FechaAdquirido.getTime());
            System.out.println(sqldate.toString());
            System.out.println(parser.parse(fechaAdq));
            Date FechaPublicado = parser.parse(fechaPub);*/
            String query = "INSERT INTO `catalogo`(`idClasificacion`, `idIdioma`, "
                    + "`idMaterial`, `Titulo`, `Edicion`, `Descripcion`, `Notas`, `FechaAdquirido`,"
                    + " `Resumen`, `FechaPublicacion`) VALUES (" + idClasificacion + ","
                    + idIdioma + "," + idMaterial + ",'" + Titulo + "','" + Edicion
                    + "','" + Descripcion + "','" + Notas + "','" + fechaAdq
                    + "','" + Resumen + "','" + fechaPub + "')";
            Conexion conexion = new Conexion();
            conexion.setQuery(query);
            conexion.setRs("select max(idCatalogo) from catalogo");
            ResultSet last_id = conexion.getRs();
            if(last_id.next())
            {   
                int id = last_id.getInt(1);
                conexion.cerrarConexion();
                return id;
            }
            else{
                conexion.cerrarConexion();
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        /*} catch (ParseException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }*/
    }
    
    /*
     * Funcion ingresoMultipleAutor
     * Toma el ultimo id y un arreglo de id e ingresa las relaciones en la tabla autorcatalogo
     */
    public void ingresoMultipleAutor(int idPrincipal,int[] id)
    {
        try {
            String query = "insert into catalogoautor values (?,?)";
            Conexion conexion = new Conexion();
            //conexion.getConnection().setAutoCommit(false);
            PreparedStatement pstmt = conexion.getConnection().prepareStatement(query);
            for (int i = 0; i < id.length; i++) {
                pstmt.setInt(1, id[i]);
                pstmt.setInt(2, idPrincipal);
                pstmt.addBatch();
            }
            pstmt.executeBatch();
            //conexion.getConnection().commit();//si no hay errores, commit
            pstmt.close();
            conexion.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
     * Funcion ingresoMultipleTema
     * Toma el ultimo id y un arreglo de id e ingresa las relaciones en la tabla temacatalogo
     */
    public void ingresoMultipleTema(int idPrincipal,int[] id)
    {
        try {
            String query = "insert into temacatalogo values (?,?)";
            Conexion conexion = new Conexion();
            PreparedStatement pstmt = conexion.getConnection().prepareStatement(query);
            for (int i = 0; i < id.length; i++) {
                pstmt.setInt(1, id[i]);
                pstmt.setInt(2, idPrincipal);
                pstmt.addBatch();
            }
            pstmt.executeBatch();
            pstmt.close();
            conexion.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    * Funcion ingresoLibro
    * Hace el ingreso de los datos a la tabla libro
    */
    public void ingresoLibro(int id,String ISBN,String Publisher){
        try {
            String query = "INSERT INTO `libro`(`idCatalogo`, `ISBN`, `Publisher`) VALUES ("
                    + id + ",'" + ISBN + "' , '" + Publisher+ "')";
            Conexion conexion = new Conexion();
            conexion.setQuery(query);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Libro ingresado correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}