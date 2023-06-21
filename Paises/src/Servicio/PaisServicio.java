package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServicio {
    HashSet<String>paises = new HashSet<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    String continuar;
    
//Se requiSe requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
    public void guardarPais(){
        do {
            System.out.println("Ingrese un pais");
            continuar = scan.next();
            paises.add(continuar);
            System.out.println("Desea ingresar otro pais");
            continuar = scan.next();
        } while (continuar.equalsIgnoreCase("si")||continuar.equalsIgnoreCase("s"));

        for (String aux : paises) {
            System.out.println(aux);
        }
    }
    
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
    public void ordenarPais(){
        System.out.println("\n---- Paises ordenados alfabeticamente -----\n");
        ArrayList<Integer>paisesOrdenados = new ArrayList(paises);
        Collections.sort(paisesOrdenados);
        System.out.println(paisesOrdenados);
    }
 
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
    public void borrarPais(){
        System.out.println("Ingrese el Pais que desea borrar");
        continuar = scan.next();
        Iterator iterator = paises.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(continuar)) {
                iterator.remove();
                System.out.println("El pais se borró exitosamente");
            }
            
        }
    }
}