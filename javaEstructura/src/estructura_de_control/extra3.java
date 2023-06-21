package estructura_de_control;

import java.util.Scanner;

public class extra3 {

    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
        trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
        la función equals() de la clase String.
        */
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra=leer.next();
        if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
            System.out.println("La letra ingresada en una vocal");
        }else{System.out.println("La letra ingresa no es una vocal");}
    }
    
}
