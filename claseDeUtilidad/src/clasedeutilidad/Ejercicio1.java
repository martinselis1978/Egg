package clasedeutilidad;

import Entidad.Cadena;
import Servicio.CadenaServicios;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena cadena = new Cadena();
        CadenaServicios cadenaServicios = new CadenaServicios();
        
        System.out.println("Ingrese una frase");
        String f = leer.next();
        cadena.setFrase(f);
        cadenaServicios.mostrarVocales(cadena.getFrase());
        System.out.print("\u001B[32m"+"La frase invertida se lee de esta manera: ");
        cadenaServicios.invertirFrase(f);
        cadenaServicios.vecesRepetido(f);
        cadenaServicios.compararLongitud(f);
        cadenaServicios.unirFrases(f);
        cadenaServicios.reemplazar(f);
        System.out.println(cadenaServicios.contiene(f));
    }
    
}