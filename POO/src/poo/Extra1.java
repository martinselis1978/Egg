package poo;

import Entidad.Cancion;
import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Cancion can=new Cancion(leer.next(), leer.next());
        System.out.println("El libro "+can.getTitulo()+" tiene como actor a "+can.getAutor());
    }
    
}
