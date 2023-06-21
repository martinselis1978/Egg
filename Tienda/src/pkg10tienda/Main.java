package pkg10tienda;

import Servicio.TiendaServicio;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        TiendaServicio tiendaServicio = new TiendaServicio();
        HashMap<String, Double>productos = new HashMap<>();
        
        for (int i = 0; i < 3; i++) {
            tiendaServicio.IngresarProductos(productos);   
        }

        tiendaServicio.mostrarProductos(productos);
        tiendaServicio.IngresarProductos(productos);//modifica o ingresa producto
        tiendaServicio.mostrarProductos(productos);
        tiendaServicio.eliminarProductos(productos);
        tiendaServicio.mostrarProductos(productos);


    }
    
}

//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.