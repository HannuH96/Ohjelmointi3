package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int leveys = 0 , korkeus = 0, x = 0, i, j ;
        char merkki, testi;

        Scanner scn = new Scanner(System.in);

        // ... kysyy käyttäjältä suorakaiteen leveyden, korkeuden, piirtomerkin  ...
       while(x == 0) {
            try {
                System.out.print("Anna suorakaiteen leveys (kokonaisluku): ");
                leveys = scn.nextInt();
                x = 1;
            } catch (InputMismatchException e) {
                System.out.println("Taisit antaa jotain muuta kuin kokonaisluvun. Kokeileppa uudestaan.");
                scn.nextLine();
                x = 0;
            }
       }
       x = 0;
        while(x == 0) {
            try {
                System.out.print("Anna suorakaiteen korkeus (kokonaisluku): ");
                korkeus = scn.nextInt();
                x = 1;

            } catch (InputMismatchException e) {
                System.out.println("Taisit antaa jotain muuta kuin kokonaisluvun. Kokeileppa uudestaan.");
                scn.nextLine();
                x = 0;
            }
        }

        System.out.print("Anna suorakaiteen piirtomerkki (Vain ensimmäinen huomioidaan): ");
        merkki = scn.next().charAt(0);

        //   ...ja sen, tulostetaanko se täytettynä vai ei...
        x = 0;
        while(x == 0) {
            System.out.print("Täytettynä vai ei? (K / E) : ");
            testi = scn.next().charAt(0);
            switch (testi) {

                case 'K':
                case 'k':
                    //    Ohjelma tulostaa sitten suorakaiteen annetulla merkillä täytettynä
                    for(i = 0; i < korkeus; i++)
                    {
                        for(j= 0; j < leveys; j++)
                        {
                            System.out.print(merkki);
                        }
                        System.out.println();
                    }

                    x = 1;
                    break;

                case 'E':
                case 'e':
                    //    Ohjelma tulostaa sitten suorakaiteen annetulla merkillä täyttämättömänä
                    for(i = 0; i < korkeus; i++)
                    {
                        for(j= 0; j < leveys; j++)
                        {
                            if( i == 0 || i == korkeus-1)
                            {
                                System.out.print(merkki);
                            }
                            else if (j == 0 || j == leveys-1)
                            {
                                System.out.print(merkki);
                            }
                            else
                            {

                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }

                    x = 1;
                    break;

                default:
                    System.out.print("Anna K tai E ensimmäisenä merkkinä.");

            }
        }

    }

}
  /*
   Tee ohjelma joka kysyy käyttäjältä suorakaiteen leveyden, korkeuden, piirtomerkin
   ja sen, tulostetaanko se täytettynä vai ei.
   Ohjelma tulostaa sitten suorakaiteen annetulla merkillä

   täytetty
   * * * *
   * * * *
   * * * *

   ei täytetty
   * * * *
   *     *
   * * * *

   */