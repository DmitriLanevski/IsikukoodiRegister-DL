import java.util.ArrayList;
import java.util.List;

/**
 * Created by lanev_000 on 6.04.2016.
 */
public class IsikukoodiRegister {
    private List<String> isikukoodid = new ArrayList<>();

    public void register(String isikukood){
        synchronized (isikukood) {
            if (!isikukoodid.contains(isikukood)){
                isikukoodid.add(isikukood);
            }
        }
    }

    public int jarjekorranumber(String isikukood){
        synchronized (isikukood) {
            if (!isikukoodid.contains(isikukood)){
                return -1;
            } else {
                return isikukoodid.indexOf(isikukood);
            }
        }
    }

    public List<String> getIsikukoodid() {
        return isikukoodid;
    }
}
