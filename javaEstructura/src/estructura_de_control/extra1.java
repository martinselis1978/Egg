package estructura_de_control;

import java.util.Scanner;

public class extra1 {

    public static void main(String[] args) {
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
        ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
        equivalente: 1 día, 2 horas
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tiempo en minutos");
        int minuto,hora=0,dia=0;
        minuto = leer.nextInt();
        while(minuto>60){
            minuto=minuto-60;
            hora++;
            while(hora>24){
                hora=hora-24;
                dia++;                        
            }
        }
        System.out.printf("El valor agregado equivale a %d día %d hora y %d minutos",dia,hora,minuto);
        System.out.println("");
    }
    
}
