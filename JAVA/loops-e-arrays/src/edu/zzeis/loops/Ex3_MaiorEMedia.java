package edu.zzeis.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;

        int count = 0;
        int maior = 0;
        int soma  = 0;
        do {

            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;

            count++;
            soma = soma + numero;

        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));
    }
}
