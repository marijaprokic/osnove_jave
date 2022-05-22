package d20_05_2022;

import p20_05_2022.Radnik;

public class RadnikMain {
    public static void main(String[] args) {
        p20_05_2022.Radnik r1 = new p20_05_2022.Radnik();
        r1.jmbg = "111111111";
        r1.imeIPrezime = "Paja Patak";
        r1.brojDece = 2;
        r1.stepenStrucneSpreme = "VII";
        r1.godineRadnogStaza = 21;

        p20_05_2022.Radnik r2 = new p20_05_2022.Radnik("333333333");
        r2.imeIPrezime = "Pink Panter";
        r2.brojDece = 3;
        r2.stepenStrucneSpreme = "VIII";
        r2.godineRadnogStaza = 9;

        p20_05_2022.Radnik r3 = new Radnik( "999999999", "Pera Kojot",20,"VII",100 );
        


        double minuliRad3 = r3.minuliRad();
        System.out.println("Minuli rad za radnika 3: " + r3.imeIPrezime + " iznosi: " + minuliRad3);

        double koeficijentSloženosti3 = r3.koeficijentSloženosti();
        System.out.println("Koeficijent složenosti za radnika 3: " + r3.imeIPrezime + " iznosi: " + koeficijentSloženosti3);

        double plata3 = r3.plata();
        System.out.println("Plata za radnika 3: " + r3.imeIPrezime + " iznosi: " + plata3);

        r3.daLiJeKreditnoSposoban();

        int brojDanaOdmora3 = r3.brojDanaOdmora();
        System.out.println("Broj dana odmora za radnika 3: " + r3.imeIPrezime + " iznosi: " +brojDanaOdmora3);
    }


}
