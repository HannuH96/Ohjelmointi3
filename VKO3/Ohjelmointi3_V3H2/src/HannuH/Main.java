package HannuH;

import HannuH.MathUtils;
public class Main {

    public static void main(String[] args) {
        double ka, suurin, yhteenlasku;
        double[] lista = new double[]{5, 3.2, 2.5, 1.111, 4};


        yhteenlasku = MathUtils.LaskeYhteen(lista);
        suurin = MathUtils.SuurinLuku(lista);
        ka = MathUtils.LaskeKeskiarvo(lista);

        System.out.println(yhteenlasku + " " + suurin + " " + ka);




    }
}

/*

Tee ohjelma, joka testaa staattisten metodien toiminnan. Käyttäjältä ei kysytä mitään, vaan desimaalilukuja lista voidaan määritellä ohjelmassa.
 */