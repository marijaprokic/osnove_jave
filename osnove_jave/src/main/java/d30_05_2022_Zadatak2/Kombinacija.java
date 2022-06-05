package d30_05_2022_Zadatak2;

import java.util.ArrayList;

public class Kombinacija {
    private String id;
    private ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

    public Kombinacija(String id, int jedan, int dva, int tri,
                       int cetiri, int pet, int sest, int sedam) {
        this.id = id;
        nizBrojeva.add(jedan);
        nizBrojeva.add(dva);
        nizBrojeva.add(tri);
        nizBrojeva.add(cetiri);
        nizBrojeva.add(pet);
        nizBrojeva.add(sest);
        nizBrojeva.add(sedam);
    }

    public String getId() {
        return id;
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        boolean istaKombinacija = true;
        for (int i = 0; i < 7; i++) {
            if (nizBrojeva.get(i) == k.nizBrojeva.get(i)) {
                istaKombinacija = true;
            } else {
                istaKombinacija = false;
            }
        }
        return istaKombinacija;
    }

    public void stampaj () {
        System.out.println("ID kombinacije: " + this.id);
        System.out.println("Brojevi: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(this.nizBrojeva.get(i) + ", ");
        }
    }

}
