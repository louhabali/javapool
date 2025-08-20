import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list==null || list.isEmpty()){
            return null;
        }
        if ( list.lastIndexOf(value)!= -1){
            return list.lastIndexOf(value);
        }
        return  null;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
          if (list==null|| list.isEmpty()){
            return null;
        }
        if (list.indexOf(value)!=-1){
            return list.indexOf(value);
        }
        return null;
        
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        
        List<Integer> ll = new ArrayList<>();
        if (list==null){
            return ll;
        }
        int ind = 0;
        for (Integer i : list){
            if (i.equals(value)){
                ll.add(ind);
            }
            ind++;
        }
        return ll;
    }
}