package p02_06_2022_Zadatak5;

public class Dodatak {
    protected String nazivDodatka;
    protected int cenaDodatka;

    public Dodatak(String nazivDodatka, int cenaDodatka) {
        this.nazivDodatka = nazivDodatka;
        this.cenaDodatka = cenaDodatka;
    }

    public String getNazivDodatka() {
        return nazivDodatka;
    }

    public void setNazivDodatka(String nazivDodatka) {
        this.nazivDodatka = nazivDodatka;
    }

    public int getCenaDodatka() {
        return cenaDodatka;
    }

    public void setCenaDodatka(int cenaDodatka) {
        this.cenaDodatka = cenaDodatka;
    }

    public void stampaj () {
        System.out.println("( " + this.nazivDodatka + " )( " + this.cenaDodatka);
    }

}
