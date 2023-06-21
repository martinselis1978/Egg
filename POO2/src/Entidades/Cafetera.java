package Entidades;

public class Cafetera {
//Programa Nespresso. Desarrolle una clase Cafetera en el paquete
//Entidades con los atributos capacidadMáxima (la cantidad máxima de
//café que puede contener la cafetera) y cantidadActual (la cantidad
//actual de café que hay en la cafetera). Agregar constructor vacío y con
//parámetros así como setters y getters.
    private final int capacidadMaxima = 1000;
    private int cantidadActual;
    
    public Cafetera(){}
    
    public Cafetera(int cantidadActual){
        this.cantidadActual=cantidadActual;
    }
    
    public void setCantidadActual(int cantidadActual){
        this.cantidadActual=cantidadActual;
    }
    
    public int getCantidadActual(){
        return cantidadActual;
    }
    
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
}