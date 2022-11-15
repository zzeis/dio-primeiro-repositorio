import java.util.Scanner;

public class array {
    public static void main(String[] args) {

   

        int numero = 5454;
        int posicao = verifica(numero);
        
        if(posicao != -3333){
            System.out.println("achei " + numero + " na posicao " + posicao);
        }else{
            System.out.println("Numero " + numero + " nao encontrado!");
        }
    




        


      
       
        
    }  

    public static int verifica(int numero){
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
        int count = 0; 
      
        int posicao = 0;

        while(count < (elementos.length)){
            if(numero == elementos[count]){
                posicao = count; 
                return posicao;  
            }else{
               posicao = -3333;
            }

            count++;
            
    }

    return posicao;
        

       
    }
}
