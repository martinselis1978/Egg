package pkg10paises;

import Servicio.PaisServicio;

public class Main {

    public static void main(String[] args) {
        PaisServicio paisServicio = new PaisServicio();
        
        paisServicio.guardarPais();
        paisServicio.ordenarPais();
        paisServicio.borrarPais();
        paisServicio.ordenarPais();
    }
    
}
