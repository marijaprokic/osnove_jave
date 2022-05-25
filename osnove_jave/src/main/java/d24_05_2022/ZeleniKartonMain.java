package d24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = s.nextInt();
        ArrayList<ZeleniKarton> niz1 = new ArrayList<ZeleniKarton>();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite ime i prezime studenta: ");
            String imePrezime = s.next();
            System.out.print("Unesite broj indeksa: ");
            int brojIndeksa = s.nextInt();
            System.out.print("Unesite naziv predmeta: ");
            String nazivPredmeta = s.next();
            System.out.print("Unesite ime i prezime profesora: ");
            String profesor = s.next();
            System.out.print("Unesite ocenu: ");
            int ocena = s.nextInt();

            ZeleniKarton x = new ZeleniKarton(imePrezime, brojIndeksa, nazivPredmeta, profesor, ocena);
            niz1.add(x);
        }
        System.out.println();
        for (int i = 0; i < niz1.size(); i++) {
            niz1.get(i).stampaj();
            System.out.println();
        }

        int suma1 = 0;
        for (int i = 0; i < niz1.size(); i++) {
            suma1 = suma1 + niz1.get(i).getOcena();
        }
        double prosecnaOcenaZaSve = 1.0*suma1 / niz1.size();
        System.out.println("Prosečna ocena za sve ispite: " + prosecnaOcenaZaSve);

        int suma2 = 0;
        int brojac = 0;
        for (int i = 0; i < niz1.size(); i++) {
            if (niz1.get(i).getOcena() > 5) {
                suma2 = suma2 + niz1.get(i).getOcena();
                brojac = brojac + 1;
            }
        }
        double prosecnaOcenaZaPolozene = 1.0* suma2 / brojac;
        System.out.println("Prosečna ocena za položene ispite: " + prosecnaOcenaZaPolozene);


    }
}
