package Entidad;

public class Circuferencia {
    private double radio;
    
    public Circuferencia(double radio){
        this.radio=radio;
    }
    
    public double getCircunferencia(){
        return radio;
    }
    
    public void setCircunferencia(double radio){
        this.radio=radio;
    }
    public void crearCircunferencia(double radio){
        double atributo = radio;
    }
    
    public double getArea(){
        double area = (3.14 * radio)*23*23;
        return area;
    }
    
    public double getPerimetro(){
        double perimetro=2*3.14*radio;
        return perimetro;
    }
    
}
        /*
        c) Método para crearCircunferencia(): que le pide el radio y lo guarda
        en el atributo del objeto.
        d) Método area(): para calcular el área de la circunferencia ՄArea=〖
        π*radio〗^2Յ.
        e) Método perimetro(): para calcular el perímetro
        ՄPerimetro=2*π*radio).
        */