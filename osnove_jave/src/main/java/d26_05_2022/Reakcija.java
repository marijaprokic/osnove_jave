package d26_05_2022;
//Kreirati klasu Reakcija koja ima
//        tip reakcije (smajli, like, srce)
//        ime i prezime korisnika koji je reagovao
//        gettere, settere i konstruktore

import java.util.ArrayList;

public class Reakcija {
    private String reakcijaNaPost;
    private  String imePrezime;


    public Reakcija (){
    }
         public Reakcija(String reakcijaNaPost, String imePrezime) {
        this.reakcijaNaPost = reakcijaNaPost;
        this.imePrezime = imePrezime;
     }

    public String getReakcijaNaPost() {
        return reakcijaNaPost;
    }

    public void setReakcijaNaPost(String reakcijaNaPost) {
        this.reakcijaNaPost = reakcijaNaPost;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
}
