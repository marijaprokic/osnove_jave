package d24_05_2022;

public class ViberReakcijaKorisnikMain_cas {
    public static void main(String[] args) {
        ViberKorisnik_cas marija = new ViberKorisnik_cas("Marija Prokić", 111111, true);
        ViberKorisnik_cas dusko = new ViberKorisnik_cas("Duško Dugouško", 333333, true);
        ViberKorisnik_cas pera = new ViberKorisnik_cas("Pera Detlić", 999999, false);
        ViberReakcija_cas reakcija1 = new ViberReakcija_cas(":-)", pera );

        ViberKorisnik_cas elmer = new ViberKorisnik_cas("Elmer lovac", 555555, false);


        ViberPoruka_cas poruka1 = new ViberPoruka_cas();
        poruka1.setTekst("Hello!");
        poruka1.setVreme("00:30");
        poruka1.setPosiljalac(marija);
        poruka1.setPrimalac(dusko);
        poruka1.setReakcija(reakcija1);

        poruka1.prikazi();

        System.out.println();

        ViberPoruka_cas poruka2 = new ViberPoruka_cas();
        poruka2.setTekst(" Sha ima? ");
        poruka2.setVreme("03:30");
        poruka2.setPosiljalac(marija);
        poruka2.setPrimalac(elmer);

        poruka2.prikazi();

    }
}
