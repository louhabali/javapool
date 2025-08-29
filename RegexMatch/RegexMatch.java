public class RegexMatch {

    public static boolean containsOnlyAlpha(String str) {
        return str.matches("^[A-Za-z]+$");
    }

    public static boolean startWithLetterAndEndWithNumber(String str) {
        return str.matches("^[A-Za-z].*[0-9]$");
    }

    public static boolean containsAtLeast3SuccessiveA(String str) {
        return str.matches(".*A{3,}.*");
    }

}
