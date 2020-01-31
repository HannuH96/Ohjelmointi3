package HannuH;

import java.util.Scanner;

public class OpiskelijaUtils {
    public static Object TarkastaTiedot(Opiskelija o) {
        if (o.getEtunimi() == null || o.getEtunimi().isEmpty()
                || o.getSukunimi() == null || o.getSukunimi().isEmpty()
                || o.getOpiskelijaNro() == 0
                || o.getOsoite() == null || o.getOsoite().isEmpty()) {
            return null;
        }
        o.setEtunimi(convert(o.getEtunimi()));
        o.setSukunimi(convert(o.getSukunimi()));
        return o;
    }
    static String convert(String str)
    {
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            if (i == 0 && ch[i] != ' ' ||
                    ch[i] != ' ' && ch[i - 1] == ' ') {

                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
            else if (ch[i] >= 'A' && ch[i] <= 'Z')
                // Convert into Lower-Case
                ch[i] = (char)(ch[i] + 'a' - 'A');
        }
        String st = new String(ch);
        return st;
    }
    static Opiskelija kysyTiedot(Opiskelija o) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Syötä opiskelijan etunimi: ");
        o.setEtunimi(sc.nextLine());
        System.out.println("Syötä opiskelijan sukunimi: ");
        o.setSukunimi(sc.nextLine());
        System.out.println("Syötä opiskelijan opiskelijanumero: ");
        o.setOpiskelijaNro(sc.nextInt());
        sc.nextLine();
        System.out.println("Syötä opiskelijan osoite: ");
        o.setOsoite(sc.nextLine());

        return o;
    }

}
