package Servicio;

import Entidad.Revolver;

public class ServicioRevolver {
    Revolver revolver = new Revolver();
//llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
    public Revolver llenarRevolver(){
        revolver.setPosicionActual((int) (Math.random()*8+1));
        revolver.setPosicionAgua((int) (Math.random()*8+1));
        return revolver;
    }

//mojar(): devuelve true si la posición del agua coincide con la posición actual   
    public boolean mojar(){
        boolean moja = false;
        if (revolver.getPosicionActual() == revolver.getPosicionAgua()) moja = true;
        return moja;
    }
    
//siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(){
        revolver.setPosicionActual(revolver.getPosicionActual()+1);
    }

//toString(): muestra información del revolver (posición actual y donde está el agua)
    @Override
    public String toString() {
        return "ServicioRevolverDeAgua{" + "revolver=" + revolver + '}';
    }
    
}