package Servicio;

import Entidad.Ahorcado;

public class AhorcadoService {    
   String [] vectorPalabra;
   int cont = 0;
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de
//jugadas máxima. Con la palabra del usuario, pone la longitud de la
//palabra, como la longitud del vector. Después ingresa la palabra en el
//vector, letra por letra, quedando cada letra de la palabra en un índice
//del vector. Y también, guarda la cantidad de jugadas máximas y el
//valor que ingresó el usuario.
    public Ahorcado crearJuego(String palabra){
        vectorPalabra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vectorPalabra[i] = palabra.substring(i, i + 1);
        }
        // correr todo para que desaparesca la palabra
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }

        return new Ahorcado(vectorPalabra);
    }
    
//Método longitud(): muestra la longitud de la palabra que se debe
//encontrar. Nota: buscar como se usa el vector.length.
    public int Longitud(Ahorcado aa){
        int longitud = aa.getVectorPalabra().length;
        return longitud;
    }
    
//Método buscar(letra): este método recibe una letra dada por el
//usuario y busca si la letra ingresada es parte de la palabra o no.
//También informará si la letra estaba o no.
    public void buscarLetra(String letra, Ahorcado ah){
        boolean encontrada = false;
        for (int i = 0; i < ah.getVectorPalabra().length; i++) {
            if (letra.equals(vectorPalabra[i])) {
                encontrada = true;
            }
        }
        if (encontrada) {
            System.out.println("La letra '" + letra + "' se encuentra en la palabra secreta.");
        } else {
            System.out.println("La letra '" + letra + "' NO se encuentra en la palabra secreta.");
        }
    }

//Método encontradas(letra): que reciba una letra ingresada por el
//usuario y muestre cuantas letras han sido encontradas y cuántas le
//faltan. Este método además deberá devolver true si la letra estaba y
//false si la letra no estaba, ya que, cada vez que se busque una letra
//que no esté, se le restará uno a sus oportunidades.

    public boolean encontradasLetras(String letra, Ahorcado ah){
        boolean encontrada = false;
        for (int i = 0; i < ah.getVectorPalabra().length; i++) {
            if (letra.equals(vectorPalabra[i])) {
                encontrada = true;
                cont++;                
                ah.setLetrasEncontradas(cont);
            }
        }    
        System.out.println("Llevas " + ah.getLetrasEncontradas() + " letras encontradas.");
        System.out.println("Te faltan hallar " + (ah.getVectorPalabra().length - ah.getLetrasEncontradas()) + " letras");
        return encontrada;
    }
    
//Método intentos(): para mostrar cuántas oportunidades le queda al
//jugador.
    public void intentos(boolean intentar, Ahorcado ah){
        if (!intentar) {
            ah.setIntentosMaximos(ah.getIntentosMaximos() - 1);
        }
        System.out.println("Al jugador le quedan " + ah.getIntentosMaximos() + " intentos.");
    }
    
}

//Método juego(): el método juego se encargará de llamar todos los
//métodos previamente mencionados e informará cuando el usuario
//descubra toda la palabra o se quede sin intentos. Este método se
//llamará en el main.