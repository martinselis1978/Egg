package poo;

import Entidad.Operacion;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Operacion numeros=new Operacion(0, 0);
        System.out.println("Ingrese dos valores");
        numeros.crearOperacion(leer.nextInt(), leer.nextInt());
        System.out.println("La suma de los números es "+numeros.sumar()+"\n");
        System.out.println("La resta de los números es "+numeros.restar()+"\n");
        System.out.println("El resultado de la multiplicación es "+numeros.multiplicar()+"\n");
        System.out.println("El resultado de la división es "+numeros.dividir());
    }

}
