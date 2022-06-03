package p02_06_2022_Zadatak5;

public class Zadatak5Main {
    public static void main(String[] args) {

        Dodatak d1 = new Dodatak("lešnik", 50);
        Dodatak d2 = new Dodatak("čokolada", 30);
        Dodatak d3 = new Dodatak("bananice", 60);
        Dodatak d4 = new Dodatak("karamel", 45);
        Dodatak d5 = new Dodatak("keks", 55);
        IcePoint sladoled1 = new IcePoint("čokolada", false);
        IcePoint sladoled2 = new IcePoint("vanila", false);
        IcePoint sladoled3 = new IcePoint("čokolada", true);

        sladoled1.ubaciDodatak(d1);
        sladoled1.ubaciDodatak(d2);
        sladoled1.ubaciDodatak(d3);
        sladoled1.racunajCenuDodataka();
        sladoled1.racunajUkupnuCenu();

        sladoled2.ubaciDodatak(d4);
        sladoled2.ubaciDodatak(d5);
        sladoled2.racunajCenuDodataka();
        sladoled2.racunajUkupnuCenu();

        sladoled3.ubaciDodatak(d4);
        sladoled3.racunajCenuDodataka();
        sladoled3.racunajUkupnuCenu();

        Dodatak p1 = new Dodatak("mocarela", 150);
        Dodatak p2 = new Dodatak("masline", 120);
        Dodatak p3 = new Dodatak("bosiljak", 80);
        Dodatak p4 = new Dodatak("kapar", 130);
        Dodatak p5 = new Dodatak("pelat", 120);

        Pica pica1 = new Pica(100);
        Pica pica2 = new Pica(120);
         pica1.ubaciDodatak(p1);
        pica1.ubaciDodatak(p2);
        pica1.ubaciDodatak(p3);
        pica1.racunajCenuDodataka();
        pica1.racunajUkupnuCenu();

        pica2.ubaciDodatak(p4);
        pica2.ubaciDodatak(p5);
        pica2.racunajCenuDodataka();
        pica2.racunajUkupnuCenu();

        sladoled1.stampaj();
        sladoled2.stampaj();
        sladoled3.stampaj();

        pica1.stampaj();
        pica2.stampaj();

    }

}
