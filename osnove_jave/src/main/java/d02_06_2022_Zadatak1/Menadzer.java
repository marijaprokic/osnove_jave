package d02_06_2022_Zadatak1;

import java.util.ArrayList;

public class Menadzer extends Radnik{

    public Menadzer(String imePrezime) {
        super(imePrezime);
    }


    @Override
    public double plataRadnika (){
        double sumaPlata = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            sumaPlata=sumaPlata + nizSektora.get(i).plata;
        }
        return sumaPlata;
    }
}
