package subprograma;

import java.util.Scanner;

public class Clase3_1 {

    public static void main(String[] args) {
        /*
        Crea una aplicación que le pida dos números al usuario y este pueda
        elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
        una función para cada operación matemática y deben devolver sus
        resultados para imprimirlos en el main
        */
        Scanner leer = new Scanner(System.in);
        int num1, num2, menu;
        System.out.println("Ingresa dos valores");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        do{
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Ingrese una opción del menu");
            menu = leer.nextInt();
            switch(menu){
                case 1:
                    System.out.println("El resultado de la suma es " + suma(num1,num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es " + resta(num1,num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es " + multiplicacion(num1,num2));
                    break;
                case 4:
                    System.out.println("El resultado de la división es " + division(num1,num2));
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta");
            }
        }while(menu>4);
    }
    
    public static int suma (int num1, int num2){
        int res = num1 + num2;
        return res;
    }
    
    public static int resta (int num1, int num2) {
        int res = num1 - num2;
        return res;
    }
    
    public static int multiplicacion (int num1, int num2) {
        int res = num1 * num2;
        return res;
    }
    
    public static double division (double num1, double num2) {
        double res = num1 / num2;
        return res;
    }
}
