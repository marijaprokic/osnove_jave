package d16_05_2022;

//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri
//        funkcije vraca novu vrednost koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.


import java.util.Scanner;

public class Zadatak2_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite prvi broj od 1 do 9: ");
        int x = s.nextInt();
        System.out.println("Unesite drugi broj od 1 do 9: ");
        int y = s.nextInt();
        int novaVrednost = funkcija(x, y);
        System.out.println("Za brojeve: " + x + " i " + y + " nova vrednost je: " + novaVrednost);
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
