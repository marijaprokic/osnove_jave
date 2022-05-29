package d24_05_2022;

import p24_05_2022.Korisnik;

public class ViberPoruka_cas {
    private String tekst;
    private String vreme;

    private ViberKorisnik_cas posiljalac;
    private ViberKorisnik_cas primalac;
    private ViberReakcija_cas reakcija;


    public ViberPoruka_cas() {
    }

    public ViberPoruka_cas(String tekst, ViberKorisnik_cas posiljalac, ViberKorisnik_cas primalac) {
        this.tekst = tekst;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.reakcija = reakcija;

    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public ViberKorisnik_cas getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(ViberKorisnik_cas posiljalac) {
        this.posiljalac = posiljalac;
    }

    public ViberKorisnik_cas getPrimalac() {
        return primalac;
    }

    public void setPrimalac(ViberKorisnik_cas primalac) {
        this.primalac = primalac;
    }

    public ViberReakcija_cas getReakcija() {
        return reakcija;
    }

    public void setReakcija(ViberReakcija_cas reakcija) {
        this.reakcija = reakcija;
    }

    public void prikazi() {
        System.out.print("From: " + this.posiljalac.getImePrezime() + " * ");
        if (this.posiljalac.isDaLiJeAktivan() == true) {
            System.out.print(" Active now ");
        } else {
            System.out.print(" Not active ");
        }
        System.out.println(" - at: " + this.vreme);
        System.out.print("Tekst poruke: " + this.tekst);
        if (this.reakcija != null) {
            System.out.print(" Reakcija: " + this.reakcija.getReakcija());
            System.out.println(" from: " + this.reakcija.getReagovao().getImePrezime());
        }
    }


}
