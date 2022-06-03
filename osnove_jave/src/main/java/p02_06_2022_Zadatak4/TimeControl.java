package p02_06_2022_Zadatak4;

public class TimeControl extends Control {

    private boolean udesno;

    public TimeControl( boolean udesno) {

        this.udesno = udesno;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        int vreme = 0;
        if (this.udesno) {
            vreme = videoPlayer.trenutnoVreme + 15;
        } else {
            vreme = videoPlayer.trenutnoVreme - 15;
        }
        videoPlayer.setTrenutnoVreme(vreme);
        if (vreme < 0) {
            vreme = 0;
        }
        if (vreme > videoPlayer.duzinaVidea) {
            vreme = videoPlayer.duzinaVidea;
        }
        videoPlayer.setTrenutnoVreme(vreme);
    }



}
