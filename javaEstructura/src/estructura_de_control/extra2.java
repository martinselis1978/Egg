package estructura_de_control;

import java.util.Scanner;

public class extra2 {

    public static void main(String[] args) {
        /*
        Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
        diferente a cada una. A continuación, realizar las instrucciones
        necesarias para que: B tome el valor de C, C tome el valor de A, A tome
        el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
        valores finales de cada variable. Utilizar sólo una variable auxiliar
        */
        Scanner leer=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Ingresar 4 valores diferentes");
        a=leer.nextInt();b=leer.nextInt();c=leer.nextInt();d=leer.nextInt();
        int aux = b;b=c;c=a;a=d;d=aux;
        System.out.println("Los valores finales cambiados son -> "+a+" "+b+" "+c+" "+d);
    }
    
}
