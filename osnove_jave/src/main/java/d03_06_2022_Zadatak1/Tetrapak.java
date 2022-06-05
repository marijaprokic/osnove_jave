package d03_06_2022_Zadatak1;

public class Tetrapak extends Ambalaza{
    public boolean daLiMozeDaSeReciklira;
    public int cena;

    public Tetrapak(boolean daLiMozeDaSeReciklira, int cena) {
        this.daLiMozeDaSeReciklira = daLiMozeDaSeReciklira;
        this.cena = cena;
    }

    public Tetrapak(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, boolean daLiMozeDaSeReciklira, int cena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiMozeDaSeReciklira = daLiMozeDaSeReciklira;
        this.cena = cena;
    }

    public boolean isDaLiMozeDaSeReciklira() {
        return daLiMozeDaSeReciklira;
    }

    public void setDaLiMozeDaSeReciklira(boolean daLiMozeDaSeReciklira) {
        this.daLiMozeDaSeReciklira = daLiMozeDaSeReciklira;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public double cenaArtikla () {
        double cena= 0;
        if (daLiMozeDaSeReciklira == true) {
            cena = this.tezinaPakovanja()*1.5 + this.cena;
        }else{
            cena = this.cena;
        }
        return cena;
    }

    @Override
    public void stampaj (){
        System.out.println("Barkod: " + this.barkod + ", Naziv artikla: " + this.nazivArtikla);
        System.out.println("Neto tezina: "+ this.netoTezina + ", Bruto tezina: " + this.brutoTezina);
        if (daLiMozeDaSeReciklira == true) {
            System.out.println("Materijal može da se reciklira.");
        } else {
            System.out.println("Materijal ne može da se reciklira.");
        }
        System.out.println("Cena artikla: " + this.cenaArtikla());
    }


}
