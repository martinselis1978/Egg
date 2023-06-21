package POO2;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        CuentaBancariaServicio cuentaBancariaServicio = new CuentaBancariaServicio();
        Scanner leer = new Scanner(System.in);
        System.out.println("Crear una cuenta bancaria\n");
        CuentaBancaria cuentaBancaria = cuentaBancariaServicio.crearCuenta();
        int op;
        do{
            do{
                System.out.println("\nMENÚ\n");
                System.out.println("1. Ingresar dinero a la cuenta");
                System.out.println("2. Retirar dinero de la cuenta");
                System.out.println("3. Extracción rápida");
                System.out.println("4. Consulta de saldo");
                System.out.println("5. Salir");
                System.out.print("\nIngrese una opción:");
                op = leer.nextInt();
                if (op > 5){
                    System.out.println("La opción ingresada es incorrecta.");
                    System.out.println("Por favor, vuelva a intentarlo");
                }
            }while(op > 5);
            switch(op){
                case 1:            
                    cuentaBancariaServicio.ingresarDinero();
                    break;
                case 2:
                    cuentaBancariaServicio.retirarDinero();
                    break;
                case 3:
                    cuentaBancariaServicio.extraccionRapida();
                    break;
                case 4:
                    cuentaBancariaServicio.consultarSaldo();
                    break;
                default:
                    System.out.println("Muchas gracias por usar nuestro servicio bancario");
            }
        }while(op != 5);
    }
}