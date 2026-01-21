import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Program7 {
    public static void main(String[] args) {
        LocalDate currentdate = LocalDate.now();  // To get current date
        LocalTime currenttime = LocalTime.now();  // To get current time
        int currentyear = currentdate.getYear(); // To get current year

           System.out.println(" Current date is: " + currentdate);
           System.out.println("Current time is: " + currenttime);
           System.out.println("Current year is: " + currentyear);
    }

}
