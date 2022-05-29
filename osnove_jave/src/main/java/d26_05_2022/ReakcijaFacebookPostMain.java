package d26_05_2022;


public class ReakcijaFacebookPostMain {

    public static void main(String[] args) {

        Reakcija r1 = new Reakcija("smajli", "Marija Prokić");
        Reakcija r2 = new Reakcija("smajli", "Pera Detlić");
        Reakcija r3 = new Reakcija("like", "Patak Dača");
        Reakcija r4 = new Reakcija("srce", "Marija Prokić");
        Reakcija r5 = new Reakcija("srce", "Pera Kojot");
        Reakcija r6 = new Reakcija("srce", "Sofronije");

        FacebookPost post1 = new FacebookPost("Sima Strahota", "Hey, hey!");

        post1.reaguj(r1);
        post1.reaguj(r2);
        post1.reaguj(r3);
        post1.reaguj(r4);
        post1.reaguj(r5);
        post1.reaguj(r6);

        post1.stampaj();

    }


}
