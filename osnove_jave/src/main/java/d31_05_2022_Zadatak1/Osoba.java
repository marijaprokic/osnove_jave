package d31_05_2022_Zadatak1;

public class Osoba {
    protected String imePrezime;
    protected String jmbg;
    protected int godina;

    public Osoba() {
    }

    public Osoba(String imePrezime, String jmbg, int godina) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.godina = godina;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void stampaj () {
        System.out.println(this.imePrezime + ", " + this.jmbg + ", " + this.godina);
    }
}
