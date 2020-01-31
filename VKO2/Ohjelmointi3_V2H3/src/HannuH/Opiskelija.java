package HannuH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Opiskelija {
    private String nimi;
    private int vtpisteet;
    private int koepisteet;
    private int arvosana;
    Scanner scn = new Scanner(System.in);


    public Opiskelija() {
        nimi = "";
        vtpisteet = 0;
        koepisteet = 0;

    }

    public Opiskelija(String Nimi, int Vtpisteet, int Koepisteet) {
        nimi = Nimi;
        vtpisteet = Vtpisteet;
        koepisteet = Koepisteet;
    }

    //Ohjelman luomaa koodia
    @Override
    public String toString() {
        return "Henkilön nimi: " + nimi  +
                "\nViikkotehtävien pisteet: " + vtpisteet +
                "\nKoepisteet: " + koepisteet + "\nArvosana: " + arvosana;

    }

    public String getNimi()
    {
        return nimi;
    }
    public void setNimi(String Nimi) {
        this.nimi = Nimi;
    }

    public int getVtpisteet() { return vtpisteet; }
    public void setVtpisteet(int Vtpisteet) { this.vtpisteet = Vtpisteet; }

    public int getKoepisteet() { return koepisteet; }
    public void setKoepisteet(int Koepisteet) { this.koepisteet = Koepisteet; }

    public int getArvosana() { return arvosana; }
    public void setArvosana( int Arvosana ) { this.arvosana = Arvosana; }

    public void kysyTiedot() {
        boolean koetus = false;
        System.out.println("Anna nimi: ");
        setNimi(scn.nextLine());

        while (koetus == false) {
            try {
                System.out.println("Anna viikkotehtäväpisteet: ");
                setVtpisteet(scn.nextInt());
                scn.nextLine();
                koetus = true;
                if(vtpisteet > 16 || vtpisteet < 0)
                {
                    koetus = false;
                    System.out.println("Anna kokonaisluku väliltä 0-16");
                }
            } catch (InputMismatchException e) {
                System.out.println("Anna kokonaislukuna");
                scn.nextLine();
                koetus = false;
            }
        }

        koetus = false;

        while (koetus == false) {
            try {
                System.out.println("Anna opiskelijan kokeen pisteet: ");
                setKoepisteet(scn.nextInt());
                scn.nextLine();
                koetus = true;
                if(koepisteet > 20 || koepisteet < 0)
                {
                    koetus = false;
                    System.out.println("Anna kokonaisluku väliltä 0-20");
                }
            } catch (InputMismatchException e) {
                System.out.println("Anna kokonaislukuna");
                scn.nextLine();
                koetus = false;
            }
            arvosana = LaskeArvosana();
        }
    }

    public int LaskeArvosana()
    {
        if (koepisteet<10) {
            arvosana = 0;
        }
        else  if(koepisteet<12){
            arvosana = 1;}
        else  if(koepisteet<14)
            {arvosana = 2;}
        else  if(koepisteet<16)
            {arvosana = 3;}
        else  if(koepisteet<18)
            {arvosana = 4;}
        else
            {arvosana = 5;}
        if (arvosana > 0 && ((double) vtpisteet/16) >= 0.75)
            {arvosana ++;}
        if (arvosana> 5)
            {arvosana = 5;}

        return arvosana;
    }
}
