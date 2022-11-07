package edu.zzeis.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros, 
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

            count++;

        } while (count < quantNumeros);

        System.out.println("Quantidade de números Pares: " + quantPares);
        System.out.println("Quantidade de números Impares: " + quantImpares);

    }
}
