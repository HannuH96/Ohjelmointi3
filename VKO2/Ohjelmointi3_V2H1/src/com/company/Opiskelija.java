package com.company;

public class Opiskelija{

    private String Etunimi;
    private String Sukunimi;
    private int Opiskelijanumero;
    private String Osoite;

    public Opiskelija() {
        Etunimi = "";
        Sukunimi = "";
        Opiskelijanumero = 0;
        Osoite = "";

    }

    public Opiskelija(String etun, String sukun, int opin, String osoi)
    {
        Etunimi = etun;
        Sukunimi = sukun;
        Opiskelijanumero = opin;
        Osoite = osoi;
    }
    //Ohjelman luomaa koodia
    @Override
    public String toString() {
        return "Opiskelija{" +
                "Etunimi='" + Etunimi + '\'' +
                ", Sukunimi='" + Sukunimi + '\'' +
                ", Opiskelijanumero=" + Opiskelijanumero +
                ", Osoite='" + Osoite + '\'' +
                '}';
    }

    public String getEtunimi()
    {
        return Etunimi;
    }
    public void setEtunimi(String etunimi) {
        this.Etunimi = etunimi;
    }

    public String getSukunimi()
    {
        return Sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.Sukunimi = sukunimi;
    }


    public int getOpiskelijanumero()
    {
        return Opiskelijanumero;
    }
    public void setOpiskelijanumero(int opiskelijanumero) {
        this.Opiskelijanumero = opiskelijanumero;
    }


    public String getOsoite()
    {
        return Osoite;
    }

    public void setOsoite(String osoite) {
        this.Osoite = osoite;
    }



}