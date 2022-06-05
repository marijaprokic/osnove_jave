package d03_06_2022_Zadatak1;

public class StaklenaAmbalaza extends Ambalaza{
    public int kaucija;
    public boolean daLiSePlacaKaucija;
    public int osnovnaCena;

    public StaklenaAmbalaza(int kaucija, boolean daLiSePlacaKaucija, int osnovnaCena) {
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, int kaucija, boolean daLiSePlacaKaucija, int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla (){
        double cena=0;
        if (daLiSePlacaKaucija == true) {
            cena=this.osnovnaCena*1.2 + this.kaucija;
        }else {
            cena = this.osnovnaCena*1.2;
        }
        return cena;
    }

    @Override
    public void stampaj (){
        System.out.println("Barkod: " + this.barkod + ", Naziv artikla: " + this.nazivArtikla);
        System.out.println("Neto tezina: "+ this.netoTezina + ", Bruto tezina: " + this.brutoTezina);
        if (daLiSePlacaKaucija == true) {
            System.out.println("Plaća se kaucija.");
        } else {
            System.out.println("Ne plaća se kaucija.");
        }
        System.out.println("Osnovna cena artkla: " + this.osnovnaCena);
        System.out.println("Cena artikla: " + this.cenaArtikla());
    }

}
