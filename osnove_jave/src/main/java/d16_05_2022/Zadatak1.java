package d16_05_2022;

//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

public class Zadatak1 {
    public static void main(String[] args) {
        int a = stampajVrednostZa10Vecu(10);
        System.out.println("Vrednost veća za 10 od broja 10 je: " + a);
        int b = stampajVrednostZa10Vecu(-10);
        System.out.println("Vrednost veća za 10 od broja -10 je: " + b);
        int c = stampajVrednostZa10Vecu(100);
        System.out.println("Vrednost veća za 10 od broja 100 je: " + c);
        int d = stampajVrednostZa10Vecu(-5000);
        System.out.println("Vrednost veća za 10 od broja -5000 je: " + d);
    }

    static int stampajVrednostZa10Vecu(int a) {
        return a + 10;
    }
}
