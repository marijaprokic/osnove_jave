package p02_06_2022_Zadatak5;

public class Pica extends Proizvod {

    private int cenaPodloge;

    public Pica(int cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public int racunajUkupnuCenu() {
        int ukupnaCena = 0;
        ukupnaCena = this.racunajCenuDodataka() + this.cenaPodloge;
        return ukupnaCena;
    }

    @Override
    public void stampaj() {
        System.out.println("Pica:");
        System.out.println("Cena podloge: " + this.cenaPodloge);
        System.out.println("Dodaci: ");
        for (int i = 0; i < nizDodataka.size(); i++) {
            System.out.println(nizDodataka.get(i).nazivDodatka + ", " + nizDodataka.get(i).cenaDodatka);
        }
        System.out.println("Ukupna cena: " + this.racunajUkupnuCenu());
        System.out.println();

    }

}
