package d23_05_2022;

public class Proizvod {

    private String sifra;
    private String naziv;
    private int cena;

    public Proizvod(String sifra, String naziv, int cena) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cena = cena;
    }


    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getCenaKg() {
        return cena;
    }


    public double getCenaLb() {
        return this.cena * 2.2046;
    }

    public void stampaj() {
        System.out.println("( " + this.sifra + " )-( " + this.naziv + " )");
    }

}

