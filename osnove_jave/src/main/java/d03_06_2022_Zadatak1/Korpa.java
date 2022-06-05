package d03_06_2022_Zadatak1;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

    public void dodajAmbalazu(Ambalaza a) {
        nizAmbalaza.add(a);
    }

    public void izbaciAmbalazu(String barkod) {
        Ambalaza izbaci = nizAmbalaza.get(0);
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            if (nizAmbalaza.get(i).getBarkod().equals(barkod)) {
                nizAmbalaza.remove(i);
            }
        }
    }

    private double cenaSvihAmbalaza(int popust) {
        double cenaSvihAmbalaza = 0;
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            double iznosPopusta = nizAmbalaza.get(i).cenaArtikla() * popust / 100;
            cenaSvihAmbalaza = cenaSvihAmbalaza + (nizAmbalaza.get(i).cenaArtikla()-iznosPopusta);
        }
        return cenaSvihAmbalaza;
    }

    public double ukupnaCenaKorpe(SuperKartica kartica) {
        return cenaSvihAmbalaza(kartica.getPopust());
    }

    public void stampajKorpu () {
        for (int i = 0; i < nizAmbalaza.size(); i++) {
            nizAmbalaza.get(i).stampaj();
            System.out.println();
        }
    }

}
