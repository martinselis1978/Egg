package subprograma;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        /*
        Escribir un programa que procese una secuencia de caracteres ingresada por
        teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
        la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
        la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
        mantienen sin cambios.
        a e i o u
        @ # $ % *
        Realice un subprograma que reciba una secuencia de caracteres y retorne la
        codificación correspondiente. Utilice la estructura “según” para la
        transformación.
        Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
        La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una palabra o frase. Finalizar con un (.) punto.");
        String frase, ultima;
        int u;
        
        do{
            frase = leer.nextLine();
            u = frase.length();
            ultima = frase.substring(u-1);
        }while(!ultima.equals("."));
        System.out.println(convertir(frase));
    }
        
    public static String convertir (String frase) {
        String nuevafrase = "";
        nuevafrase = frase.replace("a", "@"); frase = nuevafrase;
        nuevafrase = frase.replace("e", "#"); frase = nuevafrase;
        nuevafrase = frase.replace("i", "$"); frase = nuevafrase;
        nuevafrase = frase.replace("o", "%"); frase = nuevafrase;
        nuevafrase = frase.replace("u", "*");
        return nuevafrase;
    }
}