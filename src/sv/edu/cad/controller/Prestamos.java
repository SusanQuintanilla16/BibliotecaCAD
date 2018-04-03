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
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
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
    float cuota;
    int idPrestamo;
    ArrayList <String> fechaPrestamos;
    ArrayList <Float> montoPrestamos;
    ArrayList <Integer> idPrestamos;
    
    public Prestamos() {
        this.Mora = (float) 0.0;
        this.maxPrestamos = 0;
        this.totalPrestamos = 0;
        this.estado = null;
        this.idUsuario = 0;
        this.idEjemplar = 0;
        this.idTiempo = 0;
        this.cuota = (float) 0.0;
        this.idPrestamo=0;
    }
    
    //Método para mostrar la información del usuario para realizar el ingreso del préstamo
    public String[] mostrarUsuario(String Carnet){
        try {
            String Datos[]= new String[7];
            String query ="SELECT usuario.idUsuario,usuario.Carnet,categoriausuario.NombreCategoria"
                    + ",usuario.Nombre,usuario.Apellido,categoriausuario.MaxPrestamos from usuario "
                    + "inner join categoriausuario on categoriausuario.idCategoria=usuario.idCategoria "
                    + "where usuario.Carnet='"+Carnet+"'";
            Conexion conexion = new Conexion();
            conexion.setRs(query);
            ResultSet Contenido = conexion.getRs();
            if(Contenido.next()){
                //Reasignación de valores
                this.idUsuario=Contenido.getInt(1);
                //this.Mora=Contenido.getFloat(7);
                this.maxPrestamos=Contenido.getInt(6);
                
                //Para los labels
                Datos[0] = Contenido.getString(1);
                Datos[1] = Contenido.getString(2);
                Datos[2] = Contenido.getString(3);
                Datos[3] = Contenido.getString(4);
                Datos[4] = Contenido.getString(5);
                Datos[5] = Contenido.getString(6);
                //Datos[6] = Contenido.getString(7);
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
            String Datos[]= new String[8];
            String query ="select ejemplar.idEjemplar,biblioteca.Nombre,"
                    + "estado.Estado,catalogo.idCatalogo,catalogo.Titulo,"
                    + "material.NombreMaterial,tiempoprestamo.Tiempo,"
                    + "ejemplar.idTiempo,cuotamora.cuotamora from "
                    + "ejemplar inner join catalogo on ejemplar.idCatalogo="
                    + "catalogo.idCatalogo inner join biblioteca on biblioteca."
                    + "idBiblioteca=ejemplar.idBiblioteca inner join estado "
                    + "on estado.idEstado=ejemplar.idEstado inner join material"
                    + " on catalogo.idMaterial=material.idMaterial inner join "
                    + "tiempoprestamo on tiempoprestamo.idTiempo=ejemplar."
                    + "idTiempo inner join cuotamora on cuotamora.idcuota= "
                    + "catalogo.idcuota where ejemplar.idEjemplar="+idEjemplar+"";
            Conexion conexion = new Conexion();
            conexion.setRs(query);
            ResultSet Contenido = conexion.getRs();
            if(Contenido.next()){
                //Para los atributos
                this.idEjemplar=Contenido.getInt(1);
                this.estado=Contenido.getString(3);
                this.idTiempo=Contenido.getInt(8);
                this.cuota=Contenido.getFloat(9);
                
                //Para los labels
                Datos[0] = Contenido.getString(1);
                Datos[1] = Contenido.getString(2);
                Datos[2] = Contenido.getString(3);
                Datos[3] = Contenido.getString(4);
                Datos[4] = Contenido.getString(5);
                Datos[5] = Contenido.getString(6);
                Datos[6] = Contenido.getString(7);
                Datos[7] = Contenido.getString(9);
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
    
    //Función para mostrar datos del préstamo
    public String[] mostrarItemPrestamo(){
        try {
            String [] resultados = new String[4]; 
            String query = "SELECT usuario.Carnet,prestamo.FechaPrestamo,"
                    + "prestamo.FechaDevolucion,prestamo.MontoDia,prestamo.idPrestamo from usuario "
                    + "inner join prestamo on prestamo.idUsuario=usuario.idUsuario"
                    + " inner join ejemplar on ejemplar.idEjemplar=prestamo.idEjemplar"
                    + " WHERE prestamo.idEjemplar="+this.idEjemplar;
            Conexion conexion = new Conexion();
            conexion.setRs(query);
            ResultSet resultado = conexion.getRs();
            if(resultado.next()){
                resultados[0]=resultado.getString(1);
                resultados[1]=resultado.getString(2);
                resultados[2]=resultado.getString(3);
                resultados[3]=resultado.getString(4);
                this.idPrestamo=resultado.getInt(5);
                resultado.close();
                conexion.cerrarConexion();
                return resultados;
            }
            else{
                resultado.close();
                conexion.cerrarConexion();
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }      
    }
    
    //Método para mostrar el total de prestamos por usuario
    public int mostrarTotalPrestamos(){
        try {
            String query="select count(prestamo.idUsuario) from prestamo "
                    + "where prestamo.idUsuario="+ this.idUsuario+ " and prestamo."
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
            fechaPrestamos = new ArrayList<String>();
            montoPrestamos = new ArrayList<Float>();
            idPrestamos = new ArrayList <Integer>();
            String[] columnas = {"ID","Título","Fecha Préstamo","Fecha Devolución"};
            Object [][] data = null;
            DefaultTableModel modelo = new DefaultTableModel(data, columnas);
            Conexion conexion = new Conexion();
            conexion.setRs("select prestamo.idEjemplar,catalogo.Titulo,"
                    + "prestamo.FechaPrestamo,prestamo.FechaDevolucion,prestamo.montodia"
                    + ",prestamo.idPrestamo from "
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
                fechaPrestamos.add(catalogo.getString(4));
                montoPrestamos.add(catalogo.getFloat(5));
                idPrestamos.add(catalogo.getInt(6));
            }
            catalogo.close();
            conexion.cerrarConexion();
            tabla.setModel(modelo);
            tabla.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método para calcular las moras 
    // Como el arraylist anterior solo toma los prestamos que aun no han sido regresados
    // comparará la fecha de devolución con la actual y si ya paso la fecha lo tomará como 
    // prestamo vencido y actualizará la mora
    public void calcularMora(){
        ArrayList<Object[]> prestamosVencidos = new ArrayList<Object[]>();
        LocalDate fechaActual = LocalDate.now();
        float mora = 0;
        for (int i = 0; i < fechaPrestamos.size(); i++) {
            String [] arregloFecha = fechaPrestamos.get(i).split("-");
            LocalDate fechaDevolucion = LocalDate.of(Integer.parseInt(arregloFecha[0]),
                    Integer.parseInt(arregloFecha[1]),
                    Integer.parseInt(arregloFecha[2]));
            int dias = (int) ChronoUnit.DAYS.between(fechaDevolucion, fechaActual);
            if(dias>0){
                mora += dias*montoPrestamos.get(i);
                prestamosVencidos.add(new Object[] {idPrestamos.get(i),dias,dias*montoPrestamos.get(i)});
            }
        }
        
        if(mora > 0)
        {
            try {
                String query = "update usuario set usuario.mora = "+mora+" where "
                        + "usuario.idUsuario = "+this.idUsuario;
                Conexion conexion = new Conexion();
                conexion.setQuery(query);
                //Se pasa el arraylist a una matriz multidimensional de tipo objeto
                Object[][] arrayVencimiento = new Object[prestamosVencidos.size()][3];
                for (int i = 0; i <prestamosVencidos.size(); i++) {
                    Object[] row = prestamosVencidos.get(i);
                    arrayVencimiento[i] = row;
                }
                
                String queryMultiple;
                for (int i = 0; i < arrayVencimiento.length; i++) {
                    //for (int j = 0; j < 10; j++) {
                    Conexion conexion2= new Conexion();
                    query= "select mora.idprestamo from mora where mora.idprestamo = "
                            + arrayVencimiento[i][0];
                    conexion2.setRs(query);
                    ResultSet resultado = conexion2.getRs();
                    if(resultado.next()){
                        queryMultiple="update mora set estadomora='PENDIENTE',"
                                + "montomora="+arrayVencimiento[i][2]+",diasbajomora="
                                + arrayVencimiento[i][1] + " where idprestamo = "
                                + arrayVencimiento[i][0];
                    }
                    else{
                        queryMultiple="insert into mora(idprestamo,estadomora,montomora,"
                                + "diasbajomora) values("+arrayVencimiento[i][0]
                                +",'PENDIENTE',"+arrayVencimiento[i][2]+","
                                +arrayVencimiento[i][1]+")";
                    }
                    Conexion conexion3 = new Conexion();
                    conexion3.setQuery(queryMultiple);
                    conexion3.cerrarConexion();
                    resultado.close();
                    conexion2.cerrarConexion();
                }
                conexion.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Método para obtener la mora
    public float getMora ()
    {
        try {
            String query = "select usuario.mora from usuario where usuario.idUsuario = "+this.idUsuario;
            Conexion conexion = new Conexion();
            conexion.setRs(query);
            ResultSet mora = conexion.getRs();
            if(mora.next()){
                this.Mora= mora.getFloat(1);
                mora.close();
                conexion.cerrarConexion();
                return this.Mora;
            }else{
                mora.close();
                conexion.cerrarConexion();
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
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
                        +"','PRESTADO',"+dias+","+this.cuota+",'"+fechaDevolucion.toString()+"')";
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
    
    //Método de préstamo para docentes y administradores
    //Al tener mayor rango de privilegios los préstamos duran 15 días
        public boolean ingresoPrestamoDocenteAdmin(){
        boolean bandera = verificaEstado();
        if(!bandera){
            return bandera;
        }
        else{
            try {
                int dias = 15;
                LocalDate fechaPrestamo = LocalDate.now();
                LocalDate fechaDevolucion = fechaPrestamo.plusDays(dias);//sumo días para la devolución
                String query = "INSERT INTO `prestamo`(`idUsuario`, "
                        + "`idEjemplar`, `FechaPrestamo`, `EstadoPrestamo`, `DuracionDias`"
                        + ", `MontoDia`, `FechaDevolucion`) VALUES ("
                        + this.idUsuario+","+this.idEjemplar+",'"+fechaPrestamo.toString()
                        +"','PRESTADO',"+dias+","+this.cuota+",'"+fechaDevolucion.toString()+"')";
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
        
    //Método para cargar los préstamos
    public void cargarPrestamos(JTable tabla){
            try
            {
                String[] columnas = {"ID","Título","Material","Carnet","Fecha Préstamo",
                    "Fecha Devolución","Estado"};
                Object [][] data = null;
                DefaultTableModel modelo = new DefaultTableModel(data, columnas);
                Conexion conexion = new Conexion();
                conexion.setRs("select prestamo.idPrestamo,catalogo.Titulo,"
                        + "material.NombreMaterial,usuario.Carnet,prestamo.FechaPrestamo"
                        + ",prestamo.FechaDevolucion,prestamo.EstadoPrestamo from prestamo"
                        + " inner join ejemplar on ejemplar.idEjemplar=prestamo.idEjemplar "
                        + "inner join catalogo on ejemplar.idCatalogo=catalogo.idCatalogo "
                        + "inner join usuario on usuario.idUsuario=prestamo.idUsuario inner "
                        + "join material on material.idMaterial= catalogo.idMaterial");
                ResultSet prestamo = conexion.getRs();
                while(prestamo.next())
                {
                    Object[] row={prestamo.getInt(1),prestamo.getString(2),
                    prestamo.getString(3),prestamo.getString(4),prestamo.getString(5),
                    prestamo.getString(6),prestamo.getString(7)};
                    modelo.addRow(row);
                }
                prestamo.close();
                conexion.cerrarConexion();
                tabla.setModel(modelo);
                tabla.setEnabled(false);
            } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    //Método para cargar los préstamos
    public void cargarPrestamosCarnet(JTable tabla,String carnet){
        try
        {
                String[] columnas = {"ID","Título","Material","Carnet","Fecha Préstamo",
                    "Fecha Devolución","Estado"};
                Object [][] data = null;
                DefaultTableModel modelo = new DefaultTableModel(data, columnas);
                Conexion conexion = new Conexion();
                conexion.setRs("select prestamo.idPrestamo,catalogo.Titulo,"
                        + "material.NombreMaterial,usuario.Carnet,prestamo.FechaPrestamo"
                        + ",prestamo.FechaDevolucion,prestamo.EstadoPrestamo from prestamo"
                        + " inner join ejemplar on ejemplar.idEjemplar=prestamo.idEjemplar "
                        + "inner join catalogo on ejemplar.idCatalogo=catalogo.idCatalogo "
                        + "inner join usuario on usuario.idUsuario=prestamo.idUsuario inner "
                        + "join material on material.idMaterial= catalogo.idMaterial where "
                        + "usuario.Carnet like '"+carnet+"%'");
                ResultSet prestamo = conexion.getRs();
                while(prestamo.next())
                {
                    Object[] row={prestamo.getInt(1),prestamo.getString(2),
                    prestamo.getString(3),prestamo.getString(4),prestamo.getString(5),
                    prestamo.getString(6),prestamo.getString(7)};
                    modelo.addRow(row);
                }
                prestamo.close();
                conexion.cerrarConexion();
                tabla.setModel(modelo);
                tabla.setEnabled(false);
            } catch (SQLException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    //Función para realizar la devolución
    public boolean ingresoDevolucion(String Descripcion){
        try {
            String query = "INSERT INTO `devolucion`(`idPrestamo`, `Observaciones`) VALUES ("
                    + this.idPrestamo+",'"+Descripcion+"')";
            Conexion conexion = new Conexion();
            conexion.setQuery(query);
            query = "update prestamo set estadoprestamo = 'DEVUELTO' where "
                    + "prestamo.idPrestamo = "+this.idPrestamo;
            conexion.setQuery(query);
            query = "update ejemplar set idEstado = 1 where ejemplar.idEjemplar "
                    + "= "+this.idEjemplar;
            conexion.setQuery(query);
            conexion.cerrarConexion();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}