package estructura_de_control;

import java.util.Scanner;

public class Clase2_2 {

    public static void main(String[] args) {
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el
        programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
        Incorrecto. Nota: investigar la función equals() en Java.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        if(frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }   
}
