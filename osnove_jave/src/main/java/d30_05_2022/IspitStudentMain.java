package d30_05_2022;

public class IspitStudentMain {

    public static void main(String[] args) {


        Ispit statika = new Ispit("Statika", 10, "Patak Dača");
        Ispit matemaika = new Ispit("Matematika", 9, "Elmer lovac");
        Ispit istorijaArhitekture = new Ispit("Istorija arhitekture", 10, "Tom i Dzeri");
        Ispit mehanika = new Ispit("Mehanika", 5, "Miki maus");
        Student marija = new Student(1111, "Marija Prokić", "master");

        marija.dodajIspit(statika);
        marija.dodajIspit(matemaika);
        marija.dodajIspit(istorijaArhitekture);
        marija.dodajIspit(mehanika);

        marija.racunajProsek();

        marija.stampaj();


    }
}
