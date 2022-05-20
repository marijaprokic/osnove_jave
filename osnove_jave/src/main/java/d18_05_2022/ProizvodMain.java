package d18_05_2022;
//Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//        cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//        i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod prviProizvod = new Proizvod();
        prviProizvod.naziv="Roze cipele";
        prviProizvod.cena = 100000.0;
        prviProizvod.tezina=300.00;

        Proizvod drugiProizvod = new Proizvod();
        drugiProizvod.naziv="Crne cipele";
        drugiProizvod.cena = 200000.00;
        drugiProizvod.tezina=350.00;

        System.out.print("{{ " + prviProizvod.naziv + " }}," );
        System.out.println( "{{ " + prviProizvod.cena + " }}," + "{{ " + prviProizvod.tezina + " gr }},");

        System.out.print("{{ " + drugiProizvod.naziv + " }}," );
        System.out.println( "{{ " + drugiProizvod.cena + " }}," + "{{ " + drugiProizvod.tezina + " gr }},");

    }

}
