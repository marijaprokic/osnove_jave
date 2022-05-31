package d30_05_2022;

import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String imePrezime;
    private String tipStudija;
    private ArrayList <Ispit> nizIspita = new ArrayList<Ispit>();

    public Student(int brojIndeksa, String imePrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public void dodajIspit (Ispit ispit1) {
        this.nizIspita.add(ispit1);
    }

    public double racunajProsek () {
        int suma = 0;
        for (int i = 0; i < nizIspita.size(); i++) {
          suma = suma + nizIspita.get(i).getOcena();
        }
        return suma/(nizIspita.size());
    }

    public void stampaj () {
        System.out.println("( " + this.brojIndeksa + " )-( "
                + this.imePrezime +  " )-( "
                + this.tipStudija + " )" );
        for (int i = 0; i < nizIspita.size(); i++) {
            nizIspita.get(i).stampaj();
        }
        System.out.println("Prosečna ocena: " + this.racunajProsek());
    }
}
