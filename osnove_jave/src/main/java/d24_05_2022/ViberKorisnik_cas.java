package d24_05_2022;

public class ViberKorisnik_cas {
    private String imePrezime;
    private int telefon;
    private boolean daLiJeAktivan;

    public ViberKorisnik_cas() {
    }

    public ViberKorisnik_cas(String imePrezime, int telefon, boolean daLiJeAktivan){
    this.imePrezime =imePrezime;
    this.telefon =telefon;
    this.daLiJeAktivan =daLiJeAktivan;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public boolean isDaLiJeAktivan() {
        return daLiJeAktivan;
    }

    public void setDaLiJeAktivan(boolean daLiJeAktivan) {
        this.daLiJeAktivan = daLiJeAktivan;
    }
}

