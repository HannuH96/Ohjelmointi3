package HannuH;

public class Main {

    public static void main(String[] args) {
        Opiskelija o = new Opiskelija();
        OpiskelijaUtils.kysyTiedot(o);
        if (OpiskelijaUtils.TarkastaTiedot(o) == null)
            System.out.println("Virhe syötteessä");
        else
            System.out.println(o.toString());
    }
}
