package Servicios;

import Entidades.Nif;
import java.util.Scanner;

public class NifServicio {
    Nif nif = new Nif();
//b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
//letra que le corresponderá. Una vez calculado, le asigna la letra que
//le corresponde según
    public void crearNif(){
        Scanner leer = new Scanner(System.in);
        long aux;
        int cont;
        do{
            cont = 0;
            System.out.print("Ingrese el DNI: ");
            nif.setDni(leer.nextLong());
            aux = nif.getDni();
            while (aux > 0) {
                cont ++;
                aux = aux / 10;
            }
            if (cont != 8) {
                System.out.println("\nLa cantidad de digitos debe ser 8\n");
            }
        }while(cont != 8);
    }
    
    public void mostrar(){
        String vector[] = new String[23];
        vector[0]="T"; vector[1]="R"; vector[2]="W"; vector[3]="A"; vector[4]="G"; vector[5]="M"; vector[6]="Y"; vector[7]="F"; vector[8]="P"; vector[9]="D"; vector[10]="X"; vector[11]="B"; vector[12]="N"; vector[13]="J"; vector[14]="Z"; vector[15]="S"; vector[16]="Q"; vector[17]="V"; vector[18]="H"; vector[19]="L"; vector[20]="C"; vector[21]="K"; vector[22]="E";
        int res;
        res = (int) nif.getDni() % 23;
        nif.setUnif(vector[res]);
        System.out.println(nif.getDni() + "-" + nif.getUnif());
    }
    
}
//c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
//guion y la letra en mayúscula; por ejemplo: 00395469՞FՅ.
//La letra correspondiente al dígito verificador se calculará a traves de un
//método que funciona de la siguiente manera: Para calcular la letra se
//toma el resto de dividir el número de DNI por 23 (el resultado debe ser
//un número entre 0 y 22Յ. El método debe buscar en un array (vector) de
//caracteres la posición que corresponda al resto de la división para
//obtener la letra correspondiente. La tabla de caracteres es la siguiente:
//POSICIÓN LETRA
//0 T
//1 R
//2 W
//3 A
//4 G
//5 M
//6 Y
//7 F
//8 P
//9 D
//10 X
//11 B
//12 N
//13 J
//14 Z
//15 S
//16 Q
//17 V
//18 H
//19 L
//20 C
//21 K
//22 E