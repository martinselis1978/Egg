package Entidades;

//Dígito Verificador. Crear una clase Nif que se usará para mantener DNIs
//con su correspondiente letra ՄNIFՅ. Los atributos serán el número de DNI
//(entero largo) y la letra ՄString o char) que le corresponde. En NIFService
//se dispondrá de los siguientes métodos:
//a) Métodos getters y setters para el número de DNI y la letra.
public class Nif {
    private String unif;
    private long dni;
    
    public Nif(){}
    
    public Nif(String unif, long dni){
        this.unif = unif;
        this.dni = dni;
    }
    
    public void setUnif(String unif){
        this.unif = unif;
    }
    
    public String getUnif(){
        return unif;
    }
    
    public void setDni(long dni){
        this.dni = dni;
    }
    
    public long getDni(){
        return dni;
    }
}