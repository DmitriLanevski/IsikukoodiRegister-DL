/**
 * Created by lanev_000 on 8.04.2016.
 */
public class KaitstudMassiiv {
    private int[] andmed = new int[100];

    public synchronized void set(int positsioon, int väärtus) {
        andmed[positsioon] = väärtus;
    }

    public synchronized int suurus() {
        return andmed.length;
    }

    public synchronized int[] kõikVäärtused() {
        return andmed;
    }
}


