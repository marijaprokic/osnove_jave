package d23_05_2022;

//Kreirati klasu Knjiga koji ima:
//        -ISBN
//        -naziv
//        -godina izdanja
//        -autor
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//        (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)

public class Knjiga {

    private String isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void print () {
        System.out.println("( " + this.isbn + " )");
        System.out.println("( " + this.naziv + " ) (" + this.godinaIzdanja + " )");
        System.out.print( "Autor: " );
        autor.print();

    }
}
