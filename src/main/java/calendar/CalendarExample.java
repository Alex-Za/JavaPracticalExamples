package calendar;

import java.util.Calendar;

public class CalendarExample {
    public void test() {
        String months[] = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        Calendar calendar = Calendar.getInstance();

        //get current month and date
        System.out.println(months[calendar.get(Calendar.MONTH)]);
        System.out.println(calendar.get(Calendar.DATE));

        //set time
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 29);
        calendar.set(Calendar.SECOND, 22);
    }
}
