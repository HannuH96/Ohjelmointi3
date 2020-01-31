package com.company;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double summa = 0, uusi = 0, keskiarvo, max = 0;
        int i = 1, x = 0;
        Scanner scn = new Scanner(System.in);
        //Tämä muotoilee double-arvon. esm 4.333333 tulee olemaan 4.33
        DecimalFormat pyorista = new DecimalFormat("#.##");

        System.out.println("Ohjelma kysyy menneiden kuukausien tulot, negatiivinen arvo lopettaa kyselyn, ja tulostaa summan, keskiarvon sekä suurimman kuukaisitulon.");
        System.out.println();

        //Laadi ohjelma, joka kysyy kuukauden tulot
        while(true)
        {
            x=0;
            while(x==0) {
                try {
                    System.out.print("Anna " + i + ". kuukauden tulot: ");
                    uusi = scn.nextDouble();
                    x=1;
                } catch (InputMismatchException e) {

                    System.out.println("Anna lukuarvo, ei tekstiä.");
                    scn.nextLine();
                    x=0;
                }
            }

            if(uusi >= 0)
            {
                //Laskee summan... määrittää suurimman...
                summa = summa + uusi;
                if (uusi > max)
                {

                    max = uusi;
                }
                i++;
            }
            // Jos syötetty kuukausitulo on negatiivinen, ohjelma tulostaa kysytyt arvot ja päättää toimintansa.
            else
            {
                i--;
                keskiarvo = summa / i;

                System.out.println("Kokonaistulo oli " + summa);
                System.out.println("Suurin kuukausitulo oli " + max);
                System.out.println("Keskimääräinen kuukausitulo oli: " + pyorista.format(keskiarvo));
                break;
            }

        }

    }
}
/*
Laadi ohjelma, joka kysyy kuukauden tulot
ja laskee sekä tulostaa näytölle tuloista yhteenlasketun tulon,
keskitulon kuukautta kohti, sekä suurimman kuukausikohtaisen tulon.
Jos syötetty kuukausitulo on negatiivinen, ohjelma tulostaa kysytyt arvot ja päättää toimintansa.

 */