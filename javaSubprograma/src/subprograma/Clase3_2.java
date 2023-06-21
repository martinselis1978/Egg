package subprograma;

import java.util.Scanner;

public class Clase3_2 {

    public static void main(String[] args) {
        /*
        Diseñe una función que pida el nombre y la edad de N personas e
        imprima los datos de las personas ingresadas por teclado e indique si
        son mayores o menores de edad. Después de cada persona, el programa
        debe preguntarle al usuario si quiere seguir mostrando personas y frenar
        cuando el usuario ingrese la palabra “No”.
        */
        
        Scanner leer = new Scanner(System.in);
        String nombre, con;
        int edad;
        do {
            System.out.println("Ingrese el nombre"); nombre = leer.next();
            System.out.println("Ingrese la edad"); edad = leer.nextInt();
            mayor(nombre,edad);
            System.out.println("Desea ingresar a otra persona S/N"); con = leer.next();
        } while (!con.equals("n"));
        
        
    }
    
    public static void mayor (String nombre, int edad){
        if (edad > 18){
            System.out.println(nombre + " con " + edad + " años es mayor de edad");
        } else {
            System.out.println(nombre + " con " + edad + " años es menor de edad");;}
    }
    
}
