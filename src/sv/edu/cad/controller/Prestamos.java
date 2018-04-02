/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.cad.controller;

//Clase utilizada para el manejo de préstamos

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sv.edu.cad.model.Conexion;

public class Prestamos {
    
    //Atributos de la clase Prestamos;
    float Mora;
    int maxPrestamos;
    int totalPrestamos;
    String estado;
    int idUsuario;
    int idEjemplar;
    int idTiempo;
    
    public Prestamos() {
        this.Mora = (float) 0.0;
        this.maxPrestamos = 0;
        this.totalPrestamos = 0;
        this.estado = null;
        this.idUsuario = 0;
        this.idEjemplar = 0;
        this.idTiempo = 0;
    }
    
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
                //Reasignación de valores
                this.idUsuario=Contenido.getInt(1);
                this.Mora=Contenido.getFloat(7);
                this.maxPrestamos=Contenido.getInt(6);
                
                //Para los labels
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
                    + "material.NombreMaterial,tiempoprestamo.Tiempo,"
                    + "ejemplar.idTiempo from "
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
                //Para los atributos
                this.idEjemplar=Contenido.getInt(1);
                this.estado=Contenido.getString(3);
                this.idTiempo=Contenido.getInt(8);
                
                //Para los labels
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
    
    //Método para mostrar el total de prestamos por usuario
    public int mostrarTotalPrestamos(int idUsuario){
        try {
            String query="select count(prestamo.idUsuario) from prestamo "
                    + "where prestamo.idUsuario="+ idUsuario+ " and prestamo."
                    + "EstadoPrestamo=\"PRESTADO\"";
            Conexion conexion = new Conexion();
            conexion.setRs(query);
            ResultSet total = conexion.getRs();
            if(total.next()){
                int prestamos = total.getInt(1);
                this.totalPrestamos=prestamos;
                total.close();
                conexion.cerrarConexion();
                return prestamos;
            }
            else
            {
                total.close();
                conexion.cerrarConexion();
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }      
    }
    
    //Método para ver los préstamos en la tabla
    public void muestraPrestamos(JTable tabla){
        try
        {
            String[] columnas = {"ID","Título","Fecha Préstamo","Fecha Devolución"};
            Object [][] data = null;
            DefaultTableModel modelo = new DefaultTableModel(data, columnas);
            Conexion conexion = new Conexion();
            conexion.setRs("select prestamo.idEjemplar,catalogo.Titulo,"
                    + "prestamo.FechaPrestamo,prestamo.FechaDevolucion from "
                    + "prestamo inner join ejemplar on ejemplar.idEjemplar="
                    + "prestamo.idEjemplar inner join catalogo on "
                    + "catalogo.idCatalogo=ejemplar.idCatalogo where prestamo.idUsuario "
                    + "= "+this.idUsuario+" and prestamo.EstadoPrestamo=\"PRESTADO\"");
            ResultSet catalogo = conexion.getRs();
            while(catalogo.next())
            {
                Object[] row={catalogo.getInt(1),catalogo.getString(2),
                catalogo.getString(3),catalogo.getString(4)};
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
    
    //Método para realizar las verificaciones
    private boolean verificaEstado()
    {
        if(this.Mora > 0){
            JOptionPane.showMessageDialog(null, "Usuario tiene mora pendiente");
            return false;
        }
        else if(this.totalPrestamos >= this.maxPrestamos){
            JOptionPane.showMessageDialog(null, "No puede realizar más de "+this.maxPrestamos+" préstamos" );
            return false;
        }
        else if(!this.estado.equals("DISPONIBLE")){
            JOptionPane.showMessageDialog(null, "Este ejemplar no esta disponible para su préstamo");
            return false;
        }
        else if(this.idTiempo==1){
            JOptionPane.showMessageDialog(null, "Este ejemplar es de USO INTERNO");
            return false;
        }
        else{
            return true;
        }
    }
    
    //Método que determina el tiempo de préstamo
    private int devuelveTiempo(){
        int dias = 0;
        if(this.idTiempo==2)
            dias=1;
        else if(this.idTiempo==3)
            dias=3;
        else if(this.idTiempo==4)
            dias=15;
        return dias;
    }
    
    //Método para el ingreso  de Prestamos
    public boolean ingresoPrestamoEstudiante(){
        boolean bandera = verificaEstado();
        if(!bandera){
            return bandera;
        }
        else{
            try {
                int dias = devuelveTiempo();
                LocalDate fechaPrestamo = LocalDate.now();
                LocalDate fechaDevolucion = fechaPrestamo.plusDays(dias);//sumo días para la devolución
                String query = "INSERT INTO `prestamo`(`idUsuario`, "
                        + "`idEjemplar`, `FechaPrestamo`, `EstadoPrestamo`, `DuracionDias`"
                        + ", `MontoDia`, `FechaDevolucion`) VALUES ("
                        + this.idUsuario+","+this.idEjemplar+",'"+fechaPrestamo.toString()
                        +"','PRESTADO',"+dias+",0.25,'"+fechaDevolucion.toString()+"')";
                Conexion conexion = new Conexion();
                conexion.setQuery(query);
                query  = "UPDATE ejemplar set ejemplar.idEstado = 2 where ejemplar.idEjemplar="
                        +this.idEjemplar;
                conexion.setQuery(query);
                conexion.cerrarConexion();
                
                return bandera;
            } catch (SQLException ex) {
                Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
    }
}
