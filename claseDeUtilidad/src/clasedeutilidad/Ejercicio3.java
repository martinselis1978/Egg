package clasedeutilidad;

import Servicio.ArregloService;

public class Ejercicio3 {

//Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
//arreglo B de 20 números reales.
//En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
//mostrar A y B.
    public static void main(String[] args) {
        ArregloService arregloService = new ArregloService();
        
        int vectorA[] = new int[50];
        int vectorB[] = new int[20];
        
        arregloService.inicializarA(vectorA);
        arregloService.mostrar(vectorA);
        System.out.println("");
        arregloService.ordenar(vectorA);
        System.out.println("");
        arregloService.inicializarB(vectorA, vectorB);
        System.out.println("");
        arregloService.mostrar(vectorA);
        System.out.println("");
        arregloService.mostrar(vectorB);        
    }    
}
