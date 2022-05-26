package d24_05_2022;

public class Racun {
    private String broj;
    private String imePrezime;
    private int trenutnoStanje;

    public Racun(int trenutnoStanje) {
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBroj() {
        return broj;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int menjaStanjeNaRačunu(int iznos) {
        this.trenutnoStanje = this.trenutnoStanje + iznos;
        return this.trenutnoStanje;
    }


    public void stampaj() {
        System.out.println(this.imePrezime + " - " + this.broj);
        System.out.println("Stanje na računu je: " + this.trenutnoStanje + " rsd.");
    }

}
