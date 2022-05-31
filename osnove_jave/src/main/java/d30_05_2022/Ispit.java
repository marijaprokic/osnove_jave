package d30_05_2022;

public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String profesor;

    public Ispit(String nazivPredmeta, int ocena, String profesor) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean daLiJePolozio(int ocena) {
        if (ocena <= 6 && ocena <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public void stampaj() {
        System.out.print("(" + this.nazivPredmeta + " )-( ");
        System.out.println(this.profesor + ")-( " + this.ocena + " )");
    }
}