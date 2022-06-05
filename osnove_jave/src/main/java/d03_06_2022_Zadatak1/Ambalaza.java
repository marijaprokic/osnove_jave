package d03_06_2022_Zadatak1;

public abstract class Ambalaza {
    protected String barkod;
    protected String nazivArtikla;
    protected int netoTezina;
    protected int brutoTezina;

    public Ambalaza() {
    }

    public Ambalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public int getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(int netoTezina) {
        this.netoTezina = netoTezina;
    }

    public int getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(int brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public int tezinaPakovanja () {
        return brutoTezina-netoTezina;
    }

    public abstract double cenaArtikla ();
    public abstract void stampaj ();


}
