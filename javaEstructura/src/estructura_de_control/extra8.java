package estructura_de_control;

import java.util.Scanner;

public class extra8 {

    public static void main(String[] args) {
        /*
        Escriba un programa que lea números enteros. Si el número es múltiplo
        de cinco debe detener la lectura y mostrar la cantidad de números
        leídos, la cantidad de números pares y la cantidad de números impares.
        Al igual que en el ejercicio anterior los números negativos no deben
        sumarse. Nota: recordar el uso de la sentencia break
        */
        
        Scanner read=new Scanner(System.in);
        int num,cont=0,impar=0,par=0,suma=0;
        do{
            System.out.println("Ingresar un valor");
            num=read.nextInt();
            cont++;
            if(num%2==0){
                par++;
            }else{
                impar++;
            }
            if(num>0){
            suma=suma+num;
            }
        }while(num%5!=0);
        System.out.println("La cantidad de números ingresados fue de "+cont);
        System.out.println("La cantidad de números pares ingresados fue de "+par);
        System.out.println("La cantidad de números impares ingresados fue de "+impar);
        System.out.println("La suma de los números positivos es de "+suma);
    }
    
}
