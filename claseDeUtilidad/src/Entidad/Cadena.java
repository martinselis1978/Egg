package Entidad;

public class Cadena {
    private String frase;
    private int longitud;
    
    public Cadena(){}
    
    public Cadena(String frase) {
        this.frase = frase;
        //settear la longitud automaticamente
    }
    public void setFrase(String frase){
        this.frase = frase;
    }
    
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
    
    public String getFrase(){
        return frase;
    }
    
    public int longitud(){
        return longitud;
    }
}
//Realizar una clase llamada Cadena, en el paquete de entidades, que
//tenga como atributos una frase ՄString) y su longitud. Agregar
//constructor vacío y con atributo frase solamente. Agregar getters y
//setters. El constructor con frase como atributo debe setear la longitud
//de la frase de manera automática. Crear una clase CadenaServicio en el
//paquete servicios que implemente los siguientes métodos: