package HannuH;

public class Osoite {
    public String katuosoite;
    public String kaupunki;
    public int postinro;

    public Osoite() {
        katuosoite = "";
        kaupunki = "";
        postinro = 0;

    }

    public Osoite(String katuos, String kaupunk, int post) {
        katuosoite = katuos;
        kaupunki = kaupunk;
        postinro = post;

    }

    public String getKatuosoite()
    {
        return katuosoite;
    }
    public void setKatuosoite(String Katuosoite) {
        this.katuosoite = Katuosoite;
    }

    public String getKaupunki() { return kaupunki; }
    public void setKaupunki(String Kaupunki) { this.kaupunki = Kaupunki;}

    public int getPostinro() { return postinro; }
    public void setPostinro(int Postinro) { this.postinro = Postinro;}

    @Override
    public String toString() {
        return "Osoite{" + "katuosoite='" + katuosoite + '\'' +
                "kaupunki='" + kaupunki + '\'' +
                "postinumero='" + postinro + '\'' +
                '}';
    }
}
