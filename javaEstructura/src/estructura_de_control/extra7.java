package estructura_de_control;

import java.util.Scanner;

public class extra7 {

    public static void main(String[] args) {
        /*
        Realice un programa que calcule y visualice el valor máximo, el valor
        mínimo y el promedio de n números (n>0). El valor de n se solicitará al
        principio del programa y los números serán introducidos por el usuario.
        Realice dos versiones del programa, una usando el bucle “while” y otra
        con el bucle “do - while”
        */
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de valores que desa ingresar");
        int n,valor,max,min;
        n=read.nextInt();
        int cont=n-1;
        System.out.println("Ingrese un valor");
        valor=read.nextInt();
        double prom=valor;
        min=valor;
        max=valor;
        while(cont!=0){
            if(cont!=0){
                System.out.println("Ingrese otro valor");
                valor=read.nextInt();
                prom=prom+valor;
            }
            if(valor>max){
                max=valor;
            }
            if(valor<min){
                min=valor;
            }
            cont--;
        }
        System.out.println("El valor máximo es "+max);
        System.out.println("El valor mínimo es "+min);
        System.out.println("El promedio de los números es "+prom/n);
    }
    
}
