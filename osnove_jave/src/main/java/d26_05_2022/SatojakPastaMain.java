package d26_05_2022;

import javax.security.sasl.SaslServer;
import java.util.ArrayList;

public class SatojakPastaMain {


    public static void main(String[] args) {

        Pasta nizPasta = new Pasta();

        Sastojak s1 = new Sastojak("Brašno", 100);
        nizPasta.dodaj(s1);
        Sastojak s2 = new Sastojak("Jaje", 30);
        nizPasta.dodaj(s2);
        Sastojak s3 = new Sastojak("Tartufi", 520);
        nizPasta.dodaj(s3);
        Sastojak s4 = new Sastojak("Pamrezan", 200);
        nizPasta.dodaj(s4);
        Sastojak s5 = new Sastojak("Gorgonzola", 220);
        nizPasta.dodaj(s5);
        Sastojak s6 = new Sastojak("So", 20);
        nizPasta.dodaj(s6);

        nizPasta.stampaj();
        int cena = nizPasta.računajCenu();
        System.out.println("Ukupna cena paste je: " + cena);
        System.out.println();
        nizPasta.brisi(s6);
        nizPasta.stampaj();

    }

}
