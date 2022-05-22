package d20_05_2022;
//2.Zad Kreirati klasu Radnik koja ima:
//        jmbg radnika
//        ime i prezime
//        broj dece (1,2,3,... ili 0 ako nema dece)
//        stepen strucne spreme (od 1 do 8)
//        godine radnog staza
//        konstuktor koji postavlja samo jmbg
//        konstuktor koji postavlja sve atribute
//        metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//        metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//        metodu koja racuna platu radnika, plata se racuna po formuli:
//        25000 + (koeficijent slozenosti + minuli rad) * 10000
//        metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//        metodu koja racuna i vraca koliko slobodnih dana radnik ima za tekucu godinu.
//        Svaki radnik godisnje ima 22 radna dana, i za svako dete plus po 2 dana
//
//        Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//        - do 10 godina 0.05
//        - od 10-20 godina 0.075
//        - preko 20 godina 0.1

//        Koeficijent slozenosti
//        - (I stepen) Nekvalifikan radnik, koeficijent: 1,03;
//        - (II stepen) Osnovno obrazovanje, koeficijent: 1,65;
//        - (III stepen) Srednje obrazovanje u trajanju od dvije do tri god., koeficijent: 2,00;
//        - (IV stepen) Kvalifikacija srednjeg opšteg i stručnog obrazovanja, koeficijent: 2,27;
//        - (V stepen) Kvalifikacija višeg stručnog obrazovanja, koeficijent: 2,88;
//        - (VI stepen) Visoko obrazovanje, koeficijent: 3,09;
//        - (VII stepen) Fakultetsko, odnosno visoko obrazovanje - Bechelor, koeficijent: 3,40;
//        - (VIII stepen) Doktorat nauka, koeficijent: 4,12.

public class Radnik {
    public String jmbg;
    public String imeIPrezime;
    public int brojDece;
    public String stepenStrucneSpreme;
    public int godineRadnogStaza;

    public Radnik() {
    }

    public Radnik(String jmbg) {
        this.jmbg = jmbg;
    }

    public Radnik(String jmbg, String imeIPrezime, int brojDece, String stepenStrucneSpreme, int godineRadnogStaza) {
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.godineRadnogStaza = godineRadnogStaza;
    }

    public double minuliRad() {
        if (godineRadnogStaza <= 10) {
            return (godineRadnogStaza * 0.05);
        }
        if (godineRadnogStaza > 10 && godineRadnogStaza <= 20) {
            return (10 * 0.05 + (godineRadnogStaza - 10) * 0.075);
        } else {
            return (10 * 0.05 + 20 * 0.075 + (godineRadnogStaza - 30) * 0.1);
        }
    }

    public double koeficijentSloženosti() {
        if (stepenStrucneSpreme.equals("I")) {
            return 1.03;
        }
        if (stepenStrucneSpreme.equals("II")) {
            return 1.65;
        }
        if (stepenStrucneSpreme.equals("III")) {
            return 2.00;
        }
        if (stepenStrucneSpreme.equals("IV")) {
            return 2.27;
        }
        if (stepenStrucneSpreme.equals("V")) {
            return 2.88;
        }
        if (stepenStrucneSpreme.equals("VI")) {
            return 3.09;
        }
        if (stepenStrucneSpreme.equals("VII")) {
            return 3.40;
        }
        if (stepenStrucneSpreme.equals("VIII")) {
            return 4.12;
        } else {
            return 0;
        }
    }

    public double plata() {
        return 25000 + (koeficijentSloženosti() + minuliRad()) * 10000;
    }

    public void daLiJeKreditnoSposoban() {
        if (plata() >= 50000) {
            System.out.println("Radnik je kreditno sposoban. ");
        } else {
            System.out.println("Radnik nije kreditno sposoban. ");
        }
    }


    public int brojDanaOdmora() {
        return 22 + brojDece * 2;
    }

}