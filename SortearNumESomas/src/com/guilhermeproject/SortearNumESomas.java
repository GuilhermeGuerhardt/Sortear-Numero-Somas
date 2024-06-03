package com.guilhermeproject;

import java.util.Scanner;
import java.util.Random;

public class SortearNumESomas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        int pos = 0, soma = 0, maiorVlr = 0, menorVlr = 0, vlrCinco = 0;
        String resp;

        do {
            int sort = gerador.nextInt(10) + 1;
            System.out.println("o " + (pos + 1) + "º valor sorteado foi " + sort);

            pos++;
            soma += sort;

            if (pos == 1) {
                maiorVlr = sort;
                menorVlr = sort;
            } else {
                if (sort > maiorVlr) {
                    maiorVlr = sort;
                }
                if (sort < menorVlr) {
                    menorVlr = sort;
                }
            }
            if (sort == 5) {
                vlrCinco++;
            }

            System.out.println("Quer sortear mais um? [S/N]");
            resp = scanner.next();

        } while (resp.equalsIgnoreCase("S"));

        System.out.println("Você me fez sortear " + pos + " valores");
        System.out.println("A soma de todos eles foi igual a " + soma);
        System.out.println("O maior valor foi " + maiorVlr + " e o menor valor foi " + menorVlr);
        System.out.println("O valor 5 foi sorteado " + vlrCinco + " vezes");

        scanner.close();
    }
}
