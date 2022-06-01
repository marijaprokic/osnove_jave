package d31_05_2022_Zadatak1;

public class Trener extends Osoba{
    private int godineIskustva;
    private String tipTrenera;
    public Trener() {
      super();
    }

    public Trener(String imePrezime, String jmbg, int godina, int godineIskustva, String tipTrenera) {
        super(imePrezime, jmbg, godina);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println(this.godineIskustva + ", " + this.tipTrenera);

    }
}
