package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena cadena = new Cadena();
//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
//que tiene la frase ingresada.
    public void mostrarVocales(String frase){
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i+1).equals("a") || frase.substring(i, i+1).equals("e") || frase.substring(i, i+1).equals("i") || frase.substring(i, i+1).equals("o") || frase.substring(i, i+1).equals("u")) {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " vocales en esta frase.");
    }
    
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
//asac".
    public void invertirFrase(String frase){
        String invertida = "";
        for (int i = frase.length(); i > 0; i--) {
            invertida = invertida + frase.substring(i-1, i);
        }
        System.out.println(invertida);
    }
    
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado
//por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter
//'a' se repite 4 veces.
    public void vecesRepetido(String frase){
        System.out.println("Ingrese una vocal para saber cuantas veces se repite");
        String car = leer.next();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i+1).equals(car)) {
                cont++;
            }
        }
        System.out.println("La cantidad de veces que se repite la vocal " + car + " es " + cont + " veces.");
    }
    
//e) Método compararLongitud(String frase), deberá comparar la longitud
//de la frase que compone la clase con otra nueva frase ingresada por
//el usuario.
    public void compararLongitud(String frase){
        System.out.println("Ingrese una nueva frase para compara su longitud");
        String frase2 = leer.next();
        if (frase.length() == frase2.length()) {
            System.out.println("Las frases tienen la misma longitud.");
        } else if (frase.length() > frase2.length()) {
            System.out.println("La primer frase es más extensa.");
        } else {
            System.out.println("La segunda frase ingresada es más extensa.");
        }
    }
    
//f) Método unirFrases(String frase), deberá unir la frase contenida en la
//clase Cadena con una nueva frase ingresada por el usuario y mostrar
//la frase resultante.
    public void unirFrases(String frase){
        System.out.println("Ingrese una nueva oración para añadir");
        String frase2 = leer.next();
        System.out.println(frase + " " + frase2);
    }

//g) Método reemplazar(String letra), deberá reemplazar todas las letras
//“a” que se encuentren en la frase, por algún otro carácter
//seleccionado por el usuario y mostrar la frase resultante.
    public void reemplazar(String frase){
        System.out.println("Ingrese un caracter que reemplazará las vocales 'a'");
        String car = leer.next();
        String nuevaFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i+1).toLowerCase().equals("a")) {
                nuevaFrase = nuevaFrase + car;
            } else {
                nuevaFrase = nuevaFrase + frase.substring(i, i+1);
            }
        }
        System.out.println(nuevaFrase);
    }
    
//h) Método contiene(String letra), deberá comprobar si la frase contiene
//una letra que ingresa el usuario y devuelve verdadero si la contiene y
//falso si no.
    public boolean contiene(String frase){
        boolean contiene = false;
        System.out.println("Ingrese una legra para comprobar si se encuentra en la frase");
        String letra = leer.next();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().substring(i, i+1).equals(letra.toLowerCase()))
                contiene = true;
        }
        return contiene;
    }
}