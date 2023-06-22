package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPerro(ArrayList<Perro>perros){
        String continuar;
        do {
            perros.add(ingresarPerro());
            System.out.println("Desea ingresar otro perro.");
            continuar = scan.next();
        } while (continuar.equalsIgnoreCase("si")||continuar.equalsIgnoreCase("s"));
    }
    
    public Perro ingresarPerro(){
        System.out.println("Ingrese el nombre del perro");
        String nombre = scan.next();
        System.out.println("Ingrese la raza del perro");
        String raza = scan.next();
        System.out.println("Ingrese la edad del perro");
        int edad = scan.nextInt();
        System.out.println("Ingrese el tamaño del perro");
        double tamaño = scan.nextDouble();
        return new Perro(nombre, raza, edad, tamaño);        
    }
    
    public Persona adopcionPerro(ArrayList<Persona>personas, ArrayList<Perro>perros){   
        System.out.println("\n----- Lista de PERSONAS disponibles para adoptar -----\n");
        personas.forEach((personaAux) -> System.out.println(personaAux));
        System.out.println("\nIngrese el DNI de la persona que va a adoptar un perro\n");
        String dni = scan.next();
        int cont = 0;
        for (Persona aux : personas) {
            if (dni.equals(aux.getDocumento())) {
                System.out.println("\n----- Lista de perros disponibles -----\n");
                for (Perro perrosAux : perros) {
                    if (!perrosAux.isAdoptado()) System.out.println(perrosAux);
                }
                System.out.println("\nQue perro desea apoptar.\n"
                        + "Ingrese el nombre del perro\n");
                String nombre = scan.next();
                for (Perro perrosAux : perros) {
                    if (nombre.equals(perrosAux.getNombre())) {
                        perrosAux.setAdoptado(true);
                        aux.setPerro(perros);
                    }
                }                
                break;
            } else {
                System.out.println("El sujeto no se encuentra en la lista");
            }
            cont++;
        }
        return personas.get(cont);       
    }

    public void bucle(ArrayList<Persona>personas, ArrayList<Perro>perros){
        String continuar;
        do {
            adopcionPerro(personas, perros);
            System.out.println("\nDesea seguir adoptando perros SI/NO");
            continuar = scan.next();
        } while (continuar.equalsIgnoreCase("si")||continuar.equalsIgnoreCase("s"));
        
    }    
}
