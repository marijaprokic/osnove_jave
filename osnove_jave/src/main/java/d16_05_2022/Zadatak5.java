package d16_05_2022;

//(Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1


import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj M: ");
        int m = s.nextInt();
        System.out.print("Unesite broj N: ");
        int n = s.nextInt();
        funkcijaBrojanja(m, n);
    }

    static void funkcijaBrojanja(int m, int n) {
        int brojac = 0;
        for (int i = m + 1; i < n; i++) {
            brojac = brojac + 1;
        }
        System.out.println("Izmedju brojeva " + m + " i " + n + " ima " + brojac + " celih brojeva");
    }
}

