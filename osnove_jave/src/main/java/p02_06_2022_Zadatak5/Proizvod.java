package p02_06_2022_Zadatak5;

import java.util.ArrayList;

public abstract class Proizvod {

    protected ArrayList<Dodatak> nizDodataka = new ArrayList<>();

    public void ubaciDodatak(Dodatak dodatak1) {
        nizDodataka.add(dodatak1);
    }

    protected int racunajCenuDodataka() {
        int cena = 0;
        for (int i = 0; i < nizDodataka.size(); i++) {
            cena = cena + nizDodataka.get(i).cenaDodatka;
        }
        return cena;
    }

    public abstract int racunajUkupnuCenu();

    public abstract void stampaj();

}
