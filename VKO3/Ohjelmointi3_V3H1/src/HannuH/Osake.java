package HannuH;



public class Osake {
    private String Nimi;
    private double Ostohinta;

    public String getNimi() {
        return Nimi;
    }

    public void setNimi(String nimi) {
        Nimi = nimi;
    }

    public double getOstohinta() {
        return Ostohinta;
    }

    public void setOstohinta(double ostohinta) {
        Ostohinta = ostohinta;
    }

    public void TulostaArvo(double kasvuprosentti, int vuosimaara){
        double nykhinta, tuotto;
        nykhinta = LaskeTuottoYhdelleVuodelle(kasvuprosentti, vuosimaara);
        tuotto = nykhinta - Ostohinta;

        System.out.println("Osakkeen " + Nimi + " ostohinta oli " + Ostohinta + ", osakkeen nykyinen arvo on " + nykhinta + ". Osakkeen tuotto on " + tuotto);


    }

    double LaskeTuottoYhdelleVuodelle(double kasvuprosentti, int vuosimaara){
        int i;
        double tuotot, nykhinta;
        nykhinta = Ostohinta;
        for(i = 0; i < vuosimaara; i++){
            tuotot = nykhinta * (kasvuprosentti/100);
            nykhinta = tuotot + nykhinta;
        }

        return nykhinta;
    }
}

/*

Tee luokka Osake, jolla on yksityiset attribuutit: - tehty

                             - Nimi

                             - Ostohinta (eli osakkeisiin sijoitettu pääomal)



Osakkeella on julkinen metodit: - tehty

                             - TulostaArvo, joka ottaa vastaan vuosikohtaisen kasvuprosentin ja ajanjakson vuosina.



TulostaArvo-metodi kutsuu Osake-luokan kapseloitua metodia LaskeTuottoYhdelleVuodelle, joka laskee vuosikohtaisen tuoton. - tehty
Mieti myös ratkaisua tuottoa tuotolle eli seuraavan vuoden tuotto perustuukin edellisenä vuonna kasvaneeseen pääomaan. - tehty
 Osakkeen vuosikohtaiset tuotot lasketaan yhteen ja tulostetaan kuvitteellinen arvo ajanjakson jälkeen. - tehty


 */