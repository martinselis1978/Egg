package clasedeutilidad;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        Persona persona = personaService.crearPersona();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\n" + persona.getNombre() + " tiene " + personaService.calcularEdad() + " años de edad.\n");
        System.out.println("Ingrese una edad");
        int edad = leer.nextInt();
        System.out.println(personaService.menorQue(persona, edad));
        System.out.println("");
        personaService.mostrarPersona();

    }
    
}

//Implemente la clase Persona en el paquete entidades. Una persona tiene
//un nombre y una fecha de nacimiento ՄTipo Date), constructor vacío,
//constructor parametrizado, get y set. Crear una clase PersonaService,
//en el paquete servicio, con los siguientes métodos:
//a) Método crearPersona que pida al usuario Nombre y fecha de
//nacimiento de la persona a crear. Retornar el objeto Persona creado.
//b) Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual.
//c) Método menorQue recibe como parámetro una Persona y una edad.
//Retorna true si la persona es menor que la edad consultada o false
//en caso contrario.
//d) Método mostrarPersona que muestra la información de la persona
//deseada.