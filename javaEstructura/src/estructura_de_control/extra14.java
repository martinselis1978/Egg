package estructura_de_control;

import java.util.Scanner;

public class extra14 {

    public static void main(String[] args) {
        /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene
        una M cantidad de hijos. Escriba un programa que pida la cantidad de
        familias y para cada familia la cantidad de hijos para averiguar la media
        de edad de los hijos de todas las familias.

        */
        
        Scanner read=new Scanner(System.in);
        int families=0,sons=0,ages,totalSons=0;
        double average=0;
        String op="s";
        do{
            while(op.equals("s")){
                System.out.println("La familia tiene hijos S/N");
                op=read.next();
                families++;
                if(op.equals("s")){
                    System.out.println("Ingrese la cantidad de hijos");
                    sons=read.nextInt();
                    for(int i=1;i<sons+1;i++){
                        System.out.println("Ingrese la edad del "+i+" hijo");
                        ages=read.nextInt();
                        average=average+ages;
                        totalSons++;
                    }
                    break;
                }
            }
            System.out.println("Desea agregar otra familia S/N");
            op=read.next();
        }while(op.equals("s"));
        System.out.println("La media de edad de los hijos de todas las familias es "+(average/totalSons));
        
    }
    
}
