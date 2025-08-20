import java.util.ArrayList;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
         if (list == null){
            return null;
        }
        List<Integer> mutable = new ArrayList<>(list);
        mutable.sort(null); 
        return mutable;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null){
            return null;
        }
        List<Integer> mutable = new ArrayList<>(list);
        mutable.sort((a, b) -> b - a);
        return mutable;
    }
}