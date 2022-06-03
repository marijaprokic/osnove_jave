package d02_06_2022_Zadatak1;

import java.util.ArrayList;

public abstract class Radnik extends Sektor {
    protected String imePrezime;
    protected ArrayList<Sektor> nizSektora = new ArrayList<>();

    public Radnik(String imePrezime) {
        this.imePrezime = imePrezime;
    }



    public abstract double plataRadnika ();

    public void zaposliUSektor (Sektor sektor) {
        this.nizSektora.add(sektor);
    }

}
