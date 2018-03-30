
package sv.edu.cad.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JTable;


/*
 * CLASE OPERACIONES
 * Diseñada para contener métodos que sirven para las verificaciones y/o procesos
 * de los datos de entrada
 */

public class Procesos {
   
    //Función para verificar la autenticidad de la fecha
    public static boolean VerificaDate(String Fecha)
    {
        String regexp = "\\d{1,2}-\\d{1,2}-\\d{4}";
        String [] FechaC = Fecha.split("-");
        boolean bandera = true;
        bandera = Pattern.matches(regexp, Fecha);
        
        if(!bandera) return false;
        else{
            int Day = Integer.parseInt(FechaC[0]);
            int Month = Integer.parseInt(FechaC[1]);
            int Year = Integer.parseInt(FechaC[2]);

            try{
                Calendar calendar = Calendar.getInstance();
                calendar.setLenient(false);//solo permite que las fechas esten en el rango correspondiente
                calendar.set(Calendar.YEAR, Year);//Campo,Valor
                calendar.set(Calendar.MONTH, Month - 1); // [0,...,11]
                calendar.set(Calendar.DAY_OF_MONTH, Day);
                Date date = calendar.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date FechaActual = new Date();
                if(!(date.compareTo(FechaActual) < 0)) 
                    bandera = false;
                return bandera;
        }
        catch(Exception e)
        {
            /*si ocurre un error en la conversion, indica error en los rangos de fechas
             por lo tanto es una fecha no valida*/
            bandera= false;
            return bandera;
        }
        }
    }
    
    //funcion para cambiar el orden del formato del date
    public static String cambiarOrden(String fecha){
        String [] FechaC = fecha.split("-");
        String FechaFinal;
        FechaFinal = FechaC[2]+"-"+FechaC[1]+"-"+FechaC[0];
        return FechaFinal;
    }
    
    //funcion que verifica si existe un elemento en la tabla chekeado
    public static boolean VerificaChecks(JTable tabla)
    {
        boolean bandera = false;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            bandera=(boolean)tabla.getValueAt(i, 0);
            if(bandera)
                return bandera;//si devuelve true hay uno seleccionado
        }
        return bandera;//si devuelve false no hay ninguno seleccionado
    }
    
    //función que obtiene el id de las tablas para inserciones multiples
    public static int[] getID(JTable tabla)
    {
        ArrayList<Integer> id_tabla = new ArrayList<Integer>();
        boolean bandera = false;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            bandera=(boolean)tabla.getValueAt(i, 0);
            if(bandera)
                id_tabla.add((int) tabla.getValueAt(i, 1));//si el valor esta seleccionado se agrega al arraylist
        }
        int[] id_seleccionados = new int[id_tabla.size()];
        for (int i = 0; i < id_tabla.size(); i++) {
            id_seleccionados[i]=id_tabla.get(i);//se pasa de arraylist a int[]
        }
        return id_seleccionados;
    }
}
