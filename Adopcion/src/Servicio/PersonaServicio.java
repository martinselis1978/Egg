package Servicio;

import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicio {
     Scanner scan = new Scanner(System.in).useDelimiter("\n");
     
    public void crearPersona(ArrayList<Persona>personas){ 
        String continuar;
        do {
            personas.add(ingresarPersona());
            System.out.println("Desea ingresar a otra persona.");
            continuar = scan.next();
        } while (continuar.equalsIgnoreCase("si")||continuar.equalsIgnoreCase("s"));
    }
    
    public Persona ingresarPersona(){
        System.out.println("Ingrese el nombre de la persona");
        String nombre = scan.next();
        System.out.println("Ingrese el apellido de la persona");
        String apellido = scan.next();
        System.out.println("Ingrese la edad de la persona");
        int edad = scan.nextInt();
        System.out.println("Ingrese el DNI de la persona");
        String dni = scan.next();
        return new Persona(nombre, apellido, edad, dni);
    }
}