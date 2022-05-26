package d24_05_2022;

public class Transakcija {
    private String id;
    private Racun racunSaKogSePrenosi;
    private Racun racunNaKojiSePrenosi;

    public Transakcija(String id, Racun racunSaKogSePrenosi, Racun racunNaKojiSePrenosi) {
        this.id = id;
        this.racunSaKogSePrenosi = racunSaKogSePrenosi;
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getRacunSaKogSePrenosi() {
        return racunSaKogSePrenosi;
    }

    public void setRacunSaKogSePrenosi(Racun racunSaKogSePrenosi) {
        this.racunSaKogSePrenosi = racunSaKogSePrenosi;
    }

    public Racun getRacunNaKojiSePrenosi() {
        return racunNaKojiSePrenosi;
    }

    public void setRacunNaKojiSePrenosi(Racun racunNaKojiSePrenosi) {
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }

    private int racunanjeProvizije(int visinaTransakcije) {
        if (visinaTransakcije <= 4500) {
            return 45;
        } else {
            return visinaTransakcije / 100;
        }
    }


    public void izvršiTransakciju(int visinaTransakcije) {
        if (this.racunSaKogSePrenosi.getTrenutnoStanje() > visinaTransakcije + this.racunanjeProvizije(visinaTransakcije)) {
            this.racunSaKogSePrenosi.menjaStanjeNaRačunu(-(visinaTransakcije + this.racunanjeProvizije(visinaTransakcije)));
            this.racunNaKojiSePrenosi.menjaStanjeNaRačunu(visinaTransakcije);
        }
    }

    public void stampaj(){
        System.out.println("ID transakcije: " + this.id);
        this.racunSaKogSePrenosi.stampaj();
        this.racunNaKojiSePrenosi.stampaj();
    }

}
