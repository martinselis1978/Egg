package estructura_de_control;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

public class extra10 {

    public static void main(String[] args) {
        /*
        Realice un programa para que el usuario adivine el resultado de una
        multiplicación entre dos números generados aleatoriamente entre 0 y 10.
        El programa debe indicar al usuario si su respuesta es o no correcta. En
        caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
        su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.
        */
        
        Scanner read=new Scanner(System.in);
        int min=1,max=10,num1,num2,res;
        Random rand=new Random();
        num1=rand.nextInt(max-min)+min;
        num2=rand.nextInt(max-min)+min;
        do{
            System.out.println("Cual es el resultado de "+num1+" x "+num2+" = ?");
            res=read.nextInt();
                if(res==(num1*num2)){
                    System.out.println("El resultado es el CORRECTO");
                    break;
                }else{
                    System.out.println("El resultado es INCORRECTO");
                    System.out.println("Vuelva a intentarlo");
                }
        }while(res!=(num1*num2));
    }
    
}
