import java.util.*;
import java.util.stream.Stream;
public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        Map<Character, List<String>> mm = new HashMap<>();
        s.forEach(ss -> {
            //System.out.println(ss);
            Character c = ss.substring(0,1).toUpperCase().charAt(0);
            if (mm.containsKey(c)){
                mm.get(c).add(ss);
            }else {
                mm.put(c,new ArrayList<>());
                mm.get(c).add(ss);
            }
        });
        return mm;
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
         Map<Integer, Optional<Integer>> mm = new HashMap<>();
        s.forEach(ii -> {
            Integer c = ii % 4;
            mm.merge(c, Optional.of(ii), (oldOpt, newOpt) -> 
            Optional.of(Math.max(oldOpt.get(), newOpt.get()))
        );
        });
        return mm;
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
            StringBuilder soso = new StringBuilder("{");
            String hash = " # ";
            List<String> list = s.sorted().toList(); 
            for (int i = 0; i < list.size(); i++) {
                soso.append(list.get(i));
                if (i != list.size() - 1) {
                    soso.append(hash);
                }
            }   
            soso.append("}");
            return soso.toString();
    }
}   