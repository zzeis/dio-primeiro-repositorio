package edu.zzeis.arrays;
/*
 Crie um vetor de 6 números
 e mostre-os na ordem inversa. 
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { 1, 2, -3, 4, 5, 6 };

        int count = 0;

        System.out.print("Vetor: ");
        while (count < (vetor.length)) {

            System.out.print(vetor[count] + " " ) ;
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length -1);i >= 0; i--){
            System.out.print(vetor[i] + " " ) ;
        }
    }
}
