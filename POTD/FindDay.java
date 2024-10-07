import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class FindDay {
    public static String findDay(int month, int day, int year) {
        Calendar calendarObj = new GregorianCalendar(year, month,day);
        String dt = calendarObj.getTime().toString();
        System.out.println(dt);
        HashMap<String,String> daysOfWeek = new HashMap<>();
        
        // Add entries to the HashMap
          daysOfWeek.put("Sun", "SUNDAY");
          daysOfWeek.put("Mon", "MONDAY");
          daysOfWeek.put("Tue", "TUESDAY");
          daysOfWeek.put("Wed", "WEDNESDAY");
          daysOfWeek.put("Thu", "THURSDAY");
          daysOfWeek.put("Fri", "FRIDAY");
          daysOfWeek.put("Sat", "SATURDAY");
          
          return daysOfWeek.get(dt.substring(0,3));
        
      }
      public static void main(String[] args) {
        System.out.println(findDay(8,5,2015));
      }
}
