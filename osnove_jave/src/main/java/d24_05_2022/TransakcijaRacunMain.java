package d24_05_2022;

public class TransakcijaRacunMain {

    public static void main(String[] args) {

        Racun r1 = new Racun( 2000);
        r1.setBroj("111111-1");
        r1.setImePrezime("Marija Prokić");

        Racun r2 = new Racun( 1000);
        r2.setBroj("222222-2");
        r2.setImePrezime("Marko Marković");

        Transakcija transakcija1 = new Transakcija("123456", r1, r2);

        transakcija1.stampaj();

        System.out.println();


        transakcija1.izvršiTransakciju(200);
        transakcija1.stampaj();

        System.out.println();
        r1.stampaj();
        r2.stampaj();

    }
}
