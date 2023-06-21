package Entidad;

import java.util.Scanner;

public class Cuenta {
    Scanner leer=new Scanner(System.in);
    private double saldo=1000;
    private String titular="Martin";
       
    public void retirarDinero(double retiro){
        System.out.print("Ingrese la cantidad de dinero que desea retirar --> ");
        retiro=leer.nextDouble();
        if(saldo<retiro){
            System.out.println("El saldo es insuficiente.");
            System.out.println("Su saldo disponible es de --> $"+this.saldo);
        }else{
            System.out.println("Usted a retirado $"+retiro+" dispone de un saldo de $"+(this.saldo-retiro));
        }
    }
    
}

//Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
//Luego, crea un método "retirar_dinero" que permita retirar una cantidad
//de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
//negativo después de realizar una transacción de retiro.