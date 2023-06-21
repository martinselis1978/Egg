package estructura_de_control;

import java.util.Scanner;

public class extra4 {

    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
        muestre su equivalente en romano.
        */
        Scanner read=new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un valor entre 1 y 10");
            num=read.nextInt();
        }while(num<1||num>10);
        for(int i=0;i<num;i++){
            if(num==10){
                System.out.println("X");
                break;}
            if(num>4&&num<9){
                System.out.print("V");
                for(int j=5;j<num;j++){
                    System.out.print("I");
                }
                break;
            }
            System.out.print("I");
            if(num==9){
                System.out.println("X");
                break;}
            if(num==4){
                System.out.println("V");
                break;}
        }
        System.out.println("");
    }
}
