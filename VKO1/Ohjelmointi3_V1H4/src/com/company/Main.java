package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] kayttajan = new int[7], oikeat = new int[7], ohjelman = new int[7];


        int i, j, oikkpl = 0, x = 0, jatko = 1, virhe = 1;
        String kysy;
        Random rng = new Random();
        Scanner scn = new Scanner(System.in);

        //Arvotaan luvut käyttäjälle, mikäli nyt ymmärsin tehtävänannon oikein
        for (i = 0; i < kayttajan.length; i++) {
            kayttajan[i] = rng.nextInt(40) + 1;


            for (j = 0; j < i; j++) {
                //Jos on sama luku, laitetaan uusi tilalle, ja testataan uudestaan.
                if (kayttajan[i] == kayttajan[j]) {
                    kayttajan[i] = rng.nextInt(40) + 1;
                    j = -1;
                }
            }


        }
        Arrays.sort(kayttajan);
        System.out.print("Rivisi on: ");
        for (i = 0; i < kayttajan.length; i++) {
            if (i == kayttajan.length - 1) {
                System.out.print(kayttajan[i]);
            } else {
                System.out.print(kayttajan[i] + ", ");
            }
        }

        System.out.println();


        while (jatko == 1) {

            //Toistetaan niin kauan kunnes input on halutun kaltainen.
            while (virhe == 1) {


                System.out.println("Haluatko suorittaa arvonnan? (k / e): ");
                kysy = scn.next();
                char kysychar = kysy.charAt(0);
                if (kysy.length() > 1) {
                    virhe = 1;
                    System.out.println("Anna vain yksi merkki (k tai e)");

                } else if (kysychar == 'e') {
                    jatko = 0;
                    virhe = 0;

                } else if (kysychar == 'k') {
                    virhe = 0;
                    jatko = 1;
                } else {
                    virhe = 1;
                    System.out.println("Anna k tai e.");
                }
            }
            if (jatko == 0) {
                System.out.println();
                System.out.println("Ohjelma päättyy. Kiitos käytöstä");
                break; //Ohjelma päättyy jos ei käyttäjä halua arpoa)

            }

            virhe = 1; //Resetoitava, jotta tuo muistaa kysyä arvonnasta uudestaan.

            //Nollataan tuo oikein olevien taulu
            for(i = 0; i < oikeat.length; i++)
            {
                oikeat[i] = 0;
                oikkpl = 0;
                x = 0;
            }

            //Arvotaan luvut ohjelmalle, mikäli nyt ymmärsin tehtävänannon oikein
            for (i = 0; i < ohjelman.length; i++) {
                ohjelman[i] = rng.nextInt(40) + 1;


                for (j = 0; j < i; j++) {
                    //Jos on sama luku, laitetaan uusi tilalle, ja testataan uudestaan.
                    if (ohjelman[i] == ohjelman[j]) {
                        ohjelman[i] = rng.nextInt(40) + 1;
                        j = -1;
                    }
                }


            }

            //Vertaillaan arvottuja lukuja, lisätään oikeat-tauluun jos on oikea ja lisätään muistiin oikeiden määrän nousu
            for (i = 0; i < kayttajan.length; i++) {
                for (j = 0; j < ohjelman.length; j++) {
                    if (kayttajan[i] == ohjelman[j]) {
                        oikeat[x] = kayttajan[i];
                        x++;
                        oikkpl++;
                    }
                }
            }

            Arrays.sort(ohjelman);
            
            System.out.print("Arvottu rivi on: ");
            for (i = 0; i < ohjelman.length; i++) {
                if (i == ohjelman.length - 1) {
                    System.out.print(ohjelman[i]);
                } else {
                    System.out.print(ohjelman[i] + ", ");
                }
            }


            System.out.println();
            System.out.print("Oikein oli " + oikkpl + " kpl, jotka olivat ");
            for (int luku : oikeat
            ) {
                if (luku != 0) {
                    System.out.print(luku + " ");
                }
            }
            System.out.println();
        }
    }
}



/*
Tee ohjelma joka arpoo lottorivin ja vertaa ohjelman arpomaan toteutuneeseen lottoriviin. ?? Molemmat arvotaan ?? Oletan näin
Aina vertauksen jälkeen ohjelma ilmoittaa montako oli oikein ja mitkä ne olivat.
 Ohjelmassa ei tarvitse välittää lisänumeroista.
 Esimerkiksi järjestelmän arpoma rivi voisi olla 4, 6, 8, 11, 14, 25, 29.
  Ohjelman tulee kysyä käyttäjältä, haluaako se uuden arvottavan lottorivin.
  Jos vastaus on kyllä, niin  sen jälkeen ohjelma  suoríttaa arvonnan ja vertailun.
  Jos vastaus on ei, niin ohjelma päättyy.

   Ohjelman tulostus voisi näyttää kutakuinkin seuraavalta:


Lottorivi on: 4, 6, 8, 11, 14, 25, 29.
Haluatko arpoa rivin (k= kyllä, e = ei)? k
Ohjelma arpoi rivin: 1, 4, 13, 14, 23, 27, 39
Oikein oli  2 kpl, jotka olivat 4, 14
Haluatko arpoa rivin (k= kyllä, e = ei)? e
Kiitos ja hei hei!

 */