package estructura_de_control;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20Յ e imprima
        el número ingresado seguido de tantos asteriscos como indique su valor. Por
        ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **    */
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3, num4;
        do{
            System.out.println("Ingresa un número");
            num1 = leer.nextInt();
        }while(num1<0 ||num1>20);
        do{
            System.out.println("Ingresa un número");
            num2 = leer.nextInt();
        }while(num2<0 ||num2>20);
        do{
            System.out.println("Ingresa un número");
            num3 = leer.nextInt();
        }while(num3<0 ||num3>20);
        do{
            System.out.println("Ingresa un número");
            num4 = leer.nextInt();
        }while(num4<0 ||num4>20);
        System.out.println("");
        System.out.print(num1 + " ");
        for(int i=0;i<num1;i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num2 + " ");
        for(int i=0;i<num2;i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num3 + " ");
        for(int i=0;i<num3;i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num4 + " ");
        for(int i=0;i<num4;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
