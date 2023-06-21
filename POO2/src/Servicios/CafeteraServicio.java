package Servicios;

import Entidades.Cafetera;
import POO2.Ejercicio2;
import java.util.Scanner;

public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    Cafetera cafetera = new Cafetera();
    
    public int mostrarCafetera(){
        int cantidad = cafetera.getCantidadActual();
        return cantidad;
    }
    
//Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
//a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
//capacidad máxima.
    public void llenarCafetera(){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("\nSu cafetera acaba de llenarse.\n");
    }
    
//b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
//método recibe el tamaño de la taza y simula la acción de servir la
//taza con la capacidad indicada. Si la cantidad actual de café “no
//alcanza” para llenar la taza, se sirve lo que quede. El método le
//informará al usuario si se llenó o no la taza, y de no haberse llenado
//en cuanto quedó la taza.
    public int servirTaza(){
        System.out.println("Ingrese la cantidad de café que desea servir");
        int servir = leer.nextInt();
        if(cafetera.getCantidadActual()<servir){
            System.out.println("La cafetera tiene " + cafetera.getCantidadActual() + " ml de café");
            System.out.println("\nNo le alcanza para llenar la taza");
            System.out.println("\nDesea servir de todos modos S/N");
            String op = leer.next();
            if (op.toLowerCase().equals("s")) {
                System.out.println("La taza se sirvio con " + cafetera.getCantidadActual() + " ml de café.");                
                cafetera.setCantidadActual(0);
            }
        }
        return cafetera.getCantidadActual();
    }
    
//c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(){
        System.out.println("\nLa cafetera acaba de ser vaciada\n");
        cafetera.setCantidadActual(0);
    }
    
//d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
//el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public int agregarCafe(){
        System.out.println("Ingrese la cantidad de café que desea agregar");
        int agregar = leer.nextInt();
        agregar = agregar + cafetera.getCantidadActual();
        if(agregar > cafetera.getCapacidadMaxima()){
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("La capacidad máxima de la cafetera es de " + cafetera.getCantidadActual() + " ml de café.");
            System.out.println("De modo que los " + (agregar - cafetera.getCantidadActual()) + " ml de café restante no se podrán cargar.");
        }else {
            System.out.println("Se agregaron " + agregar + " ml de café a la cafetera");
            cafetera.setCantidadActual(agregar);
        }
        return cafetera.getCantidadActual();
    }
}