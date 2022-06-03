package p02_06_2022_Zadatak4;

public class QualityOptimizerControl extends Control{

    private int brzinaInterneta;

    public QualityOptimizerControl( int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }



    public int getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(int brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double kvalitet1 = this.brzinaInterneta*10.1;
        int kvalitet = 0;
        if (kvalitet1 <=144) {
            kvalitet=144;
        }
        if (kvalitet1 <=240 && kvalitet1 >144) {
            kvalitet=240;
        }
        if (kvalitet1 <=720 && kvalitet1 >240) {
            kvalitet=720;
        }
        if (kvalitet1 <=1080 && kvalitet1>720) {
            kvalitet=1080;
        }
        videoPlayer.setKvalitet(kvalitet);
    }
}
