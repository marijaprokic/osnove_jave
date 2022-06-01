package d26_05_2022;

//Klasu History koja ima:
//        niz stranica koje su posecene
//        metoda otvori stranicu koja dodaje novi historypage u niz.
//        metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//        metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//        metoda obrisi istoriju - metoda brise celu istoriju
//        metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//        metoda pogledajIstoriju - stampa sve posecene stranice
//        metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//        metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena.
//        Metoda kao parametar prima trenutno vreme (sat i minut)

import java.util.ArrayList;

public class History {
    private ArrayList<HistoryPage> niz = new ArrayList<HistoryPage>();



    public void otvoriStranicu(HistoryPage stranica) {
        niz.add(stranica);
    }

    public void obrisiStranicu(String link) {
        for (int i = 0; i < niz.size(); i++) {
            if (this.niz.get(i).getLink().equals(link)) {
                niz.remove(i);
            }
        }
    }

    public void obrisiKolacice(String link) {
        for (int i = 0; i < niz.size(); i++) {
            if (this.niz.get(i).getLink().equals(link)) {
                this.niz.get(i).obrišiKolacice();
            }
        }
    }

    public void obrisiIstoriju() {
        for (int i = niz.size()-1; i > 0; i--) {
            niz.remove(i);
        }
    }

    public void sacuvajKredencijale(String nazivStranice, String usernameStranice, String passwordStranice) {
        for (int i = 0; i < niz.size(); i++) {
            if (niz.get(i).getNaziv().equals(nazivStranice)) {
                this.niz.get(i).sacuvajKredencijale(usernameStranice, passwordStranice);
            }
        }
    }

    public void pogledajIstoriju() {
        for (int i = 0; i < niz.size(); i++) {
            this.niz.get(i).stampaj();
        }
    }

    public void obrisiSveKolacice() {
        for (int i = 0; i < niz.size(); i++) {
            this.niz.get(i).obrišiKolacice();
        }
    }

    public void obrisiKolaciceSat(int satSada, int minutSada) {
        for (int i = 0; i < niz.size(); i++) {
            if ((this.niz.get(i).getSat() == (satSada - 1) && this.niz.get(i).getMinut() > (minutSada - 1)) ||
                    (this.niz.get(i).getSat() == satSada  && this.niz.get(i).getMinut() <= (minutSada - 1)) ) {
                this.niz.get(i).obrišiKolacice();
            }
        }
    }

}
