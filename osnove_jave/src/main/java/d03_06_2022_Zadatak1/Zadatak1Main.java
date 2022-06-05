package d03_06_2022_Zadatak1;

public class Zadatak1Main {
    public static void main(String[] args) {

        Tetrapak t1 = new Tetrapak("111", "mleko", 40, 50, true, 200);
        Tetrapak t2 = new Tetrapak("222", "sok", 50, 90, true, 250);
        Tetrapak t3 = new Tetrapak("333", "jogurt", 100, 150, true, 300);

        StaklenaAmbalaza s1 = new StaklenaAmbalaza("444", "vino", 500,
                600, 100, true, 500);
        StaklenaAmbalaza s2 = new StaklenaAmbalaza("555", "viski", 880,
                1000, 0, false, 3500);
        StaklenaAmbalaza s3 = new StaklenaAmbalaza("666", "vodka", 1000,
                1300, 0, false, 5500);

        Korpa korpa = new Korpa ();
        korpa.dodajAmbalazu(t1);
        korpa.dodajAmbalazu(t2);
        korpa.dodajAmbalazu(t3);
        korpa.dodajAmbalazu(s1);
        korpa.dodajAmbalazu(s2);
        korpa.dodajAmbalazu(s3);

        SuperKartica superKartica = new SuperKartica(123, "Patak Dača", 20);
        superKartica.stampaj();
        korpa.stampajKorpu();
        System.out.println("Ukupna cena korpe sa popustom: "+ korpa.ukupnaCenaKorpe(superKartica));
        System.out.println();

        korpa.izbaciAmbalazu("222");
        korpa.stampajKorpu();
        System.out.println("Ukupna cena korpe posle izbacivanja sa popustom: "+ korpa.ukupnaCenaKorpe(superKartica));

    }
}
