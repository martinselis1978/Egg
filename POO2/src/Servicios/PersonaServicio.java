package Servicios;

import Entidades.Persona;
import java.util.Scanner;
import java.util.Vector;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    Persona persona = new Persona();
    
//a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
//función devuelve un booleano.
    public boolean esMayorDeEdad(int edad){
        boolean mayor = true;
        if (edad < 18) {
            mayor = false;
        }
        return mayor;
    }
    
//b) Metodo crearPersona(): el método crear persona, le pide los valores
//de los atributos al usuario y después se le asignan a sus respectivos
//atributos para llenar el objeto Persona. Además, comprueba que el
//sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
//deberá mostrar un mensaje
    public Persona crearPersona(){
        System.out.println("Ingresa el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        String sexo;
        do{
            System.out.println("Ingrese el sexo H - Hombre, M - Mujer, O - Otro");
            sexo = leer.next();
            if (!sexo.toLowerCase().equals("h")&&!sexo.toLowerCase().equals("m")&&!sexo.toLowerCase().equals("o")) {
                System.out.println("La opción ingresada es incorrecta, vuelva a intentarlo.");
            }
        }while(!sexo.toLowerCase().equals("h")&&!sexo.toLowerCase().equals("m")&&!sexo.toLowerCase().equals("o"));
        System.out.println("Ingrese el peso en kg");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura en mts");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
//3c) Método calcularIMCՄՅր calculara si la persona está en su peso ideal
//(peso en kg/(altura^2 en mt2ՅՅ. Si esta fórmula da por resultado un
//valor menor que 20, significa que la persona está por debajo de su
//peso ideal y la función devuelve un ՞1. Si la fórmula da por resultado
//un número entre 20 y 25 (incluidos), significa que la persona está en
//su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene
//sobrepeso, y la función devuelve un 1.
    public int calcularIMC(double peso, double altura){
        double imc = peso / (altura * altura);
        int pesoIdeal;
        if (imc < 20) {
            pesoIdeal = 1;
        } else if (imc > 25) {
            pesoIdeal = -1;
        } else {
            pesoIdeal = 0;
        }
        return pesoIdeal;
    }
    
    public void mayorMenor(boolean vector[]){
        int cont = 0;
        for (int i = 0; i < 4; i++) {
            if (vector[i]) cont++;
        }
        System.out.println("Hay " + cont * 100 / 4 + "% mayores y " + ((4 - cont)* 100) / 4 + "% menores.");
    }
    
    public void calculoImc(int vector[]){
         int bajo = 0, normal = 0, alto = 0;
        for (int i = 0; i < 4; i++) {
            if (vector[i]>0) {
                bajo ++;
            } else if (vector[i]<0) {
                alto++;
            }else {
                normal++;
            }
        }
        System.out.println("Hay " + (alto * 100 / 4) + "% con sobrepeso, " + (bajo * 100 / 4) + "% con bajo peso, y "  + (normal * 100 / 4) + "% con peso normal, " );
    }
}