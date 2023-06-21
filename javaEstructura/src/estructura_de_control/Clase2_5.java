package estructura_de_control;

import java.util.Scanner;

public class Clase2_5 {

    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a
        continuación solicite números al usuario hasta que la suma de los
        números introducidos supere el límite inicial*/
        
        Scanner leer = new Scanner(System.in);
        int limite, suma, num;
        suma = 0;
        do{
            System.out.println("Ingrese un valor límite positivo");
            limite = leer.nextInt();
        }while(limite <= 0);
        
        do{
            System.out.println("Ingrese un valor");
            num = leer.nextInt();
            suma = suma + num;
        }while(suma <= limite);
    }
    
}
