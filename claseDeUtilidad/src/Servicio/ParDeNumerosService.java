package Servicio;

import Entidad.ParDeNumeros;

public class ParDeNumerosService {
    ParDeNumeros parDeNumeros = new ParDeNumeros();
    
//a) Método mostrarValores que muestra cuáles son los dos números
//guardados.
    public void mostrarValores(){
        System.out.println("Los número al azar son el número " + "\u001B[31m" + parDeNumeros.getNum1() +
        "\u001B[30m" + " y el número " + "\u001B[31m" + parDeNumeros.getNum2() + "\u001B[30m");
    }
    
//b) Método devolverMayor para retornar cuál de los dos atributos tiene
//el mayor valor
    public double devolverMayor(){
        double mayor = parDeNumeros.getNum2();
        if (parDeNumeros.getNum1() > parDeNumeros.getNum2()) {
            mayor = parDeNumeros.getNum1();
        }
        return mayor;
    }
    
//c) Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores.
    public double calcularPotencia(){
        double menor = parDeNumeros.getNum1();
        if (Math.round(devolverMayor()) == parDeNumeros.getNum1()) {
            menor = parDeNumeros.getNum2();
        }
        return Math.pow(Math.round(devolverMayor()), Math.round(menor));
    }
    
//d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//valor absoluto del número.
    public double calcularRaiz(){
        double menor = parDeNumeros.getNum1();
        if (devolverMayor() == parDeNumeros.getNum1()) {
            menor = parDeNumeros.getNum2();
        }
        return Math.sqrt(Math.abs(menor));
    }
}