package HannuH;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Auto {
    private String rekisterinumero, merkki, malli;
    private int vuosimalli;
    Scanner scn = new Scanner(System.in);

    //Tee luokalle vähintään kolme(3) erilaista muodostinta.
    // Oletus, kaikki arvot ja muodostin jossa kaikki muut paitsi vuosimalli = 3
    public Auto()
    {
        rekisterinumero = "AAA-000";
        merkki = "";
        malli = "";
        vuosimalli = 1900;
    }
    public Auto(String Rekisterinumero, String Merkki, String Malli, int Vuosimalli)
    {
        rekisterinumero = Rekisterinumero;
        merkki = Merkki;
        malli = Malli;
        vuosimalli = Vuosimalli;
    }
    public Auto(String Rekisterinumero, String Merkki, String Malli)
    {
        rekisterinumero = Rekisterinumero;
        merkki = Merkki;
        malli = Malli;
        vuosimalli = 1900;
    }


    //Tee luokalle get ja set -metodit

    public int getVuosimalli() {
        return vuosimalli;
    }

    public void setVuosimalli(int Vuosimalli) {
        //Tarkista vuosimallin set-metodissa, että vuosimalli on >= 1900 ja pienempi kuin tämä kuluva vuosi. Jos ei ole, niin vuosimalliksi laitetaan 1900
        int nykvuosi = Calendar.getInstance().get(Calendar.YEAR);
        if (Vuosimalli <= nykvuosi || Vuosimalli >= 1900) {
            this.vuosimalli = Vuosimalli;
        } else {
            this.vuosimalli = 1900;
        }
    }

    public String getMalli() {
        return malli;
    }

    public void setMalli(String Malli) {
        this.malli = Malli;
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String Merkki) {
        this.merkki = Merkki;
    }

    public String getRekisterinumero() {
        return rekisterinumero;
    }

    //Tarkista rekisterinumeron set-metodissa, että rekisterinumeron max pituus on 7 merkkiä ja sisältää väliviivan.
    public void setRekisterinumero(String Rekisterinumero) {


        if (Rekisterinumero.indexOf('-') != -1 && Rekisterinumero.length() <= 7) {
            this.rekisterinumero = Rekisterinumero;
        } else {
            this.rekisterinumero = "AAA-000"; //tälle nyt ei annettu mitään, mitä pitäisi tehdä, niin tehdään nyt vaikka näin.
        }

    }


    //Tee luokalle kysyTiedot -metodi, jossa kysyt luokan attribuutteihin arvot
    public void kysyTiedot() {
        boolean koetus = false;
        System.out.println("Anna auton merkki: ");
        setMerkki(scn.nextLine());
        System.out.println("Anna auton malli: ");
        setMalli(scn.nextLine());
        System.out.println("Anna auton rekisterinumero: ");
        setRekisterinumero(scn.nextLine());
        while (koetus == false) {
            try {
                System.out.println("Anna auton vuosimalli: ");
                setVuosimalli(scn.nextInt());
                scn.nextLine();
                koetus = true;
            } catch (InputMismatchException e) {
                System.out.println("Anna kokonaislukuna");
                scn.nextLine();
                koetus = false;
            }
        }

    }

//Uudelleenmuotoiltu toString
    public String toString() {
        return ("Auton merkki: " + merkki + "\nAuton malli: " + malli + "\nAuton vuosimalli: " + vuosimalli + "\nAuton rekisterinumero: " + rekisterinumero);
    }


}

/*
Tee luokka Auto, jolle teet seuraavat yksityiset attribuutit
- rekisterinumero (merkkijono)
- merkki (merkkijono)
- vuosimalli (kokonaisluku)
- malli (merkkojono)

Tee luokalle vähintään kolme(3) erilaista muodostinta.
Tee luokalle get ja set -metodit - done
Tarkista vuosimallin set-metodissa, että vuosimalli on >= 1900 ja pienempi kuin tämä kuluva vuosi. Jos ei ole, niin vuosimalliksi laitetaan 1900 - done
Tarkista rekisterinumeron set-metodissa, että rekisterinumeron max pituus on 7 merkkiä ja sisältää väliviivan. - done
Tee luokalle kysyTiedot -metodi, jossa kysyt luokan attribuutteihin arvot. - done
Tee luokalle toString-metodi, joka palauttaa attribuuttien tiedot merkkijonona ja "siistityssä" muodossa eli muokkaa oletuspohjaa siistimmäksi. - done
 */