package Servicio;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArregloService {
//1Յ Método inicializarA recibe un arreglo por parámetro y lo inicializa con
//números aleatorios.
    public void inicializarA(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100);
        }
    }
    
//2Յ Método mostrar recibe un arreglo por parámetro y lo muestra por
//pantalla.
    public void mostrar(int vector[]){
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            cont++;
            if ( cont == 10 ) {
                System.out.println(" " + vector[i]);
                cont = 0;
            } else {
                System.out.print(" " + vector [i]);
            }
        }
    }
    
//3Յ Método ordenar recibe un arreglo por parámetro y lo ordena de
//mayor a menor.
    public void ordenar(int vector[]){
        Arrays.sort(vector);
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            cont++;
            if ( cont == 10 ) {
                System.out.println(" " + vector[i]);
                cont = 0;
            } else {
                System.out.print(" " + vector [i]);
            }
        }
    }
    
//4Յ Método inicializarB copia los primeros 10 números del arreglo A en el
//arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public void inicializarB(int vectorA[], int vectorB[]){
        for (int i = 0; i < 10; i++) {
            vectorB[i] = vectorA[i];
        }
        for (int i = 10; i < vectorB.length; i++) {
            vectorB[i] = 5;
        }
        int cont = 0;
        for (int i = 0; i < vectorB.length; i++) {
            cont++;
            if ( cont == 10 ) {
                System.out.println(" " + vectorB[i]);
                cont = 0;
            } else {
                System.out.print(" " + vectorB[i]);
            }
        }
    }
}