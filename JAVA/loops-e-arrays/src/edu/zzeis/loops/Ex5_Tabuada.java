package edu.zzeis.loops;

import java.util.Scanner;

/*
  Desenvolva um gerador de tabuada,
  capaz de gerar a tabuada de qualquer numero inteiro entre 1 a 10. 
  O usuario deve informar de qual numero ele deseja vera tabuada. 
  A sáida deve ser conforme o exemplo abaixo: 

  Tabuada de 5: 
  5x1 = 5
  2x2 = 10
  ....
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Tabuada: ");
        int tabuada = scan.nextInt();


        System.out.print("Tabuada de " + tabuada);

        for(int i = 1; i<=10 ; i++ ){
            System.out.println( tabuada + " X " + i + " = " + tabuada*i );
        }

    }
}
