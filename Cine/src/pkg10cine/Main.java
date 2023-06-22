package pkg10cine;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;

public class Main {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        PeliculaServicio peliculaServicio = new PeliculaServicio();
        
        peliculaServicio.listaPelicula(pelicula);
        System.out.println("\n---------- Peliculas agregadas a la lista ----------\n");
        peliculaServicio.mostrarPelicula();
        System.out.println("\n---------- Peliculas con duración mayor a una hora ----------\n");
        peliculaServicio.mayorUnaHora();
        System.out.println("\n---------- Peliculas ordenadas por Duración ----------\n");
        peliculaServicio.ordenarDuracion();
        System.out.println("\n---------- Peliculas ordenadas por Título ----------\n");
        peliculaServicio.ordenarTitulo();
        System.out.println("\n---------- Peliculas ordenadas por Director ----------\n");
        peliculaServicio.ordenarDirector();
    }
    
}
