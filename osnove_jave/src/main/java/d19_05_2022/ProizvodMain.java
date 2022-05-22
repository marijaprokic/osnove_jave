package d19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {

        Proizvod p1 = new Proizvod();
        p1.naziv = "YSL Libre";
        p1.cena = 15000;
        p1.tezina = 100;

        Proizvod p2 = new Proizvod();
        p2.naziv = "JPG So scandal";
        p2.cena = 20000;
        p2.tezina = 120;

        p1.stampaj();
        p1.povecajCenu(2);
        System.out.println("Cena proizvoda 1 - {{ " + p1.naziv + " }} sa povećanjem iznosi: " + p1.cena);
        double cenaSaPopustom1 = p1.vratiCenuSaPopustom(20);
        System.out.println("Cena proizvoda 1 - {{ " + p1.naziv + " }} sa popustom iznosi: " + cenaSaPopustom1);
        int postarina1 = p1.racunajPostarinu();
        System.out.println("Poštarina za proizvoda 1 - {{ " + p1.naziv + " }} iznosi: " + postarina1);

        System.out.println();

        p2.stampaj();
        p2.povecajCenu(3);
        System.out.println("Cena proizvoda 2 - {{ " + p2.naziv + " }} sa povećanjem iznosi: " + p2.cena);
        double cenaSaPopustom2 = p2.vratiCenuSaPopustom(20);
        System.out.println("Cena proizvoda 2 - {{ " + p2.naziv + " }} sa popustom iznosi: " + cenaSaPopustom2);
        int postarina2 = p2.racunajPostarinu();
        System.out.println("Poštarina za proizvoda 2 - {{ " + p2.naziv + " }} iznosi: " + postarina2);

    }

}
