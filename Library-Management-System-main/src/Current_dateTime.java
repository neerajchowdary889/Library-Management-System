import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Current_dateTime {
    public static String current_dateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  --  HH:mm:ss");
        String formatDateTime = now.format(formatter);
        return formatDateTime;
    }
    public static  String valid_date() {
        LocalDateTime now = LocalDateTime.now();
        now = now.plusMonths(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  --  HH:mm:ss");
        String formatDateTime = now.format(formatter);
       return formatDateTime;


    }


}