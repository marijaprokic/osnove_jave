package d20_05_2022;

//1.Kreirati klasu FacebookPost koja ima:
//        Od atributa:
//        ime i prezime korisnika koji je objavio post
//        ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da
//        postavite objavu na tudjem profilu)
//        tekst objave
//        broj lajkova
//        broj deljenja
//        Konstruktore:
//        difoltni konstuktor
//        konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen
//        i tekst objave
//        Od metoda:
//        like(), koja povecava broj lajkova za 1.
//        dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//        share(), koja povecava broj deljenja za 1
//        print(), koja stampa objavu u formatu:
//        (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        (tekst objave)
//        Likes (broj lajkova) | Shares (broj deljenja)
//
//        U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//        Primer stampanja:
//        Milan Jovanovic >>> Pera Peric
//        Ovo je tekst objave
//        Likes 3 | Shares 1


public class FacebookPost {
    public String imePrezimeKorisnika;
    public String imePrezimeKorisnikaObjava;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;


    public FacebookPost() {
    }

    public FacebookPost (String imePrezimeKorisnika, String imePrezimeKorisnikaObjava, String tekstObjave) {
        this.imePrezimeKorisnika = imePrezimeKorisnika;
        this.imePrezimeKorisnikaObjava = imePrezimeKorisnikaObjava;
        this.tekstObjave = tekstObjave;
    }


    public int like() {
        this.brojLajkova = this.brojLajkova + 1;
        return this.brojLajkova;
    }

    public int dislike() {
        if (this.brojLajkova >= 1) {
            this.brojLajkova = this.brojLajkova - 1;
            return this.brojLajkova;
        } else {
            return 0;
        }
    }

        public int share() {
            this.brojDeljenja =  this.brojDeljenja + 1;
            return this.brojDeljenja;
        }

        public void print () {
            System.out.println(this.imePrezimeKorisnika + " >>> " + this.imePrezimeKorisnikaObjava);
            System.out.println(this.tekstObjave);
            System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
        }


}
