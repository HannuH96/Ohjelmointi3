package HannuH;

public class Opiskelija {
    private String etunimi;
    private  String sukunimi;
    private int opiskelijaNro;
    private String osoite;

    @Override
    public String toString() {
        return "Opiskelija{" +
                "etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", opiskelijaNro=" + opiskelijaNro +
                ", osoite='" + osoite + '\'' +
                '}';
    }

    public Opiskelija() { }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getOpiskelijaNro() {
        return opiskelijaNro;
    }

    public void setOpiskelijaNro(int opiskelijaNro) {
        this.opiskelijaNro = opiskelijaNro;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }
}
