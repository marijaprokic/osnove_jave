package d16_05_2022;

//(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.


import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int a = s.nextInt();
        System.out.print("Unesite drugi broj: ");
        int b = s.nextInt();
        System.out.print("Unesite treći broj: ");
        int c = s.nextInt();
        int najmanji = funkcijaNajmanjiBroj(a,b,c);
        System.out.println("Najmanji broj od unetih " + a + ", " + b + " i " + c + " je: " + najmanji);
    }

    static int funkcijaNajmanjiBroj(int a, int b, int c) {
        int najmanji = a;
        if (b < najmanji) {
            najmanji = b;
        }
        if (c < najmanji){
            najmanji = c;
        } else {
            najmanji = a;
        }
        return najmanji;
    }
}


