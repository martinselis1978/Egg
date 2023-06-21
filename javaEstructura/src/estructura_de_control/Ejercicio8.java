package estructura_de_control;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
        y 10 la nota se pedirá de nuevo hasta que la nota sea correcta*/
        System.out.println("Ingrese una calificación");
        Scanner leer = new Scanner(System.in);
        int nota = 11;
        while (nota > 10 || nota < 0){
            nota = leer.nextInt();}
    }
    
}
