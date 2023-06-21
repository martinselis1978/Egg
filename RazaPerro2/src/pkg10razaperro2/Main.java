package pkg10razaperro2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> razaPerro = new ArrayList();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String pregunta;
    
        do {
            System.out.println("Ingresa la raza de un perro");
            razaPerro.add(scan.next());
            System.out.println("Desea ingresar otra raza de perro SI/NO");
            pregunta = scan.next();
        } while (pregunta.equalsIgnoreCase("si"));
        System.out.println("");
        System.out.println("La lista del raza de perros es:");
        for (String aux : razaPerro) {
            System.out.print(aux + " ");
        }
        System.out.println("\n");
        
        System.out.println("Ingrese una raza de perro a eliminar");
        String borrar = scan.next();
        Iterator it = razaPerro.iterator();
        
        while (it.hasNext()) {
            if (it.next().equals(borrar))
            it.remove();            
        }
        
        System.out.println("La lista del raza de perros es:");
        for (String aux : razaPerro) {
            System.out.print(aux + " ");
        }
        System.out.println("");
        
        Collections.sort(razaPerro);
                
        for (String aux : razaPerro) {
            System.out.print(aux + " ");
        }
        System.out.println("");
    }
    
}

//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.