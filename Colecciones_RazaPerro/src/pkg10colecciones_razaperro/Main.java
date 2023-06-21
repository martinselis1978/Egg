package pkg10colecciones_razaperro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        ArrayList<String> razaPerro = new ArrayList();
        Scanner scan = new Scanner(System.in);
        String pregunta;
    
        do {
            System.out.println("Ingresa la raza de un perro");
            razaPerro.add(scan.next());
            System.out.println("Desea ingresar otro perro SI/NO");
            pregunta = scan.next();
        } while (pregunta.equalsIgnoreCase("si"));
        
        System.out.println("La lista del ArrayList es:");
        for (String aux : razaPerro) {
            System.out.print(aux + " ");
        }
        
        System.out.println("");
    }
    
}

//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.