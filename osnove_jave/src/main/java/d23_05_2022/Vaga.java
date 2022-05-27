package d23_05_2022;

public class Vaga {
    private String jedinicaMere;
    private Proizvod proizvod;

    public Vaga() {
    }

    public String getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(String jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public double sracunajCenu(int tezina) {
        if (this.jedinicaMere.equals("kg")) {
            return tezina * proizvod.getCenaKg();
        }
        if (this.jedinicaMere.equals("lb")) {
            return tezina * proizvod.getCenaLb();
        } else {
            return 0;
        }
    }

    public void stampaj(int tezina) {
        proizvod.stampaj();
        if (this.jedinicaMere.equals("kg")) {
            System.out.println("(cena za odgovarajucu mernu jedinicu) " + proizvod.getCenaKg() + " kg: " + tezina);
            System.out.println("Ukupno: " + sracunajCenu(tezina));
        }
        if (this.jedinicaMere.equals("lb")) {
            System.out.println("(cena za odgovarajucu mernu jedinicu) " +proizvod.getCenaLb() + " lb: " + tezina);
            System.out.println("Ukupno: " + sracunajCenu(tezina));
        }
    }


}
