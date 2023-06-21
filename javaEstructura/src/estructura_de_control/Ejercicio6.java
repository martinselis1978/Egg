package estructura_de_control;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        
        if (num1 < num2){
            System.out.println(num1 + " es menor que " + num2);
        }else{
            System.out.println(num2 + " es menor que " + num1);
        }
        
    }
    
}
