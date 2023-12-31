package Entidades;

import java.util.ArrayList;

public class Alumno {
    
    private String nombre;
    private ArrayList<Integer> notas;
    
    public Alumno(){}
    
    public Alumno(String nombre, ArrayList<Integer> notas){
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
}

//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.