/**
 * Created by lanev_000 on 8.04.2016.
 */
public class test2 {
    public static void main(String[] args) {
        KaitstudMassiiv kaitstud = new KaitstudMassiiv();
        for (int i = 0; i < kaitstud.suurus(); i++) {
            kaitstud.set(i, i * 10);
        }
        int[] tulemus = kaitstud.kõikVäärtused();
        for (int element : tulemus) {
            System.out.println(element);
        }
    }
}
