package Entidad;
//        Crear una clase llamada Libro que contenga los siguientes atributos:
//        ISBN, Título, Autor, Número de páginas, y un constructor con todos los
//        atributos pasados por parámetro y un constructor vacío. 
public class Libro {
    public String isbn;
    public String titulo;
    public String autor;
    public int numPag;
    
    public Libro(){
    }

    public Libro(String isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }
    
}
