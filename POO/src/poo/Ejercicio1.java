package poo;

import Entidad.Libro;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*
        Crear un
        método para cargar un libro pidiendo los datos al usuario y luego
        informar mediante otro método el número de ISBN, el título, el autor del
        libro y el número de páginas.
        */
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el ISBN, el titulo, el autor y la cantidad de páginas");
        Libro cargar=new Libro(leer.next(), leer.next(), leer.next(), leer.nextInt());          
        System.out.println("ISBN="+cargar.isbn+", título="+cargar.titulo+", autor="+cargar.autor+", numPag="+cargar.numPag);
        System.out.println(cargar.toString());
    }
    
}
