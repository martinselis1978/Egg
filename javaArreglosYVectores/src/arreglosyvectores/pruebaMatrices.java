/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosyvectores;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class pruebaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int num = leer.nextInt();
        int matriz[][] = new int[num][num];
        matrices(matriz, num);
    }
    
    public static void matrices(int[][] matriz,int num){
        Scanner leer=new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.println("Ingrese un valor en ["+(i+1)+"]["+(j+1)+"]");
                matriz[i][j]=leer.nextInt();
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
