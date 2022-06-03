package p02_06_2022_Zadatak4;

public class Zadatak4Main {
    public static void main(String[] args) {
        VideoPlayer v1 = new VideoPlayer(300, 250, 2, 144);
        VideoPlayer v2 = new VideoPlayer(350, 230, 5, 240);
        TimeControl t1 = new TimeControl(true);
        AudioControl a1 = new AudioControl(false);
        QualityOptimizerControl q1 = new QualityOptimizerControl(20);
        QualityOptimizerControl q2 = new QualityOptimizerControl(100);

        v1.stampaj();
        t1.izvrsiAkciju(v1);
        t1.izvrsiAkciju(v1);
        t1.izvrsiAkciju(v1);
        t1.izvrsiAkciju(v1);
        a1.izvrsiAkciju(v2);
        q1.izvrsiAkciju(v1);
        v1.stampaj();

        v2.stampaj();
        t1.izvrsiAkciju(v2);
        a1.izvrsiAkciju(v2);
        a1.izvrsiAkciju(v2);
        a1.izvrsiAkciju(v2);
        q2.izvrsiAkciju(v2);
        v2.stampaj();
    }

}
