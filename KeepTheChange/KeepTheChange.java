import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> ll = new ArrayList<>();
        int xx = 0;
        List<Integer> l2 =new ArrayList<>(coins) ;
    
        int max = Collections.max(l2);
        while (true) { 
            if (amount == xx){
                break;
            }
            if (xx+max <=amount){
                ll.add(max);
                xx+=max;
            }else {
                l2.remove(Integer.valueOf(max));
                max = Collections.max(l2);
            }
        }
        return ll;
    }
}