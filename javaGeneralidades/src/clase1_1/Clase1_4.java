
package clase1_1;

import java.util.Scanner;

public class Clase1_4 {

    public static void main(String[] args) {
        /*
        Dada una cantidad de grados centígrados se debe mostrar su
        equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
        + Մ9 * C / 5Յ.
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en °C");
        int grados;
        grados = leer.nextInt();
        System.out.println("La temperatura de " + grados + "°C, es equivalente a " + (32 + (9 * grados / 5)) + "°F" );
    }
    
}
