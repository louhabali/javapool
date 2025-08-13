
public class StringReplace {
    public static <T> String replace(String s, T target, T replacement) {
        if (s == null || target == null || replacement == null) {
            return null;
        }
        return s.replace(target.toString(), replacement.toString());
    }
}