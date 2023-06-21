package Entidad;

public class Curso {
//Un profesor particular está dando cursos para grupos de cinco alumnos
//y necesita un programa para organizar la información de cada curso.
//Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
//serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
//turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
//arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
//nombres de cada alumno. A continuación, se implementarán los
//siguientes métodos:
    private String nombreCurso;
    private double cantidadHorasPorDia;
    private int CantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String [] alumnos;
    
//a) Un constructor por defecto.
    public Curso(){}

//b) Un constructor con todos los atributos como parámetro.

    public Curso(String nombreCurso, double cantidadHorasPorDia, int CantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.CantidadDiasPorSemana = CantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }
    
//c) Métodos getters y setters de cada atributo.

    public String getNombreCurso() {
        return nombreCurso;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return CantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int CantidadDiasPorSemana) {
        this.CantidadDiasPorSemana = CantidadDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

}