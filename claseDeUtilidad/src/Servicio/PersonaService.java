package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Persona persona = new Persona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//a) Método crearPersona que pida al usuario Nombre y fecha de
//nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la fecha de nacimiento");
        int day = leer.nextInt();
        int month = leer.nextInt() - 1;
        int year = leer.nextInt() - 1900;
        persona.setNombre(nombre);
        Date fechaNacimiento = new Date(year, month, day);
        persona.setFechaNacimiento(fechaNacimiento);
        Persona pp = new Persona(nombre, fechaNacimiento);
        return pp;
    }
    
//b) Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual.
    public int calcularEdad(){
        Date fechaActual = new Date();
        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fechaActual.getTime() - persona.getFechaNacimiento().getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);
        return edad;
    }

//c) Método menorQue recibe como parámetro una Persona y una edad.
//Retorna true si la persona es menor que la edad consultada o false
//en caso contrario.
    public boolean menorQue(Persona persona, int edad){
        boolean bool;
        int edadSujeto = calcularEdad();
        if (edad > edadSujeto) {
            bool = false;
        } else {
            bool = true;
        }
        return bool;
    }

    
//d) Método mostrarPersona que muestra la información de la persona
//deseada.
    public void mostrarPersona(){
        switch(persona.getFechaNacimiento().getMonth()){
            case 0:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de enero de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 1:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de febrero de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 2:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de marzo de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 3:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de abril de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 4:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de mayo de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 5:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de junio de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 6:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de julio de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 7:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de agosto de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 8:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de septiembre de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 9:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de octubre de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 10:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de noviembre de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
            case 11:
                System.out.println(persona.getNombre() + " nació el " + persona.getFechaNacimiento().getDate() + " de diciembre de " + (persona.getFechaNacimiento().getYear()+1900));
                break;
        }
    }
}

