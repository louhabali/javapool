import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> s = set1;
        for (Integer i : set2){
            s.add(i);
        }
        return s;
    }

  public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>();

        for (Integer e : set1) {
            if (set2.contains(e)) {
                res.add(e);
            }
        }

        for (Integer e : set2) {
            if (set1.contains(e)) {
                res.add(e);
            }
        }

        return res;
    }
}   