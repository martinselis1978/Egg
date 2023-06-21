package estructura_de_control;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una opción de motor de 1 a 4");
        int tipoMotor = leer.nextInt();
        
        switch(tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
            break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
            break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
}
