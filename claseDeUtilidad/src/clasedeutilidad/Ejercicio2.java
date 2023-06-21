package clasedeutilidad;

import Servicio.ParDeNumerosService;

public class Ejercicio2 {

    public static void main(String[] args) {
        ParDeNumerosService parDeNumerosService = new ParDeNumerosService();
        
        parDeNumerosService.mostrarValores();
        System.out.println("\nEl mayor de los números elevado a la potencia por el menor es " +  "\u001B[31m" + parDeNumerosService.calcularPotencia() + "\u001B[30m");
        System.out.println("\nLa raíz cuadrada del menor número es " +  "\u001B[31m" + parDeNumerosService.calcularRaiz() + "\u001B[30m\n");
    }    
}

