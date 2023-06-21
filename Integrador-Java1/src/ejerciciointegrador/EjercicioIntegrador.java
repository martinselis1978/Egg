package ejerciciointegrador;

import Entidad.Estudiante;

public class EjercicioIntegrador {

    public static void main(String[] args) {
        
//Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
//examen final. La escuela nos ha pedido que calculemos el promedio de notas
//final de todos sus alumnos y saber qué alumnos han recibido una nota por
//encima de ese promedio.
        Estudiante estudiante = new Estudiante();
        Estudiante ee [] = new Estudiante [8];
        
        ee[0] = new Estudiante ("Martin", 9);
        ee[1] = new Estudiante ("Franco", 7);
        ee[2] = new Estudiante ("Claudio", 3);
        ee[3] = new Estudiante ("Ernesto", 5);
        ee[4] = new Estudiante ("Mateo", 8);
        ee[5] = new Estudiante ("Francisco", 6);
        ee[6] = new Estudiante ("Fernando", 7);
        ee[7] = new Estudiante ("Patricio", 4);
        
        double nota, promedio = 0;
        
        for (int i = 0; i < ee.length; i++) {
            nota = ee[i].getNota();
            promedio = estudiante.promedioNotas(nota);
        }
        System.out.println("El promedio de las notas de todo el curso es " + promedio + "\n");
        
        boolean aux;
        int cant = 0;
        for (int i = 0; i < ee.length; i++) {
            if (promedio < ee[i].getNota()) {
                aux = estudiante.nombreMejoresPromedios(promedio,ee[i].getNota());
                if (aux) {
                    System.out.println(ee[i].getNombre() + " obtuvo un " + ee[i].getNota() + ", su nota es  mejor que la del promedio clase.");
                }
            }
            
        }
        
    }

}
