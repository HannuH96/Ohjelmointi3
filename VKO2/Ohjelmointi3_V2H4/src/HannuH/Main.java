package HannuH;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String kysy;
        int virhe = 1, lisataan = 1, poistetaan = 1;
        char kysychar = 'x';
        Opiskelija o;
        Osoite osoite;
        Opiskelijat listaus = new Opiskelijat();

        Scanner scn = new Scanner(System.in);



        //Jätin tästä koodista try-catchit tietoisesti pois, ohjelma olettaa, että opiskelijanumero on uniikki jokaisen opiskelijan kohdalla. (Kuten se oikeasti olisi)


        while (lisataan == 1)
 {       while (virhe == 1) {


            System.out.println("Haluatko lisätä opiskelijan? (k / e): ");
            kysy = scn.next();
            kysychar = kysy.charAt(0);
            if (kysy.length() > 1) {
                virhe = 1;
                System.out.println("Anna vain yksi merkki (k tai e)");

            } else if (kysychar == 'e') {

                virhe = 0;
                lisataan = 0;

            } else if (kysychar == 'k') {
                virhe = 0;

            } else {
                virhe = 1;
                System.out.println("Anna k tai e.");
            }
        }

        if(kysychar == 'k') {
            o = new Opiskelija();
            osoite = new Osoite();
            scn.nextLine();
            System.out.print("Anna etunimi: ");
            o.setEtunimi(scn.nextLine());


            System.out.print("Anna sukunimi: ");
            o.setSukunimi(scn.nextLine());


            System.out.print("Anna opiskelijanumero: ");
            o.setOpiskelijanumero(scn.nextInt());
            scn.nextLine();

            System.out.print("Anna katuosoite: ");
            osoite.setKatuosoite(scn.nextLine());

            System.out.print("Anna asuinkaupunki: ");
            osoite.setKaupunki(scn.nextLine());


            System.out.print("Anna postinumero: ");
            osoite.setPostinro(scn.nextInt());
            scn.nextLine();

            o.setOsoite(osoite);

            listaus.lisaaOpiskelija(o);

            virhe = 1;
            kysychar = 'x';


        }


}

        //Kokeilun vuoksi testataan Kuopiolaisilla
        listaus.tulostaAsukkaat("Kuopio");

        virhe = 1;
        while (poistetaan == 1)
        {       while (virhe == 1) {


            System.out.println("Haluatko poistaa opiskelijan? (k / e): ");
            kysy = scn.next();
            kysychar = kysy.charAt(0);
            if (kysy.length() > 1) {
                virhe = 1;
                System.out.println("Anna vain yksi merkki (k tai e)");

            } else if (kysychar == 'e') {

                virhe = 0;
                poistetaan = 0;

            } else if (kysychar == 'k') {
                virhe = 0;

            } else {
                virhe = 1;
                System.out.println("Anna k tai e.");
            }
        }

            if(kysychar == 'k') {
                o = new Opiskelija();

                scn.nextLine();

                System.out.print("Anna poistettavan opiskelijan opiskelijanumero: ");
                o.setOpiskelijanumero(scn.nextInt());
                scn.nextLine();

                listaus.poistaOpiskelija(o);

                virhe = 1;
                kysychar = 'x';


            }


        }

        listaus.tulostaAsukkaat("Kuopio");
    }
}
/*
Ensimmäisessä tehtävässä teit Opiskelija-luokan. Jatka sitä tehtävää tehdessäsi.

Eriytä opiskelijan osoitetiedot omaksi luokakseen Osoite ja hyödynnä tuota luokkaa Opiskelija-luokassa - done
Testaa, että toimii.

Tee erillinen luokka Opiskelijat, joka pitää sisällään listan, jossa on Opiskelija -olioita.
Tee tuolle uudelle luokalle seuraavat metodit:
- lisääOpiskelija(Opiskelija o), joka lisää opiskelija-olion listaan - done
- poistaOpiskelija(Opiskelija o), joka poistaa opiskelija-olion listasta - done
- tulostaAsukkaat(String kaupunki), joka tulostaa ne opiskelijat, jotka asuvat kaupungissa 'kaupunki' - done

Edellenkään ei tarvitse tehdä monimutkaista käyttöliittymää. Riittää kun testaat pääohjelman kautta, että metodit toimivat.
 */