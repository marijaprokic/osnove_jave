package d23_05_2022;

public class ProizvodVagaMain {
    public static void main(String[] args) {

        Proizvod p1 = new Proizvod("111", "proizvod 01", 1000);
        Proizvod p2 = new Proizvod("333", "proizvod 02", 5000);

        Vaga vaga1 = new Vaga();
        vaga1.setJedinicaMere("kg");
        vaga1.setProizvod(p1);

        vaga1.sracunajCenu(200);
        vaga1.stampaj(200);

        System.out.println();

        Vaga vaga2 = new Vaga();
        vaga2.setJedinicaMere("lb");
        vaga2.setProizvod(p2);

        vaga2.stampaj(300);

    }
}