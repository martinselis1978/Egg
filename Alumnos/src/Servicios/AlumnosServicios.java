package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosServicios {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Integer> notas;
    
    public ArrayList<Integer> ingresarNotas(){
        notas = new ArrayList();
        System.out.println("Ingrese la nota del primer trimestre");
        notas.add(scan.nextInt());
        System.out.println("Ingrese la nota del segundo trimestre");
        notas.add(scan.nextInt());
        System.out.println("Ingrese la nota del tercer trimestre");
        notas.add(scan.nextInt());
        return notas;
    }
   
     public ArrayList<Alumno> crearAlumnos(){
        ArrayList<Alumno> alumno = new ArrayList();
        String res;
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = scan.next();
            Alumno alumnos = new Alumno(nombre, ingresarNotas());
            alumno.add(alumnos);
            System.out.println("Desea ingrear otro alumno SI/NO");
            res = scan.next();
        } while (res.equalsIgnoreCase("SI")||res.equalsIgnoreCase("S"));
        return alumno;
    }
    
    public void notaFinal(ArrayList<Alumno> alumno){
        int cont = 0;
        double promedio = 0;
        System.out.println("Ingrese el alumno de cual desea obtener el promedio");
        String al = scan.next();
        int suma = 0;
        for (Alumno aux : alumno) {
            if (aux.getNombre().equalsIgnoreCase(al)) {
                cont++;
                for (Integer aux2 : aux.getNotas()) {
                    suma += aux2;
                }

                promedio = suma / aux.getNotas().size();
                System.out.println("La nota promedio del alumno " + al + " es " + promedio);
            }
        }
        if (cont == 0) System.out.println("No se encontró ningún alumno con el nombre ingresado");
    }
}

//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumno. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.