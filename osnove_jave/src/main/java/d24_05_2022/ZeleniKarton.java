package d24_05_2022;

public class ZeleniKarton {

    private String imePrezime;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String profesor;
    private int ocena;

    public ZeleniKarton() {
    }

    public ZeleniKarton(String imePrezime,
                        int brojIndeksa,
                        String nazivPredmeta,
                        String profesor,
                        int ocena) {
        this.imePrezime = imePrezime;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean daLiJePolozio() {
        if (this.ocena < 5) {
            return true;
        } else {
            return false;
        }
    }

    public void stampaj() {
        System.out.println("( " + this.nazivPredmeta + " ) - ( " + this.ocena + " )");
        System.out.println("Student: " + this.imePrezime + ", broj indeksa: " + this.brojIndeksa);
        System.out.println("Profesor: " + this.profesor);
    }


}
