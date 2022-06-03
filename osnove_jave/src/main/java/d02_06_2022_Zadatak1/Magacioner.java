package d02_06_2022_Zadatak1;

import java.util.ArrayList;

public class Magacioner extends Radnik{


    public Magacioner(String imePrezime) {super(imePrezime);
    }


    private double prosecnaPlata () {
        double sumaPlata = 0;
        for (int i = 0; i < this.nizSektora.size(); i++) {
           sumaPlata = sumaPlata + this.nizSektora.get(i).plata;
        }
        return sumaPlata/this.nizSektora.size()*0.5;
    }

    @Override
    public double plataRadnika () {
        return this.prosecnaPlata() * this.nizSektora.size();
    }
}
