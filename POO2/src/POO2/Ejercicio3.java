package POO2;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter(" ");
        PersonaServicio personaServicio = new PersonaServicio();
        Persona persona = new Persona();
        boolean vectorEdad[] = new boolean[4];
        int vectorImc[] = new int[4];
        
        System.out.println("Ingrese los datos de 4 sujetos\n");
        Persona p1 = personaServicio.crearPersona();
        Persona p2 = personaServicio.crearPersona();
        Persona p3 = personaServicio.crearPersona();
        Persona p4 = personaServicio.crearPersona();
        
        vectorEdad[0] = personaServicio.esMayorDeEdad(p1.getEdad());
        vectorEdad[1] = personaServicio.esMayorDeEdad(p2.getEdad());
        vectorEdad[2] = personaServicio.esMayorDeEdad(p3.getEdad());
        vectorEdad[3] = personaServicio.esMayorDeEdad(p4.getEdad());
        
        vectorImc[0] = personaServicio.calcularIMC(p1.getPeso(), p1.getAltura());
        vectorImc[1] = personaServicio.calcularIMC(p2.getPeso(), p2.getAltura());
        vectorImc[2] = personaServicio.calcularIMC(p3.getPeso(), p3.getAltura());
        vectorImc[3] = personaServicio.calcularIMC(p4.getPeso(), p4.getAltura());
        
        personaServicio.mayorMenor(vectorEdad);
        personaServicio.calculoImc(vectorImc);
        
    }     
//Crear 4 objetos de tipo Persona con distintos valores, a continuación,
//llamaremos todos los métodos para cada objeto, deberá comprobar si la
//persona está en su peso ideal, tiene sobrepeso o está por debajo de su
//peso ideal e indicar para cada objeto si la persona es mayor de edad.
}
//Por último, guardaremos los resultados de los métodos calcularIMC y
//esMayorDeEdad en distintas variables(arrays), para después calcular un
///porcentaje de esas 4 personas cuantas están por debajo de su peso,
//cuantas en su peso ideal y cuantos, por encima, y también calcularemos
///un porcentaje de cuantos son may7-75res de edad y cuantos menores. Para
//esto, podemos crear unos métodos adicionales.
