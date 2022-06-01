package d31_05_2022_Zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private boolean kapiten;
    private ArrayList<Karton> nizKartona = new ArrayList<>();

    public Igrac(int broj, String pozicija, boolean kapiten) {
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public void dodajKarton(Karton karton1) {
        nizKartona.add(karton1);
    }

    public int brojZutih() {
        int brojac = 0;
        for (int i = 0; i < nizKartona.size(); i++) {
            if (nizKartona.get(i).getTipKartona().equals("žuti")) {
                brojac = brojac + 1;
            }
        }
        return brojac;
    }

    public int brojCrvenih() {
        int brojac = 0;
        for (int i = 0; i < nizKartona.size(); i++) {
            if (nizKartona.get(i).getTipKartona().equals("crveni")) {
                brojac = brojac + 1;
            }
        }
        return brojac;
    }

    public void stampaj () {
        super.stampaj();
    }

}
