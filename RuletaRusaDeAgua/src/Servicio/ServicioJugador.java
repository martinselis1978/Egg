package Servicio;

import Entidad.Jugador;
import java.util.Scanner;

public class ServicioJugador {
//disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    public boolean disparo(Jugador jugador, ServicioRevolver servicioRevolver, ServicioJuego servicioJuego){
        Scanner scan = new Scanner(System.in);
        boolean mojado = false;
        System.out.println("El jugador se apunta.\n"
                + "Presiones ENTER para presionar el gatillo y DISPARAR");
        String seguir = scan.nextLine();
        if(servicioRevolver.mojar()) {
            System.out.println("El jugador quedo todo MOJADO\n");
            mojado = true;
        } else {
            servicioRevolver.siguienteChorro();
            System.out.println("El jugador SAFO\n");
        }
        return mojado;
    }
}