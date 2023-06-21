package estructura_de_control;

import java.util.Scanner;

public class Clase2_6 {

    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por
        teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
        una opción y el programa deberá mostrar el resultado por pantalla y
        luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
        vez de salir del programa directamente, se debe mostrar el siguiente
        mensaje de confirmación: ¿Está seguro que desea salir del programa
        ՄS/NՅ? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
        contrario se vuelve a mostrar el menú.*/

        Scanner leer = new Scanner(System.in);
        int num1, num2, res, op;
        String salir;
        System.out.println("Ingrese dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do{
            System.out.println("MENU");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Elija una opción: ");
            op = leer.nextInt();
        
            switch(op){
                case 1:
                    res = num1 + num2;
                    System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " = " + res);
                    break;
                case 2:
                    res = num1 - num2;
                    System.out.println("El resultado de la resta de " + num1 + " - " + num2 + " = " + res);
                    break;      
                case 3:
                    res = num1 * num2;
                    System.out.println("El resultado de la multiplicación de " + num1 + " * " + num2 + " = " + res);
                    break;
                case 4:
                    res = num1 / num2;
                    System.out.println("El resultado de la división de " + num1 + " / " + num2 + " = " + res);
                    break;
                case 5:
                    System.out.println("Seguro que desea salir S/N");
                    salir = leer.next();
                    if (salir == "S"){
                    break;} else {continue;}
                default:
                    System.out.println("No ingreso ninguna opción correcta");
                    break;
            }
        } while(op > 4);
    }
    
}
