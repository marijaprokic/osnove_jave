package p02_06_2022_Zadatak5;

public class IcePoint extends Proizvod{

    private String tipSladoleda;
    private boolean daLiJeMali;

    public IcePoint(String tipSladoleda, boolean daLiJeMali) {
        this.tipSladoleda = tipSladoleda;
        this.daLiJeMali = daLiJeMali;
    }

    @Override
    public int racunajUkupnuCenu () {
        int ukupnaCena=0;
        if (daLiJeMali) {
           ukupnaCena = this.racunajCenuDodataka() + 100;
        } else {
            ukupnaCena = this.racunajCenuDodataka() + 130;
        }
        return ukupnaCena;
    }

    @Override
    public void stampaj () {
        System.out.println("Sladoled:");
                System.out.println("Tip sladoleda: " + this.tipSladoleda );
        System.out.print("Size does matter: " );
                if (this.daLiJeMali) {
                    System.out.println("mali :-(");
                }else {
                    System.out.println("veliki :-)");
                }
        System.out.println("Dodaci:");
        for (int i = 0; i < nizDodataka.size(); i++) {
            System.out.println(nizDodataka.get(i).nazivDodatka + ", " + nizDodataka.get(i).cenaDodatka);
        }
        System.out.println("Ukupna cena: " + this.racunajUkupnuCenu());
        System.out.println();
    }

}
