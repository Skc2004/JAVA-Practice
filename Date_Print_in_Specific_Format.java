import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Date_Print_in_Specific_Format
{
    public static void main(String[] args)
    {
        LocalDateTime dt =LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH : mm : ss");
        System.out.println(dt.format(dateTimeFormatter));
    }
}
