package pkg10alumnos;

import Servicios.AlumnosServicios;

public class Main {

    public static void main(String[] args) {
 
        AlumnosServicios as = new AlumnosServicios();
        
        as.notaFinal(as.crearAlumnos());
        
    }
}