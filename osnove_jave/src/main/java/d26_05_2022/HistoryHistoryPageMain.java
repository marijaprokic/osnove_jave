package d26_05_2022;

public class HistoryHistoryPageMain {

    public static void main(String[] args) {

        HistoryPage page1 = new HistoryPage("w3schools", "https://www.w3schools.com/", 12, 20);
        HistoryPage page2 = new HistoryPage("wikipedia", "https://www.wikipedia.org/", 16, 30);
        HistoryPage page3 = new HistoryPage("imdb", "https://www.imdb.com/", 18, 45);

        History istorija = new History();

        istorija.otvoriStranicu(page1);
        istorija.otvoriStranicu(page2);
        istorija.otvoriStranicu(page3);
        istorija.sacuvajKredencijale("imdb", "Marija", "bzvz");
        istorija.obrisiKolaciceSat(13, 10);
        istorija.pogledajIstoriju();
        istorija.obrisiIstoriju();
        istorija.pogledajIstoriju();


    }
}
