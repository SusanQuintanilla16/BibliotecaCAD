/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.cad.controller;

//Clase para el manejo de ejemplares de los materiales

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sv.edu.cad.model.Conexion;

public class Ejemplar {
    
    //Método para cargar todos los items registados en el catalogo
    public void mostrarCatalogo(JTable tabla)
    {
        try
        {
            String[] columnas = {"ID","Título","Material"};
            Object [][] data = null;
            DefaultTableModel modelo = new DefaultTableModel(data, columnas);
            Conexion conexion = new Conexion();
            conexion.setRs("select catalogo.idCatalogo,catalogo.Titulo,"
                    + "material.NombreMaterial from catalogo inner join "
                    + "material on material.idMaterial=catalogo.idMaterial");
            ResultSet catalogo = conexion.getRs();
            while(catalogo.next())
            {
                Object[] row={catalogo.getInt(1),catalogo.getString(2),
                catalogo.getString(3)};
                modelo.addRow(row);
            }
            catalogo.close();
            conexion.cerrarConexion();
            tabla.setModel(modelo);
            tabla.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    //Método para cargar todos los items registados en el catalogo
    public void mostrarCatalogoEsp(JTable tabla,String titulo)
    {
        try
        {
            String[] columnas = {"ID","Título","Material"};
            Object [][] data = null;
            DefaultTableModel modelo = new DefaultTableModel(data, columnas);
            Conexion conexion = new Conexion();
            conexion.setRs("select catalogo.idCatalogo,catalogo.Titulo,"
                    + "material.NombreMaterial from catalogo inner join "
                    + "material on material.idMaterial=catalogo.idMaterial"
                    + " where catalogo.Titulo like '%"+titulo+"%'");
            ResultSet catalogo = conexion.getRs();
            while(catalogo.next())
            {
                Object[] row={catalogo.getInt(1),catalogo.getString(2),
                catalogo.getString(3)};
                modelo.addRow(row);
            }
            catalogo.close();
            conexion.cerrarConexion();
            tabla.setModel(modelo);
            tabla.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Metodo para devolder titulo y material del id seleccionado
    public Object[] devuelveItem(int id){
        try {
            Conexion conexion = new Conexion();
            String sql = "select catalogo.idCatalogo,catalogo.Titulo,"
                    + "material.NombreMaterial from catalogo inner join "
                    + "material on material.idMaterial=catalogo.idMaterial"
                    + " where catalogo.idCatalogo = "+id;
            conexion.setRs(sql);
            ResultSet Resultado = conexion.getRs();
            if(Resultado.next())
            {
                Object []datos = {Resultado.getInt(1),Resultado.getString(2),Resultado.getString(3)};
                Resultado.close();
                conexion.cerrarConexion();
                return datos;
            }
            else
            {
                Resultado.close();
                conexion.cerrarConexion();
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplar.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //Metodo para el ingreso de ejemplares
    public void ingresoEjemplares(int idCatalogo,int idTiempo,int Cantidad){
        try {
            String query = "INSERT INTO `ejemplar`(`idCatalogo`, "
                    + "`idBiblioteca`, `idTiempo`, `idEstado`) VALUES (?,1,?,1)";
            Conexion conexion = new Conexion();
            PreparedStatement pstmt = conexion.getConnection().prepareStatement(query);
            for (int i = 0; i < Cantidad; i++) {
                pstmt.setInt(1, idCatalogo);
                pstmt.setInt(2, idTiempo);
                pstmt.addBatch();
            }
            pstmt.executeBatch();
            pstmt.close();
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null,"Se ingresaron " + Cantidad + " ejemplares nuevos");
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
