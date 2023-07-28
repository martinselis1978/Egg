package Entidad;

public class Asiento {
    private String asiento;
    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(String asiento, Espectador espectador) {
        this.asiento = asiento;
        this.espectador = espectador;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        String ocupado = asiento.toString();
        if (espectador == null) {
            ocupado = ocupado.concat("   | ");
        } else {
            ocupado = ocupado.concat(" X | ");
        }
        return ocupado;
    }
    
    
}

//Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
//(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
//sala con los espectadores y el precio de la entrada.
//Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
//etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
//la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
//ocupado se muestra una X, sino un espacio vacío.