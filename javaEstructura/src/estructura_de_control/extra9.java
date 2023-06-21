package estructura_de_control;

import java.util.Scanner;

public class extra9 {

    public static void main(String[] args) {
        /*
        Simular la división usando solamente restas. Dados dos números enteros
        mayores que uno, realizar un algoritmo que calcule el cociente y el
        residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
        obtener un resultado menor que el divisor, este resultado es el residuo, y
        el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13ր
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
        3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas
        sucesivas
        */
        
        Scanner read=new Scanner(System.in);
        System.out.println("Ingreso dos números");
        int num1=read.nextInt();
        int num2=read.nextInt();
        int cociente=0, residuo=num1;
        do{
            residuo=residuo-num2;
            cociente++;
        }while(residuo>=num2);
        System.out.println("El residuo de la división de restas sucesivas es "+residuo);
        System.out.println("Su cociente es "+cociente);
    }
    
}
