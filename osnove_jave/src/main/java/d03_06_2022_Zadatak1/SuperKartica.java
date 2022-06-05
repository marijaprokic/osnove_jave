package d03_06_2022_Zadatak1;

public class SuperKartica {

    public int brojKartice;
    public String imePrezime;
    public int popust;

    public SuperKartica() {
    }

    public SuperKartica(int brojKartice, String imePrezime, int popust) {
        this.brojKartice = brojKartice;
        this.imePrezime = imePrezime;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void stampaj (){
        System.out.println("Broj kartice: ( " + this.brojKartice + " ),( " + this.imePrezime + " )");

    }
}
