package Entidad;

//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        if (posicionActual > 6) {
            posicionActual = 1;
        }
        return posicionActual;
    }

    public int getPosicionAgua() {
            if (posicionAgua > 6) {
            posicionAgua = 1;
        }return posicionAgua;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
        
}