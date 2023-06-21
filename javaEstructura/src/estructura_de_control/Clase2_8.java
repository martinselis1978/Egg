package estructura_de_control;

import java.util.Scanner;

public class Clase2_8 {

    public static void main(String[] args) {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
        lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para dibujar un cuadrado");
        int cua = leer.nextInt();
        for (int i=1;i<=cua;i++){
            System.out.print(" * ");
            for (int j=1;j<cua;j++){
                if(i==1||i==cua){
                    System.out.print(" * ");
                }else if(j==cua -1){System.out.print(" * ");
                }else{System.out.print("   ");}
            }
            System.out.println("");
        }
    }
    
}
