package d16_05_2022;

//Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.


import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite JMBG: ");
        String unosJmbg = s.next();
        System.out.print("Unesite ime: ");
        String unosIme = s.next();
        System.out.print("Unesite prezime: ");
        String unosPrezime = s.next();
        System.out.print("Unesite godinu rodjenja: ");
        int unosGodRodjena = s.nextInt();
        System.out.print("Unesite da li je korisnik aktivan true/false: ");
        boolean unosAktivan = s.nextBoolean();
        printPodaciKorisnika(unosJmbg, unosIme, unosPrezime, unosGodRodjena, unosAktivan);
    }

    static void printPodaciKorisnika(String jmbg, String ime, String prezime,
                                     int godinaRođenja, boolean aktivan) {
        System.out.println("JMBG: [" + jmbg + "]");
        System.out.println("Ime: [" + ime + "]");
        System.out.println("Prezime: [" + prezime + "]");
        System.out.println("God. rodjenja: [" + godinaRođenja + "]");
        System.out.println("Aktivan: [" + aktivan + "]");

    }
}

