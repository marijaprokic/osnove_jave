package d26_05_2022;
//Za potrebe google istorije potrebno je kreirati sledece klase.
//        Klasu HistoryPage koja ima:
//        naziv stranice
//        link do stranice
//        vreme otvaranja stranice - sat i minut (2 atributa)
//        username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
//        konstuktore koji su logicni
//        gettere i setter (username i password nemaju settere)
//        metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
//        Metoda obrisi kolacice koja setuje username i password na null.
//        Metoda stampaj koja stampa podatke u formatu:
//        [datum] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]

public class HistoryPage {
    private String naziv;
    private String link;
    private int sat;
    private int minut;
    private String username;
    private String password;

    public HistoryPage() {
    }

    public HistoryPage(String naziv, String link, int sat, int minut) {
        this.naziv = naziv;
        this.link = link;
        this.sat = sat;
        this.minut = minut;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getLink() {
        return link;
    }

    public int getSat() {
        return sat;
    }

    public int getMinut() {
        return minut;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public void setMinut(int minut) {
        this.minut = minut;
    }

    public void sacuvajKredencijale(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void obrišiKolacice() {
        this.username = null;
        this.password = null;
    }

    public void stampaj() {
        System.out.print("[ " + this.sat + ":" +this.minut + " ] - [ ");
        System.out.print(this.naziv + " ]...[ " + this.link + " ]");
        if (this.username != null && this.password != null) {
            System.out.print(" * ");
        }
        System.out.println();
    }

}
