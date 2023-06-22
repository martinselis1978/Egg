package Servicio;

import Entidad.Baraja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BarajaServicio {
    Baraja baraja;

//Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un método toString() que retorne el número de carta y el palo. La baraja estará
//compuesta por un conjunto de cartas, 40 exactamente.
    public Baraja crearBaraja(int numero, String palo) {
        return new Baraja(numero, palo);
    }

//• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(ArrayList<Baraja> barajas) {
        Random random = new Random();
        Collections.shuffle(barajas, random);
    }

//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public ArrayList siguienteCarta(ArrayList<Baraja> barajas, ArrayList<Baraja> cartaDada){
        if (barajas.size()==0) {
            System.out.println("No quedan más cartas en el maso.");
        } else {
            cartaDada.add(barajas.get(0));
            barajas.remove(0);
        }
        return cartaDada; 
    }
    
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles(ArrayList<Baraja> barajas){
        return barajas.size();
    }
    
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    public ArrayList darCartas(ArrayList<Baraja> barajas, ArrayList<Baraja> cartaDada){
        if (barajas.size()==0) {
            System.out.println("No quedan más cartas en el maso.");
        } else {
            cartaDada.add(barajas.get(0));
            barajas.remove(0);
        }
        return cartaDada;
    }
    
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton(ArrayList<Baraja> cartaDada){
        System.out.println("\n----- Las cartas que salieron -----");
        for (Baraja aux : cartaDada) {
            System.out.println(aux);
        }
        if (cartaDada.size()==0) System.out.println("Aún no hay cartas en el montón.\n");
    }
    
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(ArrayList<Baraja> barajas){
        for (Baraja aux : barajas) {
            System.out.println(aux);
        }
    }
}