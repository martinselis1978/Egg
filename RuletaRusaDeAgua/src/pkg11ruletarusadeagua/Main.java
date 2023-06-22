package pkg11ruletarusadeagua;

import Entidad.Jugador;
import Entidad.Revolver;
import Servicio.ServicioJuego;
import Servicio.ServicioJugador;
import Servicio.ServicioRevolver;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {        
        ServicioJuego servicioJuego = new ServicioJuego();
        ServicioJugador servicioJugador = new ServicioJugador();
        ServicioRevolver servicioRevolver = new ServicioRevolver();
        Jugador jugador = new Jugador();
        
        Revolver revolver = servicioRevolver.llenarRevolver();
        ArrayList<Jugador>jugadores = new ArrayList<>();
        
        servicioJuego.llenarJuego(jugadores, revolver);
        servicioJuego.ronda(jugador, servicioJugador, servicioRevolver, servicioJuego);

        
    }
}

//Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
//un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
//se dispara y se moja. Las clases por hacer del juego son las siguientes: