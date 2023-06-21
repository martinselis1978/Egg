package Servicio;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

public class CursoService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Curso curso = new Curso();
    int cantidad;
//d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
//los alumnos que asisten a las clases. Nosotros nos encargaremos de
//almacenar esta información en un arreglo e iterar con un bucle,
//solicitando en cada repetición que se ingrese el nombre de cada
//alumno.
    public String[] cargarAlumnos(){
        String [] alumnos = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese un alumno");
            alumnos[i] = scan.next();
        }
        return alumnos;
    }
    
//e) Método crearCurso(): el método crear curso, le pide los valores de
//los atributos al usuario y después se le asignan a sus respectivos
//atributos para llenar el objeto Curso. En este método invocamos al
//método cargarAlumnos() para asignarle valor al atributo alumnos
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del Curso");
        String nombreCurso = scan.next();
        System.out.println("Ingrese la cantidad de horas por día");
        double cantidadHorasPorDia = scan.nextDouble();
        System.out.println("Ingrese la cantidad de horas semanales");
        int CantidadDiasPorSemana = scan.nextInt();
        String turno;
        do {
            System.out.println("Ingrese el turno de la cursada (M / T)");
            turno = scan.next();
        } while (!turno.toUpperCase().equals("T") && !turno.toUpperCase().equals("M"));
        System.out.println("Ingrese el precio por hora");
        double precioPorHora = scan.nextDouble();
        System.out.println("Ingrese la cantidad de alumnos");
        cantidad = scan.nextInt();
        return new Curso(nombreCurso, cantidadHorasPorDia, CantidadDiasPorSemana,
        turno, precioPorHora,cargarAlumnos());
    }
    
//f) Método calcularGananciaSemanal(): este método se encarga de
//calcular la ganancia en una semana por curso. Para ello, se deben
//multiplicar la cantidad de horas por día, el precio por hora, la
//cantidad de alumnos y la cantidad de días a la semana que se repite
//el encuentro.
    public double calcularGananciaSemanal(double cantidadHorasPorDia, double precioPorHora, int cantidadDiasPorSemana){
        return (cantidadHorasPorDia * precioPorHora * cantidad * cantidadDiasPorSemana);
    }
}