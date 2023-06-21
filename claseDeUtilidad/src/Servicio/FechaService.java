package Servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    Scanner leer = new Scanner(System.in);
//a) Método fechaNacimiento que pregunte al usuario día, mes y año de
//su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
//new Date(anio, mes, dia);
    public Date FechaNacimiento(){
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Día: ");
        int day = leer.nextInt();
        System.out.print("Mes: ");
        int month = leer.nextInt()-1;
        System.out.print("Año: ");
        int year = leer.nextInt()-1900;
        return new Date(year, month, day);
    }
    
//b) Método fechaActual que cree un objeto fecha con el día actual. Para
//esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
//fechaActual = new Date();
    public Date fechaActual(){
        return new Date();
    }
        
//c) Método diferencia que reciba las dos fechas por parámetro y retorna
//la diferencia de años entre una y otra (edad del usuario).
//Si necesiten acá tienen más información en clase Date: Documentacion
//Oracle
//    public int difFechas(){
//        int dif = (fechaActual().getYear()) - FechaNacimiento().getYear();
//        return dif;
//    }
   
    public int diferencia(Date fechaNacimiento, Date fechaActual) {
        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);

        return edad;
    }  
}