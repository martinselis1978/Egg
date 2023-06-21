package Entidad;
//Crear una clase Rectángulo que modele rectángulos por medio de un
//atributo privado base y un atributo privado altura.
public class Rectangulo {
    private int base;
    private int altura;
    
    public Rectangulo(){
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int getBase(){
        return base;
    }
    
    public void setBase(int base){
        this.base=base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    //Incluirá un método para calcular la superficie
    public int superficie(){
        System.out.print("La superficie del rectángulo es "+(base*altura));
        return 0;
    }
    //Un método para calcular el perímetro
    public int perimetro(){
        System.out.print("El perímetro del rectángulo es "+(base+altura)*2);
        return 0;
    }
    //Método que dibujará el rectángulo mediante
    //asteriscos usando la base y la altura. 
    public void dibRec(int base,int altura){
        this.base=base;
        this.altura=altura;
        for (int i = 0; i < altura; i++) {
            System.out.print(" * ");
            for (int j = 1; j < base; j++) {
                if(i==0||i==altura-1){
                    System.out.print(" * ");
                }else{
                    if(j==base-1){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println("");
        }
    }
}