import java.util.ArrayList;
import java.util.List;

/**
 * Created by lanev_000 on 6.04.2016.
 */
public class Test implements Runnable{

    private IsikukoodiRegister isikukoodiRegister;
    private int switchSelector;

    public Test(IsikukoodiRegister isikukoodiRegister, int switchSelector) {
        this.isikukoodiRegister = isikukoodiRegister;
        this.switchSelector = switchSelector;
    }

    @Override
    public void run() {
        for (int k = 0; k < 30; k++){
            switch (switchSelector){
                case 1 : isikukoodiRegister.register(Integer.toString(((int)(Math.random()*20+1))));
                    break;
                case 2 :
                    int i = (int)(Math.random()*20+1);
                    System.out.print(i + " elemendi jarjekorra number on " +
                            isikukoodiRegister.jarjekorranumber(Integer.toString(i)) + "\r\n");
            }
        }

    }

    public static void main(String[] args) throws Exception{
        IsikukoodiRegister isikukoodiRegister = new IsikukoodiRegister();
        List<Thread> tList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            Thread thread = new Thread(new Test(isikukoodiRegister, (int)(Math.random()*2+1)));
            tList.add(thread);
            thread.start();
        }

        for (Thread thread : tList) {
            thread.join();
        }

        for (String isikukood : isikukoodiRegister.getIsikukoodid()) {
            System.out.print(isikukood + ":" + isikukoodiRegister.jarjekorranumber(isikukood) + ", ");
        }
    }
}
