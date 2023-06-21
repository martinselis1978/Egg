package poo;

import Entidad.Rectangulo;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        //La clase incluirá un método para crear el rectángulo con los datos del
        //Rectángulo dados por el usuario.
        Scanner leer=new Scanner(System.in);
        Rectangulo valor=new Rectangulo(0, 0);
        System.out.print("Ingrese la base del rectángulo ");
        valor.setBase(leer.nextInt());
        System.out.print("\nIngrese la altura del rectángulo ");
        valor.setAltura(leer.nextInt());
        System.out.println("");
        valor.superficie();
        System.out.println("\n");
        valor.perimetro();
        System.out.println("\n");
        valor.dibRec(valor.getBase(),valor.getAltura());
    }
    
}

//Crear una clase Rectángulo que modele rectángulos por medio de un
//atributo privado base y un atributo privado altura. La clase incluirá un
//método para crear el rectángulo con los datos del Rectángulo dados por
//el usuario. También incluirá un método para calcular la superficie del
//rectángulo y un método para calcular el perímetro del rectángulo. Por
//último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Se deberán además definir los
//métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
