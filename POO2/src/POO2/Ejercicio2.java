package POO2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){           
        Cafetera cafetera = new Cafetera();
        CafeteraServicio cafe = new CafeteraServicio();
        boolean seguir = true;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("\nMENÚ\n");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Vaciar cafetera");
            System.out.println("3. Agregar café a la cafetera");
            System.out.println("4. Servir taza");
            System.out.println("5. Cantidad de cafetera");
            System.out.println("6. Salir");
            System.out.print("\nElige una opción: ");
            int op = leer.nextInt();
            switch(op){
                case 1:
                    cafe.llenarCafetera();
                    break;
                case 2:
                    cafe.vaciarCafetera();
                    break;
                case 3:
                    cafe.agregarCafe();
                    break;
                case 4:
                    cafe.servirTaza();
                    break;
                case 5:
                    System.out.println("\nLa cantidad de cafe en la cafetera es de "+cafe.mostrarCafetera()+" ml.\n");
                    break;
                case 6:
                    seguir = false;
                    break;
                default:
                    System.out.println("\nEl valor ingresado no corresponde a ninguno del menú.\n");                        
            }
        } while (seguir == true);
    }
}
