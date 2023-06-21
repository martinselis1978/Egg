package Servicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TiendaServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
    public void IngresarProductos(HashMap<String, Double>productos){
        System.out.println("Ingrese el producto");
        String producto = scan.next();
        System.out.println("Ingrese el precio del producto");
        double precio = scan.nextDouble();
        productos.put(producto, precio);
    }
    
    public void mostrarProductos(HashMap<String, Double>productos){
        System.out.println(productos);
    }
    
    public void eliminarProductos(HashMap<String, Double>productos){
        System.out.println("Ingrese el producto que desea eliminar");
        String producto = scan.next();
        if (productos.containsKey(producto)) {
            productos.remove(producto);
            System.out.println("El producto se borró exitosamente");
        } else {
            System.out.println("El producto no se encuentra en la lista");
        }
    }
}

//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.