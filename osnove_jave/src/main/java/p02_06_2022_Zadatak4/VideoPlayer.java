package p02_06_2022_Zadatak4;

public class VideoPlayer {
    protected int duzinaVidea;
    protected int trenutnoVreme;
    protected int jacinaZvuka;

    protected int kvalitet;

    public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvalitet) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitet = kvalitet;
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }

    public void stampaj () {
        System.out.println("Dužina videa: " + this.duzinaVidea);
        System.out.println("Trenutno vreme videa: " + this.trenutnoVreme );
        System.out.println("Jačina zuka: " + this.jacinaZvuka);
        System.out.println("Kvalitet videa: " + this.kvalitet);
        System.out.println();
    }
}
