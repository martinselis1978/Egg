package Entidad;

import java.util.Scanner;

public class Juego {
    Scanner leer=new Scanner(System.in);
    public int incognito,adivinador,jugador1,jugador2,intentos,puntosJ1,puntosJ2;
    boolean turno=true;
    
    public void iniciarJuego(){  
        intentos=5;
        if(turno){
            System.out.println("Jugador 1: Agregue un número incognito.");
            jugador1=leer.nextInt();
            incognito=jugador1;
        }else{
            System.out.println("Jugador 2: Agregue un número incognito.");
            jugador2=leer.nextInt();
            incognito=jugador2;
        }
        
        do {
            if(turno){
                System.out.println("\nJugador 2: Adivine el número incognito. Intento "+intentos+" de 5");
                jugador2=leer.nextInt();
                adivinador=jugador2;
            }else{
                System.out.println("\nJugador 1: Adivine el número incognito."+intentos+" de 5");
                jugador1=leer.nextInt();
                adivinador=jugador1;
            }
            intentos--;
            if(incognito==adivinador){
                System.out.println("\nFELICITACIONES el número "+incognito+" era el NÚMERO INCOGNITO");
                if(turno){
                    puntosJ2++;
                }else{
                    puntosJ1++;
                }
            }else if(incognito>adivinador){
                System.out.println("Vuelve a intentarlo con un número más alto");
            }else{
                System.out.println("Vuelve a intentarlo con un número más bajo");
            }
            if(intentos==0||incognito==adivinador){
                turno = !turno;
            }
            if(intentos==0){
                if(turno){
                    puntosJ2++;
                }else{
                    puntosJ1++;
                }
            }
        } while (jugador1!=jugador2&&intentos!=0);
            System.out.println("\nEl jugador #1 tiene: "+puntosJ1+" puntos");
            System.out.println("El jugador #2 tiene: "+puntosJ2+" puntos\n");
    }

}

//Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
//a dos jugadores jugar un juego de adivinanza de números. El primer
//jugador elige un número y el segundo jugador intenta adivinarlo. El
//segundo jugador tiene un número limitado de intentos y recibe una pista
//de "más alto" o "más bajo" después de cada intento. El juego termina
//cuando el segundo jugador adivina el número o se queda sin intentos.
//Registra el número de intentos necesarios para adivinar el número y el
//número de veces que cada jugador ha ganado.