package estructura_de_control;

import java.util.Scanner;

public class Clase2_7 {

    public static void main(String[] args) {
        /*Realizar un programa que simule el funcionamiento de un dispositivo
        RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
        cadenas deben llegar con un formato fijo: tienen que ser de un máximo
        de 5 caracteres de largo, el primer carácter tiene que ser X y el último
        tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas,
        la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
        FDEՅ, y toda secuencia distinta de FDE, que no respete el formato se
        considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de
        lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
        deberá investigar cómo se utilizan las siguientes funciones de Java
        Substring(), Length(), equals().*/
        
        Scanner leer = new Scanner(System.in);
        String cadena;
        int correcto = 0, incorrecto = 0;
        System.out.println("Sistema RS232 cadenas con X y O");
        System.out.println("La secuencia &&&&& mostratá el final de los envios");
        do{
            System.out.println("Ingresar una cadena");
            cadena = leer.next();
            if (cadena.length() == 5 && cadena.substring(0, 1).equals("x") && cadena.substring(4, 5).equals("o")) {
                correcto++;}
            else{
                incorrecto++;
            }
        } while(!cadena.equals("&&&&&"));
        System.out.println("La cantidad de cadenas correctas fueron " + correcto);
        System.out.println("La cantidad de cadenas incorrectas fueron " + incorrecto);
    }
    
}
