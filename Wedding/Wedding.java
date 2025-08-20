import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> mm = new HashMap<>();
        //int jj = 0;
        List<String> l1 = new ArrayList<>(first);
        List<String> l2 = new ArrayList<>(second);

        int minsz = Math.min(l1.size(), l2.size());
        for (int i = 0; i<minsz;i++){
            mm.put(l1.get(i), l2.get(i));
        }
        return mm;
    }
}