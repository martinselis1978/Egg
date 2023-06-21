package POO2;

import Entidades.Raices;
import Servicios.RaicesServicio;
import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        Raices raices = new Raices();
        RaicesServicio raicesServicio = new RaicesServicio();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 3 valores");
        raicesServicio.crearVariables(leer.nextDouble(), leer.nextDouble(), leer.nextDouble());
        
        System.out.println(raicesServicio.getDiscriminante());
        if (raicesServicio.tieneRaices()) {
            System.out.println("Tiene más de una solución.");
        } else {
            System.out.println("Solo tiene una solución");
        }
        if (raicesServicio.tieneRaiz()) {
            System.out.println("Tiene una única raíz.");
        } else {
            System.out.println("No tiene una única raíz");
        }
        
        raicesServicio.calcular();

    }
    
}