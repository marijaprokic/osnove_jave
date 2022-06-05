package d30_05_2022_Zadatak2;

public class Zadatak2Main {

    public static void main(String[] args) {


        Kombinacija prva = new Kombinacija("a", 5, 8, 35, 25, 12, 10, 9);
        Kombinacija druga = new Kombinacija("b", 5, 4, 35, 17, 15, 1, 4);
        Kombinacija treca = new Kombinacija("c", 2, 8, 18, 17, 11, 10, 9);
        Kombinacija cetvrta = new Kombinacija("d", 5, 10, 28, 26, 13, 1, 5);
        Kombinacija peta = new Kombinacija("e", 8, 7, 36, 26, 6, 12, 15);

        Listic listic1 = new Listic();
        listic1.dodajKombinaciju(prva);
        listic1.dodajKombinaciju(druga);
        listic1.dodajKombinaciju(treca);
        listic1.dodajKombinaciju(cetvrta);
        listic1.dodajKombinaciju(peta);



        listic1.stampajListic();

        if (prva.daLiJeIstaKombinacija(treca)) {
            System.out.println("Kombinacija je dobitna.");
        } else {
            System.out.println("Kombinacija nije dobitna.");
        }

    }
}