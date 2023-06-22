package pkg11adopcion;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.PerroServicio;
import Servicio.PersonaServicio;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona>personas = new ArrayList<>();
        ArrayList<Perro>perros = new ArrayList<>();
        PerroServicio perroServicio = new PerroServicio();
        PersonaServicio personaServicio = new PersonaServicio();

        personaServicio.crearPersona(personas);
        perroServicio.crearPerro(perros);

 
        perroServicio.bucle(personas, perros);    
        
        
        for (Persona aux : personas) {
            System.out.println(aux);
        }
      
    }
    
}

//Realizar un programa para que una Persona pueda adoptar un Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.

//Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.