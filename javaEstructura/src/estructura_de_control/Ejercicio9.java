package estructura_de_control;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se
        debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
        programa deberá calcular y mostrar el resultado de la suma de los números
        leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
        de la sentencia break.*/
        Scanner leer = new Scanner(System.in);
        int cont = 0, num, res = 0;
        do{
            cont++;
            System.out.println("Ingresa un número");
            num = leer.nextInt();
            if(num == 0)
                break;
            if (num > 0)
                res = res + num;
        }while(cont != 20);
        System.out.printf("La suma de los número ingresados es %d", res);
        System.out.println("");
    }
    
}
