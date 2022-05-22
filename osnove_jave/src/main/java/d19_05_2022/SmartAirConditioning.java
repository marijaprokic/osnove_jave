package d19_05_2022;
//(ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//        atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//        atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//        atribut za mod (hladi/greje)
//        metodu za stampu - stampa u formatu
//        marka - mod - termperatura
//        metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//        30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//        metodu koja racuna koliko klima novca potrosi za mesec dana
//        Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//        Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//        Metoda vraca ukupnu cenu za taj mesec
//
//        U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode

public class SmartAirConditioning {
    public String marka;
    public int potrosnjaDokHladi;
    public int potrosnjaDokGreje;
    public int temperatura;
    public String mod;

    public void stampa() {
        System.out.println("[Marka]: " + marka + " [Mod]: " + mod + " [Temperatura]: " + temperatura);
    }


    public int mesečnaPotrosnja() {
        if (mod.equals("greje")) {
            int potrosnja = 30 * 15 * potrosnjaDokGreje;
            return potrosnja;
        } else {
            int potrosnja = 30 * 15 * potrosnjaDokHladi;
            return potrosnja;
        }
    }

    public int kolikoKošta() {
        if (mesečnaPotrosnja() <= 350) {
            int mesečnaCena = mesečnaPotrosnja() * 6;
            return mesečnaCena;
        } else {
            int mesečnaCena = 350 * 6 + (mesečnaPotrosnja() - 350) * 9;
            return mesečnaCena;
        }
    }


}
