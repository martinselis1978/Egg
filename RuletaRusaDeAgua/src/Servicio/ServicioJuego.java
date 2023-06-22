package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioJuego {
    Jugador jugador = new Jugador();
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.10
    public Juego llenarJuego(ArrayList<Jugador>jugadores, Revolver revolver){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores (Max = 6)");
        int cantidadJugadores = scan.nextInt();
        int cont = 0;
        String nombre;
        do {
            cont++;
            nombre = "Jugador " + cont;
            jugadores.add(new Jugador(cont, nombre));
        } while (cont != cantidadJugadores && cont < 6);
        
        System.out.println("\nSe incorporaron exitosamente " + cont + " jugadores al jugo,\n"
                + "de la Ruleta Rusa con revolver de agua.\n");
        return new Juego(jugadores, revolver);
    }
    
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    public void ronda(Jugador jugador, ServicioJugador servicioJugador, ServicioRevolver servicioRevolver, ServicioJuego servicioJuego){
        while(servicioJugador.disparo(jugador, servicioRevolver, servicioJuego)==false){}
    }    
    
}