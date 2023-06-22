package pkg11barajasespañolas;

import Entidad.Baraja;
import Servicio.BarajaServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Baraja>barajas = new ArrayList<>();
        ArrayList<Baraja>cartaDada = new ArrayList<>();
        BarajaServicio bs = new BarajaServicio();
        Scanner scan = new Scanner(System.in);
        
        crearBaraja(barajas);
        bs.barajar(barajas);

        System.out.println("¿Cuantas cartas desea repartir?");
        int cantidad = scan.nextInt();
        do {
        bs.darCartas(barajas, cartaDada);
        cantidad--;
        } while (cantidad!=0);
        System.out.println("Quedan " + bs.cartasDisponibles(barajas) + " cartas disponibles en la baraja.");
        bs.cartasMonton(cartaDada);
        System.out.println("Sacar una carta del mazo");
        bs.siguienteCarta(barajas, cartaDada);
        bs.mostrarBaraja(barajas);
    }
    
    
    public static void crearBaraja(ArrayList<Baraja>barajas){
        BarajaServicio bs = new BarajaServicio();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if (j!=8 && j!=9) {
                    switch (i){
                        case 0:
                            barajas.add(bs.crearBaraja(j, "ORO"));
                            break;
                        case 1:
                            barajas.add(bs.crearBaraja(j, "ESPADA"));
                            break;
                        case 2:
                            barajas.add(bs.crearBaraja(j, "BASTO"));
                            break;
                        case 3:
                            barajas.add(bs.crearBaraja(j, "COPA"));
                            break;
                    }    
                }       
            }
        }
    }
}