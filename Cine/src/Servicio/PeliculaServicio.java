package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula>peliculas = new ArrayList<>();
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
    public Pelicula crearPelicula(){
        System.out.println("Ingrese el título de la película");
        String titulo = scan.next();
        System.out.println("Ingrese el nombre del Director de la película");
        String director = scan.next();
        System.out.println("Ingrese la duración de la película en horas");
        int duracion = scan.nextInt();
        return new Pelicula(titulo, director, duracion);
    }
    
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
    public void listaPelicula(Pelicula pelicula){
        String continuar;
        do{
            peliculas.add(crearPelicula());
            System.out.println("Desea Ingresar otra pelicula");
            continuar = scan.next();
        } while (continuar.equalsIgnoreCase("si")||continuar.equalsIgnoreCase("s"));
    }
    
//Después de ese bucle realizaremos las siguientes acciones:22
//• Mostrar en pantalla todas las películas.    
    public void mostrarPelicula(){
        for (Pelicula mostrar : peliculas) {
            System.out.println(mostrar);
        }
    }
    
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mayorUnaHora(){
        for (Pelicula mostrar : peliculas) {
            if (mostrar.getDuracion()>1) {
                System.out.println(mostrar.getTitulo() + " tiene una duración de " + mostrar.getDuracion());
            }
        }
    }
    
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    public void ordenarDuracion(){
        Collections.sort(peliculas, (Pelicula p1, Pelicula p2)
                -> p1.getDuracion().compareTo(p2.getDuracion()));    
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    

//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//pantalla.
    public void ordenarTitulo(){
        Collections.sort(peliculas, (Pelicula p1, Pelicula p2)
                -> p1.getTitulo().compareTo(p2.getTitulo()));    
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenarDirector(){
        Collections.sort(peliculas, (Pelicula p1, Pelicula p2)
                -> p1.getDirector().compareTo(p2.getDirector()));    
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    
}