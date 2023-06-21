package estructura_de_control;

import java.util.Scanner;

public class extra5 {

    public static void main(String[] args) {
        /*
        Una obra social tiene tres clases de socios:
        ○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
        descuento en todos los tipos de tratamientos.
        ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
        descuento para los mismos tratamientos que los socios del tipo A.
        ○ Los socios que menos aportan, los de tipo ‘C’, no reciben
        descuentos sobre dichos tratamientos.
        ○ Solicite una letra (carácter) que representa la clase de un socio, y
        luego un valor real que represente el costo del tratamiento (previo
        al descuento) y determine el importe en efectivo a pagar por dicho
        socio
        */
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese el valor del tratamiento");
        double costo=read.nextDouble();
        System.out.println("MENU");
        System.out.println("A. Socios Tipo A");
        System.out.println("B. Socios Tipo B");
        System.out.println("C. Socios Tipo C");
        System.out.println("");
        System.out.println("Ingrese una opción");
        String letra;
        do{
            letra=read.next();
        }while(!letra.equals("a")&&!letra.equals("b")&&!letra.equals("c"));
        switch(letra){
            case "a":
                costo=costo-(costo*.5);
                System.out.println("El monto a pagar por el socio es de "+costo);
                break;
            case "b":
                costo=costo-(costo*.35);
                System.out.println("El monto a pagar por el socio es de "+costo);                
                break;
            case "c":
                System.out.println("El monto a pagar por el socio es de "+costo);
                break;
        }    
    }
}
