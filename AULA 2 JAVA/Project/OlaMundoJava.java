
public class OlaMundoJava
{
    public static void main (String[] args){
        double Salario = 1350.00;
        int x=5;
        String Nome = "Leonardo";
        char Letra = 'B'; 
        boolean Saldo = true;
        
        double valor1=15;
        double valor2=30;
        
        double total = valor1 + valor2;
        
        System.out.println("TOTAL = " + total);
        
        if(total>49){
            System.out.println("NUMERO MAIOR!");
        }
        else{
            System.out.println("NUMERO MENOR!");    
        }
        
        for(int i=0; i<=10; i++){
               System.out.println("TESTE");
        }
    }
}
