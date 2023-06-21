package Entidad;

import java.util.Scanner;

public class Puntos {
    public int x1,x2,y1,y2;
    
    public void crearPuntos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto(X e Y)");
        x1=leer.nextInt();y1=leer.nextInt();
        System.out.println("Ingrese las coordenadas del segundo punto(X e Y)");
        x2=leer.nextInt();y2=leer.nextInt();
    }
    
    public double discancia(){
        return Math.cbrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}

//Definir una clase llamada Puntos que contendrá las coordenadas de dos
//puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
//Generar un objeto puntos usando un método crearPuntos() que le pide al
//usuario los dos números y los ingresa en los atributos del objeto.
//Después, a través de otro método calcular y devolver la distancia que
//existe entre los dos puntos que existen en la clase Puntos. Para conocer
//como calcular la distancia entre dos puntos consulte el siguiente link:
//http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html