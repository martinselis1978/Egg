package Servicios;

import Entidades.Raices;

public class RaicesServicio {
    Raices raices = new Raices(0, 0, 0);
    
    public void crearVariables(double a, double b, double c) {
        this.raices.a=a;
        this.raices.b=b;
        this.raices.c=c;
    }
            
//a) Método getDiscriminante(): devuelve el valor del discriminante
//(double). El discriminante tiene la siguiente fórmula: (b^2)՞4*a*c
    public double getDiscriminante(){ 
        return Math.pow(raices.b,2)-4*raices.a*raices.c;
    }
    
//b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
//soluciones, para que esto ocurra, el discriminante debe ser mayor o
//igual que 0.
    public boolean tieneRaices(){
        return Math.sqrt(getDiscriminante()) >= 0;
    }
    
//c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
//única solución, para que esto ocurra, el discriminante debe ser igual
//que 0.
    public boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    
//d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
//imprime las 2 posibles soluciones.
    public void obtenerRaices(){
        int res;
        if (tieneRaices()) {
            System.out.println("Solución 1: " + (raices.b + Math.sqrt( Math.pow(raices.b,2)-(4*raices.a*raices.c)) / (2*raices.a)));
            System.out.println("Solución 2: " + (raices.b - Math.sqrt( Math.pow(raices.b,2)-(4*raices.a*raices.c)) / (2*raices.a)));
        }
    }
    
//e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime
//una única raíz. Es en el caso en que se tenga una única solución
//posible.
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            System.out.println(raices.b + Math.sqrt( Math.pow(raices.b,2)-(4*raices.a*raices.c)) / (2*raices.a));
        }
    }
    
//f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
//y mostrará por pantalla las posibles soluciones que tiene nuestra
//ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
//que devuelvan nuestros métodos y en caso de no existir solución, se
//mostrará un mensaje.
    public void calcular(){
        if (tieneRaices()|| tieneRaiz()) {
            obtenerRaices();
            obtenerRaiz();
        } else {
            System.out.println("No existe solución" );
        }
    }
}
