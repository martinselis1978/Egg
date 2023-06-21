package Entidad;

public class Estudiante {
//Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
//van a ser nombre y nota (representando la nota obtenida en el final).
    private String nombre;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

//1. Calcular y mostrar el promedio de notas de todo el curso
    double promedio = 0, cont = 0;
    public double promedioNotas(double nota){
        promedio = promedio + nota;
        cont++;
        return promedio / cont;
    }
    
//2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
//nota mayor al promedio del curso
    public boolean nombreMejoresPromedios(double nota, double promedio){
        boolean mayor = false;
        if (promedio > nota) {
            mayor = true;
        }
        return mayor;
    }
        
//3. Por último, deberemos mostrar todos los estudiantes con una nota
//mayor al promedio.
    
    
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
