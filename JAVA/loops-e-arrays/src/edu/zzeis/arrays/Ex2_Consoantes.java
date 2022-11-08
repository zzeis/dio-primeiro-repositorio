package edu.zzeis.arrays;

import java.util.Scanner;

/*
 Faça um programa que leia um vetor de 6 caracteres, 
 e diga quantas consoantes foram lidas. 
 Imprima sa consoantes.
 */
public class Ex2_Consoantes {
    /**
     * It asks the user to input 6 letters, and then it prints out the number of consonants that were
     * entered
     */
    public static void main(String[] args) {

        String[] consoantes = new String[6];
        Scanner scan = new Scanner(System.in);
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;
        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");

        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}
