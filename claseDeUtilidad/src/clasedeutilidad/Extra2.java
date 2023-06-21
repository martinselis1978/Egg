package clasedeutilidad;

import Entidad.Ahorcado;
import Servicio.AhorcadoService;
import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        AhorcadoService as = new AhorcadoService();
        Scanner scan = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una palabra a adivinar");
        String palabra = scan.nextLine();
        Ahorcado ah = as.crearJuego(palabra);
        do {
            System.out.println("El largo de la palabra a buscar es de " + as.Longitud(ah) + " letras.");
            System.out.println("Ingrese una letra");
            letra = scan.next();
            as.buscarLetra(letra, ah);
            as.intentos(as.encontradasLetras(letra, ah), ah);
        } while (ah.getIntentosMaximos() != 0 && ah.getVectorPalabra().length != ah.getLetrasEncontradas());
    }

}



//Un ejemplo de salida puede ser así:
//Ingrese una letra:
//a L
//Longitud de la palabra: 6
//Mensaje: La letra pertenece a la palabra
//Número de letras (encontradas, faltantes): Մ3,4Յ
//Número de oportunidades restantes: 4
//----------------------------------------------
//Ingrese una letra:
//z L
//ongitud de la palabra: 6
//Mensaje: La letra no pertenece a la palabra
//Número de letras (encontradas, faltantes): Մ3,4Յ
//Número de oportunidades restantes: 3
//3---------------------------------------------
//Ingrese una letra:
//b L
//ongitud de la palabra: 6
//Mensaje: La letra no pertenece a la palabra
//Número de letras (encontradas, faltantes): Մ4,3Յ
//Número de oportunidades restantes: 2
//----------------------------------------------
//Ingrese una letra:
//u L
//ongitud de la palabra: 6
//Mensaje: La letra no pertenece a la palabra
//Número de letras (encontradas, faltantes): Մ4,3Յ
//Número de oportunidades restantes: 1
//----------------------------------------------
//Ingrese una letra:
//q L
//ongitud de la palabra: 6
//Mensaje: La letra no pertenece a la palabra
//Mensaje: Lo sentimos, no hay más oportunidades