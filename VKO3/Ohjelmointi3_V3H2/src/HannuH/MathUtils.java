package HannuH;

class MathUtils {

    //  LaskeYhteen, ottaa vastaan listan desimaalilukuja, laskee ne yhteen sekä palauttaa yhteenlaskun tuloksen
    static double LaskeYhteen(double[] lista){
        double uusi = 0;
        for( double luku : lista){
            uusi = uusi + luku;
        }
        return uusi;
    }

    //  SuurinLuku, ottaa vastaan listan desimaalilukujaja palauttaa suurimman
    public static double SuurinLuku(double[] lista){
        double suurin = -100000;
        for(double luku : lista){
            if(luku > suurin){
                suurin = luku;
            }
        }
        return suurin;
    }

    // LaskeKeskiarvo, ottaa vastaan listan desimaalilukuja, laskee niiden keskiarvon ja palauttaa sen.
    public static double LaskeKeskiarvo(double[] lista)
    {
        double ka=0, nykyiset = 0;
        int i=0;
        for( double luku : lista){
            nykyiset = nykyiset + luku;
            i++;
        }
        ka = nykyiset/i;
        return ka;
    }


}

/*
Tee luokka MathUtils, jolla on kolme staattista metodia:

                             - LaskeYhteen, ottaa vastaan listan desimaalilukuja, laskee ne yhteen sekä palauttaa yhteenlaskun tuloksen

                             - SuurinLuku, ottaa vastaan listan desimaalilukujaja palauttaa suurimman

                             - LaskeKeskiarvo, ottaa vastaan listan desimaalilukuja, laskee niiden keskiarvon ja palauttaa sen.



Tee ohjelma, joka testaa staattisten metodien toiminnan. Käyttäjältä ei kysytä mitään, vaan desimaalilukuja lista voidaan määritellä ohjelmassa.
 */