import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        Integer t = s.reduce(
             0,
            (sum, str) -> sum + str.length(),
            Integer::sum
        );
        return t;

    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(ss-> ss.toUpperCase()).collect(Collectors.toList());
        
    }
    
    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
         return s.map(d -> d.intValue()).filter(i -> i >= 42).collect(Collectors.toSet());
    }
}