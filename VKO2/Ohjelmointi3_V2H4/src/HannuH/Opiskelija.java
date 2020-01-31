package HannuH;

//Kopioitu suoraan Ohjelmointi_V2H1 opiskelija.java tiedostosta

public class Opiskelija{

    private String Etunimi;
    private String Sukunimi;
    private int Opiskelijanumero;
    private Osoite osoite;

    public Opiskelija() {
        Etunimi = "";
        Sukunimi = "";
        Opiskelijanumero = 0;
        osoite = new Osoite();

    }

    public Opiskelija(String etun, String sukun, int opin, String osoi, String kaupunki, int postinro)
    {
        Etunimi = etun;
        Sukunimi = sukun;
        Opiskelijanumero = opin;
        osoite.katuosoite = osoi;
        osoite.kaupunki = kaupunki;
        osoite.postinro = postinro;
    }
    //Ohjelman luomaa koodia
    @Override
    public String toString() {
        return "Opiskelija{" +
                "Etunimi='" + Etunimi + '\'' +
                ", Sukunimi='" + Sukunimi + '\'' +
                ", Opiskelijanumero=" + Opiskelijanumero +
                osoite.toString();
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


    public Osoite getOsoite()
    {
        return osoite;
    }

    public void setOsoite(Osoite _osoite) {
        this.osoite = _osoite;
    }



}