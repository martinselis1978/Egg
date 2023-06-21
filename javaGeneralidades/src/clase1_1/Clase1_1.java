
package clase1_1;

import java.util.Scanner;

public class Clase1_1 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num1, num2, res;
        
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        num2 = leer.nextInt();
        
        res = num1 + num2;
        
        System.out.println("El resultado de " + num1 + " + " + num2 + " = " + res);
                
    }
    
}
