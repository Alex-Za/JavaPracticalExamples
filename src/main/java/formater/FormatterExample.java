package formater;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterExample {
    public void dateTest() {
        Formatter fmt = new Formatter();
        Calendar calendar = Calendar.getInstance();

        fmt.format("%tr", calendar);
        System.out.println(fmt);

        fmt = new Formatter();
        fmt.format("%tc", calendar);
        System.out.println(fmt);

        fmt = new Formatter();
        fmt.format("%tl:%tM", calendar, calendar);
        System.out.println(fmt);

        fmt = new Formatter();
        fmt.format("%tB %tb %tm", calendar, calendar, calendar);
        System.out.println(fmt);
    }

    public void nTest() {
        Formatter formatter = new Formatter();
        formatter.format("Copy file%nTransfer finished on %d%%", 88);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);
        System.out.println(formatter);



    }
}
