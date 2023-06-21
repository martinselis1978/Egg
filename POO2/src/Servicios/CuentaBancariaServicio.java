package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
//Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//a) Método para crear cuenta pidiéndole los datos al usuario.
    Scanner leer = new Scanner(System.in);
    CuentaBancaria cuenta = new CuentaBancaria();
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese el número de cuenta");
        int numeroCuenta = (leer.nextInt());
        System.out.println("Ingrese el DNI del cliente");
        long dniCliente = (leer.nextLong());
        System.out.println("Ingresa el saldo inicial para crear la cuenta bancaria");
        double saldoActual = (leer.nextDouble());
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
//b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
//se le sumará al saldo actual.
    public CuentaBancaria ingresarDinero(){
        
        System.out.println("Ingrese la cantidad de dinero a depositar:");
        double dinero=leer.nextDouble();
        cuenta.setSaldoActual(dinero + cuenta.getSaldoActual());
        return cuenta;
    }

//c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
//restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
//retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    public CuentaBancaria retirarDinero(){
        System.out.println("Ingrese la cantidad de dinero a retirar:");
        double dinero = leer.nextDouble();
        if (dinero>cuenta.getSaldoActual()) {
            System.out.println("El saldo es suficiente");
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual() - dinero);
        }
        return cuenta;
    }
//d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
//Validar que el usuario no saque más del 20%.
    public CuentaBancaria extraccionRapida(){
        System.out.println("Usted puede retirar solo un 20% de su saldo");
        System.out.println("Ingrese el saldo que desea retirar");
        double dinero = leer.nextDouble();
        if (dinero>(cuenta.getSaldoActual()*0.2)) {
            System.out.println("El monto ingresado supera el 20% de los fondos");
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()-dinero);
        }
        return cuenta;
    }
    
//e) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public CuentaBancaria consultarSaldo(){
        System.out.println("Su saldo es: " + cuenta.getSaldoActual());
        return cuenta;
    }
            
//f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public CuentaBancaria consultarDatos(){
        System.out.println(cuenta.toString());
        return cuenta;
    }
}