package estructura_de_control;

import java.util.Scanner;

public class extra11 {

    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número entero y devuelva el número de
        dígitos que componen ese número. Por ejemplo, si introducimos el
        número 12345, el programa deberá devolver 5. Calcular la cantidad de
        dígitos matemáticamente utilizando el operador de división. Nota:
        recordar que las variables de tipo entero truncan los números o
        resultados.
        */
        
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num=read.nextInt();
        int cont=0,res=num;
        while(res>0){
            res=res/10;
            cont++;
        }
        System.out.println("La cantidad de dígitos del número "+num+" son "+cont);
    }
    
}
