package d02_06_2022_Zadatak1;

import java.util.ArrayList;

public class Zadatak1Main {
    public static void main(String[] args) {

        Menadzer menadzer1 = new Menadzer("Marija");
        Magacioner magacioner1 = new Magacioner("Paja Patak");

        Sektor s1 = new Sektor("Sektor A", 100000);
        Sektor s2 = new Sektor("Sektor B", 50000);
        Sektor s3 = new Sektor("Sektor C", 80000);
        Sektor s4 = new Sektor("Sektor D", 50000);

        Sektor s5 = new Sektor("Sektor E", 45000);
        Sektor s6 = new Sektor("Sektor F", 20000);


        menadzer1.zaposliUSektor(s1);
        menadzer1.zaposliUSektor(s2);
        menadzer1.zaposliUSektor(s3);
        menadzer1.zaposliUSektor(s4);

        magacioner1.zaposliUSektor(s5);
        magacioner1.zaposliUSektor(s6);

        double plataMenadzer1 = menadzer1.plataRadnika();
        System.out.println("Plata za menadzera1 iznosi: " + plataMenadzer1);

        double plataMagacioner1 = magacioner1.plataRadnika();
        System.out.println("Plata za magacionera1 iznosi: " + plataMagacioner1);


    }


}
