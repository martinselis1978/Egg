package estructura_de_control;

public class extra12 {

    public static void main(String[] args) {
        /*
        Necesitamos mostrar un contador con 3 dígitos ՄX՞X՞XՅ, que muestre los
        números del 0՞0՞0 al 9՞9՞9, con la particularidad que cada vez que
        aparezca un 3 lo sustituya por una E. Ejemplo:
        0՞0՞0
        0՞0՞1
        0՞0՞2
        0՞0՞E
        0՞0՞4
        0՞1՞2
        0՞1՞E
        Nota: investigar función equals() y como convertir números a String
        */
        String cl="E",dl="E",ul="E";
        for(int c=0;c<10;c++){
            for(int d=0;d<10;d++){
                for(int u=0;u<10;u++){
                    if(c==3||d==3||u==3){
                        if(c==3){
                            System.out.print(cl+"-");
                        }else{System.out.print(c+"-");}
                        if(d==3){
                            System.out.print(dl+"-");
                        }else{System.out.print(d+"-");}                        
                        if(u==3){
                            System.out.println(ul);
                        }else{System.out.println(u);}                        
                    }else{
                         System.out.println(c+"-"+d+"-"+u);
                    }
                }
            }
        }
    }
    
}
