package d31_05_2022_Zadatak2;

public class Zadatak2Main {
    public static void main(String[] args) {

        Igrac igrac1 = new Igrac("Marija", "111111", 1980, 9, "pozicija1", true);
        Karton k1 = new Karton("žuti");
        Karton k2 = new Karton("žuti");
        Karton k3 = new Karton("žuti");
        Karton k4 = new Karton("crveni");
        Karton k5 = new Karton("crveni");

        igrac1.dodajKarton(k1);
        igrac1.dodajKarton(k2);
        igrac1.dodajKarton(k3);
        igrac1.dodajKarton(k4);
        igrac1.dodajKarton(k5);

        System.out.println("Broj žutih kartona je: " + igrac1.brojZutih());
        System.out.println("Broj žutih kartona je: " + igrac1.brojCrvenih());
        igrac1.stampaj();
    }
}
