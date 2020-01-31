package HannuH;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char merkki;
        Scanner scn = new Scanner(System.in);
        ArrayList<Osake> lista = new ArrayList<>();
        boolean testi = false;
        double kasvupros = 0;
        int vuodet= 0;



        System.out.print("Lisätäänkö uusi Osake (k/e)?");
        merkki = scn.next().charAt(0);


        while(merkki == 'k' || merkki == 'K') {
            scn.nextLine();
            Osake osake = new Osake();
            testi = false; //Resetoidaan niin se kysyy ensikierroksellakin doublea

            System.out.print("Anna osakkeen nimi: ");
            osake.setNimi(scn.nextLine());

            while( testi == false  ) {
                try {
                    System.out.print("Anna osakkeen ostohinta: ");
                    osake.setOstohinta(scn.nextDouble());
                    testi = true;
                }catch(InputMismatchException e){
                    testi = false;
            }

            }

            lista.add(osake);



            System.out.print("Lisätäänkö uusi Osake (k/e)?");
            merkki = scn.next().charAt(0);

        }


        testi = false;
        scn.nextLine();
        while(testi == false) {
        try{
        System.out.print("Anna kasvuprosentti ilman prosenttimerkkiä (esim. 10): ");
        kasvupros = scn.nextDouble();
        testi = true;
        }
        catch(InputMismatchException e)
        {
            testi = false;
        }}
        testi = false;
        while(testi == false) {
            try{
                System.out.print("Anna vuosimaara: ");
                vuodet = scn.nextInt();
                testi = true;
            }
            catch(InputMismatchException e)
            {
                testi = false;
            }}

        for (Osake ok: lista
             ) {
            ok.TulostaArvo(kasvupros, vuodet);

        }


    }
}
/*

Ohjelmalla (pääohjelmassa) on lista, johon käyttäjä voi lisätä Osake-olioita. Ohjelma kysyy käyttäjältä ”Lisätäänkö uusi osake (k/e)”.

Kun osakkeet on lisätty listaan, kysyy ohjelma käyttäjältä kuvitteellisen kasvuprosentin sekä ajanjakson vuosina. -tehty


TulostaArvo-metodi kutsuu Osake-luokan kapseloitua metodia LaskeTuottoYhdelleVuodelle, joka laskee vuosikohtaisen tuoton. -tehty
Mieti myös ratkaisua tuottoa tuotolle eli seuraavan vuoden tuotto perustuukin edellisenä vuonna kasvaneeseen pääomaan. -tehty
 Osakkeen vuosikohtaiset tuotot lasketaan yhteen ja tulostetaan kuvitteellinen arvo ajanjakson jälkeen. -tehty



Laske pääohjelmassa  myös kaikkien osakeostojen tuotto(sama % ja samat vuodet) käymällä lista läpi. -tehty
 */