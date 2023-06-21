package clasedeutilidad;

import Entidad.Curso;
import Servicio.CursoService;
import java.util.Arrays;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso c = cs.crearCurso();
        System.out.println(Arrays.toString(c.getAlumnos())); //para llamar al array
        System.out.println("La ganancia semanal por curso es de $"
                + cs.calcularGananciaSemanal(c.getCantidadHorasPorDia(), c.getPrecioPorHora(), c.getCantidadDiasPorSemana()));
    }
}
