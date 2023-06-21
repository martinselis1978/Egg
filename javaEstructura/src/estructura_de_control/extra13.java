package estructura_de_control;

import java.util.Scanner;

public class extra13 {

    public static void main(String[] args) {
        /*
        Crear un programa que dibuje una escalera de números, donde cada
        línea de números comience en uno y termine en el número de la línea.
        Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
        ingresa el número 3ր
        11
        2
        123
        */
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int esc=read.nextInt();
        System.out.println("");
        for(int i=0;i<esc;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
