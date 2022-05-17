package d16_05_2022;

//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri
//        funkcije vraca novu vrednost koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.


public class Zadatak2 {
    public static void main(String[] args) {

        int novaVrednost1 = funkcija(9, 3);
        System.out.println("Za brojeve 9 i 3 nova vrednost je: " + novaVrednost1);
        int novaVrednost2 = funkcija(8, 1);
        System.out.println("Za brojeve 8 i 1 nova vrednost je: " + novaVrednost2);
        int novaVrednost3 = funkcija(1, 2);
        System.out.println("Za brojeve 1 i 2 nova vrednost je: " + novaVrednost3);
    }

    static int funkcija(int a, int b) {
        if (a <= 9 && a!=0 && b <= 9 && b!=0) {
            int c = a * 10 + b;
            return c;
        } else {
            return 0;
        }

    }
}
