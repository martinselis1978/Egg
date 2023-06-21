package Entidad;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public void calcularAumento(int edad, double salario){
        this.salario=salario;
        this.edad=edad;
        if(edad>30){
            salario=salario+(salario*10/100);
        }else{
            salario=salario+(salario*5/100);
        }
        System.out.println("El salario con el incremento es de: "+salario);
    }
}

//Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
//"salario". Luego, crea un método "calcular_aumento" que calcule el
//aumento salarial de un empleado en función de su edad y salario actual.
//El aumento salarial debe ser del 10% si el empleado tiene más de 30
//años o del 5% si tiene menos de 30 años.