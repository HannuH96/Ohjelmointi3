package com.company;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int rahat = 0;
        double prosentti = 0.00;
        String osake;
        boolean toisto = true;
        Scanner scn = new Scanner(System.in);

        System.out.print("Anna osakkeen nimi: ");
        osake = scn.next();

        while(toisto == true) {
            try {
                System.out.print("Anna osinkoprosentti: ");
                prosentti = scn.nextDouble();
                toisto = false;
            } catch (InputMismatchException e) {
                System.out.println("Annappa numero, ei mittään pelleilyä!");
                scn.nextLine();
                toisto = true;
            }
        }


        toisto = true;
        while(toisto == true) {
            try {
                System.out.print("Anna sijoitus: ");
                rahat = scn.nextInt();
                  toisto = false;
            } catch (InputMismatchException e) {
                System.out.println("Annappa numero, ei mittään pelleilyä!");
                scn.nextLine();
                toisto = true;
            }
        }



        TulostaTiedot(osake, prosentti, rahat);
    }


    public static void TulostaTiedot(String osake, double prosentti, int rahamaara)
    {
        double tuotto = prosentti/100.00 * rahamaara;
        //Tämä muotoilee double-arvon. esm 4.333333 tulee olemaan 4.33
        DecimalFormat l2 = new DecimalFormat("#.##");
        System.out.println("Osakkeen" + osake + " tuotto pääomalle " + rahamaara +  " on " + l2.format(tuotto));
    }
}

/*
Tee ohjelma joka kysyy käyttäjältä yhden osakkeen nimen (merkkijono), - done
osinkotuottoprosentin (desimaali) ja sijoitettava rahamäärän(kokonaisluku) . - done
 Sitten ohjelma tulostaa alla lauseen, jossa se käyttää näitä tietoja. - done
 */