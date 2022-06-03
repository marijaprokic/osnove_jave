package p02_06_2022_Zadatak4;

public class AudioControl extends Control {

    private boolean daLiSmanjuje;


    public AudioControl(boolean daLiSmanjuje) {

        this.daLiSmanjuje = daLiSmanjuje;
    }

    public boolean isDaLiSmanjuje() {
        return daLiSmanjuje;
    }

    public void setDaLiSmanjuje(boolean daLiSmanjuje) {
        this.daLiSmanjuje = daLiSmanjuje;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        int jacina = 0;
        if (this.daLiSmanjuje) {
            jacina = videoPlayer.jacinaZvuka + 15;
        } else {
            jacina = videoPlayer.jacinaZvuka - 15;
        }
        videoPlayer.setJacinaZvuka(jacina);
        if (videoPlayer.jacinaZvuka < 0) {
            jacina = 0;
        }
        if (videoPlayer.jacinaZvuka > 100) {
            jacina = 100;
        }
        videoPlayer.setJacinaZvuka(jacina);
    }


}
