package pkgCine;

import Entidad.Cine;
import Entidad.Espectador;
import Servicio.PeliculaServicio;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        PeliculaServicio cs = new PeliculaServicio();
        
        Cine c = cs.abrirCine();
        ArrayList<Espectador> e = cs.crearPosiblesEspectadores();
        cs.recibirPosiblesEspectadores(c, e);
        cs.verSala(c);
        cs.revisarEspectadores(c);
        
    }
    
}
