package poo;

import Entidad.Circuferencia;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el radio de un círculo");
        Circuferencia crear=new Circuferencia(leer.nextDouble());
        System.out.println("El radio del circulo es "+crear.getCircunferencia()+", el perimetro del circulo es "+crear.getPerimetro()+", y su área es "+", "+crear.getArea());
    }
    
}
