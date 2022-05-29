package d26_05_2022;

import java.util.ArrayList;

public class Pasta {
    private Sastojak sastojak;

    ArrayList<Sastojak> nizPasta = new ArrayList<Sastojak>();

    public ArrayList<Sastojak> getPasta() {
        return nizPasta;
    }

    public void setPasta(ArrayList<Sastojak> pasta) {
        this.nizPasta = pasta;
    }



    public void dodaj( Sastojak sastojakZaDodavanje) {
            this.nizPasta.add(sastojakZaDodavanje);
        }


    public int računajCenu() {
        int cena = 0;
        for (int i = 0; i < nizPasta.size(); i++) {
            cena = cena + this.nizPasta.get(i).getCena();
        }
        return cena;
    }


    public void brisi (Sastojak sastojakZaBrisanje){
        for (int i = 0; i < nizPasta.size(); i++) {
            if (nizPasta.get(i).getNaziv().equals (sastojakZaBrisanje.getNaziv())) {
                nizPasta.remove(i);
            }
        }
    }

    public void stampaj () {
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < nizPasta.size(); i++) {
         nizPasta.get(i).stampajPodatke();
        }
    }

}
