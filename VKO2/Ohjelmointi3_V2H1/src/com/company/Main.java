package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String etunimi, sukunimi, osoite;
        int opiskelijanumero;
        boolean toisto = true;
        Opiskelija oppilas = new Opiskelija();



        System.out.println("Anna etunimi: ");
        oppilas.setEtunimi(scn.nextLine());
        System.out.println("Anna sukunimi: ");
        oppilas.setSukunimi(scn.nextLine());
        System.out.println("Anna osoitetiedot: ");
        oppilas.setOsoite(scn.nextLine());
        while(toisto == true) {
            try {
                System.out.println("Anna opiskelijanumero: ");
                oppilas.setOpiskelijanumero(scn.nextInt());

                toisto = false;
            } catch (InputMismatchException e) {
                System.out.println("Annappa numero, ei mittään pelleilyä!");
                scn.nextLine();
                toisto = true;
            }
        }

        System.out.println(oppilas.toString());

    }
}





/*
Tee julkinen luokka Opiskelija, jolla on yksityiset attribuutit:
                             - Etunimi
                             - Sukunimi
                             - Opiskelijanumero
                             - Osoite(merkkijono, joka sisältää kaiken eli katuosoite, postinro,..)

Tee luokalle ns oletusmuodostin sekä muodostin, jossa annetaan arvota kaikille luokan ettribuuteille.
Tee kaikille tiedoille get- ja set-methodit, jotta tietoja pääsee muokkaamaan ja lukemaan.
Tee myös toString -metodi. Käytä sen luonnissa automaattista luontia.
Testaa pääohjelmassa. Mitään monimutkaista käyttöliittymää ei tarvitse tehdä.
 */