package estructura_de_control;

import java.util.Scanner;

public class extra6 {

    public static void main(String[] args) {
        /*
        Leer la altura de N personas y determinar el promedio de estaturas que
        se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
        general
        */
        
        Scanner read=new Scanner(System.in);
        String op="s";
        double alt,suma=0,sumaBaja=0,cont=0,contB=0;
        while(op.equals("s")){
            System.out.println("Ingresar la altura de la persona");
            alt=read.nextDouble();
            suma=suma+alt;
            cont++;
            if(alt<1.60){
                contB++;
                sumaBaja=sumaBaja+alt;}
            System.out.println("Desea ingresar la altura de otra persona S/N");
            op=read.next();
        }
        System.out.println("El promedio de estatura de las personas que estan por debajo del 1.60m es "+(sumaBaja/contB));
        System.out.println("El promedio general es de "+(suma/cont));
    }
    
}
