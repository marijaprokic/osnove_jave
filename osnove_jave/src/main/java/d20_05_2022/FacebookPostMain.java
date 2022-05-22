package d20_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {

        FacebookPost objava1 = new FacebookPost();
        objava1.imePrezimeKorisnika = "Marija Prokić";
        objava1.imePrezimeKorisnikaObjava = "Duško Dugouško";
        objava1.tekstObjave = "Hej šefe, koj ti je vrag?";
        objava1.brojLajkova = 10;
        objava1.brojDeljenja = 20;

        FacebookPost objava2 = new FacebookPost("Marija Prokić", "Patak Dača", "Dača nedostižni, iz 23-eg i po veka!");
        objava2.brojLajkova = 1;
        objava2.brojDeljenja = 1;


        int brojLajkova1_1 = objava1.like();
        int brojLajkova1_2 = objava1.like();
        int brojLajkova1_3 = objava1.like();
        int brojLajkova1_4 = objava1.like();
        System.out.println("Broj lajkova za objavu 1 je sada: " + brojLajkova1_4);

        int brojLajkovaPosleDislajka1_1 = objava1.dislike();
        int brojLajkovaPosleDislajka1_2 = objava1.dislike();
        System.out.println("Broj lajkova za objavu 1 posle dislajkova je: " + brojLajkovaPosleDislajka1_2);

        int brojDeljenja1_1 = objava1.share();
        int brojDeljenja1_2 = objava1.share();
        System.out.println("Broj deljenja za objavu 1 je sada: " + brojDeljenja1_2);
        System.out.println();
        objava1.print();

        System.out.println();


        int brojLajkova2_1 = objava2.like();
        System.out.println("Broj lajkova za objavu 2 je sada: " + brojLajkova2_1);

        int brojLajkovaPosleDislajka2_1 = objava2.dislike();
        int brojLajkovaPosleDislajka2_2 = objava2.dislike();
        System.out.println("Broj lajkova za objavu 2 posle dislajkova je: " + brojLajkovaPosleDislajka2_2);

        int brojDeljenja2_1 = objava2.share();
        System.out.println("Broj deljenja za objavu 2 je sada: " + brojDeljenja2_1);
        System.out.println();
        objava2.print();

    }
}
