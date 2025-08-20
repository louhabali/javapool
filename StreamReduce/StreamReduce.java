import java.util.stream.Stream;
public class StreamReduce {
    public static Integer sumAll(Stream<Integer> s) {
           return  s.reduce(0,
           (acc,n)-> acc + n
            );
    }

    public static Integer divideAndAddElements(Stream<Integer> s, int divider) {
        return  s.reduce(0,
           (acc,n)-> acc + n/divider,
                Integer::sum
            );
    }
}