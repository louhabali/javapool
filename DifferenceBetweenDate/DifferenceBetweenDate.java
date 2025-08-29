import java.time.*;
public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
        if (localTime1 ==null && localTime2 ==null){
            return null;
        }else if(localTime1==null){
            return null;
        }else if (localTime2==null){
            return null;
        }
        return Duration.between(localTime1, localTime2).abs();

    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
         if (date1 ==null && date2 ==null){
            return null;
        }else if(date1==null){
            return null;
        }else if (date2==null){
            return null;
        }
            if (date1.isAfter(date2)) {
                return Period.between(date2, date1); 
            } else {
                return Period.between(date1, date2);
            }
    }

    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
          if (dateTime1 ==null && dateTime2 ==null){
            return null;
        }else if(dateTime1==null){
            return null;
        }else if (dateTime2==null){
            return null;
        }
        return Duration.between(dateTime1, dateTime2).abs().toHours();
    }

}