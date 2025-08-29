import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null){
            return null;
        }
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null){
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM uuuu", Locale.FRENCH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null){
            return null;
        }
        stringDate = stringDate.toLowerCase(Locale.FRENCH);
        int hours = Integer.parseInt(stringDate.split(" heures")[0].trim());
        boolean soir = stringDate.contains("soir");

        if (soir && hours < 12) {
            hours += 12;
        }
        int mins = 0;
        int secs = 0;
        String[] parts =  stringDate.split(" ");
        for(int i =0; i < parts.length;i++){
            if (parts[i].equals("minutes")){
                mins = Integer.parseInt(parts[i-1]);
            }else if (parts[i].equals("secondes")){
                secs = Integer.parseInt(parts[i-1]);
            }
        }

        return LocalTime.of(hours, mins, secs);
    }

}