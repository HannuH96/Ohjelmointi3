package HannuH;

import java.util.ArrayList;
import java.util.List;

public class Opiskelijat {
    public List<Opiskelija> lista = new ArrayList<>();


    public void lisaaOpiskelija(Opiskelija o)
    {
        lista.add(o);

    }

    public void poistaOpiskelija(Opiskelija o)
    {
        int sijainti=87654785, i = 0;
        for(Opiskelija k: lista)
        {
            int n1 = k.getOpiskelijanumero();
            int n2 = o.getOpiskelijanumero();
            if(n1 == n2)
            {
                sijainti = i;
            }

            i++;

        }
        if(sijainti != 87654785) {
            lista.remove(sijainti);
        }
    }

    public void tulostaAsukkaat(String kaupunki)
    {
        Osoite osoite;
        for (Opiskelija o: lista)
        {
            osoite = o.getOsoite();
            if(osoite.kaupunki.equals(kaupunki))
            {
                String opiskelijatiedot = o.toString();
                System.out.println(opiskelijatiedot);
            }
        }
    }
}
