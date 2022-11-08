package edu.zzeis.arrays;

import java.util.Random;

/*
 * Faça um programa que leia 20 numeros inteiros aleatórios (entre 0 e 100)
 * e armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 */
public class Ex3_NumerosAleatorios {
   /**
    * It creates an array of 20 random numbers, prints them, and then prints the successor of each
    * number
    */
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nSucessores dos numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }


    }
}
