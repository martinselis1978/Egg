//Vamos a realizar una clase llamada Raices, donde representaremos los
//valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
//como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
//para construir el objeto a través de un método constructor. Luego, en

package Entidades;

public class Raices {
    public double a, b, c;
    
    public Raices(){}
    
    public Raices(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
}
