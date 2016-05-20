import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by lanev_000 on 6.04.2016.
 */
public class IsikukoodiRegister {
    private CopyOnWriteArrayList<String> isikukoodid = new CopyOnWriteArrayList<>();
    //private List<String> isikukoodid = new ArrayList<>();

    public void register(String isikukood){
        synchronized (isikukoodid) {
            if (!isikukoodid.contains(isikukood)){
                isikukoodid.add(isikukood);
            }
        }
    }

    public int jarjekorranumber(String isikukood){
        synchronized (isikukoodid) {
            if (!isikukoodid.contains(isikukood)){
                return -1;
            } else {
                return isikukoodid.indexOf(isikukood);
            }
        }
    }

    public List<String> getIsikukoodid() {
        synchronized (isikukoodid){
            //It should work with CopyOnWriteArrayList. But I an not shure.
            //Is it okey? Will sollution with ArrayList and new Arraylist(Arraylist) work?
            return  isikukoodid;
            //return new ArrayList<>(isikukoodid);
        }
    }
}
