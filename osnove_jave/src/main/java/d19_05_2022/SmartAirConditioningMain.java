package d19_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {
        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Samsung";
        klima1.potrosnjaDokHladi = 1;
        klima1.potrosnjaDokGreje = 2;
        klima1.temperatura = 18;
        klima1.mod = "hladi";

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "Bergen";
        klima2.potrosnjaDokHladi = 2;
        klima2.potrosnjaDokGreje = 3;
        klima2.temperatura = 35;
        klima2.mod = "greje";

        klima1.stampa();
        int mesečnaPotrošnja1 = klima1.mesečnaPotrosnja();
        System.out.println("Mesečna potrošnja za klimu 1 iznosi: " + mesečnaPotrošnja1 + "kW/h.");
        int mesečniIznos1 = klima1.kolikoKošta();
        System.out.println("Ukupan iznos/cena za klimu 1 mesečno iznosi: " + mesečniIznos1 + "dinara.");

        System.out.println();

        klima2.stampa();
        int mesečnaPotrošnja2 = klima2.mesečnaPotrosnja();
        System.out.println("Mesečna potrošnja za klimu 2 iznosi: " + mesečnaPotrošnja2 + "kW/h.");
        int mesečniIznos2 = klima2.kolikoKošta();
        System.out.println("Ukupan iznos/cena za klimu 2 mesečno iznosi: " + mesečniIznos2 + "dinara.");

    }
}
