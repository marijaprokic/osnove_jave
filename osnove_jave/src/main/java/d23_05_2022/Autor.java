package d23_05_2022;

//Kreirati klasu Autor koja ima
//        -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)


public class Autor {
    private String ime;
    private String prezime;

    public Autor() {
    }

    public Autor(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }


    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void print() {
        System.out.print("( " + this.ime + " ) ");
        System.out.println(" ( " + this.prezime + " )");
    }
}
