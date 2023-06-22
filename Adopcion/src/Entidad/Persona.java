package Entidad;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private ArrayList<Perro> perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDocumento() {
        return documento;
    }

    public ArrayList<Perro> getPerro() {
        return perro;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setPerro(ArrayList<Perro> perro) {
        this.perro = perro;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }
    
}

//clase Persona con atributos: nombre, apellido, edad, documento y Perro.