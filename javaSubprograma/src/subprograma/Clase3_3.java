package subprograma;

import java.util.Scanner;

public class Clase3_3 {

    public static void main(String[] args) {
        /*
        Crea una aplicación que a través de una función nos convierta una
        cantidad de euros introducida por teclado a otra moneda, estas pueden
        ser a dólares, yenes o libras. La función tendrá como parámetros, la
        cantidad de euros y la moneda a convertir que será una cadena, este no
        devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        i. * 0.86 libras es un 1 €
        ii. * 1.28611 $ es un 1 €
        iii. * 129.852 yenes es un 1 €
        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros"); int euros = leer.nextInt();
        System.out.println("Ingrese la moneda a convertir, dolar, yen o libra"); String moneda = leer.next();
        System.out.println(convertir(euros,moneda));
    }
    
    public static double convertir(int euros, String moneda){
        double conversion;
        if (moneda.equals("dolar")) {
            conversion = euros * 0.86;
        } else if (moneda.equals("yen")) {
            conversion = euros * 129.852;
        } else {conversion = euros * 1.28611;}
        return conversion;
    }
}
