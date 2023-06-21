package arreglosyvectores;

import java.util.Random;
import java.util.Scanner;

public class Extra6 {

    public static void main(String[] args) {
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
        caracteres y, a medida que el usuario las va ingresando, construya una
        “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
        palabras se ubicarán todas en orden horizontal en una fila que será
        seleccionada de manera aleatoria. Una vez concluida la ubicación de las
        palabras, rellene los espacios no utilizados con un número aleatorio del 0
        al 9. Finalmente imprima por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java substring(), Length() y Math.random()
        */
        Scanner leer=new Scanner(System.in);
        Random random=new Random();
        int fil[]=new int[5];
        String palabra[]=new String[5];
        String sopa[][]=new String[20][20];
        int fila=0,columna=0,cont=0,intRelleno=0;
        String stringRelleno=String.valueOf(intRelleno);
        
//        Ingresar valores con restricción de 3 a 5 caracteres por palabra
//        palabra[0]="prim";palabra[1]="segun";palabra[2]="tres";palabra[3]="cuatr";palabra[4]="quin";
        for (int i = 0; i < 5; i++) {
            do{
            System.out.println("Ingrese la [ "+(i+1)+" ] palabra entre 3 y 5 caracteres");
            palabra[i]=leer.next();
            }while(palabra[i].length()<3||palabra[i].length()>5);    
        }
        for (int i = 0; i < 5; i++) {            
//      crear columnas aleatorias   
            switch(palabra[i].length()){
                case 3:
                    columna=random.nextInt(17);
                    break;
                case 4:
                    columna=random.nextInt(16);
                    break;
                case 5:
                    columna=random.nextInt(15);
                    break;
            }
//            crear filas aleatorias
                do{
                    fila=random.nextInt(20)+1;
                    for (int j = 0; j < i + 1; j++) {
                        if(fila==fil[j]){
                            fila=random.nextInt(20)+1;
                            j=0;
                            continue;
                        }else{
                            cont++;
                        }
                    }
                }while(cont<i+1);
                fil[i]=fila;
                
            cont=0;
            for (int j = columna; j < palabra[i].length() + columna; j++) {
                sopa[fila][j]=palabra[i].substring(cont,cont+1);
                cont++;
            }
            
        }
//        completo la sopa con 0
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(sopa[i][j]==null){
                    intRelleno=random.nextInt(9)+1;
                    stringRelleno=String.valueOf(intRelleno);
                    sopa[i][j]=stringRelleno;
                }
            }
        }
//        imprimo la sopa
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j]+ "  ");
            }
            System.out.println(" ");
        }
    }
}
