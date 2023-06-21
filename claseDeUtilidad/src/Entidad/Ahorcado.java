package Entidad;

public class Ahorcado {
    private String [] vectorPalabra;
    private int letrasEncontradas;
    private int intentosMaximos = 5;
    
    public Ahorcado(){}

    public Ahorcado(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getIntentosMaximos() {
        return intentosMaximos;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setIntentosMaximos(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
    }
    
    
}

//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
//deberá contener como atributos, un vector con la palabra a buscar, la
//cantidad de letras encontradas y la cantidad jugadas máximas que
//puede realizar el usuario. 