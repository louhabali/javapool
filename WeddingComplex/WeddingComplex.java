import java.util.*;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String, String> cpl = new HashMap<>();
        Map<String, String> girlToBoy = new HashMap<>(); 

        for (String boy : first.keySet()) {
            for (String girl : first.get(boy)) {
                if (!girlToBoy.containsKey(girl)) {
                    // girl is free
                    if (second.get(girl).get(0).equals(boy)) {
                        cpl.put(boy, girl);
                        girlToBoy.put(girl, boy);
                        break;
                    }
                } else {
                    // girl is taken
                    String currentBoy = girlToBoy.get(girl);
                    List<String> prefs = second.get(girl);
                    if (prefs.indexOf(boy) < prefs.indexOf(currentBoy)) {
                        // she prefers new boy, switch
                        cpl.remove(currentBoy);
                        cpl.put(boy, girl);
                        girlToBoy.put(girl, boy);
                        break;
                    }
                }
            }
        }
        return cpl;
    }
}
