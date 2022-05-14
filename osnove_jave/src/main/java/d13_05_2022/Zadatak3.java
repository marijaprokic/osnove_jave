package d13_05_2022;

//Napisati program koji ima niz brojeva duzine 10.
// Niz je fiksnih vrednosti (ne u nosi ih korisnik) a zatim se od korisnika
// ucitava pozicija elementa koji zeli da izbaci iz niza.
// Pre i nakon izbacivanja ispisati niz na ekranu.
// Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//        Commitujte zadatak i pushujte na github sa
//        porukom Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
//        Primer izvrsenja 1:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 5
//        Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        niz.add(1);
        niz.add(2);
        niz.add(3);
        niz.add(4);
        niz.add(5);
        niz.add(6);
        niz.add(7);
        niz.add(8);
        niz.add(9);


        System.out.println("Niz brojeva je: ");
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
        }
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite poziciju za izbacivanje: ");
        int poz = s.nextInt();

        if (poz < 0 || poz >= niz.size()) {
            System.out.println("Uneli ste pogrešnu vrednost. Kraj programa.");
        } else {
            niz.remove(poz);
            System.out.print("Niz nakon brisanja je: ");
            for (int i = 0; i < niz.size(); i++) {
                System.out.print(niz.get(i) + ", ");
            }
        }
    }

}

