package d18_05_2022;
//Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//        atribut za mod (hladi/greje)
//        metodu za stampu - stampa u formatu: Proizvoljno :)
//
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i
//        za svaki od njih pozvati metodu za stampu


public class SmartAirConditioningMain {
    public static void main(String[] args) {
        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "Samsung";
        klima1.temperatura = 18;
        klima1.mod = "hladi";

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "LG";
        klima2.temperatura = 35;
        klima2.mod = "greje";

        System.out.println("Marka klime1: [" + klima1.marka + "] ");
        System.out.print("Temperatura (min.16-max.35): [ " + klima1.temperatura + " ] ");
        System.out.print(" Mod (hladi/greje): [ " + klima1.mod + " ]");
        System.out.println();
        System.out.println("Marka klime2: [" + klima2.marka + "] ");
        System.out.print("Temperatura (min.16-max.35): [ " + klima2.temperatura + " ] ");
        System.out.print(" Mod (hladi/greje): [ " + klima2.mod + " ]");

    }
}
