package d19_05_2022;

//Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//        i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//        Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//        vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a
//        povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//        S matrati da je parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod
//        šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa
//        u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.


public class Proizvod {

    public String naziv;
    public int cena;
    public double tezina;

    public void stampaj() {
        System.out.println("{{ " + naziv + " }} , {{ " + cena + " }}, {{ " + tezina + " }}");
    }

    public void povecajCenu(int povecanje) {
        cena = cena * povecanje;
    }

    public double vratiCenuSaPopustom(int popust) {
        return cena * popust/100;
    }

    public int racunajPostarinu() {
        if (tezina == 100) {
            return 200;
        }
        if (tezina < 101 || tezina <= 500) {
            return 200;
        } else {
            return 1000;
        }
    }

}
