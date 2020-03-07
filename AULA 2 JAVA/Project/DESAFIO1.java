

public class DESAFIO1
{
    public static void main (String[] args){
        double gasolina = 4.40;
        double alcool = 2.90;
        double gasol_altera = gasolina * 0.7;
        
        if(gasol_altera < alcool){
            System.out.println("GASOLINA RENDE MAIS!");
        }
        else{
            System.out.println("ALCOOL RENDE MAIS!");
        }
    }
}
