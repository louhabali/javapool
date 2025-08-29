import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime date) {
        if (date == null){
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Le' d MMM 'de l''an' uuuu 'à' HH'h'mm'm et' ss's'", Locale.FRENCH);
        return date.format(formatter);
    }

    public static String formatSimple(LocalDate date) {
         if (date == null){
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
         if (time == null){
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS");
        if(time.format(formatter).endsWith("000000000")){
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        }
        return time.format(formatter);
    }

}
