package d31_05_2022_Zadatak1;

public class Zadatak1Main {
    public static void main(String[] args) {
        Igrac i1 = new Igrac();
        i1.setImePrezime("Patak Dača");
        i1.setJmbg("111");
        i1.setGodina(1980);
        i1.setBroj(5);
        i1.setPozicija("napadač");
        i1.setKapiten(true);


        Igrac i2 = new Igrac("Pera Detlić", "222", 1985, 7, "odbrambeni", false);

        Trener t1 = new Trener();
        t1.setImePrezime("Pevac Sofronije");
        t1.setJmbg("999");
        t1.setGodina(1990);
        t1.setGodineIskustva(20);
        t1.setTipTrenera("Pomoćni");

        Trener t2 = new Trener("Paja patak", "777", 1989, 5,"personalni");

        i1.stampaj();
        i2.stampaj();
        t1.stampaj();
        t2.stampaj();

    }

}
