package Entidad;

public class Rectangle {
    public int lado1,lado2;
    
    public void rectangulo1(int lado1, int lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    public int calcularArea(){
        return lado1*lado2;
    }
}
//Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
//método "calcular_area" que calcule y devuelva el área del rectángulo.
//Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
//de 4 y 6 y imprime el área del rectángulo.