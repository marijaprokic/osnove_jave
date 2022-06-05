package d30_05_2022_Zadatak2;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> nizKombinacija = new ArrayList<Kombinacija>();

    public void dodajKombinaciju(Kombinacija kombinacija) {
        this.nizKombinacija.add(kombinacija);
    }

    public boolean daLiJeDobitna(Kombinacija kombinacijaProvera) {
        boolean dobitnaJe = true;
        for (int i = 0; i < nizKombinacija.size(); i++) {
            if (nizKombinacija.get(i).daLiJeIstaKombinacija(kombinacijaProvera)) {
                dobitnaJe = true;
            } else {
                dobitnaJe = false;
            }
        }
        return dobitnaJe;
    }

    public void stampajListic () {
        for (int i = 0; i < nizKombinacija.size(); i++) {
            nizKombinacija.get(i).stampaj();
        }
        System.out.println();
    }


}
