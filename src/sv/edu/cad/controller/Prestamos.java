/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.cad.controller;

//Clase utilizada para el manejo de préstamos

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sv.edu.cad.model.Conexion;

public class Prestamos {
    
    //Método para mostrar la información del usuario para realizar el ingreso del préstamo
    public String[] mostrarUsuario(String Carnet){
        try {
            String Datos[]= new String[7];
            String query ="SELECT usuario.idUsuario,usuario.Carnet,categoriausuario.NombreCategoria"
                    + ",usuario.Nombre,usuario.Apellido,categoriausuario.MaxPrestamos,usuario.Mora from usuario "
                    + "inner join categoriausuario on categoriausuario.idCategoria=usuario.idCategoria "
                    + "where usuario.Carnet='"+Carnet+"'";
            Conexion conexion = new Conexion();
            conexion.setRs(query);
            ResultSet Contenido = conexion.getRs();
            if(Contenido.next()){
                Datos[0] = Contenido.getString(1);
                Datos[1] = Contenido.getString(2);
                Datos[2] = Contenido.getString(3);
                Datos[3] = Contenido.getString(4);
                Datos[4] = Contenido.getString(5);
                Datos[5] = Contenido.getString(6);
                Datos[6] = Contenido.getString(7);
                Contenido.close();
                conexion.cerrarConexion();
                return Datos;
            }
            else return null;
        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //Método para mostrar la informacion del ejemplar seleccionado
    public String[] mostrarEjemplar(int idEjemplar){
        try {
            String Datos[]= new String[7];
            String query ="select ejemplar.idEjemplar,biblioteca.Nombre,"
                    + "estado.Estado,catalogo.idCatalogo,catalogo.Titulo,"
                    + "material.NombreMaterial,tiempoprestamo.Tiempo from "
                    + "ejemplar inner join catalogo on ejemplar.idCatalogo="
                    + "catalogo.idCatalogo inner join biblioteca on biblioteca."
                    + "idBiblioteca=ejemplar.idBiblioteca inner join estado "
                    + "on estado.idEstado=ejemplar.idEstado inner join material"
                    + " on catalogo.idMaterial=material.idMaterial inner join "
                    + "tiempoprestamo on tiempoprestamo.idTiempo=ejemplar."
                    + "idTiempo where ejemplar.idEjemplar="+idEjemplar+"";
            Conexion conexion = new Conexion();
            conexion.setRs(query);
            ResultSet Contenido = conexion.getRs();
            if(Contenido.next()){
                Datos[0] = Contenido.getString(1);
                Datos[1] = Contenido.getString(2);
                Datos[2] = Contenido.getString(3);
                Datos[3] = Contenido.getString(4);
                Datos[4] = Contenido.getString(5);
                Datos[5] = Contenido.getString(6);
                Datos[6] = Contenido.getString(7);
                Contenido.close();
                conexion.cerrarConexion();
                return Datos;
            }
            else return null;
        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
