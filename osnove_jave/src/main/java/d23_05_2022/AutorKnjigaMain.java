package d23_05_2022;

import p19_05_2022.Auto;
// U glavnom programu napraviti vise autora sa vise knjiga.

public class AutorKnjigaMain {

    public static void main(String[] args) {

        Autor autor1 = new Autor();
        autor1.setIme("Slobodan");
        autor1.setPrezime("Selenić");

        Knjiga knjiga1 = new Knjiga();
        knjiga1.setIsbn("111111-1");
        knjiga1.setNaziv("Memoari Pere bogalja");
        knjiga1.setGodinaIzdanja(2020);
        knjiga1.setAutor(autor1);

        knjiga1.print();
        System.out.println();

        Autor autor2 = new Autor();
        autor2.setIme("Danilo");
        autor2.setPrezime("Kiš");

        Knjiga knjiga2 = new Knjiga();
        knjiga2.setIsbn("222222-2");
        knjiga2.setNaziv("Enciklopedija mrtvih");
        knjiga2.setGodinaIzdanja(2021);
        knjiga2.setAutor(autor2);

        knjiga2.print();
        System.out.println();

        Autor autor3 = new Autor();
        autor3.setIme("Borislav");
        autor3.setPrezime("Pekić");

        Knjiga knjiga3 = new Knjiga();
        knjiga3.setIsbn("333333-3");
        knjiga3.setNaziv("Hodočašće Arsenija Njegovana");
        knjiga3.setGodinaIzdanja(2021);
        knjiga3.setAutor(autor3);

        knjiga3.print();

    }
}
