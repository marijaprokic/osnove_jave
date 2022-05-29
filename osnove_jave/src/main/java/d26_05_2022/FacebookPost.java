package d26_05_2022;
//Kreirati klasu FacebookPost koja ima:
//        ime i prezime korisnika koji je stavio oglas
//        tekst objave
//        niz reakcija
//        metodu reaguj, koja dodaje reakciju u niz
//        (modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//        Primer: Milan - lajkuje
//        Nemanja - lajkuje
//        Milan - daje srce
//        Post ima lajk od Nemanje i srce od Milana.
//        privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//        metodu stampaj koja stampa podatke u formatu:
//        ime i prezime
//        tekst objave
//        Smajli 10 | Like 15 | Srce 2


import java.util.ArrayList;

public class FacebookPost {
    private String imePrezimeObjavio;
    private String tekst;
    private ArrayList<Reakcija> nizReakcija = new ArrayList<Reakcija>();

    public FacebookPost(String tekst, String imePrezimeObjavio) {
        this.imePrezimeObjavio = imePrezimeObjavio;
        this.tekst = tekst;
        this.nizReakcija = nizReakcija;
    }


    public void reaguj(Reakcija novaReakcija) {
        this.nizReakcija.add(novaReakcija);
        for (int i = 0; i < nizReakcija.size(); i++) {
            if (this.nizReakcija.get(i).getImePrezime().equals(novaReakcija.getImePrezime())) {
                nizReakcija.remove(i);
            }
        }
        this.nizReakcija.add(novaReakcija);
    }


    private int prebroj(String tipReakcije) {
        int brojac = 0;
        for (int i = 0; i < nizReakcija.size(); i++) {
            if (this.nizReakcija.get(i).getReakcijaNaPost().equals(tipReakcije)) {
                brojac = brojac + 1;
            }
        }
        return brojac;
    }

    public void stampaj() {
        System.out.println(this.imePrezimeObjavio);
        System.out.println(this.tekst);
        System.out.print("Smajli: " + this.prebroj("smajli") + " | ");
        System.out.print("Like: " + this.prebroj("like") + " | ");
        System.out.println("Srce: " + this.prebroj("srce"));
    }

}
