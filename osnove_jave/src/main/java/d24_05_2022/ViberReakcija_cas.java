package d24_05_2022;

public class ViberReakcija_cas {
    private String reakcija;
    private ViberKorisnik_cas reagovao;

    public ViberReakcija_cas(String reakcija, ViberKorisnik_cas reagovao) {
        this.reakcija = reakcija;
        this.reagovao = reagovao;
    }

    public String getReakcija() {
        return reakcija;
    }

    public void setReakcija(String reakcija) {
        this.reakcija = reakcija;
    }

    public ViberKorisnik_cas getReagovao() {
        return reagovao;
    }

    public void setReagovao(ViberKorisnik_cas reagovao) {
        this.reagovao = reagovao;
    }
}
